package com.project.appicoclear.activites.viewsAccounts.Levels

import com.project.appicoclear.R

data class Level_1(var title: String, var img: Int, var snd: Int)

object Supplier {

    val animals = listOf(
        Level_1("tigre", R.drawable.tigre,R.raw.tigre),
        Level_1("vaca",R.drawable.vaca,R.raw.vaca),
        Level_1("rana",R.drawable.rana,R.raw.frog),
        Level_1("perro",R.drawable.perro,R.raw.perro),
        Level_1("pato",R.drawable.pato,R.raw.patos),
        Level_1("mono",R.drawable.mono,R.raw.mono),
        Level_1("foca",R.drawable.foca,R.raw.foca),
        Level_1("cerdo",R.drawable.cerdo,R.raw.cerdo),
        Level_1("caballo",R.drawable.caballo,R.raw.caballo)
    )

    val palabras = listOf(
        Level_1("animales",R.drawable.palabra,R.raw.palabraanimales),
        Level_1("arboles",R.drawable.palabra,R.raw.palabraarboles),
        Level_1("avenida",R.drawable.palabra,R.raw.palabraavenida),
        Level_1("floristeria",R.drawable.palabra,R.raw.palabrafloristeria),
        Level_1("naturaleza",R.drawable.palabra,R.raw.palabranaturaleza),
        Level_1("persona",R.drawable.palabra,R.raw.palabrapersonas),
        Level_1("planeta",R.drawable.palabra,R.raw.palabraplaneta)

    )

    val oraciones = listOf(
        Level_1("oracion 1",R.drawable.oracion,R.raw.oracion1),
        Level_1("oracion 2",R.drawable.oracion,R.raw.oracion2),
        Level_1("oracion 3",R.drawable.oracion,R.raw.oracion3),
        Level_1("oracion 4",R.drawable.oracion,R.raw.oracion4),
        Level_1("oracion 5",R.drawable.oracion,R.raw.oracion5),
        Level_1("oracion 6",R.drawable.oracion,R.raw.oracion6),
        Level_1("oracion 7",R.drawable.oracion,R.raw.oracion7),
        Level_1("oracion 8",R.drawable.oracion,R.raw.oracion9),
        Level_1("oracion 9",R.drawable.oracion,R.raw.oracion1)
        )

    val conversaciones = listOf(
        Level_1("conversacion 1",R.drawable.conversacion,R.raw.conversacion1),
        Level_1("conversacion 2",R.drawable.conversacion,R.raw.conversacion2),
        Level_1("conversacion 3",R.drawable.conversacion,R.raw.conversacion3),
        Level_1("conversacion 4",R.drawable.conversacion,R.raw.conversacion4)

        )
}