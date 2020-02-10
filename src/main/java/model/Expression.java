/*
 * Copyright (c) 2019 by 또링
 * All rights reserved.
 *
 * Expression.java
 * 입력 값 객체
 *
 * @author      또링
 * @version     1.0
 * @date        09 Feb 2020
 *
 */
package model;

import validator.InputValidator;

import java.util.ArrayList;
import java.util.List;

public class Expression {
    private List<Double> numbers = new ArrayList<>();
    private List<String> operators = new ArrayList<>();

    public Expression(String expression) {
        String[] componentOfExpression = expression.split(InputValidator.BLANK);
        numbers.add(Double.parseDouble(componentOfExpression[0]));
        int expressionSize = componentOfExpression.length;
        for (int i = 1; i < expressionSize; i += 2) {
            if (i % 2 == 1) {
                operators.add(componentOfExpression[i]);
                numbers.add(Double.parseDouble(componentOfExpression[i + 1]));
            }
        }
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public List<String> getOperators() {
        return operators;
    }
}
