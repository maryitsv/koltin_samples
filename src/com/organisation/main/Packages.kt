package com.organisation.main
// we can import one by one or all with the *
//import com.organisation.coolfeature.buildCoolFeature
//import com.organisation.coolfeature.testCoolfeature
import com.organisation.coolfeature.*


fun main(args:Array<String>){
    println("desde el main del package")

    buildCoolFeature(arrayOf(""))
    testCoolfeature()

}