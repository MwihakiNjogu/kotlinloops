
    //my pin 1220
    //using a do wile loop write program
    //write simple program
    //to prompt to put correct pin


    fun main(args: Array<String>) {
        var pin:Int

        do {

            println("Enter Your Pin")
            pin = readln()!!.toInt()
        }
        while (pin !== 1220)
        println("Pin Accepted")


        }

