package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DoubleArrayList.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h extends a<Double> implements Internal.DoubleList, RandomAccess, g0 {

    /* renamed from: c  reason: collision with root package name */
    private static final h f15426c;

    /* renamed from: a  reason: collision with root package name */
    private double[] f15427a;

    /* renamed from: b  reason: collision with root package name */
    private int f15428b;

    static {
        h hVar = new h(new double[0], 0);
        f15426c = hVar;
        hVar.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        this(new double[10], 0);
    }

    private void c(int i10, double d10) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.f15428b)) {
            double[] dArr = this.f15427a;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f15427a, i10, dArr2, i10 + 1, this.f15428b - i10);
                this.f15427a = dArr2;
            }
            this.f15427a[i10] = d10;
            this.f15428b++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }

    public static h d() {
        return f15426c;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f15428b) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    private String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f15428b;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i10, Double d10) {
        c(i10, d10.doubleValue());
    }

    @Override // com.google.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof h)) {
            return super.addAll(collection);
        }
        h hVar = (h) collection;
        int i10 = hVar.f15428b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f15428b;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f15427a;
            if (i12 > dArr.length) {
                this.f15427a = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(hVar.f15427a, 0, this.f15427a, this.f15428b, hVar.f15428b);
            this.f15428b = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public void addDouble(double d10) {
        ensureIsMutable();
        int i10 = this.f15428b;
        double[] dArr = this.f15427a;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f15427a = dArr2;
        }
        double[] dArr3 = this.f15427a;
        int i11 = this.f15428b;
        this.f15428b = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Double d10) {
        addDouble(d10.doubleValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (this.f15428b != hVar.f15428b) {
            return false;
        }
        double[] dArr = hVar.f15427a;
        for (int i10 = 0; i10 < this.f15428b; i10++) {
            if (Double.doubleToLongBits(this.f15427a[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double getDouble(int i10) {
        e(i10);
        return this.f15427a[i10];
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Double remove(int i10) {
        int i11;
        ensureIsMutable();
        e(i10);
        double[] dArr = this.f15427a;
        double d10 = dArr[i10];
        if (i10 < this.f15428b - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f15428b--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f15428b; i11++) {
            i10 = (i10 * 31) + Internal.hashLong(Double.doubleToLongBits(this.f15427a[i11]));
        }
        return i10;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Double set(int i10, Double d10) {
        return Double.valueOf(setDouble(i10, d10.doubleValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f15427a[i10] == doubleValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 >= i10) {
            double[] dArr = this.f15427a;
            System.arraycopy(dArr, i11, dArr, i10, this.f15428b - i11);
            this.f15428b -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double setDouble(int i10, double d10) {
        ensureIsMutable();
        e(i10);
        double[] dArr = this.f15427a;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15428b;
    }

    private h(double[] dArr, int i10) {
        this.f15427a = dArr;
        this.f15428b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f15428b) {
            return new h(Arrays.copyOf(this.f15427a, i10), this.f15428b);
        }
        throw new IllegalArgumentException();
    }
}
