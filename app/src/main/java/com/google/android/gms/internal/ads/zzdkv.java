package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdkv extends zzbla implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbek {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzea zzb;
    private zzdgm zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdkv(zzdgm zzdgmVar, zzdgr zzdgrVar) {
        this.zza = zzdgrVar.zzf();
        this.zzb = zzdgrVar.zzj();
        this.zzc = zzdgmVar;
        if (zzdgrVar.zzs() != null) {
            zzdgrVar.zzs().zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdgm zzdgmVar = this.zzc;
        if (zzdgmVar == null || (view = this.zza) == null) {
            return;
        }
        zzdgmVar.zzB(view, Collections.emptyMap(), Collections.emptyMap(), zzdgm.zzY(this.zza));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzble zzbleVar, int i10) {
        try {
            zzbleVar.zze(i10);
        } catch (RemoteException e8) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final com.google.android.gms.ads.internal.client.zzea zzb() throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final zzbev zzc() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdgm zzdgmVar = this.zzc;
        if (zzdgmVar == null || zzdgmVar.zzc() == null) {
            return null;
        }
        return zzdgmVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zzd() throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzh();
        zzdgm zzdgmVar = this.zzc;
        if (zzdgmVar != null) {
            zzdgmVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdku(this));
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zzf(IObjectWrapper iObjectWrapper, zzble zzbleVar) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbleVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream ad should not be used again.");
                zzi(zzbleVar, 1);
                return;
            }
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.t0(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzv.zzy();
            zzbzc.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzv.zzy();
            zzbzc.zzb(this.zza, this);
            zzg();
            try {
                zzbleVar.zzf();
                return;
            } catch (RemoteException e8) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                return;
            }
        }
        String str = view == null ? "can not get video view." : "can not get video controller.";
        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream internal error: ".concat(str));
        zzi(zzbleVar, 0);
    }
}
