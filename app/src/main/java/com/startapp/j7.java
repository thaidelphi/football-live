package com.startapp;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j7 {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f22145a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Pair<k7, Boolean>> f22146b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22147c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f22148d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f22149e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f22150f;

    /* renamed from: g  reason: collision with root package name */
    public final int f22151g;

    /* renamed from: h  reason: collision with root package name */
    public final int f22152h;

    public j7(l1 l1Var, ArrayList arrayList, int i10, int[] iArr, Integer num, Integer num2, int i11, int i12) {
        this.f22145a = l1Var;
        this.f22146b = arrayList;
        this.f22147c = i10;
        this.f22148d = iArr;
        this.f22149e = num;
        this.f22150f = num2;
        this.f22151g = i11;
        this.f22152h = i12;
    }

    public final int a(Object obj) {
        Pair<k7, Boolean> next;
        Iterator<Pair<k7, Boolean>> it = this.f22146b.iterator();
        do {
            if (!it.hasNext()) {
                return 0;
            }
            next = it.next();
        } while (!((k7) next.first).a(obj));
        return (((Boolean) next.second).booleanValue() ? 2 : 0) | 1;
    }

    public final boolean a(int i10) {
        return (i10 & this.f22152h) != 0;
    }
}
