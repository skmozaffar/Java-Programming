import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        fun();
        multiple(2, 3, "Kunal", "Rahul", "Mohan");
        //demo(); //CTE
    }

    public static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    public static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    public static void multiple(int a, int b, String ...v) {
System.out.println(Arrays.toString(v));
    }

    public static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}