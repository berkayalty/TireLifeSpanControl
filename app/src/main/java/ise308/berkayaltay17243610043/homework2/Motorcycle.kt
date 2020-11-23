package ise308.berkayaltay17243610043.homework2

import android.util.Log

/*params:
    brand : String (stores motorcycle brand name)
    currentKm: Int (km of motorcycle) (default value = 0)
    tireType : String (summer,winter )
    lifespanOfFrontTire : Int (stores the life of the front tire as a percentage)(default value = 100)
    lifespanOfRearTire : Int (stores the life of the rear tire as a percentage)(default value = 100)
    tireLastModifiedKm : Int (stores the when last tire change is which km) (default value = 0)
*/
open class Motorcycle(var brand : String,
                      var currentKm: Int = 0,
                      var tireType : String,
                      var lifespanOfFrontTire : Int = 100,
                      var lifespanOfRearTire : Int = 100,
                      var tireLastModifiedKm: Int = 0){

    companion object{
        val TAG = "MOTORCYCLE"
    }

    open fun calculateLifeSpan(madeKm: Int){

    }

    open fun addKm(km:Int){

    }

    open fun printInfo(){
        Log.i(TAG,this.toString())
    }

    override fun toString(): String {
        return "$brand motorcycle; " +
                "Current Km: $currentKm\n" +
                "Tire Type: $tireType\n" +
                "Life span of front tire(percent): $lifespanOfFrontTire\n" +
                "Life span of rear tire(percent): $lifespanOfRearTire\n" +
                "Tire last modified Km: $tireLastModifiedKm"
    }


}