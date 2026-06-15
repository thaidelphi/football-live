package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@TargetApi(14)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class x1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzid f13221a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ x1(zzid zzidVar, zzib zzibVar) {
        this.f13221a = zzidVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzfy zzfyVar;
        try {
            try {
                this.f13221a.f13220a.zzay().q().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    zzfyVar = this.f13221a.f13220a;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.f13221a.f13220a.I();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z10 = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z10 = false;
                        }
                        this.f13221a.f13220a.zzaz().u(new w1(this, z10, data, str, queryParameter));
                        zzfyVar = this.f13221a.f13220a;
                    }
                    zzfyVar = this.f13221a.f13220a;
                }
            } catch (RuntimeException e8) {
                this.f13221a.f13220a.zzay().m().b("Throwable caught in onActivityCreated", e8);
                zzfyVar = this.f13221a.f13220a;
            }
            zzfyVar.F().t(activity, bundle);
        } catch (Throwable th) {
            this.f13221a.f13220a.F().t(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f13221a.f13220a.F().u(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f13221a.f13220a.F().v(activity);
        zzki H = this.f13221a.f13220a.H();
        H.f13220a.zzaz().u(new i3(H, H.f13220a.zzav().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzki H = this.f13221a.f13220a.H();
        H.f13220a.zzaz().u(new h3(H, H.f13220a.zzav().b()));
        this.f13221a.f13220a.F().w(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f13221a.f13220a.F().x(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
