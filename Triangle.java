// 삼각형의 높이를 입력받음
// 범위값 밖의 숫자를 입력받으면 다시 입력해주세요 와 함께 다시 입력을 받음
// 입력받은 숫자만큼 삼각형의 층이 만들어짐
// 꼭대기는 별이 1개 층이 내려갈때마다 별이 2개씩 증가함
// 꼭대기에는 층-1만큼의 빈공간이 존재하고 밑으로 1층씩 내려올때마다 빈칸이 1개씩 없어짐


import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("삼각형의 높이를 입력해주세요 (2이상 20미만): ");
        int height = scanner.nextInt();

        while (height < 2 || height >= 20) {
            System.out.print("다시 입력해주세요 ");
            height = scanner.nextInt();
        }

        for (int i = 0; i < height; i += 1) {
            for (int j = 0; j < height - (i + 1); j += 1) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k += 1) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
