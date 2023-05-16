package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText user_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void registerMethod(View v){
        user_name = findViewById(R.id.username_2);
        Toast.makeText(SecondActivity.this,"Hi " +user_name.getText(), Toast.LENGTH_SHORT).show();


    }
    public void loginMethod(View v){

        Intent Intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(Intent);

    }
}