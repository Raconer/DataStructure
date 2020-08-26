package ex.example.sort;

import ex.example.sort.common.Insert;
import ex.example.sort.common.Quick;
import ex.example.sort.common.Select;

public class SortMain {
    int[] sortList = {1, 2, 3, 4, 5 ,6 ,7 ,8 ,9, 10};
    /* 
     *  1 static이 붙은 변수들은 객체들이 다 같이 공유하는 데이터를 의미한다.
     *  2 static이 붙은 메소드들은 객체들의 데이터와 관계없는 완벽하게 공통적인 로직을 정의할 때 사용한다.
     *  3 따라서 static 메소드에서는 인스턴스 변수나 객체의 메소드를 사용할 수 없다.
     */
    public static int[] randomList(final int size) {
        final int[] sortList = new int[size];
        int count = 0;
        while( count < size ){
            final int num = (int)(Math.random() * size) + 1;
            sortList[count++] = num;
            for(int i = 0; i < count - 1; i++){
                if(num == sortList[i]){
                    count--;
                    break;
                }
            } 
        }
        return sortList;
    }

    public static void arrayString(int[] arr){
        int length = arr.length;
        System.out.println();
        for(int i = 0; i < length; i++ ){
            System.out.print(arr[i]);
            if( i < length - 1)
                System.out.print(" -> ");
        }
    }

    public static void main(final String[] args) {
        final int size = 30;
        final int[] arr = randomList(size);
        // arrayString(arr);
        // // final Quick quick = new Quick();
        // // quick.quickSort(arr, 0, size-1);
        // // arrayString(arr);
        // // Insert insert = new Insert();
        // // insert.InsertSort(arr);
        // // arrayString(arr);
        Select select = new Select();
        select.selectSort(arr);
        arrayString(arr);

    }
}