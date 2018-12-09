package polyporphic.demo2;

/**
 * @program: programming-groovy-2
 * @description: 酒
 * @author: sunyf
 * @create: 2018-12-07 12:58
 **/
public class Wine {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wine(){
    }

    public String drink(){
        return "喝的是 " + getName();
    }

    // 重写toString()
    public String toString(){
        return null;
    }

}