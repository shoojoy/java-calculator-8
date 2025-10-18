package calculator;

public class StringCalculator {
    public int sum(String s) {
        // 빈 문자열은 0
        if (s == null || s.isBlank()) {
            return 0;
        }
        // 기본 구분자만 합산
        String[] tokens = splitByDefaultDelimiters(s);
        return sumTokens(tokens);
    }

    private String[] splitByDefaultDelimiters(String s) {
        // 기본 구분자 분리
        return s.split("[,:]");
    }

    private int sumTokens(String[] tokens) {
        // 분리된 숫자토큰을 정수로 파싱해서 합산
        int total = 0;
        for (String token : tokens) {
            total += Integer.parseInt(token);
        }
        return total;
    }
}
