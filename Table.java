
public class Table {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + args[0]);
        }
    }
}
