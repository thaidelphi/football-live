package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgkl {
    private ArrayList zza = new ArrayList();
    private zzgki zzb = zzgki.zza;
    private Integer zzc = null;

    public final zzgkl zza(zzgch zzgchVar, int i10, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzgkm(zzgchVar, i10, str, str2, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzgkl zzb(zzgki zzgkiVar) {
        if (this.zza != null) {
            this.zzb = zzgkiVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzgkl zzc(int i10) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i10);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzgko zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int zza = ((zzgkm) arrayList.get(i10)).zza();
                    i10++;
                    if (zza == intValue) {
                        zzgko zzgkoVar = new zzgko(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
                        this.zza = null;
                        return zzgkoVar;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzgko zzgkoVar2 = new zzgko(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
            this.zza = null;
            return zzgkoVar2;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
