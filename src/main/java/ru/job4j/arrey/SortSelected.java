package ru.job4j.arrey;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i =  0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] num = new int[] {1, 4, 6, 3};

    }
}
