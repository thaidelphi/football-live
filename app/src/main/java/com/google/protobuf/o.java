package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntArrayList.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class o extends a<Integer> implements Internal.IntList, RandomAccess, g0 {

    /* renamed from: c  reason: collision with root package name */
    private static final o f15466c;

    /* renamed from: a  reason: collision with root package name */
    private int[] f15467a;

    /* renamed from: b  reason: collision with root package name */
    private int f15468b;

    static {
        o oVar = new o(new int[0], 0);
        f15466c = oVar;
        oVar.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o() {
        this(new int[10], 0);
    }

    private void c(int i10, int i11) {
        int i12;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i12 = this.f15468b)) {
            int[] iArr = this.f15467a;
            if (i12 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
            } else {
                int[] iArr2 = new int[((i12 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f15467a, i10, iArr2, i10 + 1, this.f15468b - i10);
                this.f15467a = iArr2;
            }
            this.f15467a[i10] = i11;
            this.f15468b++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }

    public static o d() {
        return f15466c;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f15468b) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    private String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f15468b;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i10, Integer num) {
        c(i10, num.intValue());
    }

    @Override // com.google.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof o)) {
            return super.addAll(collection);
        }
        o oVar = (o) collection;
        int i10 = oVar.f15468b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f15468b;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f15467a;
            if (i12 > iArr.length) {
                this.f15467a = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(oVar.f15467a, 0, this.f15467a, this.f15468b, oVar.f15468b);
            this.f15468b = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int i10) {
        ensureIsMutable();
        int i11 = this.f15468b;
        int[] iArr = this.f15467a;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f15467a = iArr2;
        }
        int[] iArr3 = this.f15467a;
        int i12 = this.f15468b;
        this.f15468b = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Integer num) {
        addInt(num.intValue());
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
        if (!(obj instanceof o)) {
            return super.equals(obj);
        }
        o oVar = (o) obj;
        if (this.f15468b != oVar.f15468b) {
            return false;
        }
        int[] iArr = oVar.f15467a;
        for (int i10 = 0; i10 < this.f15468b; i10++) {
            if (this.f15467a[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int i10) {
        e(i10);
        return this.f15467a[i10];
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Integer remove(int i10) {
        int i11;
        ensureIsMutable();
        e(i10);
        int[] iArr = this.f15467a;
        int i12 = iArr[i10];
        if (i10 < this.f15468b - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f15468b--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f15468b; i11++) {
            i10 = (i10 * 31) + this.f15467a[i11];
        }
        return i10;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(setInt(i10, num.intValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f15467a[i10] == intValue) {
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
            int[] iArr = this.f15467a;
            System.arraycopy(iArr, i11, iArr, i10, this.f15468b - i11);
            this.f15468b -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int i10, int i11) {
        ensureIsMutable();
        e(i10);
        int[] iArr = this.f15467a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15468b;
    }

    private o(int[] iArr, int i10) {
        this.f15467a = iArr;
        this.f15468b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f15468b) {
            return new o(Arrays.copyOf(this.f15467a, i10), this.f15468b);
        }
        throw new IllegalArgumentException();
    }
}
