package lec12;

public class Lec12 {
    public static void main(String[] args) {
        int min1 = min(60, 102);
        int min2 = min(56, 10, 1034);
        int min3 = min(1284, 10000, 32, 67, 10, 9);

        int[] myList1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int min4 = min(myList1);

        System.out.printf("", , , , , , )
















////
////        int[] myList2 = new int[myList1.length];
////
////        //myList2 = {0 0 4 5 6 7 8 0 0};
////
////
////        System.arraycopy(myList1, 3, myList2, 2, 100);
////
////        printArray(myList2);
//
//        double[] myList1 = {2.3, 5.6, 10.982, 4.204, 100.87};
//        printArray(myList1);
//
//        System.out.println();
//
//        double sum = 0;
//        for (double num : myList1) {
//            sum += num;
//        }
//        System.out.println("sum = " + sum);





//        double[] myList1 = {2.3, 5.6, 10.982, 4.204, 100.87};
//        double[] myList2 = new double[myList1.length]; //shallow copy
//
//        System.arraycopy(myList1, 0, myList2, 0, myList1.length);
//
//        printArray(myList1);
//        System.out.println();
//        printArray(myList2);
//
//        myList2[2] = 10000.5;
//        System.out.println();
//        printArray(myList1);
//        System.out.println();
//        printArray(myList2);


    }

    public static int min(String s, int[] values, double ... values2) {

        int min = values[0];

        for(int i = 1 ; i < values.length ; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }

        return min;
    }

    public static double[] copyArray(double[] arr) {
        double[] myCopy = new double[arr.length];

        for(int i = 0 ; i < arr.length ; i++ ) {
            myCopy[i] = arr[i];
        }

        return myCopy;

    }



    public static void printArray(double[] arr) {

        for (double value : arr ) {
            System.out.print(value + " ");
        }

//        for (int i = 0 ; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }

    }

    public static void printArray(int[] arr) {

        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }


}
