package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.controller.model.vo.Member;

import java.util.ArrayList;
import java.util.List;

public abstract class MemberRepository {
    private List<Member> memberList = new ArrayList<>();

    public MemberRepository() {}

    public void insertMember(Member mem) {

        if (memberList.size() > 10) {
            try {
                throw new MemberExc("맴버 초과");
            } catch (MemberExc e) {
                throw new RuntimeException(e);
            }
        }
       this.memberList.add(mem);

    }

    public void printData(){

        for (Member mem : memberList) {
            System.out.println(mem.getName() + " 이름" + mem.getGrade() + " 등급" + mem.getPoint() + " 포인트, 이자 포인트는 = " + mem.calculateInterest());
        }
    }

//    public double calculateInterest() {
//        return 0;
//    }

    public abstract double calculateInterest();

    public void printBuyInfo(int price){
        // public void buy(int price);

        for (Member mem : memberList) {
            System.out.println(mem.getName() + " 이름" + mem.getGrade() + " 등급" + mem.getPoint() + " 포인트" +
                    price +" 원 상품을 할인 받아 " +(int)(price - (price * mem.calculateInterest()/mem.getPoint())) + " 원");
        }
    }

}
