package com.google.android.gms.internal.ads;

import com.ironsource.ug;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbnj implements zzbmv {
    private final zzbmx zza;
    private final zzbmy zzb;
    private final zzbmr zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnj(zzbmr zzbmrVar, String str, zzbmy zzbmyVar, zzbmx zzbmxVar) {
        this.zzc = zzbmrVar;
        this.zzd = str;
        this.zzb = zzbmyVar;
        this.zza = zzbmxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzd(zzbnj zzbnjVar, zzbml zzbmlVar, zzbms zzbmsVar, Object obj, zzbyu zzbyuVar) {
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            String uuid = UUID.randomUUID().toString();
            zzbin.zzo.zzc(uuid, new zzbni(zzbnjVar, zzbmlVar, zzbyuVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ug.f21009x, uuid);
            jSONObject.put("args", zzbnjVar.zzb.zzb(obj));
            zzbmsVar.zzp(zzbnjVar.zzd, jSONObject);
        } catch (Exception e8) {
            try {
                zzbyuVar.zzd(e8);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to invokeJavascript", e8);
            } finally {
                zzbmlVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzw
    public final b6.a zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final b6.a zzb(Object obj) {
        zzbyu zzbyuVar = new zzbyu();
        zzbml zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zzj(new zzbng(this, zzb, obj, zzbyuVar), new zzbnh(this, zzbyuVar, zzb));
        return zzbyuVar;
    }
}
