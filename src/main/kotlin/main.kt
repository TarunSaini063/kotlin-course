fun main(args: Array<String>) {
    println("Hello World!")
    var a = 2;
    val s1 = "a is $a and is is is for three times"
    val s2 = "${s1.replace("is","was")}, replaces all is with 'was'"
    println(s2)

    //conditional expressions

    fun max(a : Int,b : Int)  = if(a>b) a else b

    println("max of 3 and 4 : ${max(3,4)}")

    // printing star of height 5
    val height = 5
    for(i in 1..height){
        var row = height - i;
        while(row>0){
            print(" ")
            row-=1
        }
        for(j in 0 until 2*i-1){
            print("*")
        }
        println()
    }
}