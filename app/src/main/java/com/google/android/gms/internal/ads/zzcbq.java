package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcbq implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcbp zza(zzcal zzcalVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcbp zzcbpVar = (zzcbp) it.next();
            if (zzcbpVar.zza == zzcalVar) {
                return zzcbpVar;
            }
        }
        return null;
    }

    public final void zzb(zzcbp zzcbpVar) {
        this.zza.add(zzcbpVar);
    }

    public final void zzc(zzcbp zzcbpVar) {
        this.zza.remove(zzcbpVar);
    }

    public final boolean zzd(zzcal zzcalVar) {
        ArrayList<zzcbp> arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcbp zzcbpVar = (zzcbp) it.next();
            if (zzcbpVar.zza == zzcalVar) {
                arrayList.add(zzcbpVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (zzcbp zzcbpVar2 : arrayList) {
            zzcbpVar2.zzb.zzf();
        }
        return true;
    }
}
