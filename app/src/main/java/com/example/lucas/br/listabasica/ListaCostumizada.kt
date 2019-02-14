package com.example.lucas.br.listabasica

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast
import com.example.lucas.br.listabasica.R.layout.layout_lista
import kotlinx.android.synthetic.main.layout_lista.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        val listaContatos = ArrayList<Contato>()
        val c1 = Contato(1L, "Collor", "color@br.com", "Alagoas", R.drawable.collor)
        val c2 = Contato(2L, "Dilma", "dilma@br.com", "Porto Alegre", R.drawable.dilma)

        listaContatos.add(c1)
        listaContatos.add(c2)

        val adapter = ContatoAdapter(applicationContext, listaContatos)

        val minhalista = lstcontatos
        minhalista.adapter = adapter

        minhalista.setOnItemClickListener {parent, view, position, id ->
            val (id1, nome, email, endereco) = listaContatos.get(position)
            Toast.makeText(this, "Clicked item : $nome", Toast.LENGTH_SHORT).show()
        }

        minhalista.setOnItemClickListener {parent, view, position, id ->
            val contato = listaContatos.get(position)
            val intent = Intent(this, DetalheContato::class.java)
            intent.putExtra("contato", contato)
            startActivity(intent)
        }


    }

}



