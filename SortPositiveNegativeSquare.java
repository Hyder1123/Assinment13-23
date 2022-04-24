public class SortPositiveNegativeSquare {

    static void sort(int arr[]){
        int k=0;
        while(k<arr.length){
            if(arr[k]>=0){
                break;
            }
            else
              k++;
        }
        int result[] = new int[arr.length];
        int i=k-1,j=k,idx=0;
        while(i>=0 && j<arr.length){
            if(arr[i]*arr[i]<arr[j]*arr[j]){
                result[idx++] = arr[i]*arr[i];
                i--;
            }
           // else if(arr[i]*arr[i]>arr[j]*arr[j])
           else{
                result[idx++] = arr[j]*arr[j];
                j++;
            }
        }
        while(i>=0){
            result[idx++] = arr[i]*arr[i];
            i--;
        }
        while(j<arr.length){
            result[idx++] = arr[j]*arr[j];
            j++;
        }

        for(int m=0;m<result.length;m++){
            arr[m] = result[m];
        }
    }

    public static void main(String args[]){
        int arr[] = {-6,-4,-1,0,1,2,7};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
