package com.example.smuh4.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    EditText editText_Name;
    EditText editText_Email;
    EditText editText_Age;
    Button btn_search;

    public void onclickfunc(View v){
        EditText editText_Name = (EditText)findViewById(R.id.edit_name);
        String name = editText_Name.getText().toString();
        EditText editText_Email = (EditText)findViewById(R.id.edit_email);
        String email = editText_Email.getText().toString();
        EditText editText_Age = (EditText)findViewById(R.id.edit_age);
        String age = editText_Age.getText().toString();

        Toast.makeText(MainActivity.this,name+email+age,Toast.LENGTH_LONG).show();

    }


}