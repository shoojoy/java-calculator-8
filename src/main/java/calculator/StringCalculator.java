package calculator;

import java.util.regex.Pattern;

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
        // 커스텀 구분자 지원
        if (s.startsWith("//")) {
            int nl = s.indexOf('\n');
            if (nl < 0) {
                throw new IllegalArgumentException();
            }
            String custom = s.substring(2, nl);
            String numbers = s.substring(nl + 1);
            return numbers.split(Pattern.quote(custom));
        }
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
