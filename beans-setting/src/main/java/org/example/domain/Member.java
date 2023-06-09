package org.example.domain;

import java.util.Date;

public class Member {

    private long id;
    private String email;
    private String password;
    private String name;
    private Date regDate;

    public Member(long id, String email, String password, String name, Date regDate) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.regDate = regDate;
    }

    public Member() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", regDate=" + regDate +
                '}';
    }

    // 이전(현 비번) 비밀번호, 새로운 비밀번호 받아서 변경처리
    public void changePassword(
                    String oldPassword,
                    String newPassword){

        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return;
        } else {
            System.out.println("현 비번과 입력하신 비번이 일치하지 않습니다");
        }

    }

}
