package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    Float numero1 = 0.0f;
    Float numero2 = 0.0f;
    String operacion = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
    }
    public void clic0 (View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("0");
        }else{
            resultado.setText(resultado.getText() + "0");
        }
    }
    public void clic1 (View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("1");
        }else{
            resultado.setText(resultado.getText() + "1");
        }
    }
    public void clic2 (View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("2");
        }else{
            resultado.setText(resultado.getText() + "2");
        }
    }
    public void clic3 (View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("3");
        }else{
            resultado.setText(resultado.getText() + "3");
        }
    }
    public void clic4 (View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("4");
        }else{
            resultado.setText(resultado.getText() + "4");
        }
    }
    public void clic5 (View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("5");
        }else{
            resultado.setText(resultado.getText() + "5");
        }
    }
    public void clic6(View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("6");
        }else{
            resultado.setText(resultado.getText() + "6");
        }
    }
    public void clic7 (View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("7");
        }else{
            resultado.setText(resultado.getText() + "7");
        }
    }
    public void clic8 (View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("8");
        }else{
            resultado.setText(resultado.getText() + "8");
        }
    }
    public void clic9 (View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("9");
        }else{
            resultado.setText(resultado.getText() + "9");
        }
    }
    public void suma (View view){
        operacion = "+";
        GuardarNo1(view);
    }
    public void resta (View view){
        operacion = "-";
        GuardarNo1(view);
    }
    public void division (View view){
        operacion = "/";
        GuardarNo1(view);
    }
    public void Limpiar (View view){
        resultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
        resultado.setTextColor(Color.BLACK);
    }
    public void GuardarNo1 (View view){
        numero1 = Float.parseFloat(resultado.getText().toString());
        resultado.setText("0");
    }
    public void Igual (View view){
        Float answer = 0.0f;
        numero2 = Float.parseFloat(resultado.getText().toString());

        //operaciones
        if (operacion == "+"){
            answer = numero1+numero2;
            resultado.setText(answer.toString());
            resultado.setTextColor(Color.GREEN);
        } else if (operacion == "-") {
            answer = numero1-numero2;
            resultado.setText(answer.toString());
        } else if (operacion == "/") {
            answer = numero1/numero2;
            resultado.setText(answer.toString());
        }
    }
}