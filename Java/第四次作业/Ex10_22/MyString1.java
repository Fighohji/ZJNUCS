package Ex10_22;


public class MyString1 {
    private char[] s;
    public MyString1(char[] chars) {
        s = chars.clone();
    }
    public char charAt(int index) {
        return s[index];
    }
    public int length() {
        return s.length;
    }
    public MyString1 substring(int begin, int end) {
        char[] Ans = new char[end - begin];
        for (int i = begin; i < end; ++i) {
            Ans[i - begin] = s[i];
        }
        return new MyString1(Ans);
    }
    public MyString1 toLowerCase() {
        char[] Ans = s.clone();
        for (int i = 0; i < Ans.length; ++i) {
            if (Character.isUpperCase(Ans[i])) {
                Ans[i] += 32;
            }
        }
        return new MyString1(Ans);
    }
    public boolean equals(MyString1 t) {
        for (int i = 0; i < Math.min(t.length(), this.length()); ++i) {
            if (this.charAt(i) != t.charAt(i)) {
                return false;
            }
        }
        return t.length() == this.length() ? true : false;
    }
    public static MyString1 valueOf(int x) {
        if (x == 0) return new MyString1(new char[] {'0'});
        int cnt = 1;
        boolean neg = (x < 0);
        if (neg) cnt++;
        x = Math.abs(x);
        for (long i = 10; i <= 1e18; i *= 10) {
            if (i > x) {
                break;
            }
            cnt++;
        }
        char[] number = new char[cnt];
        if (neg) {
            number[0] = '-';
            cnt--;
        }
        for (int i = 0; i < cnt; ++i) {
            number[cnt - i - 1 + (neg ? 1 : 0)] = (char)(x % 10 + 48);
            x /= 10;
        }
        return new MyString1(number);
    }
}
