package com.example.hexagonalpractice.domain.feed.presentation;

import com.example.hexagonalpractice.domain.feed.api.CreateFeedPort;
import com.example.hexagonalpractice.domain.feed.api.dto.request.DomainCreateFeedRequest;
import com.example.hexagonalpractice.domain.feed.api.dto.response.CreateFeedResponse;
import com.example.hexagonalpractice.domain.feed.presentation.dto.request.WebCreateFeedRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/feed")
@RestController
public class FeedWebAdapter {

    private final CreateFeedPort createFeedPort;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CreateFeedResponse createFeed(@RequestBody @Valid WebCreateFeedRequest request) {
        return createFeedPort.execute(DomainCreateFeedRequest.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build()
        );
    }
}
