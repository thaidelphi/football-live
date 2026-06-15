package e2;

import s2.j;
import y1.v;
/* compiled from: SimpleResource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b<T> implements v<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final T f24925a;

    public b(T t10) {
        this.f24925a = (T) j.d(t10);
    }

    @Override // y1.v
    public void a() {
    }

    @Override // y1.v
    public Class<T> b() {
        return (Class<T>) this.f24925a.getClass();
    }

    @Override // y1.v
    public final T get() {
        return this.f24925a;
    }

    @Override // y1.v
    public final int getSize() {
        return 1;
    }
}
