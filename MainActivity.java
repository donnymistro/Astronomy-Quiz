package com.example.android.astronomyquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    /** Declare your buttons as variables to be used everywhere/ declare global variables.
     *
     */
    RadioButton one_A;
    RadioButton one_B;
    RadioButton one_C;
    RadioButton one_D;
    RadioButton two_A;
    RadioButton two_B;
    RadioButton two_C;
    RadioButton two_D;
    RadioButton three_A;
    RadioButton three_B;
    RadioButton three_C;
    RadioButton three_D;
    CheckBox four_A;
    CheckBox four_B;
    CheckBox four_C;
    CheckBox four_D;
    CheckBox five_A;
    CheckBox five_B;
    CheckBox five_C;
    CheckBox five_D;
    RadioButton six_A;
    RadioButton six_B;
    EditText seven_answer;
    RadioButton eight_A;
    RadioButton eight_B;
    RadioButton eight_C;
    RadioButton eight_D;
    RadioButton nine_A;
    RadioButton nine_B;
    RadioButton nine_C;
    RadioButton nine_D;
    RadioButton ten_A;
    RadioButton ten_B;
    RadioButton ten_C;
    RadioButton ten_D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one_A = (RadioButton) findViewById(R.id.one_A);
        one_B = (RadioButton) findViewById(R.id.one_B);
        one_C = (RadioButton) findViewById(R.id.one_C);
        one_D = (RadioButton) findViewById(R.id.one_D);
        two_A = (RadioButton) findViewById(R.id.two_A);
        two_B = (RadioButton) findViewById(R.id.two_B);
        two_C = (RadioButton) findViewById(R.id.two_C);
        two_D = (RadioButton) findViewById(R.id.two_D);
        three_A = (RadioButton) findViewById(R.id.three_A);
        three_B = (RadioButton) findViewById(R.id.three_B);
        three_C = (RadioButton) findViewById(R.id.three_C);
        three_D = (RadioButton) findViewById(R.id.three_D);
        four_A = (CheckBox) findViewById(R.id.four_A);
        four_B = (CheckBox) findViewById(R.id.four_B);
        four_C = (CheckBox) findViewById(R.id.four_C);
        four_D = (CheckBox) findViewById(R.id.four_D);
        five_A = (CheckBox) findViewById(R.id.five_A);
        five_B = (CheckBox) findViewById(R.id.five_B);
        five_C = (CheckBox) findViewById(R.id.five_C);
        five_D = (CheckBox) findViewById(R.id.five_D);
        six_A = (RadioButton) findViewById(R.id.six_A);
        six_B = (RadioButton) findViewById(R.id.six_B);
        seven_answer = (EditText) findViewById(R.id.seven_answer);
        eight_A = (RadioButton) findViewById(R.id.eight_A);
        eight_B = (RadioButton) findViewById(R.id.eight_B);
        eight_C = (RadioButton) findViewById(R.id.eight_C);
        eight_D = (RadioButton) findViewById(R.id.eight_D);
        nine_A = (RadioButton) findViewById(R.id.nine_A);
        nine_B = (RadioButton) findViewById(R.id.nine_B);
        nine_C = (RadioButton) findViewById(R.id.nine_C);
        nine_D = (RadioButton) findViewById(R.id.nine_D);
        ten_A = (RadioButton) findViewById(R.id.ten_A);
        ten_B = (RadioButton) findViewById(R.id.ten_B);
        ten_C = (RadioButton) findViewById(R.id.ten_C);
        ten_D = (RadioButton) findViewById(R.id.ten_D);

    }

    /** Make each button, radio box and check box into booleans for use in the calculate score method.
     * NOTE: Only the correct answers and id's with multiple correct answers are below
     *
     */

    private int grade(boolean oneCChecked, boolean twoDChecked,
                      boolean threeAChecked, boolean fourBChecked,
                      boolean fourCChecked, boolean fiveBChecked,
                      boolean fiveCChecked, boolean fiveDChecked,
                      boolean sixAChecked, String sevenCorrect,
                      boolean eightCChecked, boolean nineDChecked,
                      boolean tenAChecked){
        int score = 0;
        if (oneCChecked){
            score = score + 10;
        }
        if (twoDChecked){
            score = score + 10;
        }
        if (threeAChecked){
            score = score + 10;
        }
        if (fourBChecked){
            score = score + 5;
        }
        if (fourCChecked){
            score = score + 5;
        }
        if (fiveBChecked){
            score = score + (10 / 3);
        }
        if (fiveCChecked){
            score = score + (10 / 3);
        }
        if (fiveDChecked){
            score = score + (10 / 3);
        }
        if (sixAChecked){
            score = score + 10;
        }
        if (sevenCorrect.equals("four")){
            score = score + 10;
        }
        else if (sevenCorrect.equals("Four")){
            score = score +10;
        }
        else if (sevenCorrect.equals("4")){
            score = score + 10;
        }
        if (eightCChecked){
            score = score + 10;
        }
        if (nineDChecked){
            score = score + 10;
        }
        if (tenAChecked){
            score = score + 10;
        }
        return score;

    }

    public void submit(View view){
        boolean oneCChecked = one_C.isChecked();
        boolean twoDChecked = two_D.isChecked();
        boolean threeAChecked = three_A.isChecked();
        boolean fourBChecked = four_B.isChecked();
        boolean fourCChecked = four_C.isChecked();
        boolean fiveBChecked =five_B.isChecked();
        boolean fiveCChecked = five_C.isChecked();
        boolean fiveDChecked = five_D.isChecked();
        boolean sixAChecked = six_A.isChecked();
        String sevenCorrect = seven_answer.getText().toString();
        boolean eightCChecked = eight_C.isChecked();
        boolean nineDChecked = nine_D.isChecked();
        boolean tenAChecked= ten_A.isChecked();

        int score = grade(oneCChecked, twoDChecked,
                          threeAChecked, fourBChecked,
                          fourCChecked,fiveBChecked,
                          fiveCChecked, fiveDChecked,
                          sixAChecked, sevenCorrect,
                          eightCChecked, nineDChecked,
                          tenAChecked);


        Context context = getApplicationContext();
        CharSequence text = "Your score is: " + score + " out of 100!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
