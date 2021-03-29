package com.example.wholecloud.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long reviewId;

    @Column
    private Long spaceId;

    @Column
    private String score;

    @Column
    private String reviewContent;

    @Column
    private Long regId;

    @Column
    private String regDttm;
}
