package androidx.core.util;
/* compiled from: Pools.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f2788a;

    /* renamed from: b  reason: collision with root package name */
    private int f2789b;

    public g(int i10) {
        if (i10 > 0) {
            this.f2788a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t10) {
        for (int i10 = 0; i10 < this.f2789b; i10++) {
            if (this.f2788a[i10] == t10) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.f
    public boolean a(T t10) {
        if (!c(t10)) {
            int i10 = this.f2789b;
            Object[] objArr = this.f2788a;
            if (i10 < objArr.length) {
                objArr[i10] = t10;
                this.f2789b = i10 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // androidx.core.util.f
    public T b() {
        int i10 = this.f2789b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.f2788a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f2789b = i10 - 1;
            return t10;
        }
        return null;
    }
}
