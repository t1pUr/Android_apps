package com.example.amo_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Task2 extends AppCompatActivity {

    private Button calculate;
    private EditText numK, numC, numP, numA;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
        this.getResult();
    }


    private void getResult(){
        calculate = (Button)findViewById(R.id.calculate3);
        numK = (EditText)findViewById(R.id.numberK);
        numC = (EditText)findViewById(R.id.numberC3);
        numP = (EditText)findViewById(R.id.numberP);
        numA = (EditText)findViewById(R.id.numberA3);
        result = (TextView)findViewById(R.id.Res2);



        calculate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            double K = Double.parseDouble(numK.getText().toString());
                            double C = Double.parseDouble(numC.getText().toString());
                            double P = Double.parseDouble(numP.getText().toString());
                            double A = Double.parseDouble(numA.getText().toString());

                            double res = 0;

                            if(K * C > P)
                            {
                                res = Math.pow(Math.sin(C * A), 2);
                                result.setText("Результат: y = " + String.format("%.7f", res));
                            }
                            else if(K * C < P)
                            {
                                res = Math.pow(Math.cos(K * A), 2);
                                result.setText("Результат: y = " + String.format("%.7f", res));
                            }
                            else
                            {
                                result.setText("ОДЗ: К * С != Р");
                            }


                        }
                        catch(Exception e){
                            result.setText("змінні k, с, p та a мають бути числами");
                        }

                    }
                }
        );
    }
}