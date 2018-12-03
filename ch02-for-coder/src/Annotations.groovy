import groovy.transform.Canonical

// 相当于覆盖了toString()方法
@Canonical(excludes = "age,sex")
class Person {
    String firsName
    String lastName
    String sex
    int age
    int weight
}

def sara = new Person(firsName: "Sara", lastName: "walker", age: 49, weight: 60, sex: "male")
println sara
