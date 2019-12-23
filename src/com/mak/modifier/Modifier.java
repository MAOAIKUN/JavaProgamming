package com.mak.modifier;

public class Modifier {

    private String name;
    int priority;

    public Modifier(){}

    public Modifier(String name,int priority){
        this.name = name;
        this.priority = priority;
    }

    String getName(){
        return name;
    }

    protected int getPriority(){
        return priority;
    }

    public static void main(String[] args) {
        Modifier modifier = new Modifier("私有",1);

        System.out.println(modifier.name);
    }
}
