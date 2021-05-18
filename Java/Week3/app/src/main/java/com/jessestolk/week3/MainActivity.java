package com.jessestolk.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textview_0;
    int peopleCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview_0 = findViewById(R.id.textView);
        textview_0.setText(String.valueOf(peopleCount));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Week3", "Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Week3", "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Week3", "Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Week3", "Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Week3", "Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Week3", "Restart");
    }

    public void add(View view){
        peopleCount++;
        textview_0.setText(String.valueOf(peopleCount));
        Log.d("Week3", "added one person, total amount: " + peopleCount);
    }

    public void reset(View view){
        Context context = getApplicationContext();
        CharSequence text = "Counter Reset";

        peopleCount = 0;
        textview_0.setText(String.valueOf(peopleCount));
        Log.d("Week3", "reset the counter to: " + peopleCount);

        Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        toast.show();
    }

    public void exit(View view){
        finish();
        Log.d("Week3", "added one person, total amount: " + peopleCount);
    }

    public void next(View view){
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
        Log.d("Week3", "added one person, total amount: " + peopleCount);
    }
}