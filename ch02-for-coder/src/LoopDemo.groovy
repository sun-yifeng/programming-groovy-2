// 有下限、有上限
0.upto(2) {
    print("$it ")
    //print "$it "
}

print("\n------------------\n")

// 有上限、无下限（默认为0）
5.times {
    print("$it ")
}

print("\n------------------\n")

// 步长为2
0.step(10, 2) {
    print("$it ")
}

print("\n------------------\n")
// 钩子程序
//println("svn help".execute().text)
println("svn help".execute().getClass().name)
println("groovy -v".execute().text)

print("\n------------------\n")



