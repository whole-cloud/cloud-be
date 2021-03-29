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
public class Service {

    @Id
    @GeneratedValue
    private Long serviceId;

    @Column
    private Long spaceId;

    @Column
    private Long hostId;

    @Column
    private String serviceTime;

    @Column
    private String accept;

    @Column
    private Integer price;

    @Column
    private Integer limitCnt;

    @Column
    private Integer addCost;
}
