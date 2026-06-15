package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdfk implements zzbio {
    private final WeakReference zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdfk(zzdfn zzdfnVar, zzdfm zzdfmVar) {
        this.zza = new WeakReference(zzdfnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        zzcud zzcudVar;
        zzdcc zzdccVar;
        zzdcc zzdccVar2;
        zzdfn zzdfnVar = (zzdfn) this.zza.get();
        if (zzdfnVar == null) {
            return;
        }
        zzcudVar = zzdfnVar.zzh;
        zzcudVar.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkH)).booleanValue()) {
            zzdccVar = zzdfnVar.zzi;
            zzdccVar.zzdd();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdccVar2 = zzdfnVar.zzi;
            zzdccVar2.zzu();
        }
    }
}
