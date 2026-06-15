package r;
/* compiled from: Pools.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class g<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f30242a;

    /* renamed from: b  reason: collision with root package name */
    private int f30243b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i10) {
        if (i10 > 0) {
            this.f30242a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // r.f
    public boolean a(T t10) {
        int i10 = this.f30243b;
        Object[] objArr = this.f30242a;
        if (i10 < objArr.length) {
            objArr[i10] = t10;
            this.f30243b = i10 + 1;
            return true;
        }
        return false;
    }

    @Override // r.f
    public T b() {
        int i10 = this.f30243b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.f30242a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f30243b = i10 - 1;
            return t10;
        }
        return null;
    }

    @Override // r.f
    public void c(T[] tArr, int i10) {
        if (i10 > tArr.length) {
            i10 = tArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = tArr[i11];
            int i12 = this.f30243b;
            Object[] objArr = this.f30242a;
            if (i12 < objArr.length) {
                objArr[i12] = t10;
                this.f30243b = i12 + 1;
            }
        }
    }
}
