package com.example.lenovog40.tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        Button btnCuidadores = (Button) findViewById(R.id.btnCuidadores);

        btnCuidadores.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,CadastroMembroCuidador.class);
                startActivity(i);
            }
        });
    }
}
