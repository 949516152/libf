package com.libf.decorator.impl;

import com.libf.decorator.interfaces.Hero;

/**
 * @author libingfeng
 */
public class SkillQ extends DecoratorHero {
    public SkillQ(Hero hero) {
        super(hero);
    }

    @Override
    public void run() {
        System.out.println("Hero learn Q");
        hero.run();
    }
}
