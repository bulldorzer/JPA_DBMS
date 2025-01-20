package com.korea.shop.domain.member;


import com.korea.shop.domain.member.item.Item;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Category {
    
    @Id @GeneratedValue
    @Column(name="category_id")
    private Long id;
    
    private String name;    // 카테고리 이름

    // 해당 카테고리에 소속된 상품 목록(item)
    //    mappedBy = "member" 양방향 통신을 한다는 근거 PK가 FK의 거울역할(READ)
    @OneToMany(mappedBy = "category")
    private List<CategoryItem> items = new ArrayList<>();


    // 상위 카테고리
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    // 하위 카테고리
    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    public void addChild(Category newchild){
        this.child.add(newchild); // 하위 카테고리 리스트에 새로운 자식 카테고리 추가
        newchild.setParent(this); // 변경된 this(=category)로 다시 설정
    }
}
