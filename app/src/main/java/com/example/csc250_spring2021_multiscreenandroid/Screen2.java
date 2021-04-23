package com.example.csc250_spring2021_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity
{
    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView nameTV = this.findViewById(R.id.answerTV);
        Intent myIntent = this.getIntent();
        this.value = myIntent.getStringExtra("value");
        nameTV.setText(value);
    }

    private String squareRoot(double n)
    {
        double answer;
        answer = Math.sqrt(n);
        String answerStr = "" + answer;
        return answerStr;
    }

    /*
    @Override
    protected void onStop() {
        super.onStop();
        TextView nameTV = this.findViewById(R.id.nameTV);
        nameTV.setText("WOOT");
    }
    */

    public void onNextScreenButtonPressed(View v)
    {
        Intent i = new Intent(this, Screen3.class);
        String current = squareRoot(Integer.parseInt(value));
        i.putExtra("answer", current);
        this.startActivity(i);
    }
}