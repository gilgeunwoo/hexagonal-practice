package com.example.hexagonalpractice.domain.feed.persistence.entity;

import com.example.hexagonalpractice.global.entity.BaseUUIDEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@SuperBuilder
@NoArgsConstructor
@Table(name = "tbl_feed")
@Entity
public class FeedEntity extends BaseUUIDEntity {

    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private String title;

    @Column(columnDefinition = "VARCHAR(1000)", nullable = false)
    private String content;
}
