package campany;

import campany.Boss;
import campany.Skeleton;
import campany.WeaponType;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(500,50);
        boss.getWeaponType().setWeaponType(WeaponType.SCAR);
        boss.getWeaponType().setWeaponName(WeaponType.AWM);

        System.out.println(boss.info());


        Skeleton skeleton = new Skeleton(100,33,11);
        skeleton.getWeaponType().setWeaponName(WeaponType.AK47);
        skeleton.getWeaponType().setWeaponName(WeaponType.SCAR);
        System.out.println(skeleton.info());


        Skeleton skeleton2 = new Skeleton(150, 55,22);
        skeleton2.getWeaponType().setWeaponName(WeaponType.AWM);
        skeleton2.getWeaponType().setWeaponName(WeaponType.AK47);
        System.out.println(skeleton2.info());


    }
}
