package br.edu.ifrn.tads.movies.imckotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calc_btn.setOnClickListener{CalculaIMC()}
    }

    private fun CalculaIMC(){
        val altura = editAltura.text.toString().toDouble()
        val peso = editPeso.text.toString().toDouble()
        val imc = (peso / (altura * altura)).toString()
        val intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("IMC", imc)
        startActivity(intent)
    }
}
