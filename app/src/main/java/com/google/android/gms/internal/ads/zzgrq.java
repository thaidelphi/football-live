package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgrq extends zzgwk implements zzgxw {
    private static final zzgrq zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgww zzd = zzgwk.zzbK();

    static {
        zzgrq zzgrqVar = new zzgrq();
        zza = zzgrqVar;
        zzgwk.zzbZ(zzgrq.class, zzgrqVar);
    }

    private zzgrq() {
    }

    public static zzgrm zzc() {
        return (zzgrm) zza.zzaZ();
    }

    public static zzgrq zzg(InputStream inputStream, zzgvu zzgvuVar) throws IOException {
        return (zzgrq) zzgwk.zzbu(zza, inputStream, zzgvuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzgrq zzgrqVar, zzgro zzgroVar) {
        zzgroVar.getClass();
        zzgww zzgwwVar = zzgrqVar.zzd;
        if (!zzgwwVar.zzc()) {
            zzgrqVar.zzd = zzgwk.zzbL(zzgwwVar);
        }
        zzgrqVar.zzd.add(zzgroVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzgro zzd(int i10) {
        return (zzgro) this.zzd.get(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected final Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2) {
        int ordinal = zzgwjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                zzgyd zzgydVar = zzb;
                                if (zzgydVar == null) {
                                    synchronized (zzgrq.class) {
                                        zzgydVar = zzb;
                                        if (zzgydVar == null) {
                                            zzgydVar = new zzgwf(zza);
                                            zzb = zzgydVar;
                                        }
                                    }
                                }
                                return zzgydVar;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new zzgrm(null);
                }
                return new zzgrq();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgro.class});
        }
        return (byte) 1;
    }

    public final List zzh() {
        return this.zzd;
    }
}
