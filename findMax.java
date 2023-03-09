import java.util.Arrays;
import java.util.Scanner;
public class findMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc x: ");
        int x = scanner.nextInt();
        System.out.println("Nhap vao kich thuoc y :");
        int y = scanner.nextInt();
        System.out.println("Nhap cot can tinh tong :");
        int z = scanner.nextInt();
        int sum = 0;
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Nhap phan tu :");
                int element = scanner.nextInt();
                matrix[i][j] = element;
            }
        }
        int a = 0;
        int b = 0;
        int max = matrix[a][b];
        for (int m = 0; m < x; m++) {
            for (int n = 0; n < y; n++) {
                if (max < matrix[m][n]){
                    max = matrix[m][n];
                }
            }
        }
        System.out.println("Gia tri lon nhat :" + max);
        int k = 0;
        int h = 0;
        int min = matrix[k][h];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Gia tri be nhat :" + min);
        for (int i = 0; i < x; i++) {
            if (z != -1 && z < y) {
                sum += matrix[i][z];
            }
        }
        System.out.println(" Tong cot so " + z + "la :" + sum);
    }
}
