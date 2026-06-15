package com.startapp;

import java.util.Comparator;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t1<T> implements Comparator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Comparator<T> f23371a;

    /* renamed from: b  reason: collision with root package name */
    public final Comparator<T> f23372b;

    public t1(Comparator<T> comparator, Comparator<T> comparator2) {
        this.f23371a = comparator;
        this.f23372b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int compare = this.f23371a.compare(t10, t11);
        return compare == 0 ? this.f23372b.compare(t10, t11) : compare;
    }
}
