package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatArrayList.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class m extends a<Float> implements Internal.FloatList, RandomAccess, g0 {

    /* renamed from: c  reason: collision with root package name */
    private static final m f15462c;

    /* renamed from: a  reason: collision with root package name */
    private float[] f15463a;

    /* renamed from: b  reason: collision with root package name */
    private int f15464b;

    static {
        m mVar = new m(new float[0], 0);
        f15462c = mVar;
        mVar.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m() {
        this(new float[10], 0);
    }

    private void c(int i10, float f10) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.f15464b)) {
            float[] fArr = this.f15463a;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f15463a, i10, fArr2, i10 + 1, this.f15464b - i10);
                this.f15463a = fArr2;
            }
            this.f15463a[i10] = f10;
            this.f15464b++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }

    public static m d() {
        return f15462c;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f15464b) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    private String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f15464b;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i10, Float f10) {
        c(i10, f10.floatValue());
    }

    @Override // com.google.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i10 = mVar.f15464b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f15464b;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f15463a;
            if (i12 > fArr.length) {
                this.f15463a = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(mVar.f15463a, 0, this.f15463a, this.f15464b, mVar.f15464b);
            this.f15464b = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.FloatList
    public void addFloat(float f10) {
        ensureIsMutable();
        int i10 = this.f15464b;
        float[] fArr = this.f15463a;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f15463a = fArr2;
        }
        float[] fArr3 = this.f15463a;
        int i11 = this.f15464b;
        this.f15464b = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Float f10) {
        addFloat(f10.floatValue());
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
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.f15464b != mVar.f15464b) {
            return false;
        }
        float[] fArr = mVar.f15463a;
        for (int i10 = 0; i10 < this.f15464b; i10++) {
            if (Float.floatToIntBits(this.f15463a[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float getFloat(int i10) {
        e(i10);
        return this.f15463a[i10];
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Float remove(int i10) {
        int i11;
        ensureIsMutable();
        e(i10);
        float[] fArr = this.f15463a;
        float f10 = fArr[i10];
        if (i10 < this.f15464b - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f15464b--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f15464b; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f15463a[i11]);
        }
        return i10;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Float set(int i10, Float f10) {
        return Float.valueOf(setFloat(i10, f10.floatValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f15463a[i10] == floatValue) {
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
            float[] fArr = this.f15463a;
            System.arraycopy(fArr, i11, fArr, i10, this.f15464b - i11);
            this.f15464b -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float setFloat(int i10, float f10) {
        ensureIsMutable();
        e(i10);
        float[] fArr = this.f15463a;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15464b;
    }

    private m(float[] fArr, int i10) {
        this.f15463a = fArr;
        this.f15464b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f15464b) {
            return new m(Arrays.copyOf(this.f15463a, i10), this.f15464b);
        }
        throw new IllegalArgumentException();
    }
}
