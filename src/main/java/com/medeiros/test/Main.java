package com.medeiros.test;

import com.medeiros.facade.Facade;
import com.medeiros.singleton.SingletonEager;
import com.medeiros.singleton.SingletonLazy;
import com.medeiros.singleton.SingletonLazyHolder;
import com.medeiros.strategy.*;

public class Main {
    public static void main(String[] args) {
        /* Testes relacionados ao Design Pattern  */

        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Strategy

        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensivelBehavior();
        Behavior assertive = new AssertiveBehavior();

        Robo robo = new Robo();
        robo.setBehavior(normal);
        robo.toMove();
        robo.toMove();
        robo.toMove();

        robo.setBehavior(defensive);
        robo.toMove();

        robo.setBehavior(assertive);
        robo.toMove();
        robo.toMove();
        robo.toMove();

        //Facade

        Facade facade = new Facade();
        facade.migrateClient("Felipe", "02020200");




    }
}