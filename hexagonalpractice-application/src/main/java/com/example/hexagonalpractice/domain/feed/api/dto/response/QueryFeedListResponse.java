package com.example.hexagonalpractice.domain.feed.api.dto.response;

import com.example.hexagonalpractice.domain.feed.domain.Feed;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class QueryFeedListResponse {

    private final List<FeedElement> feedList;
}
