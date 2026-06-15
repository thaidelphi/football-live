package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbsu;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class QueryInfo {

    /* renamed from: a  reason: collision with root package name */
    private final zzex f11855a;

    public QueryInfo(zzex zzexVar) {
        this.f11855a = zzexVar;
    }

    private static void a(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbbm.zza(context);
        if (((Boolean) zzbdk.zzj.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzld)).booleanValue()) {
                zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdRequest adRequest2 = adRequest;
                        zzeh zza = adRequest2 == null ? null : adRequest2.zza();
                        new zzbsu(context, adFormat, zza, str).zzb(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new zzbsu(context, adFormat, adRequest == null ? null : adRequest.zza(), str).zzb(queryInfoGenerationCallback);
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        a(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.f11855a.zzb();
    }

    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.f11855a.zza();
    }

    @KeepForSdk
    public String getRequestId() {
        return this.f11855a.zzc();
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.n(str, "AdUnitId cannot be null.");
        a(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}
