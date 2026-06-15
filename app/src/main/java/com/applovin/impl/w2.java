package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w2 extends u2 implements m1 {
    private boolean A;

    /* renamed from: v  reason: collision with root package name */
    private final Bundle f9508v;

    /* renamed from: w  reason: collision with root package name */
    private final AtomicReference f9509w;

    /* renamed from: x  reason: collision with root package name */
    private final AtomicBoolean f9510x;

    /* renamed from: y  reason: collision with root package name */
    private final AtomicBoolean f9511y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f9512z;

    public w2(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(i10, map, jSONObject, jSONObject2, null, jVar);
        this.f9508v = new Bundle();
        this.f9511y = new AtomicBoolean();
        this.f9509w = new AtomicReference();
        this.f9510x = new AtomicBoolean();
    }

    private long k0() {
        long a10 = a("ad_expiration_ms", -1L);
        return a10 < 0 ? b("ad_expiration_ms", ((Long) this.f6792a.a(j3.f7304f7)).longValue()) : a10;
    }

    public void a(boolean z10) {
        this.f9512z = z10;
    }

    @Override // com.applovin.impl.m1
    public long getTimeToLiveMillis() {
        return k0() - (SystemClock.elapsedRealtime() - L());
    }

    public void j0() {
        this.f9510x.set(true);
    }

    public long l0() {
        return a("ahdm", ((Long) this.f6792a.a(j3.Z6)).longValue());
    }

    public long m0() {
        long a10 = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return a10 >= 0 ? a10 : b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f6792a.a(j3.f7311n7)).longValue());
    }

    public long n0() {
        long a10 = a("ad_hidden_timeout_ms", -1L);
        return a10 >= 0 ? a10 : b("ad_hidden_timeout_ms", ((Long) this.f6792a.a(j3.f7309k7)).longValue());
    }

    public e4 o0() {
        return (e4) this.f9509w.getAndSet(null);
    }

    public long p0() {
        if (L() > 0) {
            return SystemClock.elapsedRealtime() - L();
        }
        return -1L;
    }

    public Bundle q0() {
        return this.f9508v;
    }

    public long r0() {
        long a10 = a("fullscreen_display_delay_ms", -1L);
        return a10 >= 0 ? a10 : ((Long) this.f6792a.a(j3.X6)).longValue();
    }

    public String s0() {
        return b("mcode", "");
    }

    @Override // com.applovin.impl.m1
    public void setExpired() {
        this.A = true;
    }

    public AtomicBoolean t0() {
        return this.f9511y;
    }

    public boolean u0() {
        return this.f9512z;
    }

    public boolean v0() {
        return this.f9510x.get();
    }

    public boolean w0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f6792a.a(j3.f7310l7)).booleanValue();
    }

    public boolean x0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f6792a.a(j3.m7)).booleanValue();
    }

    public boolean y0() {
        return a("susaode", (Boolean) this.f6792a.a(j3.Y6)).booleanValue();
    }

    @Override // com.applovin.impl.u2
    public u2 a(com.applovin.impl.mediation.g gVar) {
        return new w2(this, gVar);
    }

    @Override // com.applovin.impl.u2
    public void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f9508v.putBundle("applovin_ad_view_info", bundle2);
    }

    private w2(w2 w2Var, com.applovin.impl.mediation.g gVar) {
        super(w2Var.K(), w2Var.i(), w2Var.a(), w2Var.g(), gVar, w2Var.f6792a);
        this.f9508v = new Bundle();
        this.f9511y = new AtomicBoolean();
        this.f9509w = w2Var.f9509w;
        this.f9510x = w2Var.f9510x;
    }

    public void a(e4 e4Var) {
        this.f9509w.set(e4Var);
    }
}
