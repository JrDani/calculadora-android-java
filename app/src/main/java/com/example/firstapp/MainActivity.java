package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int operacao = 0;
    private Integer esquerda = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void adicionarNumero(View view) {
        String numero = ((TextView) view).getText().toString();
        TextView resultado = ((TextView) findViewById(R.id.resultado));
        resultado.setText(resultado.getText() + numero);
    }

    public void operarCalculo(View view){
            String operador = ((TextView) view).getText().toString();
            TextView n1 = ((TextView) findViewById(R.id.resultado));
            n1.setText(n1.getText() +" "+operador+" ");

    }

    public void fazSoma(View view){
        TextView n1 = ((TextView) findViewById(R.id.resultado));
        this.esquerda = Integer.parseInt(n1.getText().toString());
        n1.setText(n1.getText() +" + ");
        this.operacao = 1;
    }
    public void fazSub(View view){
        TextView n1 = ((TextView) findViewById(R.id.resultado));
        this.esquerda = Integer.parseInt(n1.getText().toString());
        n1.setText(n1.getText() +" - ");
        this.operacao = 2;
    }
    public void fazMul(View view){
        TextView n1 = ((TextView) findViewById(R.id.resultado));
        this.esquerda = Integer.parseInt(n1.getText().toString());
        n1.setText(n1.getText() +" X ");
        this.operacao = 3;
    }
    public void fazDiv(View view){
        TextView n1 = ((TextView) findViewById(R.id.resultado));
        this.esquerda = Integer.parseInt(n1.getText().toString());
        n1.setText(n1.getText() +" / ");
        this.operacao = 4;
    }

    public void pegaResultado(View view){

        TextView resultado = ((TextView) findViewById(R.id.resultado));
        String expressao = resultado.getText().toString();
        String[] texto = expressao.split(" ");

        Integer direita = Integer.parseInt(texto[2]);

        switch (this.operacao){
            case 1:
                Integer soma = this.esquerda + direita;
                resultado.setText(soma.toString());
                break;
            case 2:
                Integer sub = this.esquerda - direita;
                resultado.setText(sub.toString());
                break;
            case 3:
                Integer mul = this.esquerda * direita;
                resultado.setText(mul.toString());
                break;
            case 4:
                Integer div = this.esquerda / direita;
                resultado.setText(div.toString());
                break;
        }

    }
}


