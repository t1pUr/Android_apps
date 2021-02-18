package com.example.amo_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button onWindow1, onWindow2, onWindow3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OpenWindow();
    }

    public void OpenWindow(){
        onWindow1 = (Button)findViewById(R.id.button);

        onWindow1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent firstPage = new Intent("com.example.amo_lab1.Task1");
                        startActivity(firstPage);
                    }
                }
        );


        onWindow2 = (Button)findViewById(R.id.button2);

        onWindow2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent secondPage = new Intent("com.example.amo_lab1.Task2");
                        startActivity(secondPage);
                    }
                }
        );


        onWindow3 = (Button)findViewById(R.id.button3);

        onWindow3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent thirdPage = new Intent("com.example.amo_lab1.Task3");
                        startActivity(thirdPage);
                    }
                }
        );





    }

}