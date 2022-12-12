package com.example.hexagonalpractice.domain.feed.usecase;

import com.example.hexagonalpractice.annotation.ReadOnlyUseCase;
import com.example.hexagonalpractice.domain.feed.api.QueryFeedDetailsPort;
import com.example.hexagonalpractice.domain.feed.api.dto.response.QueryFeedDetailsResponse;
import com.example.hexagonalpractice.domain.feed.domain.Feed;
import com.example.hexagonalpractice.domain.feed.spi.CommendFeedPort;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@ReadOnlyUseCase
public class QueryFeedDetailsUseCase implements QueryFeedDetailsPort {

    private final CommendFeedPort commendFeedPort;

    @Override
    public QueryFeedDetailsResponse execute(UUID id) {

        Feed feed = commendFeedPort.queryFeedById(id);

        return QueryFeedDetailsResponse.builder()
                .title(feed.getTitle())
                .content(feed.getContent())
                .build();
    }
}
