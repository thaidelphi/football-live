package kotlin.jvm.internal;
/* compiled from: PropertyReference0.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class t extends v implements z8.i {
    public t(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.d
    protected z8.b computeReflected() {
        return b0.e(this);
    }

    @Override // t8.a
    public Object invoke() {
        return get();
    }
}
