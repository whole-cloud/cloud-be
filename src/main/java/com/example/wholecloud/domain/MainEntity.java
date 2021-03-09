package com.example.wholecloud.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class MainEntity {
    @Id
    private Long id;

    @Column
    private String title;
}
