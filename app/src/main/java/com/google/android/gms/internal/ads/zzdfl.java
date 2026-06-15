package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdfl implements zzbio {
    private final WeakReference zza;
    private final WeakReference zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdfl(zzdfn zzdfnVar, View view, zzdfm zzdfmVar) {
        this.zza = new WeakReference(zzdfnVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmL)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        zzdfn zzdfnVar = (zzdfn) this.zza.get();
        if (zzdfnVar == null) {
            return;
        }
        zzdfn.zzc(zzdfnVar).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmL)).booleanValue()) {
            zzdfn.zzg(zzdfnVar, (View) this.zzb.get());
        }
    }
}
