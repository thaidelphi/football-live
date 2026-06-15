package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.ad.b;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
abstract class o1 {

    /* renamed from: a  reason: collision with root package name */
    final com.applovin.impl.sdk.j f8051a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f8052b;

    /* renamed from: c  reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f8053c;

    /* renamed from: d  reason: collision with root package name */
    final ViewGroup f8054d;

    /* renamed from: e  reason: collision with root package name */
    final FrameLayout.LayoutParams f8055e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.j jVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f8055e = layoutParams;
        this.f8053c = bVar;
        this.f8051a = jVar;
        this.f8052b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f8054d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f8054d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f8053c.l(), (this.f8053c.w0() ? 3 : 5) | 48, gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b.d dVar, int i10, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f8744a, dVar.f8748e, dVar.f8747d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i11 = dVar.f8746c;
        layoutParams.setMargins(i11, dVar.f8745b, i11, 0);
        layoutParams.gravity = i10;
        this.f8054d.addView(gVar, layoutParams);
    }
}
