package multimethods

//Tvoid giveRaise(Employee employee) {
void giveRaise(employee) {
    employee.raise(new BigDecimal(10000.00))
}

giveRaise(new Employee())
giveRaise(new Executive())