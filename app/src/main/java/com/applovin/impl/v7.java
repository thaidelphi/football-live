package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v7 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9483a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f9484b;

    /* renamed from: c  reason: collision with root package name */
    private final View f9485c;

    public v7(View view, com.applovin.impl.sdk.j jVar) {
        this.f9483a = jVar;
        this.f9484b = jVar.I();
        this.f9485c = view;
    }

    public long a(b3 b3Var) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f9484b.a("ViewabilityTracker", "Checking visibility...");
        }
        long j10 = 0;
        Point b10 = l0.b(this.f9485c.getContext());
        if (!this.f9485c.isShown()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9484b.b("ViewabilityTracker", "View is hidden");
            }
            j10 = 2;
        }
        if (this.f9485c.getAlpha() < b3Var.j0()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9484b.b("ViewabilityTracker", "View is transparent");
            }
            j10 |= 4;
        }
        Animation animation = this.f9485c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9484b.b("ViewabilityTracker", "View is animating");
            }
            j10 |= 8;
        }
        if (this.f9485c.getParent() == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9484b.b("ViewabilityTracker", "No parent view found");
            }
            j10 |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f9485c.getContext(), this.f9485c.getWidth());
        if (pxToDp < Math.min(b3Var.p0(), b10.x)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9484b;
                nVar.b("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j10 |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f9485c.getContext(), this.f9485c.getHeight());
        if (pxToDp2 < b3Var.l0()) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9484b;
                nVar2.b("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j10 |= 64;
        }
        Rect rect = new Rect(0, 0, b10.x, b10.y);
        int[] iArr = {-1, -1};
        this.f9485c.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        Rect rect2 = new Rect(i10, iArr[1], this.f9485c.getWidth() + i10, iArr[1] + this.f9485c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar3 = this.f9484b;
                nVar3.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j10 |= 128;
        }
        Activity b11 = this.f9483a.e().b();
        if (b11 != null && !u7.a(this.f9485c, b11)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9484b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j10 |= 256;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar4 = this.f9484b;
            nVar4.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j10));
        }
        return j10;
    }
}
