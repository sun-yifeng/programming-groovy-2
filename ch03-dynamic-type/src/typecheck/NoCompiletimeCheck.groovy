package typecheck

@groovy.transform.TypeChecked
def shout(String str) {
    println "Printing in uppercase"
    println str.toUpperCase()
    println "Printing again in uppercase"
    println str.toUpperCase()
}

try {
    shout('hello')
} catch (ex) {
    println "Failure..."
}
