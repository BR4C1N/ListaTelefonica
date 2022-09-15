package com.software.listatelefonica.bancoDados;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.software.listatelefonica.entidades.Telefones;

import java.util.Date;
import java.util.List;

public class TelefonesDB {
    private DBHelper db;
    private SQLiteDatabase conexao;

    public TelefonesDB(DBHelper db) {
        this.db = db;
    }

    public void inserir(Telefones telefone) {
        conexao = db.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("nome", telefone.getNome());
        valores.put("dataNascimento", telefone.getDataNascimento().toString());
        valores.put("telefone", telefone.getTelefone());

        conexao.insertOrThrow("listaTelefonica", null, valores);

        conexao.close();
    }

    public void atualizar(Telefones telefone) {
        conexao = db.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("nome", telefone.getNome());
        valores.put("dataNascimento", telefone.getDataNascimento().toString());
        valores.put("telefone", telefone.getTelefone());

        conexao.update("listaTelefonica", valores, "id=?", new String[]{telefone.getId().toString()});

        conexao.close();
    }

    public void remover(Integer id) {
        conexao = db.getWritableDatabase();

        conexao.delete("listaTelefonica", "id=?", new String[]{id + ""});

        conexao.close();
    }

    public void listar(List listaTelefonica) {
        listaTelefonica.clear();
        conexao = db.getReadableDatabase();

        String colunas[] = {"id", "nome", "dataNascimento", "telefone"};
        Cursor query = conexao.query("listaTelefonica", colunas, null, null, null, null, "nome");

        while (query.moveToNext()) {
            Telefones telefone = new Telefones();

            telefone.setId(Integer.parseInt(query.getString(0)));
            telefone.setNome(query.getString(1));
            telefone.setDataNascimento(new Date(query.getString(2)));
            telefone.setTelefone(query.getString(3));

            listaTelefonica.add(telefone);
        }

        conexao.close();
    }
}
