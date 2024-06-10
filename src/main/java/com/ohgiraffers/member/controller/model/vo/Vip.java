package com.ohgiraffers.member.controller.model.vo;

public class Vip extends Member {
    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    public int buy(int price) {
        return price;
    }
    public double calculateInterest() {
        return super.getPoint() * 0.1;
    }
}
