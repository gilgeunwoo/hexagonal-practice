package com.example.hexagonalpractice.domain.feed.error;

import com.example.hexagonalpractice.error.ErrorProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FeedErrorCode implements ErrorProperty {

    FEED_NOT_FOUND(404, "Feed Not Found");

    private final int status;
    private final String message;
}
