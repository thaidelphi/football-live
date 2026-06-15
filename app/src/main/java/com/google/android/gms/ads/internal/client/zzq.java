package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzq {
    public static final zzq zza = new zzq();

    protected zzq() {
    }

    public final zzm zza(Context context, zzeh zzehVar) {
        Context context2;
        List list;
        String str;
        String zzi = zzehVar.zzi();
        Set zzn = zzehVar.zzn();
        if (zzn.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(zzn));
            context2 = context;
        }
        boolean zzq = zzehVar.zzq(context2);
        Bundle zzf = zzehVar.zzf(AdMobAdapter.class);
        String zzj = zzehVar.zzj();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzbb.zzb();
            str = com.google.android.gms.ads.internal.util.client.zzf.zzr(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzp = zzehVar.zzp();
        RequestConfiguration zzc = zzeu.zzf().zzc();
        return new zzm(8, -1L, zzf, -1, list, zzq, Math.max(zzehVar.zzb(), zzc.getTagForChildDirectedTreatment()), false, zzj, null, null, zzi, zzehVar.zzg(), zzehVar.zze(), Collections.unmodifiableList(new ArrayList(zzehVar.zzm())), zzehVar.zzk(), str, zzp, null, zzc.getTagForUnderAgeOfConsent(), (String) Collections.max(Arrays.asList(null, zzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list2 = RequestConfiguration.zza;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), zzehVar.zzl(), zzehVar.zza(), zzehVar.zzh(), zzc.getPublisherPrivacyPersonalizationState().getValue(), zzehVar.zzc());
    }
}
