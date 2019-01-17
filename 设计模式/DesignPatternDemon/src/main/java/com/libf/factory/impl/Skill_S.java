package com.libf.factory.impl;

import com.libf.factory.interfaces.Skills;

public class Skill_S implements Skills {
    @Override
    public void doPlay() {
        System.out.println("the skill which the Hero can is S ");
    }
}
