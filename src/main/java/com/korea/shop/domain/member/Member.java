package com.korea.shop.domain.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
// @Table(name=변경할 이름)
@Getter @Setter
public class Member {

    @Id //PK설정
    @GeneratedValue
    @Column(name="member_id") // 컬럼명 변경
    private Long id;
    private String name;

    @Embedded // 값타입 포함
    private Addrass addrass;

    // 목록을 담을 수 있는 객체 선언

//    @ElementCollection // 값 타입 컬렉션 - List, Set에서 쓰임 - 테이블이 매핑되는 것
//    mappedBy = "member" 양방향 통신을 한다는 근거 PK가 FK의 거울역할(READ)
//    @OneToMany(mappedBy = "member") // 양방향 통신 거울설정
//    private List<Order> order = new ArrayList<>();
}
