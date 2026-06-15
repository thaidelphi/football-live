package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzxa extends zzbs {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    @Deprecated
    public zzxa() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzy();
    }

    private final void zzy() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final zzxa zzq(int i10, boolean z10) {
        if (this.zzi.get(i10) != z10) {
            if (z10) {
                this.zzi.put(i10, true);
            } else {
                this.zzi.delete(i10);
            }
        }
        return this;
    }

    public zzxa(Context context) {
        super.zze(context);
        Point zzw = zzeh.zzw(context);
        super.zzf(zzw.x, zzw.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzxa(zzxb zzxbVar, zzxm zzxmVar) {
        super(zzxbVar);
        this.zza = zzxbVar.zzD;
        this.zzb = zzxbVar.zzF;
        this.zzc = zzxbVar.zzH;
        this.zzd = zzxbVar.zzM;
        this.zze = zzxbVar.zzN;
        this.zzf = zzxbVar.zzO;
        this.zzg = zzxbVar.zzQ;
        SparseArray zza = zzxb.zza(zzxbVar);
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < zza.size(); i10++) {
            sparseArray.put(zza.keyAt(i10), new HashMap((Map) zza.valueAt(i10)));
        }
        this.zzh = sparseArray;
        this.zzi = zzxb.zzb(zzxbVar).clone();
    }
}
