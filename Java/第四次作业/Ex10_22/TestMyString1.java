package Ex10_22;

public class TestMyString1 {
    public static void main(String[] args) {
        char[] a={'H','e','L','L','o'};
        char[] b={'m','a','L','L','o'};
        MyString1 s=new MyString1(a);
        MyString1 t=new MyString1(b);

        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(0,3).length());
        MyString1 u=s.toLowerCase();
        System.out.println(u.charAt(0));
        System.out.println(s.equals(t));
        a[1]='x';
        System.out.println(s.charAt(1));

        MyString1 v=MyString1.valueOf(-1234);
        System.out.println(v.length());
        System.out.println(v.charAt(0));

        MyString1 r=MyString1.valueOf(1234);
        System.out.println(r.length());
        System.out.println(r.charAt(0));
    }
}
