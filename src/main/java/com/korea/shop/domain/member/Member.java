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
    private Long id;
    private String name;

    // 목록을 담을 수 있는 객체 선언
    
//    @ElementCollection // 값 타입 컬렉션 - List, Set에서 쓰임 - 테이블이 매핑되는 것
    @OneToMany(mappedBy = "member")
    private List<Order> order = new ArrayList<>();
}
