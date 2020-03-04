package com.example.quiz3

import java.nio.file.Paths.get

class Questions {

    var points = 0
        get() = field

    fun addPoints(points2: Int){

        this.points+=points2
    }

    fun pytania(odp: Int ): String{
        if(odp ==1)
        return "Jaka jest najdłuższa rzeka w Polsce?"
        if(odp ==2)
        return "W ktorym roku wybuchła 2 Wojna Światowa?"
        else(odp ==3)
        return "Którą planetą od słońca jest ziemia?"
    }

    fun questionss(){
        var question1 = "Jaka jest najdłuższa rzeka w Polsce?"
        val odpA = "Odra"
        val odpB_good = "Wisła"
        val odpC = "Amazonka"
    }

    fun questionEasy2(){
        val question2 = "W ktorym roku wybuchła 2 Wojna Światowa?"
        val odpA = "1839"
        val odpB = "1943"
        val odpC_good = "1939"
    }

    fun questionEasy3(){
        val question3 = "Którą planetą od słońca jest ziemia?"
        val odpA_good = "trzecią"
        val odpB = "piątą"
        val odpC = "dziewiątą"
    }
}