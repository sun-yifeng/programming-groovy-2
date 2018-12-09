package polyporphic.demo3;

/**
 * @program: programming-groovy-2
 * @description:
 * @author: sunyf
 * @create: 2018-12-07 18:50
 **/
public class B extends A{

    public String show(B obj){
        return ("调用：B 类中的 B 方法");
    }

    public String show(A obj){
        return ("调用：B 类中的 A 方法");
    }
}

