/**
 *  1、不处理异常，默认会传递给调用者
 *  2、可以省略异常类型，
 */
// 1、如果不处理异常会传递给调用者
def openFile(filName) {
    new FileInputStream(filName)
}

try {
    // 调用者处理异常
    openFile("noneExistentFile")
} catch (e) { // FIXME 2、省略异常类型
    println(e)
}