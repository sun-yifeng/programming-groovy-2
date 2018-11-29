def car = new JavaBeanCarPrivate(2012)

println "Year: $car.year"
println "Miles: $car.miles"
println "Driving"
car.drive(10)
println("Miles:$car.miles")


// 会报错:year不能被修改
try {
    println("Can I set the year ？")
    car.year = 1900
} catch (e) {
    println(e)
}

try {
    println("Can I set the miles ? ")
    car.miles = 12
} catch (e1) {
    println(e1)
}