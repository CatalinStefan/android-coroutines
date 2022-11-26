import kotlinx.coroutines.coroutineScope

suspend fun main() {
    val limit = 37263

    var i = 3
    while (i <= limit) {
        checkPrime(i)
        i += 2
    }
}

suspend fun checkPrime(number: Int) {
    coroutineScope {
        var isPrime = true

        for (i in 2..number/2) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime)
            println("$number is prime")
    }
}