package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzauc;
import com.google.android.gms.internal.ads.zzaud;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzdqk;
import com.google.android.gms.internal.ads.zzfat;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzgba;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class TaggingLibraryJsInterface {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11677a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f11678b;

    /* renamed from: c  reason: collision with root package name */
    private final zzauc f11679c;

    /* renamed from: d  reason: collision with root package name */
    private final zzfat f11680d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11681e;

    /* renamed from: f  reason: collision with root package name */
    private final zzdqk f11682f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11683g;

    /* renamed from: h  reason: collision with root package name */
    private final zzgba f11684h = zzbyp.zzf;

    /* renamed from: i  reason: collision with root package name */
    private final zzfhp f11685i;

    /* renamed from: j  reason: collision with root package name */
    private final zzo f11686j;

    /* renamed from: k  reason: collision with root package name */
    private final zzf f11687k;

    /* renamed from: l  reason: collision with root package name */
    private final zzj f11688l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaggingLibraryJsInterface(WebView webView, zzauc zzaucVar, zzdqk zzdqkVar, zzfhp zzfhpVar, zzfat zzfatVar, zzo zzoVar, zzf zzfVar, zzj zzjVar) {
        this.f11678b = webView;
        Context context = webView.getContext();
        this.f11677a = context;
        this.f11679c = zzaucVar;
        this.f11682f = zzdqkVar;
        zzbbm.zza(context);
        this.f11681e = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjy)).intValue();
        this.f11683g = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjz)).booleanValue();
        this.f11685i = zzfhpVar;
        this.f11680d = zzfatVar;
        this.f11686j = zzoVar;
        this.f11687k = zzfVar;
        this.f11688l = zzjVar;
    }

    public static /* synthetic */ void zze(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        zzfat zzfatVar;
        Uri parse = Uri.parse(str);
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlT)).booleanValue() && (zzfatVar = taggingLibraryJsInterface.f11680d) != null) {
                parse = zzfatVar.zza(parse, taggingLibraryJsInterface.f11677a, taggingLibraryJsInterface.f11678b, null);
            } else {
                parse = taggingLibraryJsInterface.f11679c.zza(parse, taggingLibraryJsInterface.f11677a, taggingLibraryJsInterface.f11678b, null);
            }
        } catch (zzaud e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to append the click signal to URL: ", e8);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "TaggingLibraryJsInterface.recordClick");
        }
        taggingLibraryJsInterface.f11685i.zzd(parse.toString(), null, null);
    }

    public static /* synthetic */ void zzf(TaggingLibraryJsInterface taggingLibraryJsInterface, Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zza = com.google.android.gms.ads.internal.zzv.zzr().zza(taggingLibraryJsInterface.f11677a);
        bundle.putBoolean("accept_3p_cookie", zza != null ? zza.acceptThirdPartyCookies(taggingLibraryJsInterface.f11678b) : false);
        QueryInfo.generate(taggingLibraryJsInterface.f11677a, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
            String zzd = this.f11679c.zzc().zzd(this.f11677a, str, this.f11678b);
            if (this.f11683g) {
                zzaa.zzd(this.f11682f, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a() - a10)));
            }
            return zzd;
        } catch (RuntimeException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals. ", e8);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            String str2 = "Invalid timeout for getting click signals. Timeout=" + i10;
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg(str2);
            return "";
        }
        try {
            return (String) zzbyp.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i10, this.f11681e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals with timeout. ", e8);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e8 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbu zzbuVar = new zzbu(this, uuid);
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            this.f11686j.zzg(this.f11678b, zzbuVar);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjB)).booleanValue()) {
                this.f11684h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaggingLibraryJsInterface.zzf(TaggingLibraryJsInterface.this, bundle, zzbuVar);
                    }
                });
            } else {
                QueryInfo.generate(this.f11677a, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbuVar);
            }
        }
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
            String zzh = this.f11679c.zzc().zzh(this.f11677a, this.f11678b, null);
            if (this.f11683g) {
                zzaa.zzd(this.f11682f, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a() - a10)));
            }
            return zzh;
        } catch (RuntimeException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals. ", e8);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) zzbyp.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i10, this.f11681e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals with timeout. ", e8);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e8 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjD)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbp
            @Override // java.lang.Runnable
            public final void run() {
                TaggingLibraryJsInterface.zze(TaggingLibraryJsInterface.this, str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i10;
        int i11;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i12 = jSONObject.getInt("x");
            int i13 = jSONObject.getInt("y");
            int i14 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i15 = jSONObject.getInt("type");
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        i11 = 1;
                    } else if (i15 == 2) {
                        i11 = 2;
                    } else if (i15 != 3) {
                        i10 = -1;
                    } else {
                        i11 = 3;
                    }
                    this.f11679c.zzd(MotionEvent.obtain(0L, i14, i11, i12, i13, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                    return;
                }
                i10 = 0;
                this.f11679c.zzd(MotionEvent.obtain(0L, i14, i11, i12, i13, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            } catch (RuntimeException e8) {
                e = e8;
                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            } catch (JSONException e10) {
                e = e10;
                int i162 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            }
            i11 = i10;
        } catch (RuntimeException | JSONException e11) {
            e = e11;
        }
    }
}
