package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbmt implements zzbll, zzbms {
    private final zzbms zza;
    private final HashSet zzb = new HashSet();

    public zzbmt(zzbms zzbmsVar) {
        this.zza = zzbmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbll, com.google.android.gms.internal.ads.zzblv
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbll, com.google.android.gms.internal.ads.zzblv
    public final /* synthetic */ void zzb(String str, String str2) {
        zzblk.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbio) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbio) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final /* synthetic */ void zzd(String str, Map map) {
        zzblk.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbll, com.google.android.gms.internal.ads.zzblj
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzblk.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final /* synthetic */ void zzp(String str, JSONObject jSONObject) {
        zzblk.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzq(String str, zzbio zzbioVar) {
        this.zza.zzq(str, zzbioVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbioVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzr(String str, zzbio zzbioVar) {
        this.zza.zzr(str, zzbioVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbioVar));
    }
}
