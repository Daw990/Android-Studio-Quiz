package com.example.quiz3

import kotlin.random.Random

class AllQuestions {

    var qEasy1 = Questions()
    var qEasy2 = Questions()
    var qEasy3 = Questions()

    var qMedium1 = Questions()
    var qMedium2 = Questions()
    var qMedium3 = Questions()

    var qHard1 = Questions()
    var qHard2 = Questions()
    var qHard3 = Questions()

    var questionsList_Easy = ArrayList<Questions>()
    var questionsList_Medium = ArrayList<Questions>()
    var questionsList_Hard = ArrayList<Questions>()

    fun randomNumberQuestionEasy(): Int{
      return Random.nextInt(0, questionsList_Easy.size-1)
    }

    fun randomNumberQuestionMedium(): Int{
        return Random.nextInt(0, questionsList_Medium.size-1)
    }

    fun randomNumberQuestionHard(): Int{
        return Random.nextInt(0, questionsList_Hard.size-1)
    }

    var points = 0
        get() = field

    fun addPoints(points2: Int){

        this.points+=points2
    }

    fun makeQuestionsEasy(){

        qEasy1.question = "Jaka jest najdłuższa rzeka w Polsce?"
        qEasy1.q_Thrue = "Wisła"
        qEasy1.q_Odp1 = "Amazonka"
        qEasy1.q_Odp2 = "Odra"
        questionsList_Easy.add(element = qEasy1)

        qEasy2.question = "Jakimi zwierzętami byli trzej towarzysze Skazy z bajki 'Król Lew'?"
        qEasy2.q_Thrue = "Hienami"
        qEasy2.q_Odp1 = "Wilkami"
        qEasy2.q_Odp2 = "Szakalami"
        questionsList_Easy.add(element = qEasy2)

        qEasy3.question = "Jak nazywamy tradycyjne urodzinowe ciasto?"
        qEasy3.q_Thrue = "Tort"
        qEasy3.q_Odp1 = "Jabłecznik"
        qEasy3.q_Odp2 = "Sernik"
        questionsList_Easy.add(element = qEasy3)

    }

    fun makeQuestionsMedium(){

        qMedium1.question = "Największy dzwon w Polsce?"
        qMedium1.q_Thrue = "Zygmunta"
        qMedium1.q_Odp1 = "Stanisława"
        qMedium1.q_Odp2 = "Fryderyka"
        questionsList_Medium.add(element = qMedium1)

        qMedium2.question = "Ilu gradom odpowiada kąt pełny?"
        qMedium2.q_Thrue = "400"
        qMedium2.q_Odp1 = "200"
        qMedium2.q_Odp2 = "600"
        questionsList_Medium.add(element = qMedium2)


        qMedium3.question = "Pierwowzór aparatu fotograficznego to:"
        qMedium3.q_Thrue = "camera obscura"
        qMedium3.q_Odp1 = "camera lumen"
        qMedium3.q_Odp2 = "camera lux"
        questionsList_Medium.add(element = qMedium3)


    }

    fun makeQuestionsHard() {

        qHard1.question = "Konstytucja podpisana w 1505 roku w Radomiu nosi nazwę 'Nihil Novi', co z łacińskiego oznacza:"
        qHard1.q_Thrue = "'nic nowego'"
        qHard1.q_Odp1 = "'bez zmian'"
        qHard1.q_Odp2 = "'nie zgadzam się'"
        questionsList_Hard.add(element = qHard1)

        qHard2.question = "Na próżno szukać lokalnego oddziału TVP w:"
        qHard2.q_Thrue = "Częstochowie"
        qHard2.q_Odp1 = "Kielcach"
        qHard2.q_Odp2 = "Gdańsku"
        questionsList_Hard.add(element = qHard2)

        qHard3.question = "Pierwszym samochodem budowanym na taśmie produkcyjnej był:"
        qHard3.q_Thrue = "Ford"
        qHard3.q_Odp1 = "Volkswagen"
        qHard3.q_Odp2 = "Seat"
        questionsList_Hard.add(element = qHard3)

    }

    fun addQuestion_Easy(a:Int){
        questionsList_Easy.get(a)
    }

    fun addQuestion_Medium(a:Int){
        questionsList_Medium.get(a)
    }

    fun addQuestion_Hard(a:Int){
        questionsList_Hard.get(a)


//        questionsList_Easy.add(element = qEasy1)
//        questionsList_Easy.add(element = qEasy2)
//        questionsList_Easy.add(element = qEasy3)
//
//        questionsList_Medium.add(element = qMedium1)
//        questionsList_Medium.add(element = qMedium2)
//        questionsList_Medium.add(element = qMedium3)
//
//        questionsList_Hard.add(element = qHard1)
//        questionsList_Hard.add(element = qHard2)
//        questionsList_Hard.add(element = qHard3)

    }


}