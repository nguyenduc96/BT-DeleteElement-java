import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = {1,3,5,7,9,0,2,4,6,8};
        System.out.println("Nhập vào vị trí muốn xóa : ");
        int value_delete = scanner.nextInt();
        System.out.println("Mảng cũ : " + Arrays.toString(arrayNumber));
        System.out.println("Mảng mới: " + Arrays.toString(deleteElemet(value_delete, arrayNumber)));
    }

    public static int[] deleteElemet(int value_delete, int[] array){
        int[] newArray = new int[array.length -1];
        for (int i = 0; i < newArray.length; i++) {
          if (i < value_delete){
              newArray[i] = array[i];
          }else {
              newArray[i] = array[i + 1];
          }
        }
        return newArray;
    }
}
