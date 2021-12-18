fun main() {

    print("Enter a number: ")

    // and !! operator ensures the input is not null
    val u_input_int = readLine()!!

    // converts the string input to integer
    var num:Int = u_input_int.toInt()

    // println() prints the following line to the output screen
    println("You entered: $num")

    print("Enter a number : ")
    //floting point Numbers
    val u_input_f = readLine()!!
    //covert string to float
    var f_num:Float = u_input_f.toFloat()

    print("You Entered : $f_num")


}   