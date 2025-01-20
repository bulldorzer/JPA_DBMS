package com.korea.shop.domain.member.item;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("B") // 구분자 컬럼에 저장되는 값 - DTYPE에 B저장됨
@Getter
@Setter
public class Book extends Item{

    private String author;
    private String isbn;
}
