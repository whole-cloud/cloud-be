package com.example.wholecloud.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Getter
@NoArgsConstructor
@Entity
public class Quest {

    @Id
    @GeneratedValue
    private Long questId;

    @Column
    private Long spaceId;

    @Column
    private String questContent;

    @Column
    private Long regId;

    @Column
    private Date regDttm;
}
