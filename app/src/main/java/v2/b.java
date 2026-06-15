package v2;

import android.util.Property;
/* compiled from: FloatProperty.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b<T> extends Property<T, Float> {
    public b(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public final void set(T t10, Float f10) {
        b(t10, f10.floatValue());
    }

    public abstract void b(T t10, float f10);
}
