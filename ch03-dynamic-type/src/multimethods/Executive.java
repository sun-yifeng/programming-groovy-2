package multimethods;

import java.math.BigDecimal;

/**
 * @program: programming-groovy-2
 * @description: 多态
 * @author: sunyf
 * @create: 2018-12-05 20:55
 **/
public class Executive extends Employee {

    public void raise(Number amount) {
        System.out.println("multimethods.Executive got raise");
    }

    public void raise(BigDecimal amount) {
        System.out.println("multimethods.Executive got outlandish raise");
    }

}
