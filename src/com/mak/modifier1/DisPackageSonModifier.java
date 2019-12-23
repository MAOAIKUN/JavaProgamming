package com.mak.modifier1;

import com.mak.modifier.Modifier;

public class DisPackageSonModifier extends Modifier {

    @Override
    public int getPriority() {
        return super.getPriority();
    }

    public DisPackageSonModifier(String name, int priority){
        super(name, priority);


    }


    public static void main(String[] args) {
        DisPackageSonModifier disPackageSonModifier = new DisPackageSonModifier("保护", 4);
        System.out.println(disPackageSonModifier.getPriority());
    }
}
