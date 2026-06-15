package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzats implements zzfnj {
    final /* synthetic */ zzfll zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzats(zzatu zzatuVar, zzfll zzfllVar) {
        this.zza = zzfllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
