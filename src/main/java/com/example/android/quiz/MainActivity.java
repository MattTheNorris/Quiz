package com.example.android.quiz;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //** Single function for checking quiz results//

        public void checkAnswers (View view){

        //**integers for tracking total correct answers

            int correctAnswers = 0;

            //**stores user's name input in a string for output in results toast message

            EditText nameField = (EditText) findViewById(R.id.name_field);
            String name = nameField.getText().toString();

            //**If correct answer of U.S.A. is selected, store as true boolean

            RadioButton q1AnswerRadioThree = (RadioButton) findViewById(R.id.question1_a3);
            boolean answerOne = q1AnswerRadioThree.isChecked();

            //**Stores the user's answer to question 2 as a string, then converts to integer

            EditText answerTwoField = findViewById(R.id.question2_a1);
            String answerTwo = answerTwoField.getText().toString();
            int answerTwoValue = Integer.parseInt(answerTwo);

            //**If correct answer Operation Eagle Claw is selected, store as true boolean

            RadioButton q3AnswerRadioTwo = (RadioButton) findViewById(R.id.question3_a2);
            boolean answerThree = q3AnswerRadioTwo.isChecked();

            //**If correct answers of Reagan and Carter are selected, store as true boolean

            CheckBox q4AnswerBoxOne = (CheckBox) findViewById(R.id.question4_a1);
            boolean answer4A = q4AnswerBoxOne.isChecked();

            CheckBox q4AnswerBoxTwo = (CheckBox) findViewById(R.id.question4_a2);
            boolean answer4B = q4AnswerBoxTwo.isChecked();

            //**Check if first answer U.S.A. correct, adjust quiz score accordingly

            if (answerOne) {
                correctAnswers = correctAnswers + 1;
            } else {
                correctAnswers = correctAnswers + 0;
            }

            //**If integer 444 correctly input by user, adjust quiz score accordingly

            if (answerTwoValue == 444) {
                correctAnswers = correctAnswers + 1;
            } else {
                correctAnswers = correctAnswers + 0;
            }

            //**If correct answer Operation Eagle Claw was selected, adjust quiz score accordingly

            if (answerThree) {
                correctAnswers = correctAnswers + 1;
            } else {
                correctAnswers = correctAnswers + 0;
            }

            //**If Ronald Reagan and Jimmy Carter correctly selected, adjust quiz score accordingly

            if ((answer4A) && (answer4B)) {
                correctAnswers = correctAnswers + 1;
            } else {
                correctAnswers = correctAnswers + 0;
            }

            //**display quiz result with toast message

            Toast toast = Toast.makeText(getApplicationContext(),name + " " + getString(R.string.results_summary) + " "
                    + correctAnswers ,Toast.LENGTH_LONG);
            toast.show();


        }




    }









