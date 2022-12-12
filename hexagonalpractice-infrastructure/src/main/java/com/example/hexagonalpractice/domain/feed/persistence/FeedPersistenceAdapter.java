package com.example.hexagonalpractice.domain.feed.persistence;

import com.example.hexagonalpractice.domain.feed.domain.Feed;
import com.example.hexagonalpractice.domain.feed.exception.FeedNotFoundException;
import com.example.hexagonalpractice.domain.feed.mapper.FeedMapper;
import com.example.hexagonalpractice.domain.feed.persistence.entity.FeedEntity;
import com.example.hexagonalpractice.domain.feed.spi.FeedPort;
import com.example.hexagonalpractice.global.annotation.Adapter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Adapter
public class FeedPersistenceAdapter implements FeedPort {

    private final FeedRepository feedRepository;
    private final FeedMapper feedMapper;

    @Override
    public void saveFeed(Feed feed) {
        feedRepository.save(
                feedMapper.domainToEntity(feed)
        );
    }

    @Override
    public UUID saveFeedAndGetId(Feed feed) {
        return feedRepository.save(
                feedMapper.domainToEntity(feed)
        ).getId();
    }

    @Override
    public List<Feed> queryFeedAllByOrderByCreatedAtDesc() {
        return feedRepository.findAllByOrderByCreateAtDesc()
                .stream()
                .map(feedMapper::entityToDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Feed queryFeedById(UUID id) {
        return feedMapper.entityToDomain(
                feedRepository.findById(id)
                        .orElseThrow(() -> FeedNotFoundException.EXCEPTION)
        );
    }
}
