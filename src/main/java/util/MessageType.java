/*
 * Copyright (c) 2019 by 또링
 * All rights reserved.
 *
 * MessageType.java
 * 출력 메세지를 관리하는 enum
 *
 * @author      또링
 * @version     1.0
 * @date        10 Feb 2020
 *
 */
package util;

public enum MessageType {
    INPUT_EXPRESSION_FROM_USER("수식을 입력해주세요"),
    OUTPUT_EXPRESSION_FORMAT("결과입니다.");

    private final String message;

    MessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
