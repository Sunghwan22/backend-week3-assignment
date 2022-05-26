// 숫자 야구게임 입력한 숫자가 정답과 순서와 값이 같으면 strike
// 입력한 숫자가 값은 맞지만 순서가 다르면 ball
// 숫자를 입력하면 스트라이크 볼의 카운트를 출력 해주기
// 스트라이크가 3개면 메인 루프 탈출과 함께 you win 출력
// 정답을 랜덤한 값이 아닌 내가 정한 값으로 설정




import java.util.Scanner;

public class Baseballgame {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int number1 = 4;
        int number2 = 8;
        int number3 = 3;

        int strike = 0;
        int ball = 0;

        while (strike != 3) {
            //입력

            System.out.print("Guess numbers: ");

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            //처리
            strike = 0;
            ball = 0;
            if (number1 == x) {
                strike += 1;
            }
            if (number2 == y) {
                strike += 1;
            }
            if (number3 == z) {
                strike += 1;
            }
            if (number1 == y || number1 == z) {
                ball += 1;
            }
            if (number2 == x || number2 == z) {
                ball += 1;
            }
            if (number3 == x || number3 == y) {
                ball += 1;
            }

            //출력
            if (strike != 0) {
                System.out.println(strike + "strike");
            }
            if (ball != 0) {
                System.out.println(ball + "ball");
            }
            if(strike ==0 && ball ==0)
                System.out.println("No count");


        }
        System.out.println("You Win!");
    }
}