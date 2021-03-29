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
public class Space {

    @Id
    @GeneratedValue
    private Long spaceId;

    @Column
    private String spaceName;

    @Column
    private String spacePhoneNumber;

    @Column
    private String category;

    @Column
    private String region;

    @Column
    private String description;

    @Column
    private String fcltInfo;

    @Column
    private String latitude;

    @Column
    private String longitude;

    @Column
    private String notice;

    @Column
    private String returnPolicy;
}
