package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzecv implements zzebg {
    private final Context zza;
    private final zzdeg zzb;
    private final Executor zzc;
    private final zzezt zzd;
    private final zzdqf zze;

    public zzecv(Context context, Executor executor, zzdeg zzdegVar, zzezt zzeztVar, zzdqf zzdqfVar) {
        this.zza = context;
        this.zzb = zzdegVar;
        this.zzc = executor;
        this.zzd = zzeztVar;
        this.zze = zzdqfVar;
    }

    public static /* synthetic */ b6.a zzc(final zzecv zzecvVar, Uri uri, zzfag zzfagVar, zzezu zzezuVar, zzezx zzezxVar, Object obj) {
        try {
            d a10 = new d.C0026d().a();
            a10.f1858a.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(a10.f1858a, null);
            final zzbyu zzbyuVar = new zzbyu();
            zzddd zze = zzecvVar.zzb.zze(new zzcqb(zzfagVar, zzezuVar, null), new zzddg(new zzdeo() { // from class: com.google.android.gms.internal.ads.zzecu
                @Override // com.google.android.gms.internal.ads.zzdeo
                public final void zza(boolean z10, Context context, zzcus zzcusVar) {
                    zzecv.zzd(zzecv.this, zzbyuVar, z10, context, zzcusVar);
                }
            }, null));
            zzbyuVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new VersionInfoParcel(0, 0, false), null, null, zzezxVar.zzb));
            zzecvVar.zzd.zza();
            return zzgap.zzh(zze.zzg());
        } catch (Throwable th) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    public static /* synthetic */ void zzd(zzecv zzecvVar, zzbyu zzbyuVar, boolean z10, Context context, zzcus zzcusVar) {
        try {
            com.google.android.gms.ads.internal.zzv.zzj();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) zzbyuVar.get(), true, zzecvVar.zze);
        } catch (Exception unused) {
        }
    }

    private static String zze(zzezu zzezuVar) {
        try {
            return zzezuVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(final zzfag zzfagVar, final zzezu zzezuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmU)).booleanValue()) {
            zzdqe zza = this.zze.zza();
            zza.zzb("action", "cstm_tbs_rndr");
            zza.zzj();
        }
        String zze = zze(zzezuVar);
        final Uri parse = zze != null ? Uri.parse(zze) : null;
        final zzezx zzezxVar = zzfagVar.zzb.zzb;
        return zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzect
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzecv.zzc(zzecv.this, parse, zzfagVar, zzezuVar, zzezxVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final boolean zzb(zzfag zzfagVar, zzezu zzezuVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbcn.zzg(context) && !TextUtils.isEmpty(zze(zzezuVar));
    }
}
