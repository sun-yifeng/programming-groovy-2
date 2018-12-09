
/**
 * @program: programming-groovy-2
 * @description:
 * @author: sunyf
 * @create: 2018-12-08 01:25
 **/
public class UsingCollection {

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
        Collection<String> col = lst;

        lst.add("one");
        lst.add("two");
        lst.add("three");

        lst.remove(0);
        //lst.remove(0);
        col.remove(0);
        //((ArrayList<String>) col).remove(0);

        System.out.println("lst size:" + lst.size());
        System.out.println("col size:" + col.size());
    }
}
