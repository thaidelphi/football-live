package com.google.android.gms.internal.ads;

import com.ironsource.ug;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbnr implements zzfzw {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final b6.a zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnr(b6.a aVar, String str, zzbmy zzbmyVar, zzbmx zzbmxVar) {
        this.zzb = aVar;
    }

    public static /* synthetic */ b6.a zzb(zzbnr zzbnrVar, Object obj, zzbms zzbmsVar) {
        zzbyu zzbyuVar = new zzbyu();
        com.google.android.gms.ads.internal.zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        zzbin.zzo.zzc(uuid, new zzbnq(zzbnrVar, zzbyuVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ug.f21009x, uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbmsVar.zzp(zzbnrVar.zza, jSONObject);
        return zzbyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzw
    public final b6.a zza(Object obj) throws Exception {
        return zzc(obj);
    }

    public final b6.a zzc(final Object obj) {
        return zzgap.zzn(this.zzb, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzbnp
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj2) {
                return zzbnr.zzb(zzbnr.this, obj, (zzbms) obj2);
            }
        }, zzbyp.zzg);
    }
}
