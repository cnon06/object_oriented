


package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class yaricap(var yaricap2: Int){}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    var yc1 = yaricap(5)
        println("Dairenin alanı 1: ${dairenin_alani(yc1)}")
        var yc2 = yaricap(6)
        println("Dairenin alanı 2: ${dairenin_alani(yc2)}")


        var dizdiz = Array<yaricap>(6){ yaricap(0) }

        for (i in 0..(dizdiz.size-1))
        {
            dizdiz[i] = yaricap(i)
            println("$i. Dairenin alanı: ${dairenin_alani(dizdiz[i])}")
        }




    }

    fun dairenin_alani(yaricap1: yaricap) :Int
    {

        //return ((yaricap1.yaricap2*yaricap1.yaricap2)*Math.PI).toInt()
        return (Math.pow(yaricap1.yaricap2.toDouble(),2.0) *Math.PI).toInt()
    }

}