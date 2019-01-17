package com.libf.adapterpattern.adapter;

import com.libf.adapterpattern.adaptee.AdapteeDemon;
import com.libf.adapterpattern.targetinterface.Teacher;

/**
 * 描述：对象适配器模式
 * @author libingfeng
 */
public class AdapterDemon implements Teacher {
    private AdapteeDemon adapteeDemon;

    public AdapterDemon(AdapteeDemon adapteeDemon) {
        this.adapteeDemon = adapteeDemon;
    }

    @Override
    public void teach() {

        System.out.println("teach 对象适配器模式");
        adapteeDemon.play();

    }
}
