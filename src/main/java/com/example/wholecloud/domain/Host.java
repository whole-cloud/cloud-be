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
public class Host {

    @Id
    @GeneratedValue
    private Long hostId;

    @Column
    private String password;

    @Column
    private String phoneNumber;

    @Column
    private String hostName;

    @Column
    private String gender;

    @Column
    private String birthday;

    @Column
    private String companyName;

    @Column
    private String position;

    @Column
    private String businessNumber;

    @Column
    private String mailAddress;
}
