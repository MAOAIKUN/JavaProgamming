package com.mak.reuse;

public class Summoner {
    private String nickName;
    private Hero hero;

    public Summoner(String nickName,Hero hero){
        this.nickName = nickName;
        this.hero = hero;
    }



    public void useQ(){
        hero.Q();
    }

    public void useW(){
        hero.W();
    }

    public void useE(){
        hero.E();
    }

    public void useR(){
        hero.R();
    }


    public static void main(String[] args) {
        Summoner summoner = new Summoner("尔雅额22", new Yasuo("亚索", "疾风剑豪", "艾欧尼亚"));
        summoner.useE();
        summoner.useQ();
    }
}
