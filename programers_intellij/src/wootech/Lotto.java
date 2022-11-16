package wootech;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        Exeption.isNotoverlapped(numbers);
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }
    // 추가 기능

    public List<Integer> getNumbers() {
        return numbers;
    }

    // TODO: 추가 기능 구현

}
