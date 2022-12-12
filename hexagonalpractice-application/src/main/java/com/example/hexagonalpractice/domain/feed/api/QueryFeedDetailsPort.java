package com.example.hexagonalpractice.domain.feed.api;

import com.example.hexagonalpractice.domain.feed.api.dto.response.QueryFeedDetailsResponse;

import java.util.UUID;

public interface QueryFeedDetailsPort {
    QueryFeedDetailsResponse execute(UUID id);
}
