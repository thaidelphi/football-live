package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjk;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbjt;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbod;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzak extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11152b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbod f11153c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ OnH5AdsEventListener f11154d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzak(zzaz zzazVar, Context context, zzbod zzbodVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.f11152b = context;
        this.f11153c = zzbodVar;
        this.f11154d = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* synthetic */ Object zza() {
        return new zzbjx();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzl(ObjectWrapper.u0(this.f11152b), this.f11153c, 250505300, new zzbjk(this.f11154d));
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbjt) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.f11152b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaj
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    return zzbjs.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.u0(this.f11152b), this.f11153c, 250505300, new zzbjk(this.f11154d));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
