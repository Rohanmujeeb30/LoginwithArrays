package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText editText1, editText2;
  Button loginbtn;
  boolean isvalid = false;
  String[] arr=  new String[3];
  String[] arr1 = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.email);
        editText2  = findViewById(R.id.pass);
        loginbtn = findViewById(R.id.login);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input= editText1.getText().toString();
                String input1= editText2.getText().toString();
                if(!input.equalsIgnoreCase("")&& !input1.equalsIgnoreCase("")){
                    String[] userid = {"MESSI","RONALDO","ROHAAN"};
                    String[] pass= {"123","1234","12345"};
                    for(int i=0; i<3; i++){
                        if(input.equals(userid[i])&& input1.equals(pass[i])){
                            isvalid = true;

                            Toast.makeText(getApplicationContext(),"You're Successfully Login",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(MainActivity.this,Activity2.class);
                            startActivity(intent);
                        }
                    }
                    if(!isvalid){
                        Toast.makeText(getApplicationContext(),"MAKE SURE YOU'RE PUTTING CORRECT USERNAME OR PASSWORD",Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(getApplicationContext(),"Please Login First",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }}
