package com.example.mt_2016.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Basic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
    }
    public void doSomeWork(View view){
        Toast.makeText(this, "ButtonClicked", Toast.LENGTH_SHORT).show();
        Textview tv = (Textview)findViewById(R.id.text1);
        tv.setText("Updated from UI");
    }
}
