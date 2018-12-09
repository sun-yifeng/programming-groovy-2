class Equipment {

    def calculator

    Equipment(calc) {
        calculator = calc
    }

    def simulator() {
        println "Running simulation"
        calculator()
    }
}

def eq1 = new Equipment({ println "Calculator 1" })
def aCalculator = { println "Calculator 2" }
def eq2 = new Equipment(aCalculator)
def eq3 = new Equipment(aCalculator)

eq1.simulator()
eq2.simulator()
eq3.simulator()
