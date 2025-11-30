package Recursion2_Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println(Search(arr, 4, 0));
        System.out.println(searchIndex(arr, 4, 0));
        System.out.println(searchIndexLast(arr, 4, arr.length-1));

        ArrayList<Integer> res = findAllIndices(arr, 4, 0, new ArrayList<Integer>());
        System.out.println(res);
    }

    static boolean Search(int[] arr, int target, int index){
        if(index == arr.length) return false;

        return (arr[index] == target || Search(arr, target, index+1));
    }

    static int searchIndex(int[] arr, int target, int index){
        if(index == arr.length) return -1;

        if(arr[index] == target) return target;
        else return searchIndex(arr, target, index+1);
    }

    static int searchIndexLast(int[] arr, int target, int index){
        if(index == -1) return -1;
        if(arr[index] == target) return target;
        else return searchIndexLast(arr, target, index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllTargets(int[] arr, int target, int index){
        if(index == -1) return;
        if(arr[index] == target) list.add(target);
        findAllTargets(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndices(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length) return list;
        if(arr[index] == target) list.add(index);
        return findAllIndices(arr, target, index+1, list);
    }

    // Not a recommended approach 😒
    static ArrayList<Integer> findAllIndices2(int[] arr, int target, int index){
        ArrayList<Integer> list  = new ArrayList<>();
        if(index == arr.length) return list;
        // contains ans for a specific func call
        if(arr[index] == target) list.add(index);
        ArrayList<Integer> prevAns = findAllIndices2(arr, target, index+1);
        list.addAll(prevAns);
        return list;
    }
}
