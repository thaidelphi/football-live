package kotlin.jvm.internal;

import java.util.Iterator;
/* compiled from: ArrayIterator.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c {
    public static final <T> Iterator<T> a(T[] array) {
        n.f(array, "array");
        return new b(array);
    }
}
