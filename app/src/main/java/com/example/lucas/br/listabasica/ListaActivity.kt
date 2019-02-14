package com.example.lucas.br.listabasica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.layout_lista.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)

        var lista: ListView = lstcontatos

        val adapterteste = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, contatos)

        lista.adapter = adapterteste
    }

    companion object {
        internal val contatos = arrayOf("Alline", "Lucas", "Rafael", "Gabriela", "Silvana")
    }
}
