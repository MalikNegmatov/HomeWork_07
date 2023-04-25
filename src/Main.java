import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Пишем код для задачи 1
        int[] index = new int[]{1, 2, 3};
        double[] vector = {1.57, 7.654, 9.986};
        double[] tensor = {1, 0, 0, 0, 1, 0, 0, 0, 0.001};
        System.out.println("Задача №1 \nМассивы index, vector и tensor инициализированы.");

        task2(index, vector, tensor);
        task3(index, vector, tensor);

        index = new int[]{1, 3, 2, 2, 4, 5, 65, 77, 5};
        task4(index);
    }

    /**
     * Метод для вывода элементов массива типа double через разделитель "запятая"
     *
     * @param array -- передаваемый массив данных типа double
     * @param style -- порядок печати: True печатаем с первого по последний; False печатаем в обратном порядке
     * @return строка с форматированным выводом элементов массива
     */
    public static String doubleArrayPrint(double[] array, boolean style) {
        String strOutput = "";
        if (style) {
            for (double j : array) strOutput = String.format("%s, %s", strOutput, j);
            return strOutput.substring(2);
        } else {
            for (double j : array) strOutput = String.format("%s, %s", j, strOutput);
            return strOutput.substring(0, (strOutput.length() - 2));
        }
    }

    public static void task2(int[] arrayIndex, double[] arrayVector, double[] arrayTensor) {
        System.out.println("\nЗадача №2");
//      Пишем код для задачи 2

        String strOutput = Arrays.toString(arrayIndex); // чит-код
        System.out.println(strOutput.substring(1,(strOutput.length() - 1))); // why not ) ?

        System.out.println(doubleArrayPrint(arrayVector, true));
        System.out.println(doubleArrayPrint(arrayTensor, true));
    }

    public static void task3(int[] arrayIndex, double[] arrayVector, double[] arrayTensor) {
        System.out.println("\nЗадача №3");

        String strOutput = Integer.toString(arrayIndex[2]);
        for (int i = (arrayIndex.length - 2); i >= 0; i--) {
            strOutput = String.format("%s, %d", strOutput, arrayIndex[i]);
        }
        System.out.println(strOutput);

        System.out.println(doubleArrayPrint(arrayVector, false));
        System.out.println(doubleArrayPrint(arrayTensor, false));
    }

    public static void task4(int[] arrayIndex) {
        System.out.println("\nЗадача №4");
        // Пишем код для задачи 4
        for (int i = 0; i < arrayIndex.length; i++) if (arrayIndex[i] % 2 > 0) arrayIndex[i]++;
        System.out.println(Arrays.toString(arrayIndex));
    }
}
