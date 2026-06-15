package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgtp {
    public static final zzgtp zza = new zzgtp(new zzgtq());
    public static final zzgtp zzb = new zzgtp(new zzgtu());
    private final zzgtn zzc;

    static {
        new zzgtp(new zzgtw());
        new zzgtp(new zzgtv());
        new zzgtp(new zzgtr());
        new zzgtp(new zzgtt());
        new zzgtp(new zzgts());
    }

    public zzgtp(zzgtx zzgtxVar) {
        zzgtn zzgtmVar;
        if (zzgjl.zzb()) {
            zzgtmVar = new zzgtm(zzgtxVar, null);
        } else {
            zzgtmVar = "The Android Project".equals(System.getProperty("java.vendor")) ? new zzgtk(zzgtxVar, null) : new zzgtl(zzgtxVar, null);
        }
        this.zzc = zzgtmVar;
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzc.zza(str);
    }
}
