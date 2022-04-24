public class MergeTwoSortedArray {

    static void sort(int a[],int b[]){
        int c[] = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++] = a[i];
                i++; 
            }
            else if(b[j]<a[i]){
                c[k++] = b[j];
                j++;
            }
        }
        while(i<a.length){
            c[k++] = a[i];
            i++;
        }
        while(j<b.length){
            c[k++] = b[j];
            j++;
        }

        for(int index=0;index<a.length;index++){
             a[index] = c[index];
        }
        int m=0;
        for(int idx = a.length;idx<c.length;idx++){
            b[m++] = c[idx];
        }
    }
    public static void main(String args[]){
        int a[] = {1,3,5,7};
        int b[] = {2,4,6,8};
        sort(a,b);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
    
}
