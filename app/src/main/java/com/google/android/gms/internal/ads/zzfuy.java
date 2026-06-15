package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfuy extends AbstractSet {
    final /* synthetic */ zzfve zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuy(zzfve zzfveVar) {
        this.zza = zzfveVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzw;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzw = this.zza.zzw(entry.getKey());
            if (zzw != -1 && zzfss.zza(zzfve.zzj(this.zza, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfve zzfveVar = this.zza;
        Map zzl = zzfveVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzfuw(zzfveVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzv;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i10;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzfve zzfveVar = this.zza;
            if (zzfveVar.zzr()) {
                return false;
            }
            zzv = zzfveVar.zzv();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzfve zzfveVar2 = this.zza;
            Object zzi = zzfve.zzi(zzfveVar2);
            zzA = zzfveVar2.zzA();
            zzB = zzfveVar2.zzB();
            zzC = zzfveVar2.zzC();
            int zzb = zzfvf.zzb(key, value, zzv, zzi, zzA, zzB, zzC);
            if (zzb != -1) {
                this.zza.zzq(zzb, zzv);
                zzfve zzfveVar3 = this.zza;
                i10 = zzfveVar3.zzg;
                zzfveVar3.zzg = i10 - 1;
                this.zza.zzo();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
