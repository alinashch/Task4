package com.company;

import java.util.ArrayList;

public class QuickSort {

    private static int partition(ArrayList<coordinates> data, int left, int right) {
        int l = left;
        int r = right - 1;
        int x=data.get((l+r)/2).value;
        while (l <= r) {
            while (data.get(l).value < x) {
                l++;
            }
            while (data.get(r).value > x) {
                r--;
            }
            if (l <= r) {
                coordinates tmp = data.get(l);
                data.set(l, data.get(r));
                data.set(r, tmp);
                l++;
                r--;
            }
        }
        if (l == right) {
            l--;
        }
        return l;
    }
    private static void sort(ArrayList<coordinates> data, int left, int right) {
        if (left < right - 1) {
            int xIndex = partition(data, left, right);
            sort(data, left, xIndex);
            sort(data, xIndex, right);
        }
    }
    public static ArrayList<coordinates> sort(ArrayList<coordinates> data) {
        sort(data, 0, data.size());
        return data;
    }
}