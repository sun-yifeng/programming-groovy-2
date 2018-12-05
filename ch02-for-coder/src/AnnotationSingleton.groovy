@Singleton(lazy = true)
class TheUnique {
    private TheUnique() {
        println "Instance created"
    }

    def hello() {
        println "hello"
    }
}
