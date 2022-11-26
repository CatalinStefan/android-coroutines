import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
//    GlobalScope.launch {
    GlobalScope.launch(Dispatchers.IO) {
        println("Coroutine from global scope")
    }

    runBlocking {
        println("printout from runBlocking")
    }

    println("Continue execution")
    Thread.sleep(1000)
}