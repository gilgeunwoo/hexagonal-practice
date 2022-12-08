package com.example.hexagonalpractice.global.error;

import com.example.hexagonalpractice.error.ErrorProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GlobalErrorCode implements ErrorProperty {

    INTERNAL_SERVER_ERROR(500, "서버 오류");

    private final int status;
    private final String message;
}
