import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(sc);
                System.out.print("Enter the First no. : ");
                int n1 = sc.nextInt();
                System.out.print("Enter the Operator : ");
                String o = sc.next();
                System.out.print("Enter the Second no. : ");
                int n2 = sc.nextInt();
                if (o.equals("+") | o.equals("-") | o.equals("*") | o.equals("/")) {
                    if (o.equals("+")) {
                        System.out.println(n1 + n2);
                    } else if (o.equals("-")) {
                        System.out.println(n1 - n2);
                    } else if (o.equals("*")) {
                        System.out.println(n1 * n2);
                    } else if (o.equals("/")) {
                        System.out.println(n1 / n2);
                    }
                    System.out.println("Continew plese enter 1 othervise 2");
                    byte c = sc.nextByte();
                    if (c != 1) {
                        flag = false;
                    }
                } else {
                    System.out.println("invelid input");
                }
            } catch (Exception e) {
                System.out.println("invelid input plese re enter");
            }
        }
    }
}
