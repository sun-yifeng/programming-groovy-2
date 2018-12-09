package multimethods;

/**
 * @program: programming-groovy-2
 * @description: 多态
 * @author: sunyf
 * @create: 2018-12-05 20:57
 **/
public class GiveRaiseJava {

    public static void giveRaise(Employee employee) {
        employee.raise(10000.00);
    }

    public static void main(String[] args) {
        giveRaise(new Employee());
        giveRaise(new Executive());
    }

}
