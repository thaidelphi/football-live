package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgc extends zzfvl {
    private final Map zza;

    public zzgc(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, java.util.Map
    public final Set entrySet() {
        return zzfxx.zzc(this.zza.entrySet(), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzga
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, java.util.Map
    public final boolean isEmpty() {
        return this.zza.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, java.util.Map
    public final Set keySet() {
        return zzfxx.zzc(this.zza.keySet(), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzgb
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfvl, com.google.android.gms.internal.ads.zzfvm
    protected final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    protected final Map zzb() {
        return this.zza;
    }
}
