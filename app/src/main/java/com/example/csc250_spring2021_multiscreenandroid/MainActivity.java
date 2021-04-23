package com.example.csc250_spring2021_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inputET = this.findViewById(R.id.inputET);
        this.answerTV = this.findViewById(R.id.answerTV);

    }
    private int factorial(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return (n * factorial(n-1));
        }
    }

    public void onFactorialButtonClicked(View v)
    {
        //launch the next screen
        Intent i = new Intent(this, Screen2.class);
        int current = Integer.parseInt(this.inputET.getText().toString());
        String answer = "" + factorial(current);
        i.putExtra("value", answer);
        this.startActivity(i);
    }
}