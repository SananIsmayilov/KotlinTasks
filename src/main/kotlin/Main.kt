import java.util.Scanner

fun main(args: Array<String>) {

  //  println(Task1(-40.0))

   // println(Task2(6))


}

fun  Task1(TC : Double) : Double{
    return (TC*1.8) + 32
}

fun Task2(factorial : Int) : Int{
    var result : Int = 1

    for(i in 1..factorial){
        result *= i
    }
    return  result
}

