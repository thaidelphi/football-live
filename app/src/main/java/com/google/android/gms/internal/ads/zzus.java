package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzus extends zztg {
    private static final zzap zza;
    private final zzua[] zzb;
    private final List zzc;
    private final zzbn[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzup zzh;
    private final zztj zzi;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zza("MergingMediaSource");
        zza = zzadVar.zzc();
    }

    public zzus(boolean z10, boolean z11, zztj zztjVar, zzua... zzuaVarArr) {
        this.zzb = zzuaVarArr;
        this.zzi = zztjVar;
        this.zze = new ArrayList(Arrays.asList(zzuaVarArr));
        this.zzc = new ArrayList(zzuaVarArr.length);
        int i10 = 0;
        while (true) {
            int length = zzuaVarArr.length;
            if (i10 < length) {
                this.zzc.add(new ArrayList());
                i10++;
            } else {
                this.zzd = new zzbn[length];
                this.zzg = new long[0];
                new HashMap();
                zzfxb.zzb(8).zzb(2).zza();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zztg
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzua zzuaVar, zzbn zzbnVar) {
        int i10;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            i10 = zzbnVar.zzb();
            this.zzf = i10;
        } else {
            int zzb = zzbnVar.zzb();
            int i11 = this.zzf;
            if (zzb != i11) {
                this.zzh = new zzup(0);
                return;
            }
            i10 = i11;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance(long.class, i10, this.zzd.length);
        }
        this.zze.remove(zzuaVar);
        this.zzd[num.intValue()] = zzbnVar;
        if (this.zze.isEmpty()) {
            zzo(this.zzd[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzG(zztw zztwVar) {
        zztw zztwVar2;
        zzuo zzuoVar = (zzuo) zztwVar;
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            List list = (List) this.zzc.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list.size()) {
                    zztwVar2 = ((zzuq) list.get(i11)).zzb;
                    if (zztwVar2.equals(zztwVar)) {
                        list.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
            this.zzb[i10].zzG(zzuoVar.zzn(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final zztw zzI(zzty zztyVar, zzye zzyeVar, long j10) {
        zzbn[] zzbnVarArr = this.zzd;
        int length = this.zzb.length;
        zztw[] zztwVarArr = new zztw[length];
        int zza2 = zzbnVarArr[0].zza(zztyVar.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zzty zza3 = zztyVar.zza(this.zzd[i10].zzf(zza2));
            zztwVarArr[i10] = this.zzb[i10].zzI(zza3, zzyeVar, j10 - this.zzg[zza2][i10]);
            ((List) this.zzc.get(i10)).add(new zzuq(zza3, zztwVarArr[i10], null));
        }
        return new zzuo(this.zzi, this.zzg[zza2], zztwVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final zzap zzJ() {
        zzua[] zzuaVarArr = this.zzb;
        return zzuaVarArr.length > 0 ? zzuaVarArr[0].zzJ() : zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzsx
    public final void zzn(zzgr zzgrVar) {
        super.zzn(zzgrVar);
        int i10 = 0;
        while (true) {
            zzua[] zzuaVarArr = this.zzb;
            if (i10 >= zzuaVarArr.length) {
                return;
            }
            zzB(Integer.valueOf(i10), zzuaVarArr[i10]);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzsx
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        this.zze.clear();
        Collections.addAll(this.zze, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zzua
    public final void zzt(zzap zzapVar) {
        this.zzb[0].zzt(zzapVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zztg
    public final /* bridge */ /* synthetic */ zzty zzy(Object obj, zzty zztyVar) {
        zzty zztyVar2;
        zzty zztyVar3;
        List list = (List) this.zzc.get(((Integer) obj).intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            zztyVar2 = ((zzuq) list.get(i10)).zza;
            if (zztyVar2.equals(zztyVar)) {
                zztyVar3 = ((zzuq) ((List) this.zzc.get(0)).get(i10)).zza;
                return zztyVar3;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzua
    public final void zzz() throws IOException {
        zzup zzupVar = this.zzh;
        if (zzupVar == null) {
            super.zzz();
            return;
        }
        throw zzupVar;
    }
}
