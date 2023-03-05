package com.duv.projetofirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_perfil)
        supportActionBar!!.hide()
    }
}