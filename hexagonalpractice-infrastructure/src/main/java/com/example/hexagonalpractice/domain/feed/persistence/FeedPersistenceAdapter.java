package com.example.hexagonalpractice.domain.feed.persistence;

import com.example.hexagonalpractice.domain.feed.mapper.FeedMapper;
import com.example.hexagonalpractice.domain.feed.persistence.entity.FeedEntity;
import com.example.hexagonalpractice.domain.feed.spi.FeedPort;
import com.example.hexagonalpractice.global.annotation.Adapter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Adapter
public class FeedPersistenceAdapter implements FeedPort {

    private final FeedRepository feedRepository;
    private final FeedMapper feedMapper;

    public Optional<FeedEntity> findFeedById(UUID id) {
        return feedRepository.findById(id);
    }
}
