package polyporphic.demo2;

/**
 * @program: programming-groovy-2
 * @description: 酒鬼酒
 * @author: sunyf
 * @create: 2018-12-07 18:37
 **/
public class JGJ extends Wine{

    public JGJ(){
        setName("JGJ");
    }

    /**
     * 重写父类方法，实现多态
     */
    public String drink(){
        return "喝的是 " + getName();
    }

    /**
     * 重写toString()
     */
    public String toString(){
        return "Wine : " + getName();
    }
}
