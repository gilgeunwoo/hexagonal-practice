package com.example.hexagonalpractice.domain.feed.api;

import com.example.hexagonalpractice.domain.feed.api.dto.request.DomainUpdateFeedRequest;

import java.util.UUID;

public interface UpdateFeedPort {
    void execute(DomainUpdateFeedRequest request, UUID id);
}
