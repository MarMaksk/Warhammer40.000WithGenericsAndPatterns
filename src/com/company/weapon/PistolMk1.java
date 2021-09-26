package com.company.weapon;

public class PistolMk1 implements RangeWeapon {

    private int damage = 15;
    private int reliability = 90;


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
        return "PistolMk1{" +
                "damage=" + damage +
                ", reliability=" + reliability +
                '}';
    }
}
