def tellFortunes(closure) {
    Date date = new Date("09/12/2018")
    // closure date, "Your day is filled with ceremony"
    // closure date, "They're feature, not bugs"
    postFortune = closure.curry(date)
    // 可里化
    postFortune "Your day is filled with ceremony"
    postFortune "They're feature, not bugs"

}

tellFortunes(){
    date, fortune ->6
        println "Fortue for ${date} is '${fortune}'"
}