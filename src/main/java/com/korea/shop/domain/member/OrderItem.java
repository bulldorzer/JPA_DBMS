package com.korea.shop.domain.member;


import com.korea.shop.domain.member.item.Item;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name="order_item_id") // DB는 스네이크스타일 표기법으로 사용함
    private Long id;                // 주문목록 id

    private int orderPrice;         // 주문 목록의 총계
    private int count;              // 주문수량

    @ManyToOne                      // 단방향 통신할때 주로 쓰임
    @JoinColumn(name="item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;
}
