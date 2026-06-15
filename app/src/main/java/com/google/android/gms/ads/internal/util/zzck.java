package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzbzc;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzck {

    /* renamed from: a  reason: collision with root package name */
    private final View f11477a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f11478b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11479c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11480d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11481e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f11482f;

    public zzck(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f11478b = activity;
        this.f11477a = view;
        this.f11482f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver a(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void b() {
        if (this.f11479c) {
            return;
        }
        Activity activity = this.f11478b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f11482f;
            ViewTreeObserver a10 = a(activity);
            if (a10 != null) {
                a10.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f11477a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f11482f;
        com.google.android.gms.ads.internal.zzv.zzy();
        zzbzc.zza(view, onGlobalLayoutListener2);
        this.f11479c = true;
    }

    private final void c() {
        Activity activity = this.f11478b;
        if (activity != null && this.f11479c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f11482f;
            ViewTreeObserver a10 = a(activity);
            if (a10 != null) {
                a10.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f11479c = false;
        }
    }

    public final void zza() {
        this.f11481e = false;
        c();
    }

    public final void zzb() {
        this.f11481e = true;
        if (this.f11480d) {
            b();
        }
    }

    public final void zzc() {
        this.f11480d = true;
        if (this.f11481e) {
            b();
        }
    }

    public final void zzd() {
        this.f11480d = false;
        c();
    }

    public final void zze(Activity activity) {
        this.f11478b = activity;
    }
}
