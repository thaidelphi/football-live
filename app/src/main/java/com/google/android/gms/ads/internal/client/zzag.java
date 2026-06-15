package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbxp;
import com.google.android.gms.internal.ads.zzbxq;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzag extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11148b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbod f11149c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(zzaz zzazVar, Context context, zzbod zzbodVar) {
        this.f11148b = context;
        this.f11149c = zzbodVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzq(ObjectWrapper.u0(this.f11148b), this.f11149c, 250505300);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbxq) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.f11148b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaf
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    return zzbxp.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.u0(this.f11148b), this.f11149c, 250505300);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
