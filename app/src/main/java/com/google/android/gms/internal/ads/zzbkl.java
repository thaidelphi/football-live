package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbkl implements zzaoi {
    private volatile zzbjy zza;
    private final Context zzb;

    public zzbkl(Context context) {
        this.zzb = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzbkl zzbklVar) {
        if (zzbklVar.zza == null) {
            return;
        }
        zzbklVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzaoi
    public final zzaol zza(zzaop zzaopVar) throws zzaoy {
        Parcelable.Creator<zzbjz> creator = zzbjz.CREATOR;
        Map zzl = zzaopVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        zzbjz zzbjzVar = new zzbjz(zzaopVar.zzk(), strArr, strArr2);
        long b10 = com.google.android.gms.ads.internal.zzv.zzC().b();
        try {
            zzbyu zzbyuVar = new zzbyu();
            this.zza = new zzbjy(this.zzb, com.google.android.gms.ads.internal.zzv.zzu().zzb(), new zzbkj(this, zzbyuVar), new zzbkk(this, zzbyuVar));
            this.zza.checkAvailabilityAndConnect();
            zzbkh zzbkhVar = new zzbkh(this, zzbjzVar);
            zzgba zzgbaVar = zzbyp.zza;
            b6.a zzo = zzgap.zzo(zzgap.zzn(zzbyuVar, zzbkhVar, zzgbaVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzez)).intValue(), TimeUnit.MILLISECONDS, zzbyp.zzd);
            zzo.addListener(new zzbki(this), zzgbaVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().b() - b10) + "ms");
            zzbkb zzbkbVar = (zzbkb) new zzbub(parcelFileDescriptor).zza(zzbkb.CREATOR);
            if (zzbkbVar == null) {
                return null;
            }
            if (!zzbkbVar.zza) {
                if (zzbkbVar.zze.length != zzbkbVar.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbkbVar.zze;
                    if (i10 < strArr3.length) {
                        hashMap.put(strArr3[i10], zzbkbVar.zzf[i10]);
                        i10++;
                    } else {
                        return new zzaol(zzbkbVar.zzc, zzbkbVar.zzd, hashMap, zzbkbVar.zzg, zzbkbVar.zzh);
                    }
                }
            } else {
                throw new zzaoy(zzbkbVar.zzb);
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().b() - b10) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().b() - b10) + "ms");
            throw th;
        }
    }
}
