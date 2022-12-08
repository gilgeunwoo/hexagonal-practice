package com.example.hexagonalpractice.domain.feed.mapper;

import com.example.hexagonalpractice.domain.feed.domain.Feed;
import com.example.hexagonalpractice.domain.feed.persistence.entity.FeedEntity;
import org.springframework.stereotype.Component;

@Component
public class FeedMapper {

    public Feed entityToDomain(FeedEntity feedEntity) {
        return Feed.builder()
                .id(feedEntity.getId())
                .title(feedEntity.getTitle())
                .content(feedEntity.getContent())
                .build();
    }

    public FeedEntity domainToEntity(Feed feed) {
        return FeedEntity.builder()
                .id(feed.getId())
                .title(feed.getTitle())
                .content(feed.getContent())
                .build();
    }
}
