package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzduz implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzduz(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* synthetic */ Object zzb() {
        final CookieManager zza = com.google.android.gms.ads.internal.zzv.zzr().zza((Context) this.zzb.zzb());
        zzfen zzfenVar = zzfen.WEBVIEW_COOKIE;
        zzfej zzi = zzfed.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdut
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaY));
            }
        }, zzfenVar, (zzfet) this.zza.zzb()).zzi(1L, TimeUnit.SECONDS);
        final zzfdx zzfdxVar = new zzfdx() { // from class: com.google.android.gms.internal.ads.zzduu
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final Object zza(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzfzw(zzfdxVar) { // from class: com.google.android.gms.internal.ads.zzfee
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return zzgap.zzh("");
            }
        }).zza();
    }
}
