// 한변의 길이를 입력을 받는다
// 범위에 맞지 않는 수를 입력받으면 다시 입력해주세요 를 출력한다 다시 크기를 입력 받을 수 있다.
// 한변의 길이만큼 별을 출력해보자
// 입력값에 맞는 세로의 길이만큼 별을 출력


import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("한 변의 길이를 입력해 주세요 (2이상 20미만): ");
        int oneSide = scanner.nextInt();

        while (oneSide < 2 || oneSide >= 20) {
            System.out.print("다시 입력해주세요 ");
            oneSide = scanner.nextInt();
        }

        for (int i = 0; i < oneSide; i += 1) {
            for (int j = 0; j < oneSide; j += 1) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
