package Math;

/**
 * Created by Iju on 2024-06-03
 * *
 * * 최대 공약수 (GCD)
 * : 유클리드 호제법(Euclidean Algorithm)을 사용하여 구함
 * - 유클리드 호제법의 핵심 아이디어?
 * 1. 두 수 중 큰 수를 작은 수로 나눈 나머지를 구함
 * 2. 나머지가 0이 될 때까지 이 과정을 반복
 * 3. 나머지가 0이 되면, 작은 수가 GCD
 */
public class GCDLCM {
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 18;

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2, gcd);

        System.out.println("GCD : " + gcd); // 출력 : GCD : 6
        System.out.printf("LCD : %d\n", lcm); // 출력 : LCM : 36
    }

    // 유클리드 호제법을 사용한 GCD 계산
    public static int findGCD(int a, int b){
        while(b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }

        return a;
    }

    // GCD를 이용한 LCM 계산
    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
