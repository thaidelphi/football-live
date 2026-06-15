package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbod;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzal extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11155b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzr f11156c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f11157d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzbod f11158e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzaz f11159f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(zzaz zzazVar, Context context, zzr zzrVar, String str, zzbod zzbodVar) {
        this.f11155b = context;
        this.f11156c = zzrVar;
        this.f11157d = str;
        this.f11158e = zzbodVar;
        this.f11159f = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11155b, "banner");
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzd(ObjectWrapper.u0(this.f11155b), this.f11156c, this.f11157d, this.f11158e, 250505300);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.f11159f.f11191a;
        return zzkVar.zza(this.f11155b, this.f11156c, this.f11157d, this.f11158e, 1);
    }
}
