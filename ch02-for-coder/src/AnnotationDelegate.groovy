class Worker {
    def worker() {
        println "get work done"
    }

    def analyze() {
        println "worker analyze..."
    }

    def writeReport() {
        println "get report written"
    }
}

class Export {
    def analyze() {
        println "export analyze..."
    }
}

class Manager {
    @Delegate
    Export export = new Export()
    @Delegate
    Worker worker = new Worker()
}

def bernie = new Manager()
bernie.analyze()
bernie.worker()
bernie.writeReport()

