package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.c5;
import com.startapp.f0;
import com.startapp.i8;
import com.startapp.l3;
import java.lang.ref.WeakReference;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SplashEventHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22699a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Activity> f22700b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22701c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22703e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22704f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22705g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22706h;

    /* renamed from: j  reason: collision with root package name */
    public SplashHtml f22708j;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22702d = true;

    /* renamed from: i  reason: collision with root package name */
    public SplashState f22707i = SplashState.LOADING;

    /* renamed from: k  reason: collision with root package name */
    public final a f22709k = new a();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum SplashState {
        LOADING,
        RECEIVED,
        DISPLAYED,
        HIDDEN,
        DO_NOT_DISPLAY
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            SplashEventHandler.this.f22704f = true;
        }
    }

    public SplashEventHandler(Activity activity) {
        this.f22699a = f0.b(activity);
        this.f22700b = new WeakReference<>(activity);
    }

    public final void a(Runnable runnable) {
        if (this.f22701c) {
            if (this.f22706h || runnable == null) {
                SplashState splashState = this.f22707i;
                if (splashState == SplashState.RECEIVED && runnable != null) {
                    this.f22702d = false;
                    runnable.run();
                } else if (splashState != SplashState.LOADING) {
                    SplashHtml splashHtml = this.f22708j;
                    i8 i8Var = new i8(this);
                    if (splashHtml == null) {
                        i8Var.a();
                        return;
                    }
                    splashHtml.callback = i8Var;
                    splashHtml.a();
                }
            }
        }
    }

    public final void a() {
        if (!this.f22703e) {
            this.f22703e = true;
            c5.a(this.f22699a).a(new Intent("com.startapp.android.splashHidden"));
        }
        try {
            c5.a(this.f22699a).a(this.f22709k);
        } catch (Throwable th) {
            l3.a(th);
        }
        Activity activity = this.f22700b.get();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.finish();
        } catch (Throwable th2) {
            l3.a(th2);
        }
    }
}
