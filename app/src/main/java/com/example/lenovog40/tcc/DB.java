package com.example.lenovog40.tcc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Lenovo G40 on 30/04/2017.
 */

public class DB {
    private SQLiteDatabase db;

    public DB(Context context) {
        DBHelper aux = new DBHelper(context);
        db = aux.getWritableDatabase();
    }

    public void cadastraPessoa(Pessoa p) {
        ContentValues dados = new ContentValues();
        dados.put("nome", p.getNome());
        dados.put("email", p.getEmail());
        dados.put("endereco", p.getEndereco());
        dados.put("telefone", p.getTelefone());
        dados.put("cpf", p.getCpf());
        dados.put("senha", p.getSenha());
        dados.put("nivel_acesso", p.isNivelAcesso());
        db.insert("pessoa", null, dados);

    }

    public void updatePessoa(Pessoa p) {
        ContentValues dados = new ContentValues();
        dados.put("nome", p.getNome());
        dados.put("email", p.getEmail());
        dados.put("endereco", p.getEndereco());
        dados.put("telefone", p.getTelefone());
        dados.put("cpf", p.getCpf());
        dados.put("senha", p.getSenha());
        db.update("pessoa", dados, "_id =" + p.get_id(), null);

    }

    public void excluirPessoa(Pessoa p) {
        db.delete("pessoa", "_id=" + p.get_id(), null);

    }

    public Pessoa carregaPessoa(int id) {
        Pessoa p = new Pessoa();
        String[] colunas = new String[]{"_id", "nome", "email", "endereco", "telefone", "cpf", "senha", "nivel_acesso"};
        Cursor cursor = db.query("pessoa", colunas, "_id=" + id, null, null, null, null);
        if (cursor.getCount() == 0) {
            cursor.moveToFirst();

            p.set_id(cursor.getInt(1));
            p.setNome(cursor.getString(2));
            p.setEmail(cursor.getString(3));
            p.setEndereco(cursor.getString(4));
            p.setTelefone(cursor.getDouble(5));
            p.setCpf(cursor.getInt(6));
            p.setSenha(cursor.getString(7));
            p.setNivelAcesso(cursor.getInt(8) > 0);

        }
        return p;
    }

}
