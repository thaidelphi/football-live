package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbod;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzao extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11169b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzr f11170c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f11171d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzbod f11172e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzaz f11173f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(zzaz zzazVar, Context context, zzr zzrVar, String str, zzbod zzbodVar) {
        this.f11169b = context;
        this.f11170c = zzrVar;
        this.f11171d = str;
        this.f11172e = zzbodVar;
        this.f11173f = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11169b, "interstitial");
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zze(ObjectWrapper.u0(this.f11169b), this.f11170c, this.f11171d, this.f11172e, 250505300);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.f11173f.f11191a;
        return zzkVar.zza(this.f11169b, this.f11170c, this.f11171d, this.f11172e, 2);
    }
}
