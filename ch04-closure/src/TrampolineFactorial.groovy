def factorial

// 尾递归解决栈溢出的问题
factorial = { int number, BigInteger theFactorial ->
    number == 1 ? theFactorial :
            factorial.trampoline(number - 1, number * theFactorial)
}.trampoline()

println "factorial of 5 is ${factorial(5, 1)}"
println "Number of bits in the result is ${factorial(5000, 1)}"
