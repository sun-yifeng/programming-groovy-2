def picEven(n, block) {
    for (int i = 2; i < n; i +=2) {
        block(i)
    }
}

// 闭包的三种写法
//picEven(10, {println it})
//picEven(10){println it}
//picEven(10){evenNumber -> println evenNumber}

// 求和
//total = 0
//picEven(10) { total += it }
//println total

// 乘积
product = 1t
picEven(10) { product *= it }
println product



