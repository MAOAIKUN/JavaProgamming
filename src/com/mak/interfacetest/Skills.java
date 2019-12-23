package com.mak.interfacetest;

public interface Skills {

    void Q();

    void E();

    default void D() {
        System.out.println("flash into bush");
    }

    default void F(int i){}
}
