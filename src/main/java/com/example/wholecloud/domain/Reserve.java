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
public class Reserve {

    @Id
    @GeneratedValue
    private Long reserveId;

    @Column
    private Long serviceId;

    @Column
    private Long spaceId;

    @Column
    private Long userId;

    @Column
    private String reserveTime;

    @Column
    private Integer reserveCnt;
}
