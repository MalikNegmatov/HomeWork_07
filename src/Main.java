public class Main {

    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int[] index = new int[] {1, 2, 3};
        double[] vector =  {1.57, 7.654, 9.986};
        double[] tensor = {1, 0, 0, 0, 1, 0, 0, 0, 0.001};

        System.out.println("Задача 2");
        // Пишем код для задачи 2
        String strOutput = Integer.toString(index[0]);
        for (int i = 1; i < index.length; i++) strOutput = strOutput + ", " + index[i];
        System.out.println(strOutput);

        strOutput = Double.toString(vector[0]);
        for (int i = 1; i < vector.length; i++) strOutput = strOutput + ", " + vector[i];
        System.out.println(strOutput);

        strOutput =Double.toString(tensor[0]);
        for (int i = 1; i < tensor.length; i++) strOutput = strOutput + ", " + tensor[i];
        System.out.println(strOutput);
        }

}
