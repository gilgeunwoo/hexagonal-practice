package com.example.hexagonalpractice.domain.feed.api.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DomainUpdateFeedRequest {

    private final String title;
    private final String content;
}
