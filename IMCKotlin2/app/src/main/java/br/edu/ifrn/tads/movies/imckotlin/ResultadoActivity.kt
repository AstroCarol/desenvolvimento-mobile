package br.edu.ifrn.tads.movies.imckotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val imc = intent.getStringExtra("imc").toDouble()
    }

    private fun SituacaoIMC(imc : Double) : String {
        if (imc < 18.5)
            return "Abaixo do peso "
        else if (imc < 24.5)
            return "Peso normal "
        else
            return "Obesidade "
    }
}
