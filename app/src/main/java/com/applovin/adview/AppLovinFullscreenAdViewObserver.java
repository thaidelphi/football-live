package com.applovin.adview;

import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.y;
import com.applovin.impl.h2;
import com.applovin.impl.p1;
import com.applovin.impl.sdk.j;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinFullscreenAdViewObserver implements o {

    /* renamed from: a  reason: collision with root package name */
    private final j f6439a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f6440b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private p1 f6441c;

    /* renamed from: d  reason: collision with root package name */
    private h2 f6442d;

    public AppLovinFullscreenAdViewObserver(i iVar, h2 h2Var, j jVar) {
        this.f6442d = h2Var;
        this.f6439a = jVar;
        iVar.a(this);
    }

    @y(i.a.ON_DESTROY)
    public void onDestroy() {
        h2 h2Var = this.f6442d;
        if (h2Var != null) {
            h2Var.a();
            this.f6442d = null;
        }
        p1 p1Var = this.f6441c;
        if (p1Var != null) {
            p1Var.c();
            this.f6441c.q();
            this.f6441c = null;
        }
    }

    @y(i.a.ON_PAUSE)
    public void onPause() {
        p1 p1Var = this.f6441c;
        if (p1Var != null) {
            p1Var.r();
            this.f6441c.u();
        }
    }

    @y(i.a.ON_RESUME)
    public void onResume() {
        p1 p1Var;
        if (this.f6440b.getAndSet(false) || (p1Var = this.f6441c) == null) {
            return;
        }
        p1Var.s();
        this.f6441c.a(0L);
    }

    @y(i.a.ON_STOP)
    public void onStop() {
        p1 p1Var = this.f6441c;
        if (p1Var != null) {
            p1Var.t();
        }
    }

    public void setPresenter(p1 p1Var) {
        this.f6441c = p1Var;
    }
}
