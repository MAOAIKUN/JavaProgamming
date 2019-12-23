package com.mak.modifier;

public class PackageModifier {

    public static void main(String[] args) {
        Modifier modifier = new Modifier("默认", 2);
        System.out.println(modifier.getName());
        PackageSonModifier packageSonModifier = new PackageSonModifier("保护", 6);
        packageSonModifier.getPriority();
    }
}
