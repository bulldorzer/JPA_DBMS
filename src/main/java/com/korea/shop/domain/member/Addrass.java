package com.korea.shop.domain.member;


import jakarta.persistence.Embeddable;

// 엔티티 안에 들어가는 값 타입으로 사용될 클래스임
@Embeddable
public class Addrass {

    private String city;
    private String street;
    private int zipcode;
}
