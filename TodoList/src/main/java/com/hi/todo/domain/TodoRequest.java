package com.hi.todo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TodoRequest {
    /*
    순서 / 설명
    1. 받을 데이터의 이름과 변수의 이름을 일치시킨다
    2. 기본 생성자를 생성한다
    3. 만약 받을 데이터 값이 null이고 데이터 타입이 자료형일 경우 400에러가 난다 (int 로 null을 받으면 400에러 / Integer로 null을 받으면 null로 받는다)
    4. 만약 커멘드 객체로 생성된다 함은 spring이 해당 객체를 생성한다는 소리이다.
    4.1 -> 그래서 기본 생성자를 만들어줌 (자동으로 데이터를 넣으라고 / 아니면 각각의 상횡마다 @Override 해줘야함)
    5. 그리고 spring은 해당 객체를 Model에도 저장해 줘 객체명(class 명)을 소문자로 바꿔 view에서도 활용할 수 있게 만들어준다.
     */

    private String todo;
    private String duedate;
}
