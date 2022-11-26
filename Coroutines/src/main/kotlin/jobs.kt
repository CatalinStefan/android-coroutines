import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    coroutineScope {
        val job1 = launch {
            println("Job 1 started")
            val job2 = launch {
                println("Job 2 started")
                delay(2000)
                println("Job 2 completed")
            }

            delay(2000)
            println("Job 1 completed")
        }

        Thread.sleep(1000)
        job1.cancel()
        println("Continue execution")
        Thread.sleep(3000)
    }
}