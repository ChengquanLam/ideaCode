package javaLearn;

public class helloworld {

    public static void main(String[] args) {
       System.out.print("helloWorld\n");
       helloworld hello = new helloworld();

      hello.test();

    }
    public void test()
    {
        System.out.print(super.getClass().getName());
    }
}
