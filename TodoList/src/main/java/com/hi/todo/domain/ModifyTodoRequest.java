package com.hi.todo.domain;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ModifyTodoRequest {
    private int tno;
    private String todo;
    private String duedate;
    private String finished;
}
