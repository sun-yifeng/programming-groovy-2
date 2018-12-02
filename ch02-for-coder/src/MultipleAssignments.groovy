// 返回多个值
def splitName(fullName) {
    fullName.split(' ')
}

// 定义两个变量接受返回值， def可以省略
def (firstName, lastName) = splitName("James Bond")
println "$lastName, $firstName $lastName"

println("---------------------------------------------------")

// 交换变量
def name1 = "Thomson1"
def name2 = "Thomson2"

println "$name1 and $name2"
// 交换变量
(name1, name2) = [name2, name1] // FIXME 左边小括号，右边方括号
println "$name1 and $name2"



/* out
Bond, James Bond
---------------------------------------------------
Thomson1 and Thomson2
Thomson2 and Thomson1
* */