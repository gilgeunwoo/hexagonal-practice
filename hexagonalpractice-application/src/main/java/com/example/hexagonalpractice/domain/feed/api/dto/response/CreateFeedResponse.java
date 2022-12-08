package com.example.hexagonalpractice.domain.feed.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class CreateFeedResponse {

    private final UUID feedId;
}
