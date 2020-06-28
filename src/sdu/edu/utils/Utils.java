package sdu.edu.utils;

import java.util.Arrays;

/*
 * Author:      刘伯栋
 * Time:        2020-06-21 09:18
 * Version:     1.0
 * Description:
 */
public class Utils {

    public static <T> void printIterable(Iterable<T> arr) {
        StringBuilder sb = new StringBuilder("[");
        for (T t : arr) {
            sb.append(t.toString());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static <T> void printArray(T[] arr) {
        printIterable(Arrays.asList(arr));
    }

}
