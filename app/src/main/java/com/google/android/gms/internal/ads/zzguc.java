package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzguc extends ThreadLocal {
    final /* synthetic */ zzgud zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzguc(zzgud zzgudVar) {
        this.zza = zzgudVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgtp zzgtpVar = zzgtp.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzgtpVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
