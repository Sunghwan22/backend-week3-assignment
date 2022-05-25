import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("한 변의 길이를 입력해주세요(2이상 20미만): ");
        int oneSide = scanner.nextInt();


        while ((oneSide < 2 || oneSide >= 20)) {
            System.out.print("다시 입력해주세요 : ");
            oneSide = scanner.nextInt();
        }
        if (oneSide >= 2 && oneSide < 20) {
            for (int i = 0; i < oneSide; i += 1) {
                for (int j = 0; j < oneSide; j += 1) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
