class Customer
class Contact(private val Id : Int, var email : String){
    var detail = "$Id $email"
    init {
        println("details = $detail")
    }
}

fun change(contact: Contact?) : Unit{
    contact?.email = "changed"
}

class Person(_firstName : String = "UNknown", _age : Int = -1){
    private val firstName = _firstName.capitalize()
    private val age = _age
    init {
        println(firstName)
        println(age)
    }
}
class NonPrimary{
    constructor(id : Int,name : String) {
        println("id = $id and name = $name")
    }
}
fun main(args: Array<String>) {
    println("Hello World!")
    val customer = Customer()
    var contact : Contact? = Contact(2,"tsaini063@gmail.com")
//    println(contact?.Id)
//    println(contact?.email)
//    contact?.email = "fun"
//    contact = null
//    println(contact?.email)
//    change(contact)
//    println(contact?.email)
    val person = Person("Tarun saini",23)
    val nonPrimary = NonPrimary(23,"random")

}