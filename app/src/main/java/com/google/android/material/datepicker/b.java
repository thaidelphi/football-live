package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalendarStyle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final a f14151a;

    /* renamed from: b  reason: collision with root package name */
    final a f14152b;

    /* renamed from: c  reason: collision with root package name */
    final a f14153c;

    /* renamed from: d  reason: collision with root package name */
    final a f14154d;

    /* renamed from: e  reason: collision with root package name */
    final a f14155e;

    /* renamed from: f  reason: collision with root package name */
    final a f14156f;

    /* renamed from: g  reason: collision with root package name */
    final a f14157g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f14158h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r5.b.d(context, d5.b.f23989s, e.class.getCanonicalName()), d5.k.A2);
        this.f14151a = a.a(context, obtainStyledAttributes.getResourceId(d5.k.D2, 0));
        this.f14157g = a.a(context, obtainStyledAttributes.getResourceId(d5.k.B2, 0));
        this.f14152b = a.a(context, obtainStyledAttributes.getResourceId(d5.k.C2, 0));
        this.f14153c = a.a(context, obtainStyledAttributes.getResourceId(d5.k.E2, 0));
        ColorStateList a10 = r5.c.a(context, obtainStyledAttributes, d5.k.F2);
        this.f14154d = a.a(context, obtainStyledAttributes.getResourceId(d5.k.H2, 0));
        this.f14155e = a.a(context, obtainStyledAttributes.getResourceId(d5.k.G2, 0));
        this.f14156f = a.a(context, obtainStyledAttributes.getResourceId(d5.k.I2, 0));
        Paint paint = new Paint();
        this.f14158h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
