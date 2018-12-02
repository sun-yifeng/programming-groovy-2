class ComplexNumber {
    def real, imaginary
    //每一个操作符都对应了一个标准方法，重写这个方法，就可以重载操作符
    def plus(other) {
        new ComplexNumber(real: real + other.real, imaginary: imaginary + other.imaginary)
    }

    String toString() {"$real ${imaginary > 0 ? '+' : '' } ${imaginary}i"}
}

c1 = new ComplexNumber(real: 1, imaginary: 2)
c2 = new ComplexNumber(real: 4, imaginary: 1)

println c1 + c2
