// Author: AG

public class SortingAlgos {

    public static void BubbleSorting(int[] arr){
        int len = arr.length;
        for(int i=len-1;i>0;i--){
            int pass=0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    pass+=1;
                }
            }
            if(pass==0){
                return;
            }
        }
    }
    public static void InsertionSort(int[] arr){
        int len = arr.length;
        for(int i=1;i<len;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            }
        }
    }
    public static void MergeSort(int[] arr){
        int i=0;
        int l = arr.length -1 ;
        int mid = l/2;
        int[] L = new int[mid+1];
        int[] R = new int[l-mid];
        for(int k=0;k<mid+1;k++){
            L[k] = arr[k];
        }
        for(int k=0;k<l-mid;k++){
            R[k] = arr[mid+1+k];
        }
        if(l>i){
            MergeSort(L);
            MergeSort(R);
        }
        else return;
        int k=0,q=0,a=0;
        while(k<mid+1 && q<l-mid){
            if(L[k]<R[q]){
                arr[a] = L[k];
                a++;
                k++;
            }
            else{
                arr[a] = R[q];
                a++;
                q++;
            }
        }
        while(k<mid+1){
            arr[a] = L[k];
            a++;
            k++;
        }
        while(q<l-mid){
            arr[a] = R[q];
            a++;
            q++;
        }
    }
    public static void CountSort(int[] arr){
        int len = arr.length;
        int max = 0;
        for(int i =0;i<len;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] count = new int[max+1];
        for(int i=0;i<max+1;i++){
            count[i]=0;
        }
        for(int i=0;i<len;i++){
            count[arr[i]]+=1;
        }
        int k=0;
        for(int i=0;i<max+1;i++){
            while(count[i]!=0){
                arr[k]=i;
                k++;
                count[i]--;
            }
        }
    }

    public static void SelectionSort(int[] arr){
        int len = arr.length;
        if(len<=1){
            return;
        }
        int min = arr[0];
        int k=0;
        for(int i=0;i<len;i++){
            if(min>arr[i]){
                min=arr[i];
                k=i;
            }
        }
        arr[k]=arr[0];
        arr[0]=min;
        int arr1[]=new int[len-1];
        for(int i=1;i<len;i++){
            arr1[i-1]=arr[i];
        }
        SelectionSort(arr1);
        for(int i=1;i<len;i++){
            arr[i]=arr1[i-1];
        }
    }
    public static void PrintArray(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.printf(""+arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Static Array Sorting and Time Calculation in process
        int[] arr = {5,2,6,8,4,3};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,25,16};
        double start = System.nanoTime();
        SelectionSort(arr2);
        double end = System.nanoTime();
        PrintArray(arr2);
        System.out.println((end-start)/1000000000.0);
    }
}
