package com.google.android.gms.internal.ads;

import com.ironsource.cc;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfvy implements Map, Serializable {
    private transient zzfwa zza;
    private transient zzfwa zzb;
    private transient zzfvq zzc;

    public static zzfvy zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfvx zzfvxVar = new zzfvx(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfvxVar.zzb(entrySet);
        return zzfvxVar.zzc();
    }

    public static zzfvy zzd() {
        return zzfxm.zza;
    }

    public static zzfvy zze(Object obj, Object obj2) {
        zzfus.zzb("dialog_not_shown_reason", obj2);
        return zzfxm.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzfws.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfxx.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfus.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(cc.T);
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    abstract zzfvq zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzfvq values() {
        zzfvq zzfvqVar = this.zzc;
        if (zzfvqVar == null) {
            zzfvq zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzfvqVar;
    }

    abstract zzfwa zzf();

    abstract zzfwa zzg();

    @Override // java.util.Map
    /* renamed from: zzh */
    public final zzfwa entrySet() {
        zzfwa zzfwaVar = this.zza;
        if (zzfwaVar == null) {
            zzfwa zzf = zzf();
            this.zza = zzf;
            return zzf;
        }
        return zzfwaVar;
    }

    @Override // java.util.Map
    /* renamed from: zzi */
    public final zzfwa keySet() {
        zzfwa zzfwaVar = this.zzb;
        if (zzfwaVar == null) {
            zzfwa zzg = zzg();
            this.zzb = zzg;
            return zzg;
        }
        return zzfwaVar;
    }
}
