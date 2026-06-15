package kotlin.jvm.internal;
/* compiled from: MutablePropertyReference0Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class q extends p {
    public q(z8.d dVar, String str, String str2) {
        super(d.NO_RECEIVER, ((e) dVar).a(), str, str2, !(dVar instanceof z8.c) ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public void set(Object obj) {
        getSetter().call(obj);
    }

    public q(Class cls, String str, String str2, int i10) {
        super(d.NO_RECEIVER, cls, str, str2, i10);
    }

    public q(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
