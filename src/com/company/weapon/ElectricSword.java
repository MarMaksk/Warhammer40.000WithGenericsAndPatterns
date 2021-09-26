package com.company.weapon;

public class ElectricSword implements MeleeWeapon {

    private int damage = 45;


    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void showWeaponSpecificaton() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ElectricSword{" +
                "damage=" + damage +
                '}';
    }
}
