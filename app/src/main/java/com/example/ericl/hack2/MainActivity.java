package com.example.ericl.hack2;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import com.example.ericl.hack2.TelaInicial.TelaInicial;

public class MainActivity extends AppCompatActivity {
private EditText senha;
private EditText cpf;
private Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        senha=findViewById(R.id.senha_Id);
        cpf=findViewById(R.id.cpf_Id);
        entrar=findViewById(R.id.entrar_Id);




 entrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        startActivity(new Intent(MainActivity.this ,TelaInicial.class));

    }
});




        }    }

