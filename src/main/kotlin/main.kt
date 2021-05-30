fun calculateLength(str : String?) : Int? {
    return str?.length
}

fun desc(str : String?) : Int? {
    return str?.length
}
fun main(args: Array<String>) {
    var notNull: String ="I am not null"
    var canNull : String? = "I can be null"
    println(notNull)
    //gives error because it is of non null type
//    notNull = null
    canNull = null
    var answer = canNull?.length
    println(calculateLength(canNull))
    println(desc(null))
    println(desc("null"))
}