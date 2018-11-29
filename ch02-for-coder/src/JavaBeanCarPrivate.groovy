class JavaBeanCarPrivate {
    // JavaBean少了setter/seatter
    private miles = 0
    final year

    // 构造方法
    JavaBeanCarPrivate(theYear) {
        year = theYear
    }

    //
    def getMiles() {
        println("getMiles called")
        miles
    }

    private void setMiles(miles) {
        threw new IllegalAccessException("你不能修改里程：miles")
    }

    def drive(dist) {
        if (dist > 0) {
            miles += dist
        }
    }
}




