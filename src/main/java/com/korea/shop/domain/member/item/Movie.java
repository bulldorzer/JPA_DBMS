package com.korea.shop.domain.member.item;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("M") // 구분자 컬럼에 저장되는 값 - DTYPE에 M저장됨
@Getter
@Setter
public class Movie extends Item{
    private String director;
    private String actor;
}
