package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BooleanArrayList.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d extends a<Boolean> implements Internal.BooleanList, RandomAccess, g0 {

    /* renamed from: c  reason: collision with root package name */
    private static final d f15408c;

    /* renamed from: a  reason: collision with root package name */
    private boolean[] f15409a;

    /* renamed from: b  reason: collision with root package name */
    private int f15410b;

    static {
        d dVar = new d(new boolean[0], 0);
        f15408c = dVar;
        dVar.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        this(new boolean[10], 0);
    }

    private void c(int i10, boolean z10) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.f15410b)) {
            boolean[] zArr = this.f15409a;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f15409a, i10, zArr2, i10 + 1, this.f15410b - i10);
                this.f15409a = zArr2;
            }
            this.f15409a[i10] = z10;
            this.f15410b++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }

    public static d d() {
        return f15408c;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f15410b) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    private String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f15410b;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i10, Boolean bool) {
        c(i10, bool.booleanValue());
    }

    @Override // com.google.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof d)) {
            return super.addAll(collection);
        }
        d dVar = (d) collection;
        int i10 = dVar.f15410b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f15410b;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f15409a;
            if (i12 > zArr.length) {
                this.f15409a = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(dVar.f15409a, 0, this.f15409a, this.f15410b, dVar.f15410b);
            this.f15410b = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public void addBoolean(boolean z10) {
        ensureIsMutable();
        int i10 = this.f15410b;
        boolean[] zArr = this.f15409a;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f15409a = zArr2;
        }
        boolean[] zArr3 = this.f15409a;
        int i11 = this.f15410b;
        this.f15410b = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
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
        if (!(obj instanceof d)) {
            return super.equals(obj);
        }
        d dVar = (d) obj;
        if (this.f15410b != dVar.f15410b) {
            return false;
        }
        boolean[] zArr = dVar.f15409a;
        for (int i10 = 0; i10 < this.f15410b; i10++) {
            if (this.f15409a[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public Boolean get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean getBoolean(int i10) {
        e(i10);
        return this.f15409a[i10];
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Boolean remove(int i10) {
        int i11;
        ensureIsMutable();
        e(i10);
        boolean[] zArr = this.f15409a;
        boolean z10 = zArr[i10];
        if (i10 < this.f15410b - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f15410b--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f15410b; i11++) {
            i10 = (i10 * 31) + Internal.hashBoolean(this.f15409a[i11]);
        }
        return i10;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(setBoolean(i10, bool.booleanValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f15409a[i10] == booleanValue) {
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
            boolean[] zArr = this.f15409a;
            System.arraycopy(zArr, i11, zArr, i10, this.f15410b - i11);
            this.f15410b -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean setBoolean(int i10, boolean z10) {
        ensureIsMutable();
        e(i10);
        boolean[] zArr = this.f15409a;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15410b;
    }

    private d(boolean[] zArr, int i10) {
        this.f15409a = zArr;
        this.f15410b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f15410b) {
            return new d(Arrays.copyOf(this.f15409a, i10), this.f15410b);
        }
        throw new IllegalArgumentException();
    }
}
