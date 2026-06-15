package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.ironsource.ug;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdkp {
    private final Executor zza;
    private final zzcmj zzb;
    private final zzdby zzc;
    private final zzclc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkp(Executor executor, zzcmj zzcmjVar, zzdby zzdbyVar, zzclc zzclcVar) {
        this.zza = executor;
        this.zzc = zzdbyVar;
        this.zzb = zzcmjVar;
        this.zzd = zzclcVar;
    }

    public final void zzc(final zzcdq zzcdqVar) {
        if (zzcdqVar == null) {
            return;
        }
        this.zzc.zza(zzcdqVar.zzF());
        this.zzc.zzo(new zzaxl() { // from class: com.google.android.gms.internal.ads.zzdkl
            @Override // com.google.android.gms.internal.ads.zzaxl
            public final void zzdn(zzaxk zzaxkVar) {
                zzcfi zzN = zzcdq.this.zzN();
                Rect rect = zzaxkVar.zzd;
                zzN.zzr(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzaxl() { // from class: com.google.android.gms.internal.ads.zzdkm
            @Override // com.google.android.gms.internal.ads.zzaxl
            public final void zzdn(zzaxk zzaxkVar) {
                HashMap hashMap = new HashMap();
                hashMap.put(ug.f20996k, true != zzaxkVar.zzj ? "0" : "1");
                zzcdq.this.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcdqVar);
        zzcfi zzN = zzcdqVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkb)).booleanValue() && zzN != null) {
            zzN.zzL(this.zzd);
            zzN.zzM(this.zzd, null, null);
        }
        zzcdqVar.zzag("/trackActiveViewUnit", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdkn
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzcdq zzcdqVar2 = (zzcdq) obj;
                zzdkp.this.zzb.zzd();
            }
        });
        zzcdqVar.zzag("/untrackActiveViewUnit", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdko
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzcdq zzcdqVar2 = (zzcdq) obj;
                zzdkp.this.zzb.zzb();
            }
        });
    }
}
