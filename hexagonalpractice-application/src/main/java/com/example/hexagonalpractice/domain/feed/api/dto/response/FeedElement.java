package com.example.hexagonalpractice.domain.feed.api.dto.response;

import com.example.hexagonalpractice.domain.feed.domain.Feed;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class FeedElement {
    private UUID feedId;
    private String title;

    public static FeedElement of(Feed feed) {
        return FeedElement.builder()
                .feedId(feed.getId())
                .title(feed.getTitle())
                .build();
    }
}
