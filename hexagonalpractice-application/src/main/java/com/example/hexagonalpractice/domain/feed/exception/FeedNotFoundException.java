package com.example.hexagonalpractice.domain.feed.exception;

import com.example.hexagonalpractice.domain.feed.error.UserErrorCode;
import com.example.hexagonalpractice.error.CustomException;

public class FeedNotFoundException extends CustomException {

    public static final CustomException EXCEPTION =
            new FeedNotFoundException();

    private FeedNotFoundException() {
        super(UserErrorCode.FEED_NOT_FOUND);
    }
}
