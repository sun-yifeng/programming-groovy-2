// 定义可选参数base
def log(x, base = 10) {
    Math.log(x)/Math.log(base)
}

//
println(log(1024))
println(log(1024, 10))
println(log(1024, 2))

println("----------------------------------------------")

// details数组可以接受多个参数
def task(name, String[] details) {
    println "$name - $details"
}

task "task", "123-456-7890"
task "task", "123-456-7890", "231-546-0987"
task "Check Mail"