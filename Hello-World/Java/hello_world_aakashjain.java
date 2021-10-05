/*
LANGUAGE: Java
AUTHOR: Aaakash Jain
GITHUB: https://github.com/aakshjain294

Here I am submittting code of quick sort as it is very important algorithm.
*/
import java.util.*;
public class quick_sort {
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partitionOverPivot(int[] arr, int si, int ei, int pidx){
        int p = si-1;
        int itr = si;
        swap(arr, pidx , ei);
        while(itr <= ei){
            if(arr[itr] <= arr[ei]){
                swap(arr, itr , ++p);
            }
            itr++;
        }
        return p;
    }
    public static void quickSort(int[] arr, int si , int ei){
        if(si > ei){
            return;
        }
        int pidx = ei;
        int p = partitionOverPivot(arr, si, ei, pidx);
        quickSort(arr, si, p-1);
        quickSort(arr, p+1, ei);
    }
    public static void print(int[] sum){
	    for(int i = 0 ; i < sum.length; i++){
	      System.out.print(sum[i]+" ");
	    }
	  }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
    	    int n = scn.nextInt();
    	    int[] arr = new int[n];
    	    for (int i = 0; i < n; i++) {
    	      arr[i] = scn.nextInt();
    	    }
    	    quickSort(arr,0,n-1);
    	    print(arr);
    	  }
    }
