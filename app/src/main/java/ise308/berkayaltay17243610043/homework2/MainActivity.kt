package ise308.berkayaltay17243610043.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sportM = Sport("Honda CBR1000RR",0,"winter")
        sportM.printInfo()
        sportM.addKm(5000)
        sportM.printInfo()

        sportM.addKm(10000)
        sportM.printInfo()

        sportM.addKm(3000)
        sportM.printInfo()

        sportM.addKm(3000)
        sportM.printInfo()

        sportM.addKm(10000)
        sportM.printInfo()


        val chooperM = Chooper("Harley Davidson",15000,"summer",70,50,5000)

        chooperM.printInfo()
        chooperM.addKm(500)
        chooperM.printInfo()

        chooperM.addKm(23000)
        chooperM.printInfo()

        chooperM.addKm(1000)
        chooperM.printInfo()


    }


}