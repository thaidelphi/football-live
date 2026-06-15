package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbtc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzaw extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FrameLayout f11183b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FrameLayout f11184c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f11185d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzaz f11186e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaw(zzaz zzazVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f11183b = frameLayout;
        this.f11184c = frameLayout2;
        this.f11185d = context;
        this.f11186e = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11185d, "native_ad_view_delegate");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzj(ObjectWrapper.u0(this.f11183b), ObjectWrapper.u0(this.f11184c));
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbtc zzbtcVar;
        zzbgu zzbguVar;
        zzbbm.zza(this.f11185d);
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkD)).booleanValue()) {
            try {
                return zzbfb.zzdy(((zzbff) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.f11185d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzav
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        return zzbfe.zzb((IBinder) obj);
                    }
                })).zze(ObjectWrapper.u0(this.f11185d), ObjectWrapper.u0(this.f11183b), ObjectWrapper.u0(this.f11184c), 250505300));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e8) {
                this.f11186e.f11197g = zzbta.zza(this.f11185d);
                zzbtcVar = this.f11186e.f11197g;
                zzbtcVar.zzh(e8, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        zzaz zzazVar = this.f11186e;
        Context context = this.f11185d;
        FrameLayout frameLayout = this.f11183b;
        FrameLayout frameLayout2 = this.f11184c;
        zzbguVar = zzazVar.f11194d;
        return zzbguVar.zza(context, frameLayout, frameLayout2);
    }
}
