package com.libf.factory;

import com.libf.factory.impl.SkillFactory;
import com.libf.factory.interfaces.Skills;
import org.junit.Test;

public class TestDemon {
    @Test
    public void Test(){
        SkillFactory skillFactory = new SkillFactory();
        Skills skill = skillFactory.getSkills(SkillFactory.SKILL_A);
        skill.doPlay();

        skill = skillFactory.getSkills(SkillFactory.SKILL_S);
        skill.doPlay();

        skill = skillFactory.getSkills(SkillFactory.SKILL_D);
        skill.doPlay();
    }
}
