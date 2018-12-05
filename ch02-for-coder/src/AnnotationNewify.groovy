@Newify([Person, CreditCard])
def fluentCreate() {
    println Person.new(firsName: "sun", lastName: "yifeng", age: 30) // 加上new
    println Person(firsName: "zhang", lastName: "sanfeng", age: 40)  // 省略new
    println CreditCard("1234-5678-1234-5678", 2000) // 省略new
}

fluentCreate()