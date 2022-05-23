import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("한 변의 길이를 입력하세요(2 이상 20 미만) : ");

        int oneside = scanner.nextInt();

        for (int i = 0; i < oneside; i += 1) {
                System.out.print("한 변의 길이를 입력하세요(2 이상 20 미만) : ");
            if (oneside < 2 || oneside >= 20) {
                System.out.println("다시 입력해 주세요");
                continue;
            }

            for (int j = 0; j < oneside; j += 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
