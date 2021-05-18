package com.jessestolk.opdracht4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    Random random = new Random();
    Integer randomNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        RandomizeNumber();
    }

    public void RandomizeNumber() {
        randomNumber = random.nextInt(3 - 1 + 1) + 1;
    }

    public void button1(View view) {
        Context context = getApplicationContext();
        CharSequence text = "";

        if(randomNumber.equals(1)) {
            text = "Good Job! Correct Number!";
            RandomizeNumber();
        } else {
            text = "Wrong Button, Try Again";
        }
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void button2(View view) {
        Context context = getApplicationContext();
        CharSequence text = "";

        if(randomNumber.equals(2)) {
            text = "Good Job! Correct Number!";
            RandomizeNumber();
        } else {
            text = "Wrong Button, Try Again";
        }
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void button3(View view) {
        Context context = getApplicationContext();
        CharSequence text = "";

        if(randomNumber.equals(3)) {
            text = "Good Job! Correct Number!";
            RandomizeNumber();
        } else {
            text = "Wrong Button, Try Again";
        }
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void reset(View view) {
        RandomizeNumber();
    }

    public void back(View view) {
        finish();
    }
}