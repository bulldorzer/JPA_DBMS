package com.korea.shop.domain.member;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {


    @Id
    @GeneratedValue
    @Column(name="delivery_id")
    private Long id;                // 주문목록 id

//    @OneToOne(mappedBy = "delivery")
//    private Order order;            // 주문서

    @Embedded // 값타입 포함
    private Addrass addrass;        // 배송지

    @Enumerated(EnumType.STRING)    // enum의 자료형 지정
    private DeliveryStatus status;  // 배송상태
}
