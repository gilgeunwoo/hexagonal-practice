package com.example.hexagonalpractice.domain.feed.persistence;

import com.example.hexagonalpractice.domain.feed.persistence.entity.FeedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FeedRepository extends JpaRepository<FeedEntity, UUID>, FeedQuerydslExtension {
}
