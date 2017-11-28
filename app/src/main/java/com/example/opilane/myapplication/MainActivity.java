package com.example.opilane.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private EditText opr1, opr2;
    private Button lahuta, liida, korruta, jaga, kustuta;
    private TextView tulemus,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opr1=(EditText)findViewById(R.id.editOp1);
        opr2=(EditText)findViewById(R.id.editOp2);
        liida=(Button) findViewById(R.id.liida);
        lahuta=(Button) findViewById(R.id.lahuta);
        jaga=(Button) findViewById(R.id.jaga);
        korruta=(Button) findViewById(R.id.korruta);
        tulemus=(TextView)findViewById(R.id.kustuta)

        liida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opr1.getText().length()>0)&&(opr2.getText().length()>0){
                    double oper1= double.parseDouble(opr1.getText().toString());
                    double oper2= double.parseDouble(opr2.getText().toString());
                    double tulem= oper1 + oper2;
                    tulemus.setText(double.toString(tulem));
            else
                    Toast toast = Toast.makeText(Context: MainActivity.this,   Text: "Sisesta vajalik number", Toast.LENGTH_LONG;
                    toast.show();

                    lahuta.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (opr1.getText().length()>0)&&(opr2.getText().length()>0){
                                double oper1= double.parseDouble(opr1.getText().toString());
                                double oper2= double.parseDouble(opr2.getText().toString());
                                double tulem= oper1 + oper2;
                                tulemus.setText(double.toString(tulem));
            else
                                Toast toast = Toast.makeText(Context: MainActivity.this,   Text: "Sisesta vajalik number", Toast.LENGTH_LONG;
                                toast.show();

                                liida.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if (opr1.getText().length()>0)&&(opr2.getText().length()>0){
                                            double oper1= double.parseDouble(opr1.getText().toString());
                                            double oper2= double.parseDouble(opr2.getText().toString());
                                            double tulem= oper1 + oper2;
                                            tulemus.setText(double.toString(tulem));
            else
                                            Toast toast = Toast.makeText(Context: MainActivity.this,   Text: "Sisesta vajalik number", Toast.LENGTH_LONG;
                                            toast.show();
                }
            }
        });


    }



