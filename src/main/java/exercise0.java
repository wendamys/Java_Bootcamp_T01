import java.util.*;

public class exercise0 {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] myArray = new float[6];
        float number;
        int i = 0;

        while (true) {
            if (i == 6) {
                if (true) {
                    System.out.println("");
                } else {
                    System.out.println("It's not a triangle");
                }
                break;
            }
            try {
                System.out.print("Введите число: ");
                number = scanner.nextFloat();
                myArray[i] = number;
            } catch (InputMismatchException e){
                System.out.println("Ошибка: введено не число!");
                throw new InputMismatchException("Некорректный ввод данных");
            }
            i++;
        }
    }
}
