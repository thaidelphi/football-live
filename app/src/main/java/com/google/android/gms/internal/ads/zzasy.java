package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzasy implements Runnable {
    private zzasy() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzasy(zzasz zzaszVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzata.zzd(MessageDigest.getInstance("MD5"));
            countDownLatch = zzata.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzata.zzb;
        } catch (Throwable th) {
            zzata.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
