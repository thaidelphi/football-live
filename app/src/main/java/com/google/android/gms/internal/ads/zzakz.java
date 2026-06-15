package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzakz implements zzajg {
    private final zzdx zza = new zzdx();
    private final zzakp zzb = new zzakp();

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(byte[] bArr, int i10, int i11, zzajf zzajfVar, zzda zzdaVar) {
        this.zza.zzJ(bArr, i11 + i10);
        this.zza.zzL(i10);
        ArrayList arrayList = new ArrayList();
        try {
            zzdx zzdxVar = this.zza;
            int zzd = zzdxVar.zzd();
            String zzz = zzdxVar.zzz(StandardCharsets.UTF_8);
            if (zzz != null && zzz.startsWith("WEBVTT")) {
                do {
                } while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8)));
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    zzdx zzdxVar2 = this.zza;
                    char c10 = 65535;
                    int i12 = 0;
                    while (c10 == 65535) {
                        i12 = zzdxVar2.zzd();
                        String zzz2 = zzdxVar2.zzz(StandardCharsets.UTF_8);
                        if (zzz2 == null) {
                            c10 = 0;
                        } else if ("STYLE".equals(zzz2)) {
                            c10 = 2;
                        } else {
                            c10 = zzz2.startsWith("NOTE") ? (char) 1 : (char) 3;
                        }
                    }
                    zzdxVar2.zzL(i12);
                    if (c10 == 0) {
                        zzaja.zza(new zzalc(arrayList2), zzajfVar, zzdaVar);
                        return;
                    } else if (c10 == 1) {
                        do {
                        } while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8)));
                    } else if (c10 == 2) {
                        if (arrayList2.isEmpty()) {
                            this.zza.zzz(StandardCharsets.UTF_8);
                            arrayList.addAll(this.zzb.zzb(this.zza));
                        } else {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                    } else {
                        zzakr zzc = zzaky.zzc(this.zza, arrayList);
                        if (zzc != null) {
                            arrayList2.add(zzc);
                        }
                    }
                }
            } else {
                zzdxVar.zzL(zzd);
                throw zzaz.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzdxVar.zzz(StandardCharsets.UTF_8))), null);
            }
        } catch (zzaz e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
