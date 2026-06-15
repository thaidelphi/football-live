package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzaz extends IOException {
    public final boolean zza;
    public final int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaz(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.zza = z10;
        this.zzb = i10;
    }

    public static zzaz zza(String str, Throwable th) {
        return new zzaz(str, th, true, 1);
    }

    public static zzaz zzb(String str, Throwable th) {
        return new zzaz(str, th, true, 0);
    }

    public static zzaz zzc(String str) {
        return new zzaz(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        return message + " {contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
