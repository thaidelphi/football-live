package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzri extends Handler {
    final /* synthetic */ zzrk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzri(zzrk zzrkVar, Looper looper) {
        super(looper);
        this.zza = zzrkVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzrk.zza(this.zza, message);
    }
}
