package com.lyj;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/6 16:42
 * @Version: 1.0
 * @Modified by:
 */
public class MonsterWolf extends Creature {
    @Override
    public void useArticle(Weapon weapon, Creature targetCreature) {
        weapon.useArticle(targetCreature);
    }
}
