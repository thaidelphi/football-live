package com.startapp;

import android.os.Build;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z8 implements Iterator<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f23677a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable[] f23678b;

    /* renamed from: c  reason: collision with root package name */
    public int f23679c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23680d;

    public z8(Throwable th) {
        this.f23677a = th;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f23678b = th.getSuppressed();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Throwable[] thArr;
        return this.f23677a != null || ((thArr = this.f23678b) != null && this.f23679c < thArr.length);
    }

    @Override // java.util.Iterator
    public final Throwable next() {
        int i10;
        Throwable th = this.f23677a;
        this.f23680d = false;
        if (th != null) {
            this.f23677a = th.getCause();
        } else {
            Throwable[] thArr = this.f23678b;
            if (thArr != null && (i10 = this.f23679c) < thArr.length) {
                this.f23680d = i10 == 0;
                this.f23679c = i10 + 1;
                th = thArr[i10];
            }
        }
        if (th != null) {
            return th;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
