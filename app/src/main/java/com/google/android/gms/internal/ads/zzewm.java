package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzewm implements zzexl {
    private zzctl zza;
    private final Executor zzb = zzgbh.zzc();

    public final zzctl zza() {
        return this.zza;
    }

    public final b6.a zzb(zzexm zzexmVar, zzexk zzexkVar, zzctl zzctlVar) {
        zzctk zza = zzexkVar.zza(zzexmVar.zzb);
        zza.zzb(new zzexp(true));
        zzctl zzctlVar2 = (zzctl) zza.zzh();
        this.zza = zzctlVar2;
        final zzcqp zzb = zzctlVar2.zzb();
        final zzfcl zzfclVar = new zzfcl();
        return (zzgag) zzgap.zzm((zzgag) zzgap.zzn(zzgag.zzu(zzb.zzi()), new zzfzw(this) { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                zzfag zzfagVar = (zzfag) obj;
                zzfclVar.zzb = zzfagVar;
                Iterator it = zzfagVar.zzb.zza.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : ((zzezu) it.next()).zza) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return zzb.zzh(zzgap.zzh(zzfagVar));
                    }
                }
                return zzgap.zzh(null);
            }
        }, this.zzb), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzewl
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzfcl zzfclVar2 = zzfcl.this;
                zzfclVar2.zzc = (zzcpl) obj;
                return zzfclVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzexl
    public final /* bridge */ /* synthetic */ b6.a zzc(zzexm zzexmVar, zzexk zzexkVar, Object obj) {
        return zzb(zzexmVar, zzexkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzexl
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
