package com.ohgiraffers.member.controller.model.vo;

public abstract class Member {
    private String name;
    private String grade;
    private int point;

    public Member() {
    }

    public Member(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {

        this.point = point;
    }

    public abstract double calculateInterest();

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", point=" + point +
                '}';
    }


}
