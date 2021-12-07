import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyMain {
    public static void main(String[] args) {
        //입력으로부터 배열을 생성하시오
        Scanner scanner = new Scanner(System.in);
        int arr_length;
        arr_length = scanner.nextInt();
        int[] arr = new int[arr_length];
        System.out.println("Input elements of array!");
        for (int i=0;i<arr_length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //shallow copy 수행 코드를 작성하시오
        int[] shallow_copy = arr;
        modifyArray(shallow_copy, 1);
        System.out.println("Shallow Copy: " + Arrays.toString(arr));

        //deep copy 수행 코드를 작성하시오
        int[] deep_copy = new int[arr.length];
        System.arraycopy(arr, 0, deep_copy, 0, arr.length);
        modifyArray(deep_copy, 2);
        System.out.println("Deep Copy: " + Arrays.toString(arr));
    }

    private static void modifyArray(int[] array, int index){
        array[index] = 15;
    }
}