package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbbn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbcw.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbdj.zza);
        zzc(arrayList, zzbdj.zzb);
        zzc(arrayList, zzbdj.zzc);
        zzc(arrayList, zzbdj.zzd);
        zzc(arrayList, zzbdj.zze);
        zzc(arrayList, zzbdj.zzu);
        zzc(arrayList, zzbdj.zzf);
        zzc(arrayList, zzbdj.zzm);
        zzc(arrayList, zzbdj.zzn);
        zzc(arrayList, zzbdj.zzo);
        zzc(arrayList, zzbdj.zzp);
        zzc(arrayList, zzbdj.zzq);
        zzc(arrayList, zzbdj.zzr);
        zzc(arrayList, zzbdj.zzs);
        zzc(arrayList, zzbdj.zzt);
        zzc(arrayList, zzbdj.zzg);
        zzc(arrayList, zzbdj.zzh);
        zzc(arrayList, zzbdj.zzi);
        zzc(arrayList, zzbdj.zzj);
        zzc(arrayList, zzbdj.zzk);
        zzc(arrayList, zzbdj.zzl);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbdy.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbcw zzbcwVar) {
        String str = (String) zzbcwVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
