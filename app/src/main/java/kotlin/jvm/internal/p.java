package kotlin.jvm.internal;

import z8.g;
import z8.i;
/* compiled from: MutablePropertyReference0.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class p extends r implements z8.g {
    public p() {
    }

    @Override // kotlin.jvm.internal.d
    protected z8.b computeReflected() {
        return b0.d(this);
    }

    @Override // z8.i
    public Object getDelegate() {
        return ((z8.g) getReflected()).getDelegate();
    }

    @Override // t8.a
    public Object invoke() {
        return get();
    }

    public p(Object obj) {
        super(obj);
    }

    @Override // z8.i
    public i.a getGetter() {
        return ((z8.g) getReflected()).mo130getGetter();
    }

    @Override // z8.g
    public g.a getSetter() {
        return ((z8.g) getReflected()).mo131getSetter();
    }

    public p(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
