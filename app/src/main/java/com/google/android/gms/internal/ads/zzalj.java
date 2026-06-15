package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.protobuf.CodedOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalj implements zzamz {
    private final List zza;

    public zzalj() {
        this(0);
    }

    public zzalj(int i10, List list) {
        this.zza = list;
    }

    private final zzamq zzc(zzamy zzamyVar) {
        return new zzamq(zze(zzamyVar), "video/mp2t");
    }

    private final zzand zzd(zzamy zzamyVar) {
        return new zzand(zze(zzamyVar), "video/mp2t");
    }

    private final List zze(zzamy zzamyVar) {
        String str;
        int i10;
        List list;
        zzdx zzdxVar = new zzdx(zzamyVar.zze);
        List list2 = this.zza;
        while (zzdxVar.zzb() > 0) {
            int zzm = zzdxVar.zzm();
            int zzd = zzdxVar.zzd() + zzdxVar.zzm();
            if (zzm == 134) {
                list2 = new ArrayList();
                int zzm2 = zzdxVar.zzm() & 31;
                for (int i11 = 0; i11 < zzm2; i11++) {
                    String zzB = zzdxVar.zzB(3, StandardCharsets.UTF_8);
                    int zzm3 = zzdxVar.zzm();
                    boolean z10 = (zzm3 & 128) != 0;
                    if (z10) {
                        i10 = zzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte zzm4 = (byte) zzdxVar.zzm();
                    zzdxVar.zzM(1);
                    if (z10) {
                        int i12 = zzm4 & 64;
                        int i13 = zzcx.zza;
                        list = Collections.singletonList(i12 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzx zzxVar = new zzx();
                    zzxVar.zzad(str);
                    zzxVar.zzS(zzB);
                    zzxVar.zzz(i10);
                    zzxVar.zzP(list);
                    list2.add(zzxVar.zzaj());
                }
            }
            zzdxVar.zzL(zzd);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final zzanb zzb(int i10, zzamy zzamyVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new zzamg(new zzaly(zzamyVar.zzb, zzamyVar.zza(), "video/mp2t"));
            }
            if (i10 == 21) {
                return new zzamg(new zzalw("video/mp2t"));
            }
            if (i10 == 27) {
                return new zzamg(new zzalt(zzc(zzamyVar), false, false, "video/mp2t"));
            }
            if (i10 == 36) {
                return new zzamg(new zzalv(zzc(zzamyVar), "video/mp2t"));
            }
            if (i10 == 45) {
                return new zzamg(new zzalz("video/mp2t"));
            }
            if (i10 == 89) {
                return new zzamg(new zzall(zzamyVar.zzd, "video/mp2t"));
            }
            if (i10 == 172) {
                return new zzamg(new zzalg(zzamyVar.zzb, zzamyVar.zza(), "video/mp2t"));
            }
            if (i10 == 257) {
                return new zzamo(new zzamf("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 != 138) {
                        if (i10 != 139) {
                            switch (i10) {
                                case 15:
                                    return new zzamg(new zzali(false, zzamyVar.zzb, zzamyVar.zza(), "video/mp2t"));
                                case 16:
                                    return new zzamg(new zzalr(zzd(zzamyVar), "video/mp2t"));
                                case 17:
                                    return new zzamg(new zzalx(zzamyVar.zzb, zzamyVar.zza(), "video/mp2t"));
                                default:
                                    switch (i10) {
                                        case 134:
                                            return new zzamo(new zzamf("application/x-scte35", "video/mp2t"));
                                        case 135:
                                            break;
                                        case 136:
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        } else {
                            return new zzamg(new zzalk(zzamyVar.zzb, zzamyVar.zza(), 5408, "video/mp2t"));
                        }
                    }
                    return new zzamg(new zzalk(zzamyVar.zzb, zzamyVar.zza(), CodedOutputStream.DEFAULT_BUFFER_SIZE, "video/mp2t"));
                }
                return new zzamg(new zzale(zzamyVar.zzb, zzamyVar.zza(), "video/mp2t"));
            }
        }
        return new zzamg(new zzalo(zzd(zzamyVar), "video/mp2t"));
    }

    public zzalj(int i10) {
        this.zza = zzfvv.zzn();
    }
}
