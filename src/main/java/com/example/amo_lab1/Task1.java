package com.example.amo_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOError;

public class Task1 extends AppCompatActivity {

    private Button calculate;
    private EditText numA, numC, numX;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        this.getResult();

    }

    private void getResult(){
        calculate = (Button)findViewById(R.id.Calculate);
        numA = (EditText)findViewById(R.id.NumberA);
        numC = (EditText)findViewById(R.id.numberC);
        numX = (EditText)findViewById(R.id.numberX);
        result = (TextView)findViewById(R.id.textView);



        calculate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            double A = Double.parseDouble(numA.getText().toString());
                            double C = Double.parseDouble(numC.getText().toString());
                            double X = Double.parseDouble(numX.getText().toString());
                            double res = Math.pow((A + X), 2) / 5 + Math.pow((A + C), 3) / 2;
                            result.setText("Результат: Y1 = " + String.format("%.7f", res));
                        }
                        catch(Exception e){
                            result.setText("змінні а, с та х мають бути числами");
                        }

                    }
                }
        );
    }

}