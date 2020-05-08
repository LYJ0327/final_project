package com.lyj;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/6 16:56
 * @Version: 1.0
 * @Modified by:
 */
public class WeaponSword extends Weapon {
    @Override
    public void useArticle(Creature targetCreature) {
        targetCreature.setHPValue(targetCreature.getHPValue()+this.getDamagePoints());
    }

    public WeaponSword(String id, String discription, int damagePoints) {
        super(id, discription, damagePoints);
    }
}
