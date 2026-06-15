package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* compiled from: TextDrawableHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class k {

    /* renamed from: c  reason: collision with root package name */
    private float f14451c;

    /* renamed from: f  reason: collision with root package name */
    private r5.d f14454f;

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f14449a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final r5.f f14450b = new a();

    /* renamed from: d  reason: collision with root package name */
    private boolean f14452d = true;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<b> f14453e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends r5.f {
        a() {
        }

        @Override // r5.f
        public void a(int i10) {
            k.this.f14452d = true;
            b bVar = (b) k.this.f14453e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // r5.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            k.this.f14452d = true;
            b bVar = (b) k.this.f14453e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public k(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f14449a.measureText(charSequence, 0, charSequence.length());
    }

    public r5.d d() {
        return this.f14454f;
    }

    public TextPaint e() {
        return this.f14449a;
    }

    public float f(String str) {
        if (!this.f14452d) {
            return this.f14451c;
        }
        float c10 = c(str);
        this.f14451c = c10;
        this.f14452d = false;
        return c10;
    }

    public void g(b bVar) {
        this.f14453e = new WeakReference<>(bVar);
    }

    public void h(r5.d dVar, Context context) {
        if (this.f14454f != dVar) {
            this.f14454f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f14449a, this.f14450b);
                b bVar = this.f14453e.get();
                if (bVar != null) {
                    this.f14449a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f14449a, this.f14450b);
                this.f14452d = true;
            }
            b bVar2 = this.f14453e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z10) {
        this.f14452d = z10;
    }

    public void j(Context context) {
        this.f14454f.n(context, this.f14449a, this.f14450b);
    }
}
