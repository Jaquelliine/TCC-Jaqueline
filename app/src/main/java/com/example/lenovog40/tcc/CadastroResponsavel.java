package com.example.lenovog40.tcc;

import android.content.Intent;
import android.database.SQLException;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class CadastroResponsavel extends AppCompatActivity {
    Button cadastroRbutton;
    TextView nomeR;
    TextView cpfR;
    TextView emailR;
    TextView telefoneR;
    TextView senhaR;
    RadioButton radioButton2;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_responsavel);

        cadastroRbutton = (Button) findViewById(R.id.cadastroRbutton);

        nomeR = (TextView) findViewById(R.id.nomeR);
        cpfR = (TextView) findViewById(R.id.cpfR);
        emailR = (TextView) findViewById(R.id.emailR);
        telefoneR = (TextView) findViewById(R.id.telefoneR);
        senhaR = (TextView) findViewById(R.id.senhaR);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);

        cadastroRbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                DB db = new DB(CadastroResponsavel.this);
try {

    Pessoa p = new Pessoa();
    p.setNome(nomeR.getText().toString());
    p.setCpf(Integer.getInteger(cpfR.getText().toString()));
    p.setEmail(emailR.getText().toString());
    p.setTelefone(Integer.getInteger(telefoneR.getText().toString()));
    p.setSenha(senhaR.getText().toString());
    p.setNivelAcesso(radioButton2.isChecked());




    db.cadastraPessoa(p);
} catch (SQLException e){

    System.out.println("Erro:"+e);

}

                Intent i = new Intent(CadastroResponsavel.this, Login.class);
                startActivity(i);



                Pessoa teste = db.carregaPessoa(1);

                System.out.println(teste.get_id());
                System.out.println(teste.getNome());
                System.out.println(teste.getCpf());
                System.out.println(teste.getEmail());
                System.out.println(teste.getTelefone());
                System.out.println(teste.getSenha());
                System.out.println(teste.isNivelAcesso());


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
