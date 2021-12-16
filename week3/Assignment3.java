//작성자 : 노찬우

import java.util.Scanner;

public class Assignment3_1 {
    public static void main(String[] args) {

        // 현재 좌표를 받을 변수
        int x, y;

        // 현재 좌표까지의 거리와 가장 가까운 거리와 해당 좌표를 받을 변수
        double distance, min;
        int resultX, resultY;

        // 임의의 좌표를 받을 변수
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("현재 x값 입력");
        x = scanner.nextInt();
        System.out.println("현재 y값 입력");
        y = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println("------" + (i + 1) + "/10 번째 입력------");

            System.out.println("임의의 좌표 x값 입력");
            arrX[i] = scanner.nextInt();
            System.out.println("임의의 좌표 y값 입력");
            arrY[i] = scanner.nextInt();

            if (arrX[i] == x && arrY[i] == y) {
                System.out.println("현재 좌표값과 동일합니다");
                --i;
                continue;
            }

            for (int j = 0; j < i; j++) {
                if (arrX[i] == arrX[j] && arrY[i] == arrY[j]) {
                    System.out.println("동일한 좌표값이 이미 존재합니다");
                    --i;
                    break;
                }
            }
        }

        // 두 좌표 사이의 거리 구하기
        distance = (double) Math.sqrt(Math.pow(Math.abs(arrX[0] - x), 2) + Math.pow(Math.abs(arrY[0] - y), 2));
        min = distance;
        resultX = arrX[0];
        resultY = arrY[0];
        System.out.printf("(%d, %d) => %.6f\n", arrX[0], arrY[0], distance);

        for (int i = 1; i < 10; i++) {
            distance = (double) Math.sqrt(Math.pow(Math.abs(arrX[i] - x), 2) + Math.pow(Math.abs(arrY[i] - y), 2));
            System.out.printf("(%d, %d) => %.6f\n", arrX[i], arrY[i], distance);
            if (min > distance) {
                min = distance;
                resultX = arrX[i];
                resultY = arrY[i];
            }
        }

        // 결과 출력
        System.out.println("제일 가까운 좌표:");
        System.out.printf("(%d, %d) => %.6f\n", resultX, resultY, min);
    }
}
