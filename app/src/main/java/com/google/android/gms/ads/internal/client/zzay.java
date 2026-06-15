package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbtc;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzay extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f11187b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HashMap f11188c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ HashMap f11189d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzaz f11190e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzay(zzaz zzazVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.f11187b = view;
        this.f11188c = hashMap;
        this.f11189d = hashMap2;
        this.f11190e = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11187b.getContext(), "native_ad_view_holder_delegate");
        return new zzfl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        HashMap hashMap = this.f11189d;
        return zzcoVar.zzk(ObjectWrapper.u0(this.f11187b), ObjectWrapper.u0(this.f11188c), ObjectWrapper.u0(hashMap));
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbtc zzbtcVar;
        zzbgv zzbgvVar;
        zzbbm.zza(this.f11187b.getContext());
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkD)).booleanValue()) {
            try {
                return zzbfh.zze(((zzbfl) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.f11187b.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzax
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        return zzbfk.zzb((IBinder) obj);
                    }
                })).zze(ObjectWrapper.u0(this.f11187b), ObjectWrapper.u0(this.f11188c), ObjectWrapper.u0(this.f11189d)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e8) {
                this.f11190e.f11197g = zzbta.zza(this.f11187b.getContext());
                zzbtcVar = this.f11190e.f11197g;
                zzbtcVar.zzh(e8, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        zzaz zzazVar = this.f11190e;
        View view = this.f11187b;
        HashMap hashMap = this.f11188c;
        HashMap hashMap2 = this.f11189d;
        zzbgvVar = zzazVar.f11196f;
        return zzbgvVar.zza(view, hashMap, hashMap2);
    }
}
