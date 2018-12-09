def doSomeThing(closure) {
    if (closure) {
        closure()
    } else {
        println "Using default implemention"
    }
}

doSomeThing() { println "Use specialized implementation" }

doSomeThing()