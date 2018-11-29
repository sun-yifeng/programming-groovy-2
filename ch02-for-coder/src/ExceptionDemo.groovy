// 如果不处理异常会传递给调用者
def openFile(filName) {
    new FileInputStream(filName)
}

try {
    // 调用者处理异常
    openFile("noneExistentFile")
} catch (FileNotFoundException e) {
    println(e)
}