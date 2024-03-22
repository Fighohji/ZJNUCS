public class Ex7_22 {
    public static void main(String[] args) {
        int sum = 0;
        for (String i : args) {
            for (int j = 0; j < i.length(); ++j) {
                sum += Character.isUpperCase(i.charAt(j)) ? 1 : 0;
            }
        }
        System.out.println(sum);
    }
}
