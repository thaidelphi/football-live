package com.startapp;

import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i1 extends j1 {

    /* renamed from: e  reason: collision with root package name */
    public final FailuresHandler f22082e;

    /* renamed from: f  reason: collision with root package name */
    public int f22083f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22084g;

    public i1(com.startapp.sdk.adsbase.cache.g gVar) {
        super(gVar);
        this.f22082e = CacheMetaData.b().a().c();
        this.f22083f = 0;
        this.f22084g = false;
    }

    @Override // com.startapp.j1
    public final boolean a() {
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        if ((!startAppSDKInternal.f22911c || startAppSDKInternal.f22912d || startAppSDKInternal.f22914f) ? false : true) {
            FailuresHandler failuresHandler = this.f22082e;
            if ((failuresHandler == null || failuresHandler.a() == null) ? false : true) {
                if (this.f22084g) {
                    return this.f22082e.b();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.startapp.j1
    public final long b() {
        Long l10;
        if (this.f22083f < this.f22082e.a().size() && (l10 = this.f22121c) != null) {
            long millis = TimeUnit.SECONDS.toMillis(this.f22082e.a().get(this.f22083f).intValue()) - (System.currentTimeMillis() - l10.longValue());
            if (millis >= 0) {
                return millis;
            }
            return 0L;
        }
        return -1L;
    }

    @Override // com.startapp.j1
    public final void c() {
        if (this.f22083f == this.f22082e.a().size() - 1) {
            this.f22084g = true;
        } else {
            this.f22083f++;
        }
        super.c();
    }
}
