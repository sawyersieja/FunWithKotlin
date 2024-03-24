package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //I think I made a mistake building that weather program
    //and then immediately creating the Clojure program after.
    //I'm kind of burnt out.
    //I was hoping Kotlin would get most of my effort.

    var name: String
    name = "First"

    var age: Int
    age = 42

    var weight: Double
    weight = 200.00

    var filledOut: Boolean = checkBox(name, age, weight)
    println("Filled out: $filledOut")

    for(i in 1..5) {
        if(i == 1) {
            println("\nExample")
        }
        else if(i == 2) {
            println("\tof")
        }
        else if (i == 3) {
            println("\t\ta")
        }
        else if (i == 4) {
            println("\t\t\tfor")
        }
        else if (i == 5) {
            println("\t\t\t\tloop.")
        }
        else {
            println("This should not be printed on the screen.")
        }
    }

    var x = 10
    while(x > 0) {
        println("While countdown: $x")
        x--
    }

    println(" ")

    do {
        println("Dowhile countup: $x")
        x++
    } while (x < 11)

    println("")

    repeat(5) {count ->
        println("Testing repeat function ${count + 1}")
    }

}

fun checkBox(name: String,age: Int, weight: Double): Boolean {
    if((name.isNotEmpty()) && (age > 1) && (weight > 0.0)) {
        val fullName: String = "$name Last"
        println("Name: $fullName")
        println("Age: $age")
        println("Weight: $weight lbs")
        return true;
    }
    return false;
}