public class MergeSort {

    static void merge(int arr[],int low,int mid,int high){
        int result[] = new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                result[k++]=arr[i];
                i++;
            }
            else{
                result[k++] = arr[j];
                j++;
            }
        }
        while(i<=mid){
            result[k++] = arr[i];
            i++;
        }
        while(j<=high){
            result[k++] = arr[j];
            j++;
        }
        j = low;
        for(int m=0;m<result.length && j<=high;m++,j++){
            arr[j] = result[m];
        }
    }

    static void partition(int arr[],int low,int high){
        if(low>=high){
          return;
        }

            int mid = low+(high-low)/2;
            partition(arr,0,mid);
            partition(arr,mid+1,high);
            merge(arr,low,mid,high);
        
    }
    public static void main(String args[]){
        int arr[] = {3,4,1,6,8};
        int n = arr.length-1;
        partition(arr,0,n);
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
