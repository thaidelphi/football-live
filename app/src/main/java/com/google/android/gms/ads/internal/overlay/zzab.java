package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzdce;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzab extends zzbsc {

    /* renamed from: a  reason: collision with root package name */
    private final AdOverlayInfoParcel f11318a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f11319b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11320c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11321d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11322e = false;

    public zzab(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f11318a = adOverlayInfoParcel;
        this.f11319b = activity;
    }

    private final synchronized void zzb() {
        if (this.f11321d) {
            return;
        }
        zzr zzrVar = this.f11318a.zzc;
        if (zzrVar != null) {
            zzrVar.zzds(4);
        }
        this.f11321d = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final boolean zzH() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzh(int i10, int i11, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzl(Bundle bundle) {
        zzr zzrVar;
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zziO)).booleanValue() && !this.f11322e) {
            this.f11319b.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f11318a;
        if (adOverlayInfoParcel == null) {
            this.f11319b.finish();
        } else if (z10) {
            this.f11319b.finish();
        } else {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                }
                zzdce zzdceVar = this.f11318a.zzu;
                if (zzdceVar != null) {
                    zzdceVar.zzdd();
                }
                if (this.f11319b.getIntent() != null && this.f11319b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = this.f11318a.zzc) != null) {
                    zzrVar.zzdp();
                }
            }
            Activity activity = this.f11319b;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f11318a;
            com.google.android.gms.ads.internal.zzv.zzi();
            zzc zzcVar = adOverlayInfoParcel2.zza;
            if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi, null, "")) {
                return;
            }
            this.f11319b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzm() throws RemoteException {
        if (this.f11319b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzo() throws RemoteException {
        zzr zzrVar = this.f11318a.zzc;
        if (zzrVar != null) {
            zzrVar.zzdi();
        }
        if (this.f11319b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzp(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzr() throws RemoteException {
        if (this.f11320c) {
            this.f11319b.finish();
            return;
        }
        this.f11320c = true;
        zzr zzrVar = this.f11318a.zzc;
        if (zzrVar != null) {
            zzrVar.zzdE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzs(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f11320c);
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzu() throws RemoteException {
        if (this.f11319b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzv() throws RemoteException {
        zzr zzrVar = this.f11318a.zzc;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzx() throws RemoteException {
        this.f11322e = true;
    }
}
