package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfvl extends zzfvm implements Map {
    @Override // java.util.Map
    public final void clear() {
        zzb().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return zzb().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return zzb().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return zzb().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || zzb().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return zzb().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzb().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return zzb().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return zzb().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return zzb().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return zzb().values();
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    protected /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    protected abstract Map zzb();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzc() {
        return zzfxx.zza(entrySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzd(Object obj) {
        zzfwn zzfwnVar = new zzfwn(entrySet().iterator());
        if (obj == null) {
            while (zzfwnVar.hasNext()) {
                if (zzfwnVar.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzfwnVar.hasNext()) {
                if (obj.equals(zzfwnVar.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zze(Object obj) {
        return zzfws.zzb(this, obj);
    }
}
