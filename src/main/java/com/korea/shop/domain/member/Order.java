package com.korea.shop.domain.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//@Embeddable
@Entity
 @Table(name="orders")
@Getter @Setter
public class Order {


    @Id //PK설정
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="member_id") // 외래키 지정
    private Member member;
}
;