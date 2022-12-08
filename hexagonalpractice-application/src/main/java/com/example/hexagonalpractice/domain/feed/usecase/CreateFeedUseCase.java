package com.example.hexagonalpractice.domain.feed.usecase;

import com.example.hexagonalpractice.annotation.UseCase;
import com.example.hexagonalpractice.domain.feed.api.CreateFeedPort;
import com.example.hexagonalpractice.domain.feed.api.dto.request.DomainCreateFeedRequest;
import com.example.hexagonalpractice.domain.feed.api.dto.response.CreateFeedResponse;
import com.example.hexagonalpractice.domain.feed.domain.Feed;
import com.example.hexagonalpractice.domain.feed.spi.CommendFeedPort;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@UseCase
public class CreateFeedUseCase implements CreateFeedPort {

    private final CommendFeedPort commendFeedPort;

    @Override
    public CreateFeedResponse execute(DomainCreateFeedRequest request) {

        UUID feedId = commendFeedPort.saveFeedAndGetId(
                Feed.builder()
                        .title(request.getTitle())
                        .content(request.getContent())
                        .build()
        );

        return new CreateFeedResponse(feedId);
    }
}
