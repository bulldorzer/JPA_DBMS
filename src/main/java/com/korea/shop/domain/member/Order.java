package com.korea.shop.domain.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//@Embeddable
@Entity
 @Table(name="orders") // order가 db 예약어 이기떄문에 테이블명 변경
@Getter @Setter
public class Order {


    @Id //PK설정
    @GeneratedValue
    @Column(name="order_id")
    private Long id;

    @ManyToOne // 단방향 통신을 한다는 근거 (FK가 주인)
    @JoinColumn(name="member_id") // 외래키 지정 주인 지정 무조건 외래키에서만 주인으로 씀
    private Member member;

    @OneToOne
    @JoinColumn(name="delivery_id") //  주인설정 (FK)
    private Delivery delivery;

    @Enumerated(EnumType.STRING)
    private OrderStatus status; //[ORDER, CANCEL]


}
;