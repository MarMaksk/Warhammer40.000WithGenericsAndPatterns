package com.company.weapon;

public class Staff implements MagicWeapon {

    private int damage = 30;

    @Override
    public Weapon getWeapon() {
        return this;
    }

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
        return "Staff{" +
                "damage=" + damage +
                '}';
    }
}
