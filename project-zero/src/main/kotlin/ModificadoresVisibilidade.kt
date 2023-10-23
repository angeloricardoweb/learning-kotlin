open class Eletronico(var marca: String) {
    private fun ativarCorrent() {
        println("Ligar")
    }

    fun ligar() {
        ativarCorrent()
    }

    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
}


fun main() {
    var computador = Computador("Dell")
    computador.ligar()

}