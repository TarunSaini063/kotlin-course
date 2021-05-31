//generic class for stack

class MutableStack<E>(vararg items : E){
    private val elements = items.toMutableList()
    fun push(element : E) = elements.add(element)
    fun peek() = elements.last()
    fun pop() = elements.removeAt(elements.size-1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    override fun toString() = "elements in stack ${elements.joinToString (prefix = "[",postfix = "]",separator = " |<--->| ") }"
}

class Person(val name : String,var age : Int){
    fun printInfo():Unit = println("name = $name age = $age")
    override fun toString(): String {
        return "name : $name, age : $age"
    }
}

fun main(args: Array<String>) {
    // stack of int
    val intStack = MutableStack<Int>(1,3,4,5,2,6,643,23,2)
    println(intStack.toString())
    println("pop : ${intStack.pop()}")

    //stack of String

    val stringStack = MutableStack<String>("Hi","Hello","Lela","Chalak")
    println(stringStack.toString())
    println("Stack size : ${stringStack.size()}")

    //stack of custom objects

    val customStack = MutableStack<Person>(Person("Tarun",13),Person("Random",100*10))

    println(customStack.toString())


}