package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.fe;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzejy implements zzerv {
    final zzfap zza;
    private final long zzb;

    public zzejy(zzfap zzfapVar, long j10) {
        this.zza = zzfapVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcth) obj).zzb;
        zzfap zzfapVar = this.zza;
        bundle.putString("slotname", zzfapVar.zzf);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfapVar.zzd;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i10 = zzmVar.zzg;
        zzfbd.zze(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (zzmVar.zza >= 8) {
            int i11 = zzmVar.zzt;
            zzfbd.zze(bundle, "tag_for_under_age_of_consent", i11, i11 != -1);
        }
        zzfbd.zzc(bundle, "url", zzmVar.zzl);
        zzfbd.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle2 = (Bundle) zzmVar.zzc.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhv)).split(",", -1)));
        for (String str : zzmVar.zzc.keySet()) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        zzfbd.zzb(bundle, "extras", bundle2);
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcth) obj).zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i10 = this.zza.zzo.zza;
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i11 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            zzfbd.zzg(bundle, "is_sdk_preload", true, zzmVar.zzb());
            zzfbd.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzmVar.zzb)), zzmVar.zzb != -1);
            zzfbd.zzb(bundle, "extras", zzmVar.zzc);
            int i12 = zzmVar.zzd;
            zzfbd.zze(bundle, "cust_gender", i12, i12 != -1);
            zzfbd.zzd(bundle, "kw", zzmVar.zze);
            int i13 = zzmVar.zzg;
            zzfbd.zze(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
            if (zzmVar.zzf) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", zzmVar.zzy);
            zzfbd.zze(bundle, "d_imp_hdr", 1, zzmVar.zza >= 2 && zzmVar.zzh);
            String str = zzmVar.zzi;
            zzfbd.zzf(bundle, "ppid", str, zzmVar.zza >= 2 && !TextUtils.isEmpty(str));
            Location location = zzmVar.zzk;
            if (location != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", location.getAccuracy() * 1000.0f);
                bundle2.putLong(fe.f17449s, (long) (location.getLatitude() * 1.0E7d));
                bundle2.putLong("long", (long) (1.0E7d * location.getLongitude()));
                bundle2.putLong("time", location.getTime() * 1000);
                bundle.putBundle("uule", bundle2);
            }
            zzfbd.zzc(bundle, "url", zzmVar.zzl);
            zzfbd.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
            zzfbd.zzb(bundle, "custom_targeting", zzmVar.zzn);
            zzfbd.zzd(bundle, "category_exclusions", zzmVar.zzo);
            zzfbd.zzc(bundle, "request_agent", zzmVar.zzp);
            zzfbd.zzc(bundle, "request_pkg", zzmVar.zzq);
            zzfbd.zzg(bundle, "is_designed_for_families", zzmVar.zzr, zzmVar.zza >= 7);
            if (zzmVar.zza >= 8) {
                int i14 = zzmVar.zzt;
                zzfbd.zze(bundle, "tag_for_under_age_of_consent", i14, i14 != -1);
                zzfbd.zzc(bundle, "max_ad_content_rating", zzmVar.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
