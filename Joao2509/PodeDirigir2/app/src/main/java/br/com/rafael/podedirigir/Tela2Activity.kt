package br.com.rafael.podedirigir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        txvSaudacao.text = "Seja bem vindo ${intent.getStringExtra("Nome")}"

        // Criando uma lista de Idades
        val listaIdades = arrayListOf("Selecione sua idade", 1)

        // Preenchendo a lista de idades
        for (numero in 2..100) {
            listaIdades.add(numero)
        }
        // Criando um adaptador
        val idadesAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            listaIdades
        )

        //Plugando o adaptador no spinner
        spnIdades.adapter = idadesAdapter

        btnVerificar.setOnClickListener {

            //Obtendo a idade selecionada
            var idade = spnIdades.selectedItem as Int

            //Verificando a idade
            if (idade >= 18){
                txvResultado.text = "Pode Dirigir"
            }else {
                txvResultado.text = "Não Pode"
            }
        }
    }
}


