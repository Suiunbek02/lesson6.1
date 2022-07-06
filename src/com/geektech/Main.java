package com.geektech;

public class Main {


    public static void main (String[] args) {

        Boss king = new Boss();
        king.setHealth(500);
        king.setDamage(100);

        Weapon weapon = new Weapon();
        weapon.setNameWeapon("assaultRifle");
        weapon.setTypeWeapon(416);

        king.setWeapon( weapon );



        System.out.println(king.getHealth() + " " + king.getDamage() + " " + king.getWeapon().getNameWeapon() + " " + king.getWeapon().getTypeWeapon());

    }
}
