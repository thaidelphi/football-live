package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzan extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11165b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzr f11166c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f11167d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzaz f11168e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(zzaz zzazVar, Context context, zzr zzrVar, String str) {
        this.f11165b = context;
        this.f11166c = zzrVar;
        this.f11167d = str;
        this.f11168e = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11165b, AppLovinEventTypes.USER_EXECUTED_SEARCH);
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzf(ObjectWrapper.u0(this.f11165b), this.f11166c, this.f11167d, 250505300);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.f11168e.f11191a;
        return zzkVar.zza(this.f11165b, this.f11166c, this.f11167d, null, 3);
    }
}
