package calculator;

public class StringCalculator {
    public int sum(String s) {
        // 빈 문자열은 0
        if (s == null || s.isBlank()) {
            return 0;
        }
        throw new IllegalArgumentException();
    }
}
