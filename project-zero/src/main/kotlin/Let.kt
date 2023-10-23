fun main(){
    val str: String? = null

    str?.let{
        it.lowercase()
        it.length
    }
}