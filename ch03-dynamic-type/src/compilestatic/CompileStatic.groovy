package compilestatic

@groovy.transform.CompileStatic
def shout(String str) {
    println str.toUpperCase()
}

shout("hello")
