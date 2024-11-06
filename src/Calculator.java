public class Calculator {

    // 덧셈 메소드
    public double add(double a, double b) {
        return a + b;
    }

    // 뺄셈 메소드
    public double subtract(double a, double b) {
        return a - b;
    }

    // 곱셈 메소드
    public double multiply(double a, double b) {
        return a * b;
    }

    // 나눗셈 메소드
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;  // 0으로 나누면 NaN을 반환
        }
        return a / b;
    }

    // main 메소드 - 계산기 테스트
    public static void main(String[] args) {
        // Calculator 객체 생성
        Calculator calc = new Calculator();

        // 덧셈
        System.out.println("5 + 2 = " + calc.add(5, 2));

        // 뺄셈
        System.out.println("6 - 4 = " + calc.subtract(6, 4));

        // 곱셈
        System.out.println("8 * 3 = " + calc.multiply(8, 3));

        // 나눗셈
        System.out.println("15 / 5 = " + calc.divide(15, 5));
        System.out.println("10 / 0 = " + calc.divide(10, 0));  // 0으로 나누는 예외 처리
    }
}
