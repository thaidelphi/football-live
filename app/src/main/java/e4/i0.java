package e4;

import android.util.SparseArray;
/* compiled from: SpannedData.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class i0<V> {

    /* renamed from: c  reason: collision with root package name */
    private final a5.h<V> f25079c;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<V> f25078b = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    private int f25077a = -1;

    public i0(a5.h<V> hVar) {
        this.f25079c = hVar;
    }

    public void a(int i10, V v10) {
        if (this.f25077a == -1) {
            a5.a.f(this.f25078b.size() == 0);
            this.f25077a = 0;
        }
        if (this.f25078b.size() > 0) {
            SparseArray<V> sparseArray = this.f25078b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            a5.a.a(i10 >= keyAt);
            if (keyAt == i10) {
                SparseArray<V> sparseArray2 = this.f25078b;
                this.f25079c.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f25078b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f25078b.size(); i10++) {
            this.f25079c.accept(this.f25078b.valueAt(i10));
        }
        this.f25077a = -1;
        this.f25078b.clear();
    }

    public void c(int i10) {
        for (int size = this.f25078b.size() - 1; size >= 0 && i10 < this.f25078b.keyAt(size); size--) {
            this.f25079c.accept(this.f25078b.valueAt(size));
            this.f25078b.removeAt(size);
        }
        this.f25077a = this.f25078b.size() > 0 ? Math.min(this.f25077a, this.f25078b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f25078b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f25078b.keyAt(i12)) {
                return;
            }
            this.f25079c.accept(this.f25078b.valueAt(i11));
            this.f25078b.removeAt(i11);
            int i13 = this.f25077a;
            if (i13 > 0) {
                this.f25077a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V e(int i10) {
        if (this.f25077a == -1) {
            this.f25077a = 0;
        }
        while (true) {
            int i11 = this.f25077a;
            if (i11 <= 0 || i10 >= this.f25078b.keyAt(i11)) {
                break;
            }
            this.f25077a--;
        }
        while (this.f25077a < this.f25078b.size() - 1 && i10 >= this.f25078b.keyAt(this.f25077a + 1)) {
            this.f25077a++;
        }
        return this.f25078b.valueAt(this.f25077a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f25078b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f25078b.size() == 0;
    }
}
