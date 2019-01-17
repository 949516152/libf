package com.libf.adapterpattern;

import com.libf.adapterpattern.adaptee.A;
import com.libf.adapterpattern.adaptee.AdapteeDemon;
import com.libf.adapterpattern.adaptee.impl.AdapteeImpl;
import com.libf.adapterpattern.adapter.AdapterDemon;
import com.libf.adapterpattern.adapter.TeacherDemon;
import com.libf.adapterpattern.adapter.impl.MyClass;
import com.libf.adapterpattern.targetinterface.Teacher;
import org.junit.Test;

public class DemonTest {

    @Test
    public void Test(){
        Teacher teacher = new TeacherDemon();
        teacher.teach();


        System.out.println("=====================================>");


        AdapteeDemon adapteeDemon = new AdapteeImpl();
        Teacher teacher1 = new AdapterDemon(adapteeDemon);

        teacher1.teach();


        System.out.println("##################");

        A a = new MyClass();

        a.a();
    }
}
