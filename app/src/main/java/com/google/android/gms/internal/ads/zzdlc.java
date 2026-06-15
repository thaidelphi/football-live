package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.h;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdlc extends zzbfr {
    private final Context zza;
    private final zzdgr zzb;
    private zzdhr zzc;
    private zzdgm zzd;

    public zzdlc(Context context, zzdgr zzdgrVar, zzdhr zzdhrVar, zzdgm zzdgmVar) {
        this.zza = context;
        this.zzb = zzdgrVar;
        this.zzc = zzdhrVar;
        this.zzd = zzdgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final com.google.android.gms.ads.internal.client.zzea zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final zzbev zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final zzbey zzg(String str) {
        return (zzbey) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final IObjectWrapper zzh() {
        return ObjectWrapper.u0(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final List zzk() {
        try {
            h zzh = this.zzb.zzh();
            h zzi = this.zzb.zzi();
            String[] strArr = new String[zzh.size() + zzi.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < zzh.size(); i11++) {
                strArr[i10] = (String) zzh.i(i11);
                i10++;
            }
            for (int i12 = 0; i12 < zzi.size(); i12++) {
                strArr[i10] = (String) zzi.i(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzl() {
        zzdgm zzdgmVar = this.zzd;
        if (zzdgmVar != null) {
            zzdgmVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzm() {
        try {
            String zzC = this.zzb.zzC();
            if (Objects.equals(zzC, "Google")) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(zzC)) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdgm zzdgmVar = this.zzd;
                if (zzdgmVar != null) {
                    zzdgmVar.zzf(zzC, false);
                }
            }
        } catch (NullPointerException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzn(String str) {
        zzdgm zzdgmVar = this.zzd;
        if (zzdgmVar != null) {
            zzdgmVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzo() {
        zzdgm zzdgmVar = this.zzd;
        if (zzdgmVar != null) {
            zzdgmVar.zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdgm zzdgmVar;
        Object t02 = ObjectWrapper.t0(iObjectWrapper);
        if (!(t02 instanceof View) || this.zzb.zzu() == null || (zzdgmVar = this.zzd) == null) {
            return;
        }
        zzdgmVar.zzK((View) t02);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final boolean zzq() {
        zzdgm zzdgmVar = this.zzd;
        return (zzdgmVar == null || zzdgmVar.zzX()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdhr zzdhrVar;
        Object t02 = ObjectWrapper.t0(iObjectWrapper);
        if ((t02 instanceof ViewGroup) && (zzdhrVar = this.zzc) != null && zzdhrVar.zzf((ViewGroup) t02)) {
            this.zzb.zzq().zzar(new zzdlb(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdhr zzdhrVar;
        Object t02 = ObjectWrapper.t0(iObjectWrapper);
        if ((t02 instanceof ViewGroup) && (zzdhrVar = this.zzc) != null && zzdhrVar.zzg((ViewGroup) t02)) {
            this.zzb.zzs().zzar(new zzdlb(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final boolean zzt() {
        zzebb zzu = this.zzb.zzu();
        if (zzu != null) {
            com.google.android.gms.ads.internal.zzv.zzB().zzk(zzu.zza());
            if (this.zzb.zzr() != null) {
                this.zzb.zzr().zzd("onSdkLoaded", new androidx.collection.a());
                return true;
            }
            return true;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
