package OOP
//color, owner, 5 properties
//3 people
class Vehicle (owner:String, model:String, price:Int, color:String, wheels:Int) {
    init {
        println("Owner of the Vehicle is $owner")
        println("The Model of the vehicle is $model")
        println("Price is $price")
        println("$color is its color")
        println(" It has $wheels wheels")

    }
}

fun main(args: Array<String>) {
    var owner_four = Vehicle("Mwihaki","Jeep", 5000000, "Red",4)
    println("----end of owner 4---")


    var owner_five= Vehicle("Sonia","BMW", 4000000, "Yellow",4)
    println("----end of owner 5---")


    var owner_six = Vehicle("Cynthia","RollsRoyce", 3000000, "Indigo",4)
    println("----end of owner 6---")

}