package br.com.joao.persistenciadados

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando o Arquivo de Preferencias compartilhadas

        val minhasPreferencias = getSharedPreferences("mensagens", Context.MODE_PRIVATE)

        //Criando um editor de preferencias

        var editor = minhasPreferencias.edit()

        //Clique do botão gravar

        btnGuardar.setOnClickListener {

            //Obtendo a mensagem digitada

            val mensagem = edtMensagem.text.toString()

            //Verificando se a mensagem foi digitada
            if (mensagem.isNotEmpty()){
                //Salvando no arquivo de preferencias
                editor.putString("msg", mensagem).apply()
                Toast.makeText(this, "Mensagem Gravada"+"", Toast.LENGTH_LONG).show()



            }else{
                //Exibindo mensagem
                Toast.makeText(this, "Digite algo", Toast.LENGTH_LONG).show()
            }
                //Clique do botão recuperar
            btnRecuperar.setOnClickListener{
                txvResultado.text = minhasPreferencias.getString("msg","Error 204")
            }
        }
    }
}
