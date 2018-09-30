package com.example.ericl.hack2.Compras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ericl.hack2.R;
import com.example.ericl.hack2.TelaInicial.TelaInicial;

public class CompraFeita extends AppCompatActivity {
private Button comprado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra_feita);

        comprado=findViewById(R.id.botaoContinuar);

        comprado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CompraFeita.this ,TelaInicial.class));

            }
        });
    }
}
