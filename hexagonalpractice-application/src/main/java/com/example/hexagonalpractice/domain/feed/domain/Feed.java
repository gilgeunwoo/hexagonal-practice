package com.example.hexagonalpractice.domain.feed.domain;

import com.example.hexagonalpractice.annotation.Aggregate;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
@Aggregate
public class Feed {

    private final UUID id;

    private final String title;

    private final String content;
}
