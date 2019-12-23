package com.mak.modifier;

public class PackageSonModifier extends Modifier {

    PackageSonModifier(String name,int priority){
        super(name, priority);
    }

    public static void main(String[] args) {
        PackageSonModifier packageSonModifier = new PackageSonModifier("保护", 3);
        packageSonModifier.getName();

    }
}
