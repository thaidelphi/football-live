package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbsa;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbtc;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbxn;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzaz {

    /* renamed from: a  reason: collision with root package name */
    private final zzk f11191a;

    /* renamed from: b  reason: collision with root package name */
    private final zzi f11192b;

    /* renamed from: c  reason: collision with root package name */
    private final zzfb f11193c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbgu f11194d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbsa f11195e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbgv f11196f;

    /* renamed from: g  reason: collision with root package name */
    private zzbtc f11197g;

    /* renamed from: h  reason: collision with root package name */
    private final zzl f11198h;

    public zzaz(zzk zzkVar, zzi zziVar, zzfb zzfbVar, zzbgu zzbguVar, zzbvu zzbvuVar, zzbsa zzbsaVar, zzbgv zzbgvVar, zzl zzlVar) {
        this.f11191a = zzkVar;
        this.f11192b = zziVar;
        this.f11193c = zzfbVar;
        this.f11194d = zzbguVar;
        this.f11195e = zzbsaVar;
        this.f11196f = zzbgvVar;
        this.f11198h = zzlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void j(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzbb.zzb().zzo(context, zzbb.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbt zzd(Context context, String str, zzbod zzbodVar) {
        return (zzbt) new zzaq(this, context, str, zzbodVar).zzd(context, false);
    }

    public final zzbx zze(Context context, zzr zzrVar, String str, zzbod zzbodVar) {
        return (zzbx) new zzam(this, context, zzrVar, str, zzbodVar).zzd(context, false);
    }

    public final zzbx zzf(Context context, zzr zzrVar, String str, zzbod zzbodVar) {
        return (zzbx) new zzao(this, context, zzrVar, str, zzbodVar).zzd(context, false);
    }

    public final zzch zzg(Context context, zzbod zzbodVar) {
        return (zzch) new zzas(this, context, zzbodVar).zzd(context, false);
    }

    public final zzdt zzh(Context context, zzbod zzbodVar) {
        return (zzdt) new zzae(this, context, zzbodVar).zzd(context, false);
    }

    public final zzbfc zzj(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbfc) new zzaw(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbfi zzk(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbfi) new zzay(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbjq zzn(Context context, zzbod zzbodVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbjq) new zzak(this, context, zzbodVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbrw zzo(Context context, zzbod zzbodVar) {
        return (zzbrw) new zzai(this, context, zzbodVar).zzd(context, false);
    }

    public final zzbsd zzq(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean z10 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbsd) zzacVar.zzd(activity, z10);
    }

    public final zzbvi zzs(Context context, String str, zzbod zzbodVar) {
        return (zzbvi) new zzaa(this, context, str, zzbodVar).zzd(context, false);
    }

    public final zzbxn zzt(Context context, zzbod zzbodVar) {
        return (zzbxn) new zzag(this, context, zzbodVar).zzd(context, false);
    }
}
