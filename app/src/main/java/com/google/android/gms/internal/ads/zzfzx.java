package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfzx extends zzfzz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzx(zzfvq zzfvqVar, boolean z10) {
        super(zzfvqVar, z10);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzfwl.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfzy zzfzyVar = (zzfzy) it.next();
            zza.add(zzfzyVar != null ? zzfzyVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
