package com.libf.factory.impl;

import com.libf.factory.interfaces.Skills;

/***
 * 描述：简单工厂模式中的工厂类
 * @author libingfeng
 */
public class SkillFactory {

    public static final String SKILL_A = "A";
    public static final String SKILL_S = "S";
    public static final String SKILL_D = "D";

    public Skills getSkills(String skill){
        switch (skill){
            case SKILL_A:
                return new Skill_A();
            case SKILL_S:
                return new Skill_S();
            case SKILL_D:
                return new Skill_D();
             default:
                 try {
                     throw new ClassNotFoundException("需要的类 "+skill+" 未创建");
                 } catch (ClassNotFoundException e) {
                     e.printStackTrace();
                 }
        }
        return null;
    }
}
