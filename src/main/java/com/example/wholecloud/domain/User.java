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
public class User {

    @Id
    @GeneratedValue
    private Long userId;

    @Column
    private String password;

    @Column
    private String phoneNumber;

    @Column
    private String userName;

    @Column
    private String gender;

    @Column
    private String birthday;

    @Column
    private String mailAddress;
}
