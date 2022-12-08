package com.example.hexagonalpractice.domain.feed.persistence;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class FeedQuerydslImpl implements FeedQuerydslExtension {

    private final JPAQueryFactory jpaQueryFactory;
}
