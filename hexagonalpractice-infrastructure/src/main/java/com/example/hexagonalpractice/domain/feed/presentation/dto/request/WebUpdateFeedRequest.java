package com.example.hexagonalpractice.domain.feed.presentation.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class WebUpdateFeedRequest {

    private String title;
    private String content;
}
