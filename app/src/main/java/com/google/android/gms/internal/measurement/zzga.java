package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzga extends zzke implements zzlm {
    private static final zzga zza;
    private zzkl zze = zzke.zzbD();

    static {
        zzga zzgaVar = new zzga();
        zza = zzgaVar;
        zzke.zzbJ(zzga.class, zzgaVar);
    }

    private zzga() {
    }

    public static zzfz zza() {
        return (zzfz) zza.zzbx();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzga zzgaVar, zzgc zzgcVar) {
        zzgcVar.getClass();
        zzkl zzklVar = zzgaVar.zze;
        if (!zzklVar.zzc()) {
            zzgaVar.zze = zzke.zzbE(zzklVar);
        }
        zzgaVar.zze.add(zzgcVar);
    }

    public final zzgc zzc(int i10) {
        return (zzgc) this.zze.get(0);
    }

    public final List zzd() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzfz(null);
                }
                return new zzga();
            }
            return zzke.zzbI(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgc.class});
        }
        return (byte) 1;
    }
}
