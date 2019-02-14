package com.example.lucas.br.listabasica

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.lucas.br.listabasica.R.id.nomecontato

class DetalheContato : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalhe_contato)

        val intent = intent
        intent.run{
            val contato = intent.getSerializableExtra("contato") as Contato
            val nomecontato = nomecontato
            nomecontato.text = contato.nome
        }
    }
}
