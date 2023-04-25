import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Пишем код для задачи 1
        int[] index = new int[] {1, 2, 3};
        double[] vector =  {1.57, 7.654, 9.986};
        double[] tensor = {1, 0, 0,  0, 1, 0,  0, 0, 0.001};
        System.out.println("Задача №1 \nМассивы index, vector и tensor инициализированы.");

        task2(index, vector, tensor);
        task3(index, vector, tensor);
        task4(index);
        index = new int[]{1, 3, 2, 2, 4, 5, 65, 77, 5};
        task4(index);
    }


    public static void task2(int[] arrayIndex, double[] arrayVector, double[] arrayTensor) {
        System.out.println("\nЗадача №2");
/*        Пишем код для задачи 2
          Без использования условных операторов в цикле.
          У меня на них идиосинкразия.
*/
        String strOutput = Integer.toString(arrayIndex[0]);
        for (int i = 1; i < arrayIndex.length; i++) {
            strOutput = String.format("%s, %d", strOutput, arrayIndex[i]);
        }
        System.out.println(strOutput);

        strOutput="";
        for (double j : arrayVector) strOutput = String.format("%s, %s", strOutput, j);
        System.out.println(strOutput.substring(2));

        strOutput="";
        for (double j : arrayTensor) strOutput = String.format("%s, %s", strOutput, j);
        System.out.println(strOutput.substring(2));
    }

    public static void task3(int[] arrayIndex, double[] arrayVector, double[] arrayTensor) {
        System.out.println("\nЗадача №3");

        String strOutput = Integer.toString(arrayIndex[2]);
        for (int i = (arrayIndex.length-2); i >= 0; i--) {
            strOutput = String.format("%s, %d", strOutput, arrayIndex[i]);
        }
        System.out.println(strOutput);

        strOutput="";
        for (double j : arrayVector) strOutput = String.format("%s, %s", j, strOutput);
        System.out.println(strOutput.substring(0,strOutput.length()-2));

        strOutput="";
        for (double j : arrayTensor) strOutput = String.format("%s, %s", j, strOutput);
        System.out.println(strOutput.substring(0,strOutput.length()-2));
    }

    public static void task4(int[] arrayIndex) {
        System.out.println("\nЗадача №4" );
        // Пишем код для задачи 4
        for (int i=0;  i < arrayIndex.length; i++) if (arrayIndex[i] % 2 > 0) arrayIndex[i]++;
        System.out.println(Arrays.toString(arrayIndex));
    }
}
