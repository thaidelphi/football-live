package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhdy implements zzhdk {
    private final List zza;
    private final List zzb;

    static {
        zzhdl.zza(Collections.emptySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhdy(List list, List list2, zzhdw zzhdwVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzhdx zza(int i10, int i11) {
        return new zzhdx(i10, i11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zzc */
    public final Set zzb() {
        int size = this.zza.size();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        int size2 = this.zzb.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((zzhdt) this.zzb.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza = zzhdh.zza(size);
        int size3 = this.zza.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object zzb = ((zzhdt) this.zza.get(i11)).zzb();
            Objects.requireNonNull(zzb);
            zza.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                Objects.requireNonNull(obj);
                zza.add(obj);
            }
        }
        return Collections.unmodifiableSet(zza);
    }
}
