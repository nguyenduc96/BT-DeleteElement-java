import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = {1,3,5,7,9,0,2,4,6,8};
        while (true){
            System.out.println("Nhập vào số muốn xóa : ");
            int value_delete = scanner.nextInt();
            for (int i = 0; i < arrayNumber.length; i++) {
                if (value_delete == arrayNumber[i]){
                    System.out.println("Mảng cũ : " + Arrays.toString(arrayNumber));
                    System.out.println("Mảng mới: " + Arrays.toString(deleteElemet(value_delete, arrayNumber)));
                    break;
                }
            }
            System.out.println(value_delete + " không có trong mảng");
        }
    }
    public static int[] deleteElemet(int value_delete, int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == value_delete){
               array[i] = array[i+ 1];
                for (int j = i; j < array.length -1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        array[array.length -1] = 0;
        return array;
    }
}
