package br.com.joao.camera

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //Declarar
    val requestCamera = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCamera.setOnClickListener {
            //Criar a intent da camera
            val intentCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intentCamera, requestCamera)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        requestCode

        if(requestCode == requestCamera){
            if(resultCode == Activity.RESULT_OK && data != null){
                imgFoto.setImageBitmap(data.extras!!.get("data") as Bitmap)
            }

        }
    }





}
