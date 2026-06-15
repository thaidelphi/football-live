package c7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JsonAdapter.java */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public @interface b {
    boolean nullSafe() default true;

    Class<?> value();
}
