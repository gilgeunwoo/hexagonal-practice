package com.example.hexagonalpractice.domain.feed.spi;

import com.example.hexagonalpractice.domain.feed.domain.Feed;

import java.util.List;
import java.util.UUID;

public interface CommendFeedPort {

    void saveFeed(Feed feed);
    UUID saveFeedAndGetId(Feed feed);
    List<Feed> queryFeedAllByOrderByCreatedAtDesc();
}
