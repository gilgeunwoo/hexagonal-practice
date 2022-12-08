package com.example.hexagonalpractice.domain.feed.presentation.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class WebCreateFeedRequest {
    private String title;
    private String content;
}
