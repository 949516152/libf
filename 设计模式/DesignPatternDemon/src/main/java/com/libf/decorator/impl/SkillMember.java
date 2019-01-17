package com.libf.decorator.impl;

import com.libf.decorator.interfaces.Hero;

public class SkillMember extends DecoratorHero {
    public SkillMember(Hero hero) {
        super(hero);
    }

    @Override
    public void run() {
        System.out.println("杀了所有人");
        hero.run();
    }
}
