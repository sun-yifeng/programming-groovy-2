def receiveVarArgs(int a, int ... b) {
    println "You passed $a and $b"
}

def receiveArray(int a, int[] b) {
    println "You passed $a and $b"
}

// 发送离散的值
receiveVarArgs(1, 2, 3, 4, 5)
receiveArray(1, 2, 3, 4, 5)

println "---------------传递数组时，要用as -----------------"

int[] values = [2, 3, 4, 5, 6, 7]
receiveVarArgs(1,values)
receiveVarArgs(1,[2, 3, 4, 5, 6, 7] as int[]) // 要加as，否则会当场ArrayList的一个实例