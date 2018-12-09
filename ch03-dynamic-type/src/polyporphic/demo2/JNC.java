package polyporphic.demo2;

/**
 * @program: programming-groovy-2
 * @description: 剑南春
 * @author: sunyf
 * @create: 2018-12-07 12:59
 **/
public class JNC extends Wine{

    public JNC(){
        setName("JNC");
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