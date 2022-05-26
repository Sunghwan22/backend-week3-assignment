// 마름모의 크기를 입력받음
//마름모의 크기는 2 이상 20이하 홀수
// 범위밖의 숫자를 입력받으면 다시 입력해주세요
// 다시 입력을 받을 수 있음
// 알맞은 숫자를 입력받으면 마름모의 크기만큼 공간이 생성됨.
// 마름모는 꼭대기에서 별이 1개 중간층까지 별2개이 증가하고 중간을 기준으로 다시 별이2개씩 감소
// 빈공간은 꼭대기에서 층 -1의 에서 층이 내려갈수록 하나씩 감소 중간층에서는 빈공간이 없어지고 그 밑으로 갈수록 빈공간이 1개씩 증가
// 마름모를 중간기준으로 위쪽은 삼각형 밑은 역삼각형 으로 모양을 분리해서 제작


import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("마름모의 크기를 입력해 주세요(2이상 20미만의 홀수): ");
        int size = scanner.nextInt();


        while (size < 2 || size >= 20 || size % 2 == 0) {
            System.out.print("다시 입력해주세요 : ");
            size = scanner.nextInt();

        }


        for (int i = 0; i < size / 2 + 1; i += 1) {
            for (int j = 0; j < size / 2  - i; j += 1) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k += 1) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < size / 2; i += 1) {
            for (int j = size - 1; j < size + i; j += 1) {
                System.out.print(" ");
            }
            for (int k = 0; k < (size - 2) - (i * 2); k += 1) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}


