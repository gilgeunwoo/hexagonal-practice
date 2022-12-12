package com.example.hexagonalpractice.domain.feed.persistence;

import com.example.hexagonalpractice.domain.feed.domain.Feed;
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

    public Optional<FeedEntity> findFeedById(UUID id) {
        return feedRepository.findById(id);
    }

    @Override
    public void saveFeed(Feed feed) {
        feedRepository.save(
                feedMapper.domainToEntity(feed)
        );
    }

    public UUID saveFeedAndGetId(Feed feed) {
        return feedRepository.save(
                feedMapper.domainToEntity(feed)
        ).getId();
    }

    public List<Feed> queryFeedAllByOrderByCreatedAtDesc() {
        return feedRepository.findAllByOrderByCreateAtDesc()
                .stream()
                .map(feedMapper::entityToDomain)
                .collect(Collectors.toList());
    }
}
