package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaia {
    private static final zzftk zza = zzftk.zzb(zzfsg.zzc(':'));
    private static final zzftk zzb = zzftk.zzb(zzfsg.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zza(zzack zzackVar, zzadf zzadfVar, List list) throws IOException {
        int i10;
        boolean z10;
        char c10;
        int i11 = this.zzd;
        if (i11 == 0) {
            long zzd = zzackVar.zzd();
            zzadfVar.zza = (zzd == -1 || zzd < 8) ? 0L : zzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i12 = 2;
        if (i11 != 1) {
            char c11 = 2819;
            short s10 = 2817;
            short s11 = 2816;
            short s12 = 2192;
            if (i11 != 2) {
                long zzf = zzackVar.zzf();
                int zzd2 = (int) ((zzackVar.zzd() - zzackVar.zzf()) - this.zze);
                zzdx zzdxVar = new zzdx(zzd2);
                zzackVar.zzi(zzdxVar.zzN(), 0, zzd2);
                int i13 = 0;
                while (i13 < this.zzc.size()) {
                    zzahz zzahzVar = (zzahz) this.zzc.get(i13);
                    zzdxVar.zzL((int) (zzahzVar.zza - zzf));
                    zzdxVar.zzM(4);
                    int zzi = zzdxVar.zzi();
                    String zzB = zzdxVar.zzB(zzi, StandardCharsets.UTF_8);
                    switch (zzB.hashCode()) {
                        case -1711564334:
                            if (zzB.equals("SlowMotion_Data")) {
                                z10 = false;
                                break;
                            }
                            z10 = true;
                            break;
                        case -1332107749:
                            if (zzB.equals("Super_SlowMotion_Edit_Data")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case -1251387154:
                            if (zzB.equals("Super_SlowMotion_Data")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case -830665521:
                            if (zzB.equals("Super_SlowMotion_Deflickering_On")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 1760745220:
                            if (zzB.equals("Super_SlowMotion_BGM")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        default:
                            z10 = true;
                            break;
                    }
                    if (!z10) {
                        c10 = 2192;
                    } else if (z10) {
                        c10 = 2816;
                    } else if (z10) {
                        c10 = 2817;
                    } else if (z10) {
                        c10 = c11;
                    } else if (!z10) {
                        throw zzaz.zza("Invalid SEF name", null);
                    } else {
                        c10 = 2820;
                    }
                    int i14 = zzahzVar.zzb - (zzi + 8);
                    if (c10 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List zzf2 = zzb.zzf(zzdxVar.zzB(i14, StandardCharsets.UTF_8));
                        for (int i15 = 0; i15 < zzf2.size(); i15++) {
                            List zzf3 = zza.zzf((CharSequence) zzf2.get(i15));
                            if (zzf3.size() == 3) {
                                try {
                                    arrayList.add(new zzagb(Long.parseLong((String) zzf3.get(0)), Long.parseLong((String) zzf3.get(1)), 1 << (Integer.parseInt((String) zzf3.get(2)) - 1)));
                                } catch (NumberFormatException e8) {
                                    throw zzaz.zza(null, e8);
                                }
                            } else {
                                throw zzaz.zza(null, null);
                            }
                        }
                        list.add(new zzagc(arrayList));
                    } else if (c10 != 2816 && c10 != 2817 && c10 != c11 && c10 != 2820) {
                        throw new IllegalStateException();
                    }
                    i13++;
                    c11 = 2819;
                }
                zzadfVar.zza = 0L;
                return 1;
            }
            long zzd3 = zzackVar.zzd();
            int i16 = this.zze - 20;
            zzdx zzdxVar2 = new zzdx(i16);
            zzackVar.zzi(zzdxVar2.zzN(), 0, i16);
            int i17 = 0;
            while (i17 < i16 / 12) {
                zzdxVar2.zzM(i12);
                short zzD = zzdxVar2.zzD();
                if (zzD != s12 && zzD != s11 && zzD != s10 && zzD != 2819 && zzD != 2820) {
                    zzdxVar2.zzM(8);
                    i10 = i16;
                } else {
                    i10 = i16;
                    this.zzc.add(new zzahz(zzD, (zzd3 - this.zze) - zzdxVar2.zzi(), zzdxVar2.zzi()));
                }
                i17++;
                i16 = i10;
                i12 = 2;
                s10 = 2817;
                s11 = 2816;
                s12 = 2192;
            }
            if (this.zzc.isEmpty()) {
                zzadfVar.zza = 0L;
            } else {
                this.zzd = 3;
                zzadfVar.zza = ((zzahz) this.zzc.get(0)).zza;
            }
        } else {
            zzdx zzdxVar3 = new zzdx(8);
            zzackVar.zzi(zzdxVar3.zzN(), 0, 8);
            this.zze = zzdxVar3.zzi() + 8;
            if (zzdxVar3.zzg() != 1397048916) {
                zzadfVar.zza = 0L;
            } else {
                zzadfVar.zza = zzackVar.zzf() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}
