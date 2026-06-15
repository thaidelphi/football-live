package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbks;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzes extends zzbks {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzeu f11264a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzes(zzeu zzeuVar, zzet zzetVar) {
        this.f11264a = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    public final void zzb(List list) throws RemoteException {
        int i10;
        ArrayList arrayList;
        synchronized (zzeu.h(this.f11264a)) {
            zzeu.k(this.f11264a, false);
            zzeu.j(this.f11264a, true);
            arrayList = new ArrayList(zzeu.i(this.f11264a));
            zzeu.i(this.f11264a).clear();
        }
        InitializationStatus f10 = zzeu.f(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(f10);
        }
    }
}
