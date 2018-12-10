class Handler {
    def f1() {
        println "f1 of handler called ... "
    }

    def f2() {
        println "f2 of handler called ..."
    }
}

class Example {
    def f1() {
        println "f1 of example called ... "
    }

    def f2() {
        println "f2 of example called ..."
    }

    def foo(closure) {
        closure.delegate = new Handler()
        closure()
    }
}

def f1() {
    println "f1 of Script called ..."
}

new Example().foo {
    f1()
    //f2()
}
new Example().foo {
    //f1()
    f2()
}


