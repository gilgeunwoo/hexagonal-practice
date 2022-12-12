package com.example.hexagonalpractice.domain.feed.api.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class QueryFeedDetailsResponse {

    private final String title;
    private final String content;
}
