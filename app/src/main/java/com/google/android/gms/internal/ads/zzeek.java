package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzeek implements zzebg {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(zzfag zzfagVar, zzezu zzezuVar) {
        String optString = zzezuVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfap zzfapVar = zzfagVar.zza.zza;
        zzfan zzfanVar = new zzfan();
        zzfanVar.zzq(zzfapVar);
        zzfanVar.zzt(optString);
        Bundle zzd = zzd(zzfapVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzezuVar.zzv.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzezuVar.zzv.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzezuVar.zzD.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzezuVar.zzD.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfapVar.zzd;
        zzfanVar.zzH(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, zzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz));
        zzfap zzJ = zzfanVar.zzJ();
        Bundle bundle = new Bundle();
        zzezx zzezxVar = zzfagVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzezxVar.zza));
        bundle2.putInt("refresh_interval", zzezxVar.zzc);
        bundle2.putString("gws_query_id", zzezxVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        zzfap zzfapVar2 = zzfagVar.zza.zza;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", zzfapVar2.zzf);
        bundle3.putString("allocation_id", zzezuVar.zzw);
        bundle3.putString("ad_source_name", zzezuVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzezuVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzezuVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzezuVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzezuVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzezuVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzezuVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzezuVar.zzi));
        bundle3.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzezuVar.zzj);
        bundle3.putString("valid_from_timestamp", zzezuVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzezuVar.zzP);
        bundle3.putString("recursive_server_response_data", zzezuVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzezuVar.zzW);
        if (zzezuVar.zzl != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzezuVar.zzl.zzb);
            bundle4.putString("rb_type", zzezuVar.zzl.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzJ, bundle, zzezuVar, zzfagVar);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final boolean zzb(zzfag zzfagVar, zzezu zzezuVar) {
        return !TextUtils.isEmpty(zzezuVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    protected abstract b6.a zzc(zzfap zzfapVar, Bundle bundle, zzezu zzezuVar, zzfag zzfagVar);
}
