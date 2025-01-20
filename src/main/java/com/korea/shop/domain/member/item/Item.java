package com.korea.shop.domain.member.item;


import com.korea.shop.domain.member.OrderItem;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 상속 관리 전략 - 단일테이블로 관로
@DiscriminatorValue("DTYPE") // 구분자 컬럼 싱글테이블 전략일때만 사용함
@Getter @Setter
public class Item {

    @Id
    @GeneratedValue
    @Column(name="item_id")
    private Long id;                // 제품id PK
    private String name;            // 제품명
    private int price;              // 가격
    private int stockQuantity;      // 재고수량

    @OneToMany(mappedBy = "item")
    private List<OrderItem> orderItems = new ArrayList<>();
}
