package com.startapp.common.parser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: Sta */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public @interface TypeClassInfo {
    String decider() default "";

    boolean extendsClass() default false;

    String packageName() default "";
}
