package com.example.hexagonalpractice.domain.feed.api;

import com.example.hexagonalpractice.domain.feed.api.dto.request.DomainCreateFeedRequest;
import com.example.hexagonalpractice.domain.feed.api.dto.response.CreateFeedResponse;

public interface CreateFeedPort {
    CreateFeedResponse execute(DomainCreateFeedRequest request);
}
