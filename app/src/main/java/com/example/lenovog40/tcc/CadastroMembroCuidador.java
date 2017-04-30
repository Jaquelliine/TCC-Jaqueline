package com.example.lenovog40.tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastroMembroCuidador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_membro_cuidador);

        Button cadastroCM = (Button) findViewById(R.id.cadastroCM);
        cadastroCM.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(CadastroMembroCuidador.this, Dashboard.class);
                startActivity(i);
            }
        });




    }
}
