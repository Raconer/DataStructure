package ex.example.sort.common;

/* 
    Quick 정렬
    Smaller Bigger을 구분하여 계속해서 작고, 큰 부분을 나눠서 정리하는 방법
    시간 복잡도 O(n log n)
*/
public class Quick {

    public Quick(){
    }

    public void quickSort(int[] arr, int start, int end){
        int part2 = partition(arr, start, end);
        if(start < part2 -1){
            quickSort(arr, start, part2 -1);
        }
        if(part2 < end){
            quickSort(arr, part2, end);
        }
    }

    public int partition(int[] arr, int start, int end){
        int pivot = arr[(start + end)/2];
        while(start <= end){
            while(arr[start] < pivot ) start++;
            while(arr[end] > pivot ) end--;
            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public  void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public void arrayString(int[] arr){
        int length = arr.length;
        System.out.println();
        for(int i = 0; i < length; i++ ){
            System.out.print(arr[i]);
            if( i < length - 1)
                System.out.print(" -> ");
        }
    }
}