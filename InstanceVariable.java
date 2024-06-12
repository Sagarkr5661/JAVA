import java.util.Scanner;
public class InstanceVariable {
    int a=2;
    String name="Rahul";
    public static void main(String[] args) {
        int num=5;
        InstanceVariable obj1=new InstanceVariable();
        InstanceVariable obj2=new InstanceVariable();
        obj1.name="Navin";
        System.out.println(obj1.a);
        System.out.println(obj1.name);
        System.out.println(obj2.a);
        System.out.println(obj2.name);

    }
}
