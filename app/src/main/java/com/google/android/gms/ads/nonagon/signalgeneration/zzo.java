package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzdqk;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzo {

    /* renamed from: a  reason: collision with root package name */
    private final Map f11803a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f11804b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Context f11805c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdqk f11806d;

    /* renamed from: e  reason: collision with root package name */
    private final ExecutorService f11807e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(Context context, zzdqk zzdqkVar, ExecutorService executorService) {
        this.f11805c = context;
        this.f11806d = zzdqkVar;
        this.f11807e = executorService;
    }

    private final void b(final boolean z10) {
        Map map = this.f11804b;
        Boolean valueOf = Boolean.valueOf(z10);
        if (map.containsKey(valueOf)) {
            return;
        }
        this.f11804b.put(valueOf, new ArrayList());
        this.f11807e.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // java.lang.Runnable
            public final void run() {
                zzo.this.d(z10, false);
            }
        });
    }

    private final void c(zzq zzqVar, Pair pair, boolean z10) {
        zzqVar.zzd();
        QueryInfo zzb = zzqVar.zzb();
        if (zzb != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(zzb);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzqVar.zzc());
        }
        zzdqk zzdqkVar = this.f11806d;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", a.f18924g);
        pairArr[4] = new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzv.zzC().a() - ((Long) pair.second).longValue()));
        pairArr[5] = new Pair("sgpc_h", Boolean.toString(z10));
        pairArr[6] = new Pair("sgpc_rs", Boolean.toString(zzqVar.zzb() != null));
        zzaa.zzd(zzdqkVar, null, "sgpcr", pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d(boolean z10, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        bundle.putBoolean("accept_3p_cookie", z10);
        Map map = this.f11803a;
        Boolean valueOf = Boolean.valueOf(z10);
        zzq zzqVar = (zzq) map.get(valueOf);
        int i10 = 0;
        if (z11 && zzqVar != null) {
            i10 = zzqVar.zza() + 1;
        }
        int i11 = i10;
        zzq zzqVar2 = (zzq) this.f11803a.get(valueOf);
        final zzp zzpVar = new zzp(this, z10, i11, zzqVar2 == null ? null : Boolean.valueOf(zzqVar2.zzf()), this.f11806d);
        final AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkY)).booleanValue()) {
            this.f11807e.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzo.zza(zzo.this, build, zzpVar);
                }
            });
        } else {
            QueryInfo.generate(this.f11805c, AdFormat.BANNER, build, zzpVar);
        }
    }

    public static /* synthetic */ Object zza(zzo zzoVar, AdRequest adRequest, zzp zzpVar) {
        QueryInfo.generate(zzoVar.f11805c, AdFormat.BANNER, adRequest, zzpVar);
        return Boolean.TRUE;
    }

    public static /* synthetic */ void zzb(zzo zzoVar, Object obj, Pair pair) {
        boolean z10 = false;
        if (obj instanceof WebView) {
            CookieManager zza = com.google.android.gms.ads.internal.zzv.zzr().zza(zzoVar.f11805c);
            if (zza != null) {
                z10 = zza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = zzoVar.f11803a;
        Boolean valueOf = Boolean.valueOf(z10);
        zzq zzqVar = (zzq) map.get(valueOf);
        if (zzqVar != null && !zzqVar.zze()) {
            zzoVar.c(zzqVar, pair, true);
            return;
        }
        List list = (List) zzoVar.f11804b.get(valueOf);
        if (list == null) {
            list = new ArrayList();
            zzoVar.f11804b.put(valueOf, list);
        }
        list.add(pair);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(final boolean z10, zzq zzqVar) {
        Long l10;
        Map map = this.f11803a;
        Boolean valueOf = Boolean.valueOf(z10);
        zzq zzqVar2 = (zzq) map.get(valueOf);
        if (zzqVar2 == null || zzqVar2.zze() || zzqVar2.zzb() == null || zzqVar.zzb() != null) {
            this.f11803a.put(valueOf, zzqVar);
        }
        if (zzqVar.zzb() != null) {
            l10 = (Long) zzbdr.zzd.zze();
        } else {
            l10 = (Long) zzbdr.zze.zze();
        }
        long longValue = l10.longValue();
        final boolean z11 = zzqVar.zzb() == null;
        zzbyp.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final void run() {
                zzo.this.d(z10, z11);
            }
        }, longValue, TimeUnit.SECONDS);
        List<Pair> list = (List) this.f11804b.get(valueOf);
        this.f11804b.put(valueOf, new ArrayList());
        if (list != null) {
            for (Pair pair : list) {
                c(zzqVar, pair, false);
            }
        }
    }

    public final synchronized void zze() {
        b(true);
        b(false);
    }

    public final synchronized void zzg(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a()));
        zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // java.lang.Runnable
            public final void run() {
                zzo.zzb(zzo.this, obj, pair);
            }
        });
    }
}
