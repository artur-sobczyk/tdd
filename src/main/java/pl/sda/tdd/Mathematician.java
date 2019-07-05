package pl.sda.tdd;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mathematician {

    private Calculator calculator;

    public Integer addNumbers(Integer i1, Integer i2) {

        if (i1 > 100 || i2 > 100) {
            return calculator.add(i1, i2);
        } else {
            return i1 + i2;
        }
    }
}
