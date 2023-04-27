fun main (args : Array<String>) {
    print("Dial *544#")
    var result= readLine()!!.toString()
    when(result) {
        "1" -> println("Storo Bonus")
        "2" -> println("Daily Bundles")
        "3" -> println("Nyakua Ibambe")
        else -> println("I don't know anything about it")
    }
}