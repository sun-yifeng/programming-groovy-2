package typecheck

import groovy.transform.TypeChecked

//@TypeChecked
def shoutString(str) {
    println str.shout()
}

str = "hello"
str.metaClass.shout = { -> toUpperCase() }

shoutString(str)