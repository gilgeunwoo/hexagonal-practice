package com.example.hexagonalpractice.domain.feed.exception;

import com.example.hexagonalpractice.domain.feed.error.FeedErrorCode;
import com.example.hexagonalpractice.error.CustomException;

public class FeedNotFoundException extends CustomException {

    public static final CustomException EXCEPTION =
            new FeedNotFoundException();

    private FeedNotFoundException() {
        super(FeedErrorCode.FEED_NOT_FOUND);
    }
}
