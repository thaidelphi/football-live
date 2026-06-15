package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbod;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzam extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11160b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzr f11161c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f11162d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzbod f11163e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzaz f11164f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzam(zzaz zzazVar, Context context, zzr zzrVar, String str, zzbod zzbodVar) {
        this.f11160b = context;
        this.f11161c = zzrVar;
        this.f11162d = str;
        this.f11163e = zzbodVar;
        this.f11164f = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11160b, "app_open");
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzc(ObjectWrapper.u0(this.f11160b), this.f11161c, this.f11162d, this.f11163e, 250505300);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.f11164f.f11191a;
        return zzkVar.zza(this.f11160b, this.f11161c, this.f11162d, this.f11163e, 4);
    }
}
