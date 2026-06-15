package c7;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: SerializedName.java */
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public @interface c {
    String[] alternate() default {};

    String value();
}
