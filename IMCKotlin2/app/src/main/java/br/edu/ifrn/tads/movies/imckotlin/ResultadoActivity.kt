package br.edu.ifrn.tads.movies.imckotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val imc = intent.getStringExtra("IMC").toDouble()
    }

    //private fun SituacaoIMC(imc : Double) : String{
        //return if(imc < 18.5)
            //""
    //}
}
