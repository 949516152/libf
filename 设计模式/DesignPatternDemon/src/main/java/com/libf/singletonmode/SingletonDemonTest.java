package com.libf.singletonmode;

import com.libf.singletonmode.singleton.FirstClass;
import com.libf.singletonmode.singleton.FourthClass;
import com.libf.singletonmode.singleton.SecondClass;
import com.libf.singletonmode.singleton.ThirdClass;
import org.junit.Test;

/**
 * @author libingfeng
 */
public class SingletonDemonTest {

    @Test
    public void Test(){
        FirstClass firstClass = FirstClass.getFirstClass();
        FirstClass firstClass2 = FirstClass.getFirstClass();
        FirstClass firstClass3 = FirstClass.getFirstClass();


        System.out.println(firstClass.hashCode());
        System.out.println(firstClass2.hashCode());
        System.out.println(firstClass3.hashCode());


        System.out.println("=========================>");

        SecondClass secondClass = SecondClass.getInstance();
        SecondClass secondClass1 = SecondClass.getInstance();
        SecondClass secondClass2 = SecondClass.getInstance();

        System.out.println(secondClass.hashCode());
        System.out.println(secondClass1.hashCode());
        System.out.println(secondClass2.hashCode());


        System.out.println("======================================>");

        ThirdClass thirdClass = ThirdClass.getInstance();
        ThirdClass thirdClass1 = ThirdClass.getInstance();
        ThirdClass thirdClass2 = ThirdClass.getInstance();

        System.out.println(thirdClass.hashCode());
        System.out.println(thirdClass1.hashCode());
        System.out.println(thirdClass2.hashCode());


        System.out.println("=======#############################");
        FourthClass fourthClass = FourthClass.getInstance();
        FourthClass fourthClass1 = FourthClass.getInstance();
        FourthClass fourthClass2 = FourthClass.getInstance();

        System.out.println(fourthClass.hashCode());
        System.out.println(fourthClass1.hashCode());
        System.out.println(fourthClass2.hashCode());
    }
}
