package OOP

class House (owner:String, location:String, price:Int, doors:Int){
    //initialize class
    init {
        println("Owner of the House is $owner")
        println("House is located in $location")
        println("Price is $price")
        println("It has $doors number of doors")
    }

}

fun main(args: Array<String>) {
    var owner_one = House("Mike", "Ngara", 2500, 2)
    println("----end of house 1---")

    var owner_two = House("Mwihaki", "Kitusuru", 80000, 6)
    println("----end of house 2---")


    var owner_three = House("Cynthia", "Lavington", 60000, 4)
    println("----end of house 3---")

}