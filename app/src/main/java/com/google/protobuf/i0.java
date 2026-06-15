package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufArrayList.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i0<E> extends a<E> implements RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final i0<Object> f15433c;

    /* renamed from: a  reason: collision with root package name */
    private E[] f15434a;

    /* renamed from: b  reason: collision with root package name */
    private int f15435b;

    static {
        i0<Object> i0Var = new i0<>(new Object[0], 0);
        f15433c = i0Var;
        i0Var.makeImmutable();
    }

    private i0(E[] eArr, int i10) {
        this.f15434a = eArr;
        this.f15435b = i10;
    }

    private static <E> E[] a(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> i0<E> b() {
        return (i0<E>) f15433c;
    }

    private void c(int i10) {
        if (i10 < 0 || i10 >= this.f15435b) {
            throw new IndexOutOfBoundsException(d(i10));
        }
    }

    private String d(int i10) {
        return "Index:" + i10 + ", Size:" + this.f15435b;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e8) {
        ensureIsMutable();
        int i10 = this.f15435b;
        E[] eArr = this.f15434a;
        if (i10 == eArr.length) {
            this.f15434a = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f15434a;
        int i11 = this.f15435b;
        this.f15435b = i11 + 1;
        eArr2[i11] = e8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: e */
    public i0<E> mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f15435b) {
            return new i0<>(Arrays.copyOf(this.f15434a, i10), this.f15435b);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c(i10);
        return this.f15434a[i10];
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        ensureIsMutable();
        c(i10);
        E[] eArr = this.f15434a;
        E e8 = eArr[i10];
        if (i10 < this.f15435b - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f15435b--;
        ((AbstractList) this).modCount++;
        return e8;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    public E set(int i10, E e8) {
        ensureIsMutable();
        c(i10);
        E[] eArr = this.f15434a;
        E e10 = eArr[i10];
        eArr[i10] = e8;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15435b;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    public void add(int i10, E e8) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.f15435b)) {
            E[] eArr = this.f15434a;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) a(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f15434a, 0, eArr2, 0, i10);
                System.arraycopy(this.f15434a, i10, eArr2, i10 + 1, this.f15435b - i10);
                this.f15434a = eArr2;
            }
            this.f15434a[i10] = e8;
            this.f15435b++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i10));
    }
}
