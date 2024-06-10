package com.ohgiraffers.member.controller.model.vo;

public class Silver extends Member {
    public Silver(String name, String grade, int point) {
        // return getGrade() + getName() + getPoint();
        // return name + grade + point ;
        super(name, grade, point);
        // 리턴은 안되네
    }

    public double calculateInterest() {
        return super.getPoint() * 0.02;
    }

    public int buy(int price) {
        return price;
    }
}
