package com.main;

public class BinarySearch {
    public static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static int binarySearch(int[] list, int key) {
        int l = 0;
        int r = list.length - 1;
        while (r >= l) {
            int mid = (l + r) / 2;
            if (key < list[mid]) {
                r = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
