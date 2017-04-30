package com.example.lenovog40.tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CadastroResponsavel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_responsavel);

        Button cadastroR = (Button) findViewById(R.id.cadastroR);
        cadastroR.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(CadastroResponsavel.this, Login.class);
                startActivity(i);
            }
        });



        TextView logar = (TextView) findViewById(R.id.logar);
        logar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(CadastroResponsavel.this, Login.class);
                startActivity(i);
            }
        });
    }
}
