package Jobsheet_7;

public class Sort13Main {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting13 mSorting13 = new MergeSorting13();
        System.out.println("Data awal");
        mSorting13.printArray(data);
        mSorting13.mergeSort(data);
        System.out.println("Setelah diurutkan");
        mSorting13.printArray(data);
    }
}
