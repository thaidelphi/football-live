package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;
/* compiled from: StateListAnimator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f14425a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f14426b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f14427c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f14428d = new a();

    /* compiled from: StateListAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f14427c == animator) {
                iVar.f14427c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateListAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f14430a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f14431b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f14430a = iArr;
            this.f14431b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f14427c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14427c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f14431b;
        this.f14427c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f14428d);
        this.f14425a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f14427c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f14427c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f14425a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f14425a.get(i10);
            if (StateSet.stateSetMatches(bVar.f14430a, iArr)) {
                break;
            }
            i10++;
        }
        b bVar2 = this.f14426b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f14426b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}
