
package br.com.joao.alerta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando o alerta
        val alerta = AlertDialog.Builder(this)

        btnAlert.setOnClickListener {
            alerta.setTitle("Alerta de um botão")
                .setMessage("Aqui você pode escrever uma mensagem.")
                .setPositiveButton("Ok") { _, _ ->
                    //Ação de clique do botão positivo
                }
                .create()
                .show()
        }

        btnAlert2.setOnClickListener {
            alerta.setTitle("Alerta de dois botões")
                .setMessage("Mensagem aqui")
                .setPositiveButton("Ok", null)
                .setNegativeButton("Finalizar") { _, _ ->
                    //Ação de clique no botão negativo
                    //Tirando o app de memória
                    finishAndRemoveTask()
                }
                .create()
                .show()

        }

        btnAlert3.setOnClickListener {
            alerta.setTitle("Alerta com três botões")
                .setPositiveButton("Ok", null)
                .setNegativeButton("Finalizar") { _, _ ->
                    finishAndRemoveTask()
                }
                .setNeutralButton("Cancelar", null)
                .setCancelable(false)
                .setIcon(R.mipmap.ic_launcher_round)
                .create()
                .show()
            }
        }
}
