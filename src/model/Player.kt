package model

import java.util.Scanner

class Player {

    constructor(){}

    fun makeMove() {
        with(Scanner(System.`in`)) {
            val x = nextInt()
            val y = nextInt()
            val playerMove = Coordinates(x,y)
        }
    }

}