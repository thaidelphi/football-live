package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzfg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzfh f11289a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfg(zzfh zzfhVar) {
        this.f11289a = zzfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbk zzbkVar;
        zzbk zzbkVar2;
        zzfh zzfhVar = this.f11289a;
        zzbkVar = zzfhVar.f11290a;
        if (zzbkVar != null) {
            try {
                zzbkVar2 = zzfhVar.f11290a;
                zzbkVar2.zze(1);
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e8);
            }
        }
    }
}
