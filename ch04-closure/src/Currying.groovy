def tellFortunes(closure) {
    Date date = new Date("09/12/2018")
    // closure date, "Your day is filled with ceremony"
    // closure date, "They're feature, not bugs"
    // 预先绑定形参，可里化
    postFortune = closure.curry(date)
    //
    postFortune "Your day is filled with ceremony"
    postFortune "They're feature, not bugs"

}

tellFortunes(){
    date, fortune ->6
        println "Fortue for ${date} is '${fortune}'"
}