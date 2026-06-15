package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzehi {
    private final zzdeg zza;

    public zzehi(zzdeg zzdegVar) {
        this.zza = zzdegVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, zzezu zzezuVar, View view, zzehe zzeheVar) {
        zzehg zzehgVar = new zzehg(this, new zzdeo() { // from class: com.google.android.gms.internal.ads.zzehf
            @Override // com.google.android.gms.internal.ads.zzdeo
            public final void zza(boolean z10, Context context, zzcus zzcusVar) {
            }
        });
        zzddd zze = this.zza.zze(new zzcqb(zzfagVar, zzezuVar, null), zzehgVar);
        zzeheVar.zzd(new zzehh(this, zze));
        return zze.zzg();
    }
}
