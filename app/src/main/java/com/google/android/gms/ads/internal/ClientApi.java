package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzah;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzcfq;
import com.google.android.gms.internal.ads.zzdhl;
import com.google.android.gms.internal.ads.zzdhn;
import com.google.android.gms.internal.ads.zzdrp;
import com.google.android.gms.internal.ads.zzehv;
import com.google.android.gms.internal.ads.zzeuu;
import com.google.android.gms.internal.ads.zzewi;
import com.google.android.gms.internal.ads.zzexz;
import com.google.android.gms.internal.ads.zzezn;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ClientApi extends zzcn {
    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbt zzb(IObjectWrapper iObjectWrapper, String str, zzbod zzbodVar, int i10) {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        return new zzehv(zzcfq.zzb(context, zzbodVar, i10), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbod zzbodVar, int i10) {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        zzeuu zzt = zzcfq.zzb(context, zzbodVar, i10).zzt();
        zzt.zza(str);
        zzt.zzb(context);
        return zzt.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbod zzbodVar, int i10) {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        zzewi zzu = zzcfq.zzb(context, zzbodVar, i10).zzu();
        zzu.zzc(context);
        zzu.zza(zzrVar);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbod zzbodVar, int i10) {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        zzexz zzv = zzcfq.zzb(context, zzbodVar, i10).zzv();
        zzv.zzc(context);
        zzv.zza(zzrVar);
        zzv.zzb(str);
        return zzv.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i10) {
        return new zzu((Context) ObjectWrapper.t0(iObjectWrapper), zzrVar, str, new VersionInfoParcel(250505300, i10, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzg(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) {
        return zzcfq.zzb((Context) ObjectWrapper.t0(iObjectWrapper), zzbodVar, i10).zzA();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzh(IObjectWrapper iObjectWrapper, int i10) {
        return zzcfq.zzb((Context) ObjectWrapper.t0(iObjectWrapper), null, i10).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzi(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) {
        return zzcfq.zzb((Context) ObjectWrapper.t0(iObjectWrapper), zzbodVar, i10).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbfc zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdhn((FrameLayout) ObjectWrapper.t0(iObjectWrapper), (FrameLayout) ObjectWrapper.t0(iObjectWrapper2), 250505300);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbfi zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdhl((View) ObjectWrapper.t0(iObjectWrapper), (HashMap) ObjectWrapper.t0(iObjectWrapper2), (HashMap) ObjectWrapper.t0(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbjq zzl(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10, zzbjn zzbjnVar) {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        zzdrp zzk = zzcfq.zzb(context, zzbodVar, i10).zzk();
        zzk.zzb(context);
        zzk.zza(zzbjnVar);
        return zzk.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbrw zzm(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) {
        return zzcfq.zzb((Context) ObjectWrapper.t0(iObjectWrapper), zzbodVar, i10).zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbsd zzn(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.t0(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzw(activity);
        }
        int i10 = zza.zzk;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return new zzw(activity);
                        }
                        return new zzaf(activity);
                    }
                    return new zzab(activity, zza);
                }
                return new zzai(activity);
            }
            return new zzah(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbus zzo(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        zzezn zzw = zzcfq.zzb(context, zzbodVar, i10).zzw();
        zzw.zzb(context);
        return zzw.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbvi zzp(IObjectWrapper iObjectWrapper, String str, zzbod zzbodVar, int i10) {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        zzezn zzw = zzcfq.zzb(context, zzbodVar, i10).zzw();
        zzw.zzb(context);
        zzw.zza(str);
        return zzw.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbxn zzq(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) {
        return zzcfq.zzb((Context) ObjectWrapper.t0(iObjectWrapper), zzbodVar, i10).zzq();
    }
}
