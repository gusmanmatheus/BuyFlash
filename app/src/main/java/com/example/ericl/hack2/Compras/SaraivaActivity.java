package com.example.ericl.hack2.Compras;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ericl.hack2.R;
import com.example.ericl.hack2.TelaInicial.TelaInicial;

public class SaraivaActivity extends AppCompatActivity {
private ImageView item1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saraiva);

        item1=findViewById(R.id.g4);


        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SaraivaActivity.this ,SaraivaItem.class));



            }  });
}}