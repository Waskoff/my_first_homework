import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("""
                Программа выводит сумму целочисленных элементов массива поданных на ввод.
                Что бы остановить ввод введите любой элемент не являющийся целым числом.
                """);
        ArrayList<Integer> input_arr_list;
        input_arr_list = input_func();
        System.out.print("Сумма элементов списка: " + sumElem(input_arr_list));
    }
    public static ArrayList<Integer> input_func() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input_arr_list = new ArrayList<>();
        while (true) {
            System.out.print("Введите целое число (элемент массива): ");
            try {
                int value = scanner.nextInt();
                input_arr_list.add(value);
            } catch (Exception e) {
                System.out.println("Ввод завершился");
                break;
            }
        }
        return input_arr_list;
    }
    private static int sumElem(ArrayList <Integer> arr_List) {
        if (arr_List.size() == 0) {
            return 0;
        }
        return arr_List.remove(arr_List.size() - 1) + sumElem(arr_List);
    }
}
