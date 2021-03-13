package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4;
    EditText text1, text2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        text1 = (EditText) findViewById(R.id.text1);
        text2 = (EditText) findViewById(R.id.editTextTextPersonName3);

        textView = (TextView) findViewById(R.id.textView5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        String editText1 = text1.getText().toString();
        int editNumber1 = Integer.parseInt(editText1);
        String editText2 = text2.getText().toString();
        int editNumber2 = Integer.parseInt(editText2);
        int plus = editNumber1 + editNumber2;
        String massage;
            switch (v.getId()) {
                case R.id.button1:
                    massage = Integer.toString(plus);
                    textView.setText(massage);
                    break;

                case R.id.button2:
                    int minus = editNumber1 - editNumber2;
                    massage = Integer.toString(minus);
                    textView.setText(massage);
                    break;

                case R.id.button3:
                    int umnoj = editNumber1 * editNumber2;
                    massage = Integer.toString(umnoj);
                    textView.setText(massage);
                    break;

                case R.id.button4:
                    int umnoj1 = editNumber1 / editNumber2;
                    massage = Integer.toString(umnoj1);
                    textView.setText(massage);
                    break;

            }

    }
}