package com.example.hexagonalpractice.domain.feed.usecase;

import com.example.hexagonalpractice.annotation.ReadOnlyUseCase;
import com.example.hexagonalpractice.domain.feed.api.QueryFeedListPort;
import com.example.hexagonalpractice.domain.feed.api.dto.response.FeedElement;
import com.example.hexagonalpractice.domain.feed.api.dto.response.QueryFeedListResponse;
import com.example.hexagonalpractice.domain.feed.spi.CommendFeedPort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@ReadOnlyUseCase
public class QueryFeedListUseCase implements QueryFeedListPort {

    private final CommendFeedPort commendFeedPort;

    public QueryFeedListResponse execute() {

        List<FeedElement> feedList = commendFeedPort.queryFeedAllByOrderByCreatedAtDesc()
                .stream()
                .map(FeedElement::of)
                .collect(Collectors.toList());

        return new QueryFeedListResponse(feedList);
    }
}
