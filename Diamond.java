import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("마름모의 크기를 입력해 주세요(2이상 20미만의 홀수): ");
        int size = scanner.nextInt();
        boolean sizeRange = size >= 2 && size < 20 && (size % 2 == 1);


        while (!sizeRange) {
            System.out.print("다시 입력해주세요 : ");
            size = scanner.nextInt();
            if (size >= 2 && size < 20 && (size % 2 == 1)) {
                break;
            }
        }


        for (int i = 0; i < size / 2 + 1; i += 1) {
            for (int j = 1; j < (size / 2 + 1) - i; j += 1) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k += 1){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

