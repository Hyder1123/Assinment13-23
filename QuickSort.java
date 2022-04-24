import java.util.*;

public class QuickSort {

    static int partition(int arr[],int start,int end){
        int i=start-1,pivot = arr[end];
        int temp = 0;
        for(int j=start;j<=end-1;j++){
            if(arr[j]<pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i+1];
        arr[i+1] = pivot;
        arr[end] = temp;

        return (i+1);
    }

    static void quick(int arr[],int start,int end){
       if(start<end){
           int p = partition(arr,start,end);
           quick(arr,start,p-1);
           quick(arr,p+1,end);
       }
    }
   public static void main(String args[]){
       int n = 3;
       int arr[] = {2,3,1};
       //int n = arr.length;
       quick(arr,0,n-1);
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
   }
}
