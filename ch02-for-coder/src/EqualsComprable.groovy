class A {
    boolean equals(other) {
        println "a equals called"
        false
    }
}

class B implements Comparable {
    boolean equals(other) {
        println "b equals called"
        false
    }

    int compareTo(other) {
        println "compareTo called"
        0
    }
}

new A() == new A()
new B() == new B()

