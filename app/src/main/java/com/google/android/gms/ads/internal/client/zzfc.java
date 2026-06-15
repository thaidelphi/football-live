package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzfc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzfd f11286a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfc(zzfd zzfdVar) {
        this.f11286a = zzfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzff zzffVar = this.f11286a.f11287a;
        if (zzff.Z(zzffVar) != null) {
            try {
                zzff.Z(zzffVar).zze(1);
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e8);
            }
        }
    }
}
