package com.example.amo_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task3 extends AppCompatActivity {

    private Button calculate;
    private EditText numN, numP;
    private TextView result, arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        this.getResult();
    }


    private void getResult(){
        calculate = (Button)findViewById(R.id.calculate);
        numN = (EditText)findViewById(R.id.numberN);
        numP = (EditText)findViewById(R.id.numberP3);
        result = (TextView)findViewById(R.id.res);
        arr = (TextView)findViewById(R.id.array);



        calculate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            int N = Integer.parseInt(numN.getText().toString());
                            int P = Integer.parseInt(numP.getText().toString());
                            double res = 0;
                            Random rand = new Random();
                            float[] A = new float[N];
                            float[] B = new float[P];


                            String resA = "";
                            String resB = "";
                            for (int i = 0; i < N; i++) {
                                A[i] = (float) Math.random() * 10;
                                resA += Float.toString(A[i]) + ", ";
                            }
                            for (int j = 0; j < P; j++) {
                                B[j] = (float) Math.random() * 10;
                                resB += Float.toString(B[j]) + ", ";
                            }



                            for (int i = 0; i < N; i++) {
                                double Pe = 1;
                                for (int j = 0; j < P; j++) {
                                    Pe *= (Math.pow(A[i], 2) + Math.pow(B[j], 3));
                                }
                                res += Pe;
                            }
                            resA = resA.substring(0, resA.length()-2);
                            resB = resB.substring(0, resB.length()-2);
                            
                            result.setText("Результат: f = " + String.format("%.7f", res));
                            arr.setText(String.format("a=[%s]\nb=[%s]", resA, resB));
                        }
                        catch(Exception e){
                            result.setText("змінні n, p та х мають бути цілими додатніми числами");
                        }

                    }
                }
        );
    }

}