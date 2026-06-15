package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzuo implements zztw, zztv {
    private final zztw[] zza;
    private zztv zze;
    private zzwd zzf;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzvu zzh = new zzti(zzfvv.zzn(), zzfvv.zzn());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zztw[] zzg = new zztw[0];

    public zzuo(zztj zztjVar, long[] jArr, zztw... zztwVarArr) {
        this.zza = zztwVarArr;
        for (int i10 = 0; i10 < zztwVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zza[i10] = new zzwa(zztwVarArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zza(long j10, zzlg zzlgVar) {
        zztw[] zztwVarArr = this.zzg;
        return (zztwVarArr.length > 0 ? zztwVarArr[0] : this.zza[0]).zza(j10, zzlgVar);
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zzd() {
        zztw[] zztwVarArr;
        zztw[] zztwVarArr2;
        long j10 = -9223372036854775807L;
        for (zztw zztwVar : this.zzg) {
            long zzd = zztwVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (zztw zztwVar2 : this.zzg) {
                        if (zztwVar2 == zztwVar) {
                            break;
                        } else if (zztwVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = zzd;
                } else if (zzd != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && zztwVar.zze(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zze(long j10) {
        long zze = this.zzg[0].zze(j10);
        int i10 = 1;
        while (true) {
            zztw[] zztwVarArr = this.zzg;
            if (i10 >= zztwVarArr.length) {
                return zze;
            }
            if (zztwVarArr[i10].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zzf(zzxp[] zzxpVarArr, boolean[] zArr, zzvs[] zzvsVarArr, boolean[] zArr2, long j10) {
        int length;
        int length2 = zzxpVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzxpVarArr.length;
            if (i11 >= length) {
                break;
            }
            zzvs zzvsVar = zzvsVarArr[i11];
            Integer num = zzvsVar != null ? (Integer) this.zzb.get(zzvsVar) : null;
            iArr[i11] = num == null ? -1 : num.intValue();
            zzxp zzxpVar = zzxpVarArr[i11];
            if (zzxpVar != null) {
                String str = zzxpVar.zzg().zzb;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.zzb.clear();
        zzvs[] zzvsVarArr2 = new zzvs[length];
        zzvs[] zzvsVarArr3 = new zzvs[length];
        zzxp[] zzxpVarArr2 = new zzxp[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.zza.length) {
            for (int i13 = i10; i13 < zzxpVarArr.length; i13++) {
                zzvsVarArr3[i13] = iArr[i13] == i12 ? zzvsVarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    zzxp zzxpVar2 = zzxpVarArr[i13];
                    Objects.requireNonNull(zzxpVar2);
                    zzbo zzboVar = (zzbo) this.zzd.get(zzxpVar2.zzg());
                    Objects.requireNonNull(zzboVar);
                    zzxpVarArr2[i13] = new zzun(zzxpVar2, zzboVar);
                } else {
                    zzxpVarArr2[i13] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzxp[] zzxpVarArr3 = zzxpVarArr2;
            zzvs[] zzvsVarArr4 = zzvsVarArr3;
            long zzf = this.zza[i12].zzf(zzxpVarArr2, zArr, zzvsVarArr3, zArr2, j11);
            if (i12 == 0) {
                j11 = zzf;
            } else if (zzf != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < zzxpVarArr.length; i14++) {
                if (iArr2[i14] == i12) {
                    zzvs zzvsVar2 = zzvsVarArr4[i14];
                    Objects.requireNonNull(zzvsVar2);
                    zzvsVarArr2[i14] = zzvsVar2;
                    this.zzb.put(zzvsVar2, Integer.valueOf(i12));
                    z10 = true;
                } else if (iArr[i14] == i12) {
                    zzcv.zzf(zzvsVarArr4[i14] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.zza[i12]);
            }
            i12++;
            arrayList = arrayList2;
            zzxpVarArr2 = zzxpVarArr3;
            zzvsVarArr3 = zzvsVarArr4;
            i10 = 0;
        }
        int i15 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzvsVarArr2, i15, zzvsVarArr, i15, length);
        this.zzg = (zztw[]) arrayList3.toArray(new zztw[i15]);
        this.zzh = new zzti(arrayList3, zzfwl.zzb(arrayList3, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzum
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return ((zztw) obj).zzg().zzc();
            }
        }));
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final zzwd zzg() {
        zzwd zzwdVar = this.zzf;
        Objects.requireNonNull(zzwdVar);
        return zzwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    public final /* bridge */ /* synthetic */ void zzh(zzvu zzvuVar) {
        zztw zztwVar = (zztw) zzvuVar;
        zztv zztvVar = this.zze;
        Objects.requireNonNull(zztvVar);
        zztvVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzi(long j10, boolean z10) {
        for (zztw zztwVar : this.zzg) {
            zztwVar.zzi(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzj(zztw zztwVar) {
        this.zzc.remove(zztwVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (zztw zztwVar2 : this.zza) {
            i10 += zztwVar2.zzg().zzb;
        }
        zzbo[] zzboVarArr = new zzbo[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            zztw[] zztwVarArr = this.zza;
            if (i11 < zztwVarArr.length) {
                zzwd zzg = zztwVarArr[i11].zzg();
                int i13 = zzg.zzb;
                int i14 = 0;
                while (i14 < i13) {
                    zzbo zzb = zzg.zzb(i14);
                    zzz[] zzzVarArr = new zzz[zzb.zza];
                    for (int i15 = 0; i15 < zzb.zza; i15++) {
                        zzz zzb2 = zzb.zzb(i15);
                        zzx zzb3 = zzb2.zzb();
                        String str = zzb2.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzb3.zzO(i11 + ":" + str);
                        zzzVarArr[i15] = zzb3.zzaj();
                    }
                    zzbo zzboVar = new zzbo(i11 + ":" + zzb.zzb, zzzVarArr);
                    this.zzd.put(zzboVar, zzb);
                    zzboVarArr[i12] = zzboVar;
                    i14++;
                    i12++;
                }
                i11++;
            } else {
                this.zzf = new zzwd(zzboVarArr);
                zztv zztvVar = this.zze;
                Objects.requireNonNull(zztvVar);
                zztvVar.zzj(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzk() throws IOException {
        int i10 = 0;
        while (true) {
            zztw[] zztwVarArr = this.zza;
            if (i10 >= zztwVarArr.length) {
                return;
            }
            zztwVarArr[i10].zzk();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzl(zztv zztvVar, long j10) {
        this.zze = zztvVar;
        Collections.addAll(this.zzc, this.zza);
        int i10 = 0;
        while (true) {
            zztw[] zztwVarArr = this.zza;
            if (i10 >= zztwVarArr.length) {
                return;
            }
            zztwVarArr[i10].zzl(this, j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final void zzm(long j10) {
        this.zzh.zzm(j10);
    }

    public final zztw zzn(int i10) {
        zztw zztwVar = this.zza[i10];
        return zztwVar instanceof zzwa ? ((zzwa) zztwVar).zzn() : zztwVar;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final boolean zzo(zzka zzkaVar) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((zztw) this.zzc.get(i10)).zzo(zzkaVar);
            }
            return false;
        }
        return this.zzh.zzo(zzkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
