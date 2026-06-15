package c7;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: Expose.java */
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public @interface a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
