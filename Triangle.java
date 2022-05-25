import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 높이를 입력해 주세요(2이상 20미만) ");
        int height = scanner.nextInt();

        while (height < 2 || height >= 20) {
            System.out.print("다시 입력해주세요 : ");
            height = scanner.nextInt();
        }
        if (height >= 2 && height < 20) {
            for (int i = 0; i < height; i += 1) {
                for (int j = 1; j < height - i; j += 1) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i * 2 + 1; k += 1) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
