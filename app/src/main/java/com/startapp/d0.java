package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.AppSessionConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d0 extends y1 {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f21863a;

    /* renamed from: b  reason: collision with root package name */
    public int f21864b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21865c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21866d;

    public d0(e0 e0Var) {
        this.f21863a = e0Var;
    }

    @Override // com.startapp.y1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == null) {
            return;
        }
        int i10 = this.f21864b + 1;
        this.f21864b = i10;
        if (i10 != 1 || this.f21865c) {
            return;
        }
        if (!this.f21866d) {
            this.f21866d = true;
            if (((StartAppSDKInternal) this.f21863a).f22916h != null) {
                l3 l3Var = new l3(m3.f22280j);
                l3Var.f22234j = false;
                try {
                    com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.R.f22411a;
                    if (aVar != null) {
                        aVar.f23240p.a().a(l3Var);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        StartAppSDKInternal startAppSDKInternal = (StartAppSDKInternal) this.f21863a;
        Application application = startAppSDKInternal.f22916h;
        if (application != null) {
            y8 a10 = com.startapp.sdk.components.a.a(application).f23230f.a();
            a10.f23621b.a().execute(new v8(a10));
            c0 a11 = com.startapp.sdk.components.a.a(startAppSDKInternal.f22916h).N.a();
            ((com.startapp.sdk.components.f0) a11.f21806a).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = a11.f21810e;
            AppSessionConfig call = a11.f21807b.call();
            if (elapsedRealtime > Math.max(0L, call != null ? call.a() : 600000L) + j10 || a11.f21809d <= 0) {
                a11.f21809d = elapsedRealtime;
                a11.f21808c.clear();
            }
        }
        if (startAppSDKInternal.f22916h != null) {
            l3 l3Var2 = new l3(m3.f22280j);
            l3Var2.f22234j = false;
            try {
                com.startapp.sdk.components.a aVar2 = com.startapp.sdk.components.a.R.f22411a;
                if (aVar2 != null) {
                    aVar2.f23240p.a().a(l3Var2);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.startapp.y1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f21864b--;
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.f21865c = isChangingConfigurations;
        if (this.f21864b != 0 || isChangingConfigurations) {
            return;
        }
        StartAppSDKInternal startAppSDKInternal = (StartAppSDKInternal) this.f21863a;
        Application application = startAppSDKInternal.f22916h;
        if (application != null) {
            y8 a10 = com.startapp.sdk.components.a.a(application).f23230f.a();
            a10.f23621b.a().execute(new w8(a10));
            c0 a11 = com.startapp.sdk.components.a.a(startAppSDKInternal.f22916h).N.a();
            ((com.startapp.sdk.components.f0) a11.f21806a).getClass();
            a11.f21810e = SystemClock.elapsedRealtime();
        }
        if (startAppSDKInternal.f22916h != null) {
            l3 l3Var = new l3(m3.f22280j);
            l3Var.f22234j = false;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.R.f22411a;
                if (aVar != null) {
                    aVar.f23240p.a().a(l3Var);
                }
            } catch (Throwable unused) {
            }
        }
        Application application2 = startAppSDKInternal.f22916h;
        if (application2 != null) {
            try {
                com.startapp.sdk.components.a.a(application2).f23246v.a().b();
            } catch (Throwable th) {
                l3.a(th);
            }
            if (MetaData.f23158k.K() == null || !MetaData.f23158k.K().h()) {
                return;
            }
            com.startapp.sdk.components.a.a(application2).f23247w.a().b();
        }
    }
}
