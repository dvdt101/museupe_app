package com.example.museupe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DonateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
    }

    public void doar(View v){

        RadioGroup opdoacoes = findViewById(R.id.opcoesDoacoes);
        int selectedId = opdoacoes.getCheckedRadioButtonId();
        EditText valordoacao = findViewById(R.id.inputOutrovalor);
        String valor = valordoacao.getText().toString();
        String valorSelecionado = "";

        if(selectedId != -1) {
            RadioButton rb = findViewById(selectedId);
            valorSelecionado = rb.getText().toString();
        }


        AlertDialog.Builder resultadoDoacao = new AlertDialog.Builder(DonateActivity.this);

        if(valor.isEmpty() && selectedId != -1){

            resultadoDoacao
                    .setTitle("Doação realizada")
                    .setMessage("Agradecemos por "+ valorSelecionado)
                    .create()
                    .show();
        }else if(!valor.isEmpty()){
            resultadoDoacao
                    .setTitle("Doação realizada")
                    .setMessage("Agradecemos sua doação de "+ valor+"R$")
                    .create()
                    .show();
        }else{
            resultadoDoacao
                    .setTitle("Doação não realizada")
                    .setMessage("Por favor selecione ou insira algum valor")
                    .create()
                    .show();
        }
    }



}