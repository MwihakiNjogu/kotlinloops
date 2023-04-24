fun main(args: Array<String>) {
    println("Enter your Age")
    var age = readln()!!.toInt()
    val date: Int = 2023

    val year = date - (age+1)
    println("Were you born in $year ?")
    println("1.No")
    println("2.Yes")
    var a = readln()!!.toInt()
    if (a>=2){
        println("Welcome")
    }

    else {

        println("1.Destroy our server")

        var c = readln()!!.toInt()
        if (c<=1){
        println("Thanks for being positive")
        }
        else if (c<=2){
        println("Don't be negative but we will try our best")
        }
        else{
        println("Invalid Option")
        }

        }

    }



