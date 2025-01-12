package ru.job4j.arrey;

public class SwitchArray {
    public static int[] swap(int[] array, int sours, int dest) {
    int temp = array[ sours ];
    array[  sours ] = array[ dest ];
    array[ dest ] = temp;
    return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[ array.length - 1 ];
        array[ array.length - 1 ] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
