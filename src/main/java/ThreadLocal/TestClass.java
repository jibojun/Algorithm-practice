package ThreadLocal;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-21 13:15
 * @Description:
 */
public class TestClass {
    static ThreadLocal<String> t1=new ThreadLocal<>();
    static ThreadLocal<Integer> t2=new ThreadLocal<>();

    public static void main(String[] args) {
        t1.set("test1");
        System.out.println(t1.get());
        t2.set(1);
        System.out.println(t2.get());
    }
}
