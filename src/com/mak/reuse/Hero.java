package com.mak.reuse;

public abstract class Hero {

    private String name;
    private String nickName;
    private String  area;

    public Hero(){}

    public Hero(String name, String nickName, String area) {
        this.name = name;
        this.nickName = nickName;
        this.area = area;
    }

    public abstract void Q();

    public abstract void W();

    public abstract void E();

    public abstract void R();
}

final class Yasuo extends Hero{

    public Yasuo(String name, String nickName, String area) {
        super(name, nickName, area);
    }

    {
        System.out.println("死亡如风,常伴吾身");
    }

    @Override
    public void Q() {
        System.out.println("hasaki");

    }

    @Override
    public void W() {
        System.out.println("face the wind");

    }

    @Override
    public void E() {
        System.out.println("eeeeee");

    }

    @Override
    public void R() {
        System.out.println("索里也给痛");

    }
}

