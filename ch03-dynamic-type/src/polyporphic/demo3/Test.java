package polyporphic.demo3;

/**
 * @program: programming-groovy-2
 * @description:
 * @author: sunyf
 * @create: 2018-12-07 18:52
 **/
public class Test {

    public static void main(String[] args) {

        // A类类型的A类对象
        A a1 = new A();
        // A类类型的B类对象 （父类类型的子类对象）
        A a2 = new B();

        // B类类型的B类对象
        B b = new B();
        // C类类型的C类对象
        C c = new C();
        // D类类型的D类对象
        D d = new D();

        // 因为a1为：A类类型的A类对象，所有只会调用A-A方法、A-D方法
        System.out.println("--------------调用a1的方法：------------");
        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));

        // 虽然b1为：父类类型的子类对象，但是子类对象的方法没有覆盖
        System.out.println("--------------调用a2的方法：------------");
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));

        //
        System.out.println("--------------调用：------------");
        //
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
    }
}
