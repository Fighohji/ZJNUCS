package Ex12_1;

public class Ex12_1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }
        int result = 0;
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[2]);
            switch (args[1].charAt(0)) {
                case '+': result = x + y;
                    break;
                case '-': result = x - y;
                    break;
                case '*': result = x * y;
                    break;
                case '/': result = x / y;
                    break;
            }
            System.out.println(result);
        } catch(Exception e) {
            System.out.println("operand should be integer!");
        }
    }
}
