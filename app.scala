package org.example
import scalaj.http._

import scala.io.StdIn.readLine


object app {
  def main(args: Array[String]): Unit = {
    println("Hello, Scala!")

    var StartVarstring = "Hello, Scala!"
    println(StartVarstring.reverse)
    println(StartVarstring.toLowerCase())
    println(StartVarstring.replace("!", ""))
    println(StartVarstring.replace("!", " ") + "and goodbye python")

    println("Введите годовой доход: ")
    val Salary = readLine().toDouble

    println("Размер премии: ")
    val Bonus = readLine().toDouble

    println("Компенсанция питания: ")
    val Food = readLine().toDouble

    val result = (Salary * Bonus + Food + Salary) * 0.87
    println("Ваш результат: ", result)


    val FirstList = List(100.00, 150.00, 200.00, 80.00, 120.00, 75.00)
    val CommonSalary = FirstList.sum
    val CountPersons = FirstList.size
    val AverageSalary = CommonSalary / CountPersons
    val Stdev = (result - AverageSalary) * (result - AverageSalary)

    println("Ввведите число: ")
    val add = readLine().toDouble
    val result1 = result + add
    val SecondList = FirstList.appended(result1)
    println(SecondList)
    val maximum = SecondList.max
    println("Max", maximum)
    val minimum = SecondList.min
    println("Min", minimum)


    // Элементы не сортируются
    val one = 350.toDouble
    val two = 90.toDouble
    val FourthList = SecondList :+ one :+ two

    println(FourthList)

    //println(FourthList)

    val FifthList = FourthList :+ 130.toDouble
    for (n <- FifthList) {
      if ((n >= 120) && (n <= 200))
        println(f"$n middle")
    }
    for (i <- FifthList) {
      var a = List() :+ (i + i * 0.07.toDouble)
      println(a)

    }

  }
}
