package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetBehavior.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private d f13876a;

    /* renamed from: b  reason: collision with root package name */
    private int f13877b;

    /* renamed from: c  reason: collision with root package name */
    private int f13878c;

    public c() {
        this.f13877b = 0;
        this.f13878c = 0;
    }

    public int E() {
        d dVar = this.f13876a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.I(v10, i10);
    }

    public boolean G(int i10) {
        d dVar = this.f13876a;
        if (dVar != null) {
            return dVar.e(i10);
        }
        this.f13877b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        F(coordinatorLayout, v10, i10);
        if (this.f13876a == null) {
            this.f13876a = new d(v10);
        }
        this.f13876a.c();
        this.f13876a.a();
        int i11 = this.f13877b;
        if (i11 != 0) {
            this.f13876a.e(i11);
            this.f13877b = 0;
        }
        int i12 = this.f13878c;
        if (i12 != 0) {
            this.f13876a.d(i12);
            this.f13878c = 0;
            return true;
        }
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13877b = 0;
        this.f13878c = 0;
    }
}
