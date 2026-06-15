package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfiw {
    private final zzfjh zza;
    private final zzfjh zzb;
    private final boolean zzc;
    private final zzfja zzd;
    private final zzfjd zze;

    private zzfiw(zzfja zzfjaVar, zzfjd zzfjdVar, zzfjh zzfjhVar, zzfjh zzfjhVar2, boolean z10) {
        this.zzd = zzfjaVar;
        this.zze = zzfjdVar;
        this.zza = zzfjhVar;
        if (zzfjhVar2 == null) {
            this.zzb = zzfjh.NONE;
        } else {
            this.zzb = zzfjhVar2;
        }
        this.zzc = z10;
    }

    public static zzfiw zza(zzfja zzfjaVar, zzfjd zzfjdVar, zzfjh zzfjhVar, zzfjh zzfjhVar2, boolean z10) {
        zzfkq.zzc(zzfjaVar, "CreativeType is null");
        zzfkq.zzc(zzfjdVar, "ImpressionType is null");
        zzfkq.zzc(zzfjhVar, "Impression owner is null");
        if (zzfjhVar != zzfjh.NONE) {
            if (zzfjaVar == zzfja.DEFINED_BY_JAVASCRIPT && zzfjhVar == zzfjh.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (zzfjdVar == zzfjd.DEFINED_BY_JAVASCRIPT && zzfjhVar == zzfjh.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new zzfiw(zzfjaVar, zzfjdVar, zzfjhVar, zzfjhVar2, z10);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfkm.zze(jSONObject, "impressionOwner", this.zza);
        zzfkm.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfkm.zze(jSONObject, "creativeType", this.zzd);
        zzfkm.zze(jSONObject, "impressionType", this.zze);
        zzfkm.zze(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
