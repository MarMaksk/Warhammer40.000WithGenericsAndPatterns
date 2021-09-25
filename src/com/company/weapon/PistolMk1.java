package com.company.weapon;

public class PistolMk1 implements RangeWeapon {

    private int damage = 15;
    private int reliability = 90;

    @Override
    public Weapon getWeapon() {
        return this;
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
