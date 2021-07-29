package com.training.typeInformation.test;


import com.training.typeInformation.TypeInformation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Exercise:      25
 * Description:   Create a class containing private, protected and package-access
 *                methods. Write code to access these methods from outside of the class’s package.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        TypeInformation ti = new TypeInformation();
        Field notPrivate = ti.getClass().getDeclaredField("i");
        notPrivate.setAccessible(true);
        System.out.println(notPrivate.getInt(ti));

        notPrivate = ti.getClass().getDeclaredField("s");
        notPrivate.setAccessible(true);
        System.out.println(notPrivate.get(ti));


        notPrivate = ti.getClass().getDeclaredField("s2");
        notPrivate.setAccessible(true);
        System.out.println(notPrivate.get(ti));

        System.out.println(ti);
        notPrivate.set(ti, "No you aren't");
        System.out.println(ti);

        Method notPrivateAnymore = TypeInformation.class.getDeclaredMethod("firstMethod");
        notPrivateAnymore.setAccessible(true);
        notPrivateAnymore.invoke(ti);

        notPrivateAnymore = TypeInformation.class.getDeclaredMethod("secondMethod");
        notPrivateAnymore.setAccessible(true);
        notPrivateAnymore.invoke(ti);

        notPrivateAnymore = ti.getClass().getDeclaredMethod("thirdMethod");
        notPrivateAnymore.setAccessible(true);
        notPrivateAnymore.invoke(ti);
    }
}
