package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgvj implements zzgyi {
    private final zzgvi zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgvj(zzgvi zzgviVar) {
        zzgwx.zzc(zzgviVar, "input");
        this.zza = zzgviVar;
        zzgviVar.zzd = this;
    }

    private final void zzO(Object obj, zzgyo zzgyoVar, zzgvu zzgvuVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgyoVar.zzh(obj, this, zzgvuVar);
            if (this.zzb == this.zzc) {
                return;
            }
            throw new zzgwz("Failed to parse the message.");
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzP(Object obj, zzgyo zzgyoVar, zzgvu zzgvuVar) throws IOException {
        zzgvi zzgviVar;
        zzgvi zzgviVar2 = this.zza;
        int zzm = zzgviVar2.zzm();
        if (zzgviVar2.zzb < zzgviVar2.zzc) {
            int zzd = this.zza.zzd(zzm);
            this.zza.zzb++;
            zzgyoVar.zzh(obj, this, zzgvuVar);
            this.zza.zzy(0);
            zzgviVar.zzb--;
            this.zza.zzz(zzd);
            return;
        }
        throw new zzgwz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    private final void zzQ(int i10) throws IOException {
        if (this.zza.zzc() != i10) {
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw new zzgwy("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw new zzgwz("Failed to parse the message.");
        }
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw new zzgwz("Failed to parse the message.");
        }
    }

    public static zzgvj zzq(zzgvi zzgviVar) {
        zzgvj zzgvjVar = zzgviVar.zzd;
        return zzgvjVar != null ? zzgvjVar : new zzgvj(zzgviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzA(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgxk) {
            zzgxk zzgxkVar = (zzgxk) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = zzm + this.zza.zzc();
                    do {
                        zzgxkVar.zzg(this.zza.zzn());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxkVar.zzg(this.zza.zzn());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = zzm2 + this.zza.zzc();
                    do {
                        list.add(Long.valueOf(this.zza.zzn()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzB(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgwb) {
            zzgwb zzgwbVar = (zzgwb) list;
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgwbVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            } else if (i11 != 5) {
                throw new zzgwy("Protocol message tag had invalid wire type.");
            } else {
                do {
                    zzgwbVar.zzh(this.zza.zzb());
                    if (this.zza.zzA()) {
                        return;
                    }
                    i10 = this.zza.zzl();
                } while (i10 == this.zzb);
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc2);
                return;
            } else if (i12 != 5) {
                throw new zzgwy("Protocol message tag had invalid wire type.");
            } else {
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                    if (this.zza.zzA()) {
                        return;
                    }
                    zzl = this.zza.zzl();
                } while (zzl == this.zzb);
                i10 = zzl;
            }
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    @Deprecated
    public final void zzC(List list, zzgyo zzgyoVar, zzgvu zzgvuVar) throws IOException {
        int zzl;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                Object zze = zzgyoVar.zze();
                zzO(zze, zzgyoVar, zzgvuVar);
                zzgyoVar.zzf(zze);
                list.add(zze);
                if (this.zza.zzA() || this.zzd != 0) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == i10);
            this.zzd = zzl;
            return;
        }
        throw new zzgwy("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzD(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgvi zzgviVar = this.zza;
                    int zzc = zzgviVar.zzc() + zzgviVar.zzm();
                    do {
                        zzgwlVar.zzi(this.zza.zzg());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgwlVar.zzi(this.zza.zzg());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgvi zzgviVar2 = this.zza;
                    int zzc2 = zzgviVar2.zzc() + zzgviVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzg()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzE(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgxk) {
            zzgxk zzgxkVar = (zzgxk) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgvi zzgviVar = this.zza;
                    int zzc = zzgviVar.zzc() + zzgviVar.zzm();
                    do {
                        zzgxkVar.zzg(this.zza.zzo());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxkVar.zzg(this.zza.zzo());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgvi zzgviVar2 = this.zza;
                    int zzc2 = zzgviVar2.zzc() + zzgviVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzo()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzF(List list, zzgyo zzgyoVar, zzgvu zzgvuVar) throws IOException {
        int zzl;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                Object zze = zzgyoVar.zze();
                zzP(zze, zzgyoVar, zzgvuVar);
                zzgyoVar.zzf(zze);
                list.add(zze);
                if (this.zza.zzA() || this.zzd != 0) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == i10);
            this.zzd = zzl;
            return;
        }
        throw new zzgwy("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzG(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) list;
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgwlVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                return;
            } else if (i11 != 5) {
                throw new zzgwy("Protocol message tag had invalid wire type.");
            } else {
                do {
                    zzgwlVar.zzi(this.zza.zzj());
                    if (this.zza.zzA()) {
                        return;
                    }
                    i10 = this.zza.zzl();
                } while (i10 == this.zzb);
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc2);
                return;
            } else if (i12 != 5) {
                throw new zzgwy("Protocol message tag had invalid wire type.");
            } else {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (this.zza.zzA()) {
                        return;
                    }
                    zzl = this.zza.zzl();
                } while (zzl == this.zzb);
                i10 = zzl;
            }
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzH(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgxk) {
            zzgxk zzgxkVar = (zzgxk) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = zzm + this.zza.zzc();
                    do {
                        zzgxkVar.zzg(this.zza.zzs());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxkVar.zzg(this.zza.zzs());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = zzm2 + this.zza.zzc();
                    do {
                        list.add(Long.valueOf(this.zza.zzs()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzI(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgvi zzgviVar = this.zza;
                    int zzc = zzgviVar.zzc() + zzgviVar.zzm();
                    do {
                        zzgwlVar.zzi(this.zza.zzk());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgwlVar.zzi(this.zza.zzk());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgvi zzgviVar2 = this.zza;
                    int zzc2 = zzgviVar2.zzc() + zzgviVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzk()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzJ(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgxk) {
            zzgxk zzgxkVar = (zzgxk) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgvi zzgviVar = this.zza;
                    int zzc = zzgviVar.zzc() + zzgviVar.zzm();
                    do {
                        zzgxkVar.zzg(this.zza.zzt());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxkVar.zzg(this.zza.zzt());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgvi zzgviVar2 = this.zza;
                    int zzc2 = zzgviVar2.zzc() + zzgviVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzt()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    public final void zzK(List list, boolean z10) throws IOException {
        int zzl;
        int i10;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzgxh) && !z10) {
                zzgxh zzgxhVar = (zzgxh) list;
                do {
                    zzp();
                    zzgxhVar.zzb();
                    if (this.zza.zzA()) {
                        return;
                    }
                    i10 = this.zza.zzl();
                } while (i10 == this.zzb);
            } else {
                do {
                    list.add(z10 ? zzs() : zzr());
                    if (this.zza.zzA()) {
                        return;
                    }
                    zzl = this.zza.zzl();
                } while (zzl == this.zzb);
                i10 = zzl;
            }
            this.zzd = i10;
            return;
        }
        throw new zzgwy("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzL(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgvi zzgviVar = this.zza;
                    int zzc = zzgviVar.zzc() + zzgviVar.zzm();
                    do {
                        zzgwlVar.zzi(this.zza.zzm());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgwlVar.zzi(this.zza.zzm());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgvi zzgviVar2 = this.zza;
                    int zzc2 = zzgviVar2.zzc() + zzgviVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzm()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzM(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgxk) {
            zzgxk zzgxkVar = (zzgxk) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgvi zzgviVar = this.zza;
                    int zzc = zzgviVar.zzc() + zzgviVar.zzm();
                    do {
                        zzgxkVar.zzg(this.zza.zzu());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxkVar.zzg(this.zza.zzu());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgvi zzgviVar2 = this.zza;
                    int zzc2 = zzgviVar2.zzc() + zzgviVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzu()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final int zzc() throws IOException {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzl();
            this.zzb = i10;
        }
        return (i10 == 0 || i10 == this.zzc) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i10 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final zzgvc zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzt(Object obj, zzgyo zzgyoVar, zzgvu zzgvuVar) throws IOException {
        zzR(3);
        zzO(obj, zzgyoVar, zzgvuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzu(Object obj, zzgyo zzgyoVar, zzgvu zzgvuVar) throws IOException {
        zzR(2);
        zzP(obj, zzgyoVar, zzgvuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzv(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgus) {
            zzgus zzgusVar = (zzgus) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgvi zzgviVar = this.zza;
                    int zzc = zzgviVar.zzc() + zzgviVar.zzm();
                    do {
                        zzgusVar.zzg(this.zza.zzB());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgusVar.zzg(this.zza.zzB());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgvi zzgviVar2 = this.zza;
                    int zzc2 = zzgviVar2.zzc() + zzgviVar2.zzm();
                    do {
                        list.add(Boolean.valueOf(this.zza.zzB()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzw(List list) throws IOException {
        int zzl;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            this.zzd = zzl;
            return;
        }
        throw new zzgwy("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzx(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgvr) {
            zzgvr zzgvrVar = (zzgvr) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = zzm + this.zza.zzc();
                    do {
                        zzgvrVar.zzh(this.zza.zza());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgvrVar.zzh(this.zza.zza());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = zzm2 + this.zza.zzc();
                    do {
                        list.add(Double.valueOf(this.zza.zza()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzy(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgvi zzgviVar = this.zza;
                    int zzc = zzgviVar.zzc() + zzgviVar.zzm();
                    do {
                        zzgwlVar.zzi(this.zza.zze());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                zzgwlVar.zzi(this.zza.zze());
                if (this.zza.zzA()) {
                    return;
                }
                i10 = this.zza.zzl();
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgvi zzgviVar2 = this.zza;
                    int zzc2 = zzgviVar2.zzc() + zzgviVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zze()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzz(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) list;
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgwlVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                return;
            } else if (i11 != 5) {
                throw new zzgwy("Protocol message tag had invalid wire type.");
            } else {
                do {
                    zzgwlVar.zzi(this.zza.zzf());
                    if (this.zza.zzA()) {
                        return;
                    }
                    i10 = this.zza.zzl();
                } while (i10 == this.zzb);
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc2);
                return;
            } else if (i12 != 5) {
                throw new zzgwy("Protocol message tag had invalid wire type.");
            } else {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzA()) {
                        return;
                    }
                    zzl = this.zza.zzl();
                } while (zzl == this.zzb);
                i10 = zzl;
            }
        }
        this.zzd = i10;
    }
}
