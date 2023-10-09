fun main(){
    showConversions(4)
    qtdChars("Hello World!")
}

fun showConversions(anos: Int){
    val days = anos * 365
    println("${anos} anos equivalem a: ${days} dias")
}

fun qtdChars(message: String){
    println(message.length)
}