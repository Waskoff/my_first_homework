import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        String rev_str = new StringBuffer(str).reverse().toString();
        if (str.equals(rev_str)) {
            System.out.println(str + " - Строка является палиндромом");
        } else {
            System.out.println(str + " - Строка не является палиндромом");
        }
    }
}
//sonarQube plagin