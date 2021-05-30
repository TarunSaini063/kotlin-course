fun sum(a : Int, b : Int): Int {
    print("sum of $a and $b = ${a+b}\n")
    return a+b
}

fun power(a : Int, b : Int) : Int{
    var num = 1
    for ( x in 0 until b){
        num *= a
    }
    return num
}
var mod : Long = 1e9.toLong()+7

fun modPower( a : Long, b : Long) : Long{
    var res : Long = 1
    var a1 = a
    var b1 = b
    while (b1>0){
        if(b1 % 2L == 1L){
            res = (res * a)%mod
        }

        b1 /= 2
        a1 = (a1 * a1)%mod
    }
    return res
}

fun sumLamda (a : Int , b : Int) = a+b

fun main(args: Array<String>) {
    println("Hello World!")
    println("sum : ${sum(2,3)}")
    println("sumLamda : ${sumLamda(2,3)}")
    println("power : ${power(3,3)}")
    println("modPower : ${modPower(3,1891239)}")
    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)
    println(Float.MAX_VALUE)
}
