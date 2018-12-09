package polyporphic.demo3;

/**
 * @program: programming-groovy-2
 * @description:
 * @author: sunyf
 * @create: 2018-12-07 18:49
 **/
public class A {

    public String show(D obj) {
        return ("调用：A 类中的 D 方法");
    }

    public String show(A obj) {
        return ("调用：A 类中的 A 方法");
    }

}
