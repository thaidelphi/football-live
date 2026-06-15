package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbsa;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbtc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzac extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f11144b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzaz f11145c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzaz zzazVar, Activity activity) {
        this.f11144b = activity;
        this.f11145c = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11144b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzn(ObjectWrapper.u0(this.f11144b));
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbtc zzbtcVar;
        zzbsa zzbsaVar;
        zzbbm.zza(this.f11144b);
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkD)).booleanValue()) {
            try {
                return zzbsc.zzI(((zzbsg) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.f11144b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzab
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        return zzbsf.zzb((IBinder) obj);
                    }
                })).zze(ObjectWrapper.u0(this.f11144b)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e8) {
                this.f11145c.f11197g = zzbta.zza(this.f11144b.getApplicationContext());
                zzbtcVar = this.f11145c.f11197g;
                zzbtcVar.zzh(e8, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        zzaz zzazVar = this.f11145c;
        Activity activity = this.f11144b;
        zzbsaVar = zzazVar.f11195e;
        return zzbsaVar.zza(activity);
    }
}
