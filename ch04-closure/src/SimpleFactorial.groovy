def factorial(BigInteger number) {
    //cprintln(number)
    if (number == 1) {
        1
    } else {
        number * factorial(number - 1)
    }
}

try {
    println "factorial of 5 is ${factorial(5)}"
    println "Number of bits in the result if ${factorial(5000).bitCount()}"
} catch (Throwable ex) {
    println "Caught ${ex.class.name}"
}