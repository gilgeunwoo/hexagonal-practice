package com.example.hexagonalpractice.global.exception;

import com.example.hexagonalpractice.error.CustomException;
import com.example.hexagonalpractice.global.error.GlobalErrorCode;

public class InternalServerErrorException extends CustomException {

    public static final CustomException EXCEPTION =
            new InternalServerErrorException();

    private InternalServerErrorException() {
        super(GlobalErrorCode.INTERNAL_SERVER_ERROR);
    }
}
