package com.example.ericl.hack2.TelaInicial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ericl.hack2.Compras.CeaActivity;
import com.example.ericl.hack2.Compras.SaraivaActivity;
import com.example.ericl.hack2.R;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaInicial extends AppCompatActivity {
    private Button cea;
    private Button saraiva;
    private EditText screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
       cea =findViewById(R.id.cea_Id);
       saraiva=findViewById(R.id.saraiva_Id);
       screen=findViewById(R.id.screen_Id);


         if(screen.getText().equals("cea")){
             startActivity(new Intent(TelaInicial.this ,CeaActivity.class));

         }

        cea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(TelaInicial.this ,CeaActivity.class));

            }
        });
        saraiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(TelaInicial.this ,SaraivaActivity.class));

            }
        });

    }
}
