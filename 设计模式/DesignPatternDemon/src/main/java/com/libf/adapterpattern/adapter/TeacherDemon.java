package com.libf.adapterpattern.adapter;

import com.libf.adapterpattern.adaptee.impl.AdapteeImpl;
import com.libf.adapterpattern.targetinterface.Teacher;


/**
 * 描述：类适配器模式
 * @author libingfeng
 */
public class TeacherDemon extends AdapteeImpl implements Teacher {
    @Override
    public void teach() {
        System.out.println("teache 类适配器模式");
        play();
    }
}
