package campany;


public class Boss extends GameEntity{
    weapon weaponType = new weapon();


    public Boss(int health, int damage) {
        super(health, damage);

    }




    public String info (){
        return  getDamage() + weaponType.getWeaponName() + getWeaponType() ;}

    public weapon getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(weapon weaponType) {
        this.weaponType = weaponType;
    }
}

