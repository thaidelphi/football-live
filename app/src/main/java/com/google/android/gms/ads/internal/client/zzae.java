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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzae extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11146b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbod f11147c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(zzaz zzazVar, Context context, zzbod zzbodVar) {
        this.f11146b = context;
        this.f11147c = zzbodVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11146b, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        Context context = this.f11146b;
        IObjectWrapper u02 = ObjectWrapper.u0(context);
        zzbbm.zza(context);
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzjp)).booleanValue()) {
            return zzcoVar.zzi(u02, this.f11147c, 250505300);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.f11146b;
        IObjectWrapper u02 = ObjectWrapper.u0(context);
        zzbbm.zza(context);
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzjp)).booleanValue()) {
            try {
                return ((zzdu) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.f11146b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzad
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return queryLocalInterface instanceof zzdu ? (zzdu) queryLocalInterface : new zzdu(iBinder);
                    }
                })).zze(u02, this.f11147c, 250505300);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e8) {
                zzbta.zza(this.f11146b).zzh(e8, "ClientApiBroker.getOutOfContextTester");
                return null;
            }
        }
        return null;
    }
}
