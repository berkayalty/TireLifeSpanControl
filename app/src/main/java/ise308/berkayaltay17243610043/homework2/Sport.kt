package ise308.berkayaltay17243610043.homework2

import android.util.Log

class Sport(brand: String,
            currentKm: Int,
            tireType : String,
            lifespanOfFrontTire: Int = 100,
            lifespanOfRearTire : Int = 100,
            tireLastModifiedKm: Int = 0):
        Motorcycle(brand,currentKm,tireType,lifespanOfFrontTire,lifespanOfRearTire,tireLastModifiedKm){

    companion object{
        var frontTireCoefficient = 0.005
        var rearTireCoefficient = 0.007
        val TAG = "SPORT"
    }

    init{
        if(this.tireType == "summer"){
            Log.i(TAG,"Sport motorcycle $brand's tire type is summer.")
            frontTireCoefficient +=0.001
            rearTireCoefficient += 0.001
        }else if(this.tireType == "winter"){
            Log.i(TAG,"Sport motorcycle $brand's tire type is winter.")
            frontTireCoefficient -= 0.001
            rearTireCoefficient -= 0.001
        }
    }

    override fun addKm(km:Int){
        currentKm += km
        Log.i(TAG,"Sport motorcycle '$brand' make $km km and current km is $currentKm")
        this.calculateLifeSpan(km)
    }

    override fun calculateLifeSpan(madeKm:Int){
        this.lifespanOfFrontTire -= (frontTireCoefficient*madeKm).toInt()
        this.lifespanOfRearTire -= (rearTireCoefficient*madeKm).toInt()
        var isChanged = false
        if(lifespanOfFrontTire <= 0){
            Log.i(TAG,"Sport motorcycle $brand's front tires are changed.")
            lifespanOfFrontTire = 100
            this.tireLastModifiedKm = this.currentKm
            isChanged = true
        }
        if(lifespanOfRearTire <=0){
            Log.i(TAG,"Sport motorcycle $brand's rear tires are changed.")
            lifespanOfRearTire=100
            this.tireLastModifiedKm = this.currentKm
            isChanged = true
        }
        if(!isChanged){
            Log.i(TAG,"Sport motorcycle $brand no need to tire change.")
        }
    }

    override fun printInfo(){
        Log.i(TAG,this.toString())
    }

    override fun toString(): String {
        return "Sport Motorcycle $brand's infos;\n" +
                "Current Km: $currentKm\n" +
                "Tire Type: $tireType\n" +
                "Life span of front tire(percent): $lifespanOfFrontTire\n" +
                "Life span of rear tire(percent): $lifespanOfRearTire\n" +
                "Tire last modified Km: $tireLastModifiedKm"
    }
}