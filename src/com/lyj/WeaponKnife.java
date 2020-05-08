package com.lyj;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/6 16:55
 * @Version: 1.0
 * @Modified by:
 */
public class WeaponKnife extends Weapon {
    @Override
    public void useArticle(Creature targetCreature) {
        targetCreature.setHPValue(targetCreature.getHPValue()+this.getDamagePoints());
    }

    public WeaponKnife(String id, String discription, int damagePoints) {
        super(id, discription, damagePoints);
    }
}
