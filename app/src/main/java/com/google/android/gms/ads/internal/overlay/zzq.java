package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzq implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final long f11360a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(long j10) {
        this.f11360a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ConcurrentHashMap concurrentHashMap;
        long j10 = this.f11360a;
        concurrentHashMap = AdOverlayInfoParcel.f11317b;
        if (concurrentHashMap.remove(Long.valueOf(j10)) != null) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
            return null;
        }
        return null;
    }
}
