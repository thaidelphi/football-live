package v2;

import android.util.Property;
/* compiled from: IntProperty.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class c<T> extends Property<T, Integer> {
    public c(String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public final void set(T t10, Integer num) {
        b(t10, num.intValue());
    }

    public abstract void b(T t10, int i10);
}
