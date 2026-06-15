package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LongArrayList.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class r extends a<Long> implements Internal.LongList, RandomAccess, g0 {

    /* renamed from: c  reason: collision with root package name */
    private static final r f15507c;

    /* renamed from: a  reason: collision with root package name */
    private long[] f15508a;

    /* renamed from: b  reason: collision with root package name */
    private int f15509b;

    static {
        r rVar = new r(new long[0], 0);
        f15507c = rVar;
        rVar.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r() {
        this(new long[10], 0);
    }

    private void c(int i10, long j10) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.f15509b)) {
            long[] jArr = this.f15508a;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f15508a, i10, jArr2, i10 + 1, this.f15509b - i10);
                this.f15508a = jArr2;
            }
            this.f15508a[i10] = j10;
            this.f15509b++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }

    public static r d() {
        return f15507c;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f15509b) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    private String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f15509b;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i10, Long l10) {
        c(i10, l10.longValue());
    }

    @Override // com.google.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof r)) {
            return super.addAll(collection);
        }
        r rVar = (r) collection;
        int i10 = rVar.f15509b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f15509b;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f15508a;
            if (i12 > jArr.length) {
                this.f15508a = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(rVar.f15508a, 0, this.f15508a, this.f15509b, rVar.f15509b);
            this.f15509b = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long j10) {
        ensureIsMutable();
        int i10 = this.f15509b;
        long[] jArr = this.f15508a;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f15508a = jArr2;
        }
        long[] jArr3 = this.f15508a;
        int i11 = this.f15509b;
        this.f15509b = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Long l10) {
        addLong(l10.longValue());
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
        if (!(obj instanceof r)) {
            return super.equals(obj);
        }
        r rVar = (r) obj;
        if (this.f15509b != rVar.f15509b) {
            return false;
        }
        long[] jArr = rVar.f15508a;
        for (int i10 = 0; i10 < this.f15509b; i10++) {
            if (this.f15508a[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int i10) {
        e(i10);
        return this.f15508a[i10];
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Long remove(int i10) {
        int i11;
        ensureIsMutable();
        e(i10);
        long[] jArr = this.f15508a;
        long j10 = jArr[i10];
        if (i10 < this.f15509b - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f15509b--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f15509b; i11++) {
            i10 = (i10 * 31) + Internal.hashLong(this.f15508a[i11]);
        }
        return i10;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Long set(int i10, Long l10) {
        return Long.valueOf(setLong(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f15508a[i10] == longValue) {
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
            long[] jArr = this.f15508a;
            System.arraycopy(jArr, i11, jArr, i10, this.f15509b - i11);
            this.f15509b -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int i10, long j10) {
        ensureIsMutable();
        e(i10);
        long[] jArr = this.f15508a;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15509b;
    }

    private r(long[] jArr, int i10) {
        this.f15508a = jArr;
        this.f15509b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f15509b) {
            return new r(Arrays.copyOf(this.f15508a, i10), this.f15509b);
        }
        throw new IllegalArgumentException();
    }
}
