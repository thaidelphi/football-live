package com.startapp;

import com.startapp.common.parser.TypeInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n4 {
    public static String a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(TypeInfo.class)) {
                TypeInfo typeInfo = (TypeInfo) annotation;
                if (!"".equals(typeInfo.name())) {
                    return typeInfo.name();
                }
            }
        }
        return field.getName();
    }

    public static boolean b(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (annotation.annotationType().equals(TypeInfo.class)) {
            return ((TypeInfo) annotation).complex();
        }
        return false;
    }
}
