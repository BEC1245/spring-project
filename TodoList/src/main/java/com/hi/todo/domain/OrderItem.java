package com.hi.todo.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class OrderItem {
    private String itemId;
    private int number;
    private String remark;
}
