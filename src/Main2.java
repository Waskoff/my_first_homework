import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        System.out.print("""
                Программа выводит целочисленные элементы массива каждый их которых больше квадрата послденего элемента.
                Если таких элементов нет, то программа выдаст "No such elements included".
                Массив заполняется поэлементно вводом целочисленных значений с клавиатуры.
                Что бы остановить ввод введите любой элемент не являющийся целым числом.
                """);
        ArrayList<Integer> arr_list;
        ArrayList<Integer> result;
        arr_list = Main.input_func();
        result = Counter_of_bigger_than_last(arr_list);
        if (result.size() == 0) {
            System.out.println("No such elements included");
        } else {
            for (int i = 0; i < result.size() - 1; i++) {
                System.out.print(result.get(i) + ", ");
            }
            System.out.println(result.get(result.size() - 1));
        }
    }

    private static ArrayList<Integer> Counter_of_bigger_than_last(ArrayList <Integer> arr_List) {
        ArrayList<Integer> result_local = new ArrayList<>();
        for (int i = 0; i < arr_List.size() - 1; i++) {
            if (arr_List.get(i) > arr_List.get(arr_List.size() - 1) * arr_List.get(arr_List.size() - 1)) {
                result_local.add(arr_List.get(i));
            }
        }
        return result_local;
    }
}
