package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbtc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzas extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11178b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbod f11179c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzaz f11180d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(zzaz zzazVar, Context context, zzbod zzbodVar) {
        this.f11178b = context;
        this.f11179c = zzbodVar;
        this.f11180d = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11178b, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        zzch zzg = zzcoVar.zzg(ObjectWrapper.u0(this.f11178b), this.f11179c, 250505300);
        zzg.zzh(this.f11179c);
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbtc zzbtcVar;
        zzch zzcfVar;
        zzl zzlVar;
        Context context = this.f11178b;
        IObjectWrapper u02 = ObjectWrapper.u0(context);
        zzbbm.zza(context);
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkD)).booleanValue()) {
            try {
                IBinder zze = ((zzci) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.f11178b, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzar
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                        return queryLocalInterface instanceof zzci ? (zzci) queryLocalInterface : new zzci(iBinder);
                    }
                })).zze(u02, this.f11179c, 250505300);
                if (zze == null) {
                    zzcfVar = null;
                } else {
                    IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    zzcfVar = queryLocalInterface instanceof zzch ? (zzch) queryLocalInterface : new zzcf(zze);
                }
                zzcfVar.zzh(this.f11179c);
                return zzcfVar;
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e8) {
                this.f11180d.f11197g = zzbta.zza(this.f11178b);
                zzbtcVar = this.f11180d.f11197g;
                zzbtcVar.zzh(e8, "ClientApiBroker.getAdPreloader");
                return null;
            }
        }
        zzaz zzazVar = this.f11180d;
        Context context2 = this.f11178b;
        zzbod zzbodVar = this.f11179c;
        zzlVar = zzazVar.f11198h;
        return zzlVar.zza(context2, zzbodVar);
    }
}
