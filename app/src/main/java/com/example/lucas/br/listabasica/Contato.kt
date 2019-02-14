package com.example.lucas.br.listabasica

import java.io.Serializable

data class Contato(var id: Long,
                   var nome: String,
                   val email: String? = null,
                   val endereco: String? = null,
                   val img: Int = R.drawable.erro)

    : Serializable

