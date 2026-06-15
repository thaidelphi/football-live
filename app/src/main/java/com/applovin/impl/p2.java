package com.applovin.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p2 extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private a f8354a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    interface a {
        void a(p2 p2Var);
    }

    public p2(r2 r2Var, Context context) {
        super(context);
        setOnClickListener(this);
        com.applovin.impl.adview.i iVar = new com.applovin.impl.adview.i(context);
        int dpToPx = AppLovinSdkUtils.dpToPx(context, r2Var.e());
        iVar.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, 17));
        iVar.a(dpToPx);
        addView(iVar);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(context, r2Var.e() + (r2Var.c() * 2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, 8388661);
        int dpToPx3 = AppLovinSdkUtils.dpToPx(context, r2Var.f());
        int dpToPx4 = AppLovinSdkUtils.dpToPx(context, r2Var.d());
        layoutParams.setMargins(dpToPx4, dpToPx3, dpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f8354a.a(this);
    }

    public void setListener(a aVar) {
        this.f8354a = aVar;
    }
}
