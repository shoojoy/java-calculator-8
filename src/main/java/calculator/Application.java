package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        // 시작 문구 출력하기
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        //합하여 출력
        int result = new StringCalculator().sum(input);
        System.out.println("결과 : " + result);
    }
}
