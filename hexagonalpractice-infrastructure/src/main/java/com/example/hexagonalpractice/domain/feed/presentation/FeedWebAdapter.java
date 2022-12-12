package com.example.hexagonalpractice.domain.feed.presentation;

import com.example.hexagonalpractice.domain.feed.api.CreateFeedPort;
import com.example.hexagonalpractice.domain.feed.api.QueryFeedDetailsPort;
import com.example.hexagonalpractice.domain.feed.api.QueryFeedListPort;
import com.example.hexagonalpractice.domain.feed.api.UpdateFeedPort;
import com.example.hexagonalpractice.domain.feed.api.dto.request.DomainCreateFeedRequest;
import com.example.hexagonalpractice.domain.feed.api.dto.request.DomainUpdateFeedRequest;
import com.example.hexagonalpractice.domain.feed.api.dto.response.CreateFeedResponse;
import com.example.hexagonalpractice.domain.feed.api.dto.response.QueryFeedDetailsResponse;
import com.example.hexagonalpractice.domain.feed.api.dto.response.QueryFeedListResponse;
import com.example.hexagonalpractice.domain.feed.presentation.dto.request.WebCreateFeedRequest;
import com.example.hexagonalpractice.domain.feed.presentation.dto.request.WebUpdateFeedRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/feed")
@RestController
public class FeedWebAdapter {

    private final CreateFeedPort createFeedPort;
    private final QueryFeedListPort queryFeedListPort;
    private final UpdateFeedPort updateFeedPort;
    private final QueryFeedDetailsPort queryFeedDetailsPort;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CreateFeedResponse createFeed(@RequestBody @Valid WebCreateFeedRequest request) {
        return createFeedPort.execute(DomainCreateFeedRequest.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build()
        );
    }

    @GetMapping
    public QueryFeedListResponse getList() {
        return queryFeedListPort.execute();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{feed-id}")
    public void updateFeed(@RequestBody @Valid WebUpdateFeedRequest request, @PathVariable("feed-id") UUID id) {
        updateFeedPort.execute(
                DomainUpdateFeedRequest.builder()
                        .title(request.getTitle())
                        .content(request.getContent())
                        .build(), id
        );
    }

    @GetMapping("/{feed-id}")
    public QueryFeedDetailsResponse getDetails(@PathVariable("feed-id") UUID id) {
        return queryFeedDetailsPort.execute(id);
    }
}
