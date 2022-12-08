package com.example.hexagonalpractice.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomException extends RuntimeException {

    private final ErrorProperty errorProperty;
}
