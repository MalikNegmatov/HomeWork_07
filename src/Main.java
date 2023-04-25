public class Main {

    public static void main(String[] args) {

        // Пишем код для задачи 1
        int[] index = new int[] {1, 2, 3};
        double[] vector =  {1.57, 7.654, 9.986};
        double[] tensor = {1, 0, 0,  0, 1, 0,  0, 0, 0.001};
        System.out.println("Задача №1 \nМассивы index, vector и tensor инициализированы.");

        task2(index, vector, tensor);
    }


    public static void task2(int[] arrayIndex, double[] arrayVector, double[] arrayTensor) {
        System.out.println("\nЗадача №2");
        // Пишем код для задачи 2

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

//    public static void task3(double[] array, int taskNumber) {
//        System.out.println("Задача №" + taskNumber);
//        // Пишем код для задач 3-4
//
//    }
}
