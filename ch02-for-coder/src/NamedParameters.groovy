class Robot {

    def type, height, width

    // 不管调用1、2、3的顺序怎么变，结果一样
    def access(Map location, height, fragile) {
        println "Received fragile ? $fragile, weight: $height, loc: $location"
    }

}

//
robot = new Robot(type: "arm", width: 10, height: 40)
println "$robot.type, $robot.height, $robot.width"

// 调用1，参数顺序1
robot.access(x:30, y: 20, z: 10, 50, true)
// 调用2，参数顺序2
robot.access(50, true, x:30, y: 20, z: 10)
// 调用3，参数顺序3
robot.access(50,  x:30, y: 20, z: 10, true)
