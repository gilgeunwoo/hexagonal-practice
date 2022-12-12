package com.example.hexagonalpractice.domain.feed.usecase;

import com.example.hexagonalpractice.annotation.UseCase;
import com.example.hexagonalpractice.domain.feed.api.UpdateFeedPort;
import com.example.hexagonalpractice.domain.feed.api.dto.request.DomainUpdateFeedRequest;
import com.example.hexagonalpractice.domain.feed.domain.Feed;
import com.example.hexagonalpractice.domain.feed.spi.CommendFeedPort;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@UseCase
public class UpdateFeedUseCase implements UpdateFeedPort {

     private final CommendFeedPort commendFeedPort;

     @Override
     public void execute(DomainUpdateFeedRequest request, UUID id) {
         Feed feed = commendFeedPort.queryFeedById(id);

         commendFeedPort.saveFeed(
                 feed.update(request.getTitle(), request.getContent())
         );
     }
}
