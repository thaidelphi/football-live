package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbnz;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzek {

    /* renamed from: a  reason: collision with root package name */
    private final zzbnz f11246a;

    /* renamed from: b  reason: collision with root package name */
    private final zzq f11247b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f11248c;

    /* renamed from: d  reason: collision with root package name */
    private final VideoController f11249d;

    /* renamed from: e  reason: collision with root package name */
    final zzbc f11250e;

    /* renamed from: f  reason: collision with root package name */
    private zza f11251f;

    /* renamed from: g  reason: collision with root package name */
    private AdListener f11252g;

    /* renamed from: h  reason: collision with root package name */
    private AdSize[] f11253h;

    /* renamed from: i  reason: collision with root package name */
    private AppEventListener f11254i;

    /* renamed from: j  reason: collision with root package name */
    private zzbx f11255j;

    /* renamed from: k  reason: collision with root package name */
    private VideoOptions f11256k;

    /* renamed from: l  reason: collision with root package name */
    private String f11257l;

    /* renamed from: m  reason: collision with root package name */
    private final ViewGroup f11258m;

    /* renamed from: n  reason: collision with root package name */
    private int f11259n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11260o;

    /* renamed from: p  reason: collision with root package name */
    private OnPaidEventListener f11261p;

    public zzek(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, zzq.zza, null, i10);
    }

    private static zzr a(Context context, AdSize[] adSizeArr, int i10) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzr zzrVar = new zzr(context, adSizeArr);
        zzrVar.zzj = b(i10);
        return zzrVar;
    }

    private static boolean b(int i10) {
        return i10 == 1;
    }

    public final boolean zzA() {
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                return zzbxVar.zzY();
            }
            return false;
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            return false;
        }
    }

    public final boolean zzB() {
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                return zzbxVar.zzZ();
            }
            return false;
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            return false;
        }
    }

    public final AdSize[] zzC() {
        return this.f11253h;
    }

    public final AdListener zza() {
        return this.f11252g;
    }

    public final AdSize zzb() {
        zzr zzg;
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null && (zzg = zzbxVar.zzg()) != null) {
                return com.google.android.gms.ads.zzc.zzc(zzg.zze, zzg.zzb, zzg.zza);
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
        AdSize[] adSizeArr = this.f11253h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.f11261p;
    }

    public final ResponseInfo zzd() {
        zzdx zzdxVar = null;
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzdxVar = zzbxVar.zzk();
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
        return ResponseInfo.zza(zzdxVar);
    }

    public final VideoController zzf() {
        return this.f11249d;
    }

    public final VideoOptions zzg() {
        return this.f11256k;
    }

    public final AppEventListener zzh() {
        return this.f11254i;
    }

    public final zzea zzi() {
        zzbx zzbxVar = this.f11255j;
        if (zzbxVar != null) {
            try {
                return zzbxVar.zzl();
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            }
        }
        return null;
    }

    public final String zzj() {
        zzbx zzbxVar;
        if (this.f11257l == null && (zzbxVar = this.f11255j) != null) {
            try {
                this.f11257l = zzbxVar.zzr();
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            }
        }
        return this.f11257l;
    }

    public final void zzl() {
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzbxVar.zzx();
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzm(zzeh zzehVar) {
        zzbx zzbxVar;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f11255j == null) {
                if (this.f11253h != null && this.f11257l != null) {
                    Context context = this.f11258m.getContext();
                    zzr a10 = a(context, this.f11253h, this.f11259n);
                    if ("search_v2".equals(a10.zza)) {
                        zzbxVar = (zzbx) new zzan(zzbb.zza(), context, a10, this.f11257l).zzd(context, false);
                    } else {
                        zzbxVar = (zzbx) new zzal(zzbb.zza(), context, a10, this.f11257l, this.f11246a).zzd(context, false);
                    }
                    this.f11255j = zzbxVar;
                    zzbxVar.zzD(new zzg(this.f11250e));
                    zza zzaVar = this.f11251f;
                    if (zzaVar != null) {
                        this.f11255j.zzC(new zzb(zzaVar));
                    }
                    AppEventListener appEventListener = this.f11254i;
                    if (appEventListener != null) {
                        this.f11255j.zzG(new zzaxz(appEventListener));
                    }
                    if (this.f11256k != null) {
                        this.f11255j.zzU(new zzfx(this.f11256k));
                    }
                    this.f11255j.zzP(new zzfp(this.f11261p));
                    this.f11255j.zzN(this.f11260o);
                    zzbx zzbxVar2 = this.f11255j;
                    if (zzbxVar2 != null) {
                        try {
                            final IObjectWrapper zzn = zzbxVar2.zzn();
                            if (zzn != null) {
                                if (((Boolean) zzbdk.zzf.zze()).booleanValue()) {
                                    if (((Boolean) zzbd.zzc().zzb(zzbbm.zzld)).booleanValue()) {
                                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzei
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzek.this.f11258m.addView((View) ObjectWrapper.t0(zzn));
                                            }
                                        });
                                    }
                                }
                                this.f11258m.addView((View) ObjectWrapper.t0(zzn));
                            }
                        } catch (RemoteException e8) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            zzehVar.zzo(currentTimeMillis);
            zzbx zzbxVar3 = this.f11255j;
            Objects.requireNonNull(zzbxVar3);
            zzbxVar3.zzab(this.f11247b.zza(this.f11258m.getContext(), zzehVar));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzn() {
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzbxVar.zzz();
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzo() {
        if (this.f11248c.getAndSet(true)) {
            return;
        }
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzbxVar.zzA();
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzp() {
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzbxVar.zzB();
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzq(zza zzaVar) {
        try {
            this.f11251f = zzaVar;
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzbxVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzr(AdListener adListener) {
        this.f11252g = adListener;
        this.f11250e.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.f11253h == null) {
            zzt(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void zzt(AdSize... adSizeArr) {
        this.f11253h = adSizeArr;
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzbxVar.zzF(a(this.f11258m.getContext(), this.f11253h, this.f11259n));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
        this.f11258m.requestLayout();
    }

    public final void zzu(String str) {
        if (this.f11257l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f11257l = str;
    }

    public final void zzv(AppEventListener appEventListener) {
        try {
            this.f11254i = appEventListener;
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzbxVar.zzG(appEventListener != null ? new zzaxz(appEventListener) : null);
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzw(boolean z10) {
        this.f11260o = z10;
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzbxVar.zzN(z10);
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        try {
            this.f11261p = onPaidEventListener;
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzbxVar.zzP(new zzfp(onPaidEventListener));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.f11256k = videoOptions;
        try {
            zzbx zzbxVar = this.f11255j;
            if (zzbxVar != null) {
                zzbxVar.zzU(videoOptions == null ? null : new zzfx(videoOptions));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final boolean zzz(zzbx zzbxVar) {
        try {
            IObjectWrapper zzn = zzbxVar.zzn();
            if (zzn != null && ((View) ObjectWrapper.t0(zzn)).getParent() == null) {
                this.f11258m.addView((View) ObjectWrapper.t0(zzn));
                this.f11255j = zzbxVar;
                return true;
            }
            return false;
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            return false;
        }
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10) {
        this(viewGroup, attributeSet, z10, zzq.zza, null, 0);
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, int i10) {
        this(viewGroup, attributeSet, z10, zzq.zza, null, i10);
    }

    zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, zzq zzqVar, zzbx zzbxVar, int i10) {
        zzr zzrVar;
        this.f11246a = new zzbnz();
        this.f11249d = new VideoController();
        this.f11250e = new zzej(this);
        this.f11258m = viewGroup;
        this.f11247b = zzqVar;
        this.f11255j = null;
        this.f11248c = new AtomicBoolean(false);
        this.f11259n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzz zzzVar = new zzz(context, attributeSet);
                this.f11253h = zzzVar.zzb(z10);
                this.f11257l = zzzVar.zza();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzb = zzbb.zzb();
                    AdSize adSize = this.f11253h[0];
                    int i11 = this.f11259n;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzrVar = new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzr zzrVar2 = new zzr(context, adSize);
                        zzrVar2.zzj = b(i11);
                        zzrVar = zzrVar2;
                    }
                    zzb.zzn(viewGroup, zzrVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e8) {
                zzbb.zzb().zzm(viewGroup, new zzr(context, AdSize.BANNER), e8.getMessage(), e8.getMessage());
            }
        }
    }
}
