public class Main {

    public static void main(String[] args) {

        // Пишем код для задачи 1
        int[] index = new int[] {1, 2, 3};
        double[] vector =  {1.57, 7.654, 9.986};
        double[] tensor = {1, 0, 0, 0, 1, 0, 0, 0, 0.001};

        task2(index);
        task3(vector, 3);
        task3(tensor, 4);
    }


    public static void task2(int[] array) {
        System.out.println("Задача №2");
        // Пишем код для задачи 2
        String strOutput = Integer.toString(array[0]);
        for (int i = 1; i < array.length; i++) strOutput = strOutput + ", " + array[i];
        System.out.println(strOutput+ "\n");
    }

    public static void task3(double[] array, int taskNumber) {
        System.out.println("Задача №" + taskNumber);
        // Пишем код для задач 3-4
        String strOutput = Double.toString(array[0]);
        for (double j : array) strOutput = strOutput + ", " + j;
        System.out.println(strOutput+ "\n");
    }
}
