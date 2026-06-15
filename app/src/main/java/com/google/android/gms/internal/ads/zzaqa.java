package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaqa extends zzhcv {
    static {
        zzhdc.zzb(zzaqa.class);
    }

    public zzaqa(zzhcw zzhcwVar, zzapz zzapzVar) throws IOException {
        zze(zzhcwVar, zzhcwVar.zzc(), zzapzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
