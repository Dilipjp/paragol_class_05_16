package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login_btn;
    EditText user_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginMethod(View v){
        user_name = findViewById(R.id.username_2);
        Toast.makeText(MainActivity.this,"Hi " +user_name.getText(), Toast.LENGTH_SHORT).show();

    }

    public void registerMethod(View v){

        Intent Intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(Intent);

    }

}