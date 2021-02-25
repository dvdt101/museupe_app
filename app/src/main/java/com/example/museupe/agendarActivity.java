package com.example.museupe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class agendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar);

    }

    public void agendar(View v){

        EditText nome = findViewById(R.id.inputNome);
        Spinner estados = findViewById(R.id.spinnerEstados);
        RadioGroup sexo = findViewById(R.id.sexoRadios);
        String estadoSRT = estados.getSelectedItem().toString();
        String nomeSTR = nome.getText().toString();


        AlertDialog.Builder confirmacao = new AlertDialog.Builder(agendarActivity.this);

        if(!nomeSTR.isEmpty() && sexo.getCheckedRadioButtonId() != -1 && !estadoSRT.equals("Selecione estado") ) {
            confirmacao
                    .setTitle("Agendamento realizado")
                    .setMessage(nomeSTR + " seu agendamento de visita foi realizado com sucesso!")
                    .create()
                    .show();
        }else{
            confirmacao
                    .setTitle("Agendamento não realizado")
                    .setMessage("Por favor preenchar todos os campos")
                    .create()
                    .show();
        }
    }
}