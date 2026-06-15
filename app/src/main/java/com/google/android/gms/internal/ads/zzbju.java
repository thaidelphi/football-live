package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbju {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbjq zzc;

    public zzbju(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.q(true, "Android version must be Lollipop or higher");
        Preconditions.m(context);
        Preconditions.m(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbbm.zza(context);
    }

    public static final boolean zzc(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjQ)).booleanValue()) {
            Preconditions.m(str);
            if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjS)).intValue()) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("H5 GMSG exceeds max length");
                return false;
            }
            Uri parse = Uri.parse(str);
            return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
        }
        return false;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzbb.zza().zzn(this.zza, new zzbnz(), this.zzb);
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjQ)).booleanValue()) {
            zzd();
            zzbjq zzbjqVar = this.zzc;
            if (zzbjqVar != null) {
                try {
                    zzbjqVar.zze();
                } catch (RemoteException e8) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (zzc(str)) {
            zzd();
            zzbjq zzbjqVar = this.zzc;
            if (zzbjqVar != null) {
                try {
                    zzbjqVar.zzf(str);
                    return true;
                } catch (RemoteException e8) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
