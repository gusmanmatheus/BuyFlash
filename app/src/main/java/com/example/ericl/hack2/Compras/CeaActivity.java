package com.example.ericl.hack2.Compras;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import com.example.ericl.hack2.R;
import com.example.ericl.hack2.TelaInicial.TelaInicial;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CeaActivity extends AppCompatActivity {
    private AlertDialog.Builder dialog;
    private Button item1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cea);

        item1 = findViewById(R.id.abrimenu);


        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CeaActivity.this ,Menu.class));


            }
        });


    }
}