package com.example.hexagonalpractice.global.error;

import com.example.hexagonalpractice.error.ErrorProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ErrorResponse {

    private final int status;
    private final String message;

    @Builder
    public ErrorResponse(ErrorProperty errorProperty) {
        this.status = errorProperty.getStatus();
        this.message = errorProperty.getMessage();
    }
}
