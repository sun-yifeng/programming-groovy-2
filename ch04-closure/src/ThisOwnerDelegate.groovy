def examingClosure(closure) {
    closure()
}

examingClosure() {
    println "In first closure"
    println "class is " + getClass().name
    println "this is " + this + ", supper is " + this.getClass().superclass.name
    println "owner is " + owner + ", supper is " + owner.getClass().superclass.name
    println "delegate is " + delegate + ", supper is " + delegate.getClass().superclass.name

    examingClosure() {
        println "In second closure"
        println "class is " + getClass().name
        println "this is " + this + ", supper is " + this.getClass().superclass.name
        println "owner is " + owner + ", supper is " + owner.getClass().superclass.name
        println "delegate is " + delegate + ", supper is " + delegate.getClass().superclass.name

    }

}