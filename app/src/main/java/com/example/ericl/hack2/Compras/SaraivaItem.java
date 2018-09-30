package com.example.ericl.hack2.Compras;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ericl.hack2.R;
public class SaraivaItem extends AppCompatActivity {
    private AlertDialog.Builder dialog;
    private Button finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saraiva_item);
        finalizar=findViewById(R.id.finalizar_Id);

        dialog =new AlertDialog.Builder(SaraivaItem.this);

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        dialog.setTitle("Compra Solicitada");
        dialog.setMessage("Deseja Comprar esse Item??");
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(SaraivaItem.this,"Compra Efetuada ",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SaraivaItem.this ,CompraFeita.class));

            }});
       dialog.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(SaraivaItem.this,"Compra Cancelada ",Toast.LENGTH_SHORT).show();

                }



            } );dialog.create();
                dialog.show();


            }  });
    }}
