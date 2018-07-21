package com.rahmahnajiyahimtihan.kalkulator_use_when

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnTambah2.setOnClickListener {
            if (valid()){ //valid kondisi untk melihat hasil jk == mka
                calculate("+")
            }
            else tampilAlert()
        }

        btnKali2.setOnClickListener {
            if (valid()){
                calculate("*")
            }
            else tampilAlert()
        }

        btnBagi2.setOnClickListener {
            if (valid()){
                calculate("/")
            }
            else tampilAlert()
        }

        btnKurang2.setOnClickListener {
            if (valid()){
                calculate("-")
            }
            else tampilAlert()
        }

        btnClear2.setOnClickListener {
            txtHasil2.text = ""
            angka1.text = null
            angka2.text = null
        }
    }

    private fun tampilAlert() {
        val alert = AlertDialog.Builder(this)
        alert.setTitle("this is alert")
        alert.setPositiveButton("yes", DialogInterface.OnClickListener { dialogInterface, i ->

        })
        alert.setNegativeButton("yes", DialogInterface.OnClickListener { dialogInterface, i ->

        })
        alert.setNeutralButton("yes", DialogInterface.OnClickListener { dialogInterface, i ->

        })

    }

    private fun calculate(s: String) {
        val inputOne = angka1.text.toString().toDouble()
        val inputTwo = angka2.text.toString().toDouble()

        when (s) {
            "+" -> txtHasil2.text = (inputOne + inputTwo).toString()
            "*" -> txtHasil2.text = (inputOne * inputTwo).toString()
            "/" -> txtHasil2.text = (inputOne / inputTwo).toString()
            "-" -> txtHasil2.text = (inputOne - inputTwo).toString()
        }
    }

    private fun valid(): Boolean {
        if (angka1.text.toString() != "" || angka2.text.toString() != ""){
            return true
        }else{
            return false
        }

    }
}


