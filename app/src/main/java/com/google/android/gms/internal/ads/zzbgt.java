package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbgt extends UnifiedNativeAd {
    private final zzbgs zza;
    private final zzbez zzc;
    private final List zzb = new ArrayList();
    private final VideoController zzd = new VideoController();
    private final List zze = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:59:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbgt(com.google.android.gms.internal.ads.zzbgs r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.zzd = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zze = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch: android.os.RemoteException -> L5b
            if (r6 == 0) goto L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5b
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5b
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5b
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5b
            if (r3 == 0) goto L4d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5b
            if (r2 != 0) goto L3a
            goto L4d
        L3a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5b
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzbey     // Catch: android.os.RemoteException -> L5b
            if (r4 == 0) goto L47
            com.google.android.gms.internal.ads.zzbey r3 = (com.google.android.gms.internal.ads.zzbey) r3     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L47:
            com.google.android.gms.internal.ads.zzbew r3 = new com.google.android.gms.internal.ads.zzbew     // Catch: android.os.RemoteException -> L5b
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L4d:
            r3 = r1
        L4e:
            if (r3 == 0) goto L27
            java.util.List r2 = r5.zzb     // Catch: android.os.RemoteException -> L5b
            com.google.android.gms.internal.ads.zzbez r4 = new com.google.android.gms.internal.ads.zzbez     // Catch: android.os.RemoteException -> L5b
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5b
            r2.add(r4)     // Catch: android.os.RemoteException -> L5b
            goto L27
        L5b:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        L5f:
            com.google.android.gms.internal.ads.zzbgs r6 = r5.zza     // Catch: android.os.RemoteException -> L8e
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L8e
            if (r6 == 0) goto L92
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8e
        L6b:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8e
            if (r2 == 0) goto L92
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8e
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8e
            if (r3 == 0) goto L80
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8e
            com.google.android.gms.ads.internal.client.zzdg r2 = com.google.android.gms.ads.internal.client.zzdf.zzb(r2)     // Catch: android.os.RemoteException -> L8e
            goto L81
        L80:
            r2 = r1
        L81:
            if (r2 == 0) goto L6b
            java.util.List r3 = r5.zze     // Catch: android.os.RemoteException -> L8e
            com.google.android.gms.ads.internal.client.zzdh r4 = new com.google.android.gms.ads.internal.client.zzdh     // Catch: android.os.RemoteException -> L8e
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8e
            r3.add(r4)     // Catch: android.os.RemoteException -> L8e
            goto L6b
        L8e:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        L92:
            com.google.android.gms.internal.ads.zzbgs r6 = r5.zza     // Catch: android.os.RemoteException -> La1
            com.google.android.gms.internal.ads.zzbey r6 = r6.zzk()     // Catch: android.os.RemoteException -> La1
            if (r6 == 0) goto La5
            com.google.android.gms.internal.ads.zzbez r2 = new com.google.android.gms.internal.ads.zzbez     // Catch: android.os.RemoteException -> La1
            r2.<init>(r6)     // Catch: android.os.RemoteException -> La1
            r1 = r2
            goto La5
        La1:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        La5:
            r5.zzc = r1
            com.google.android.gms.internal.ads.zzbgs r6 = r5.zza     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzber r6 = r6.zzi()     // Catch: android.os.RemoteException -> Lbb
            if (r6 == 0) goto Lba
            com.google.android.gms.internal.ads.zzbes r6 = new com.google.android.gms.internal.ads.zzbes     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbgs r1 = r5.zza     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzber r1 = r1.zzi()     // Catch: android.os.RemoteException -> Lbb
            r6.<init>(r1)     // Catch: android.os.RemoteException -> Lbb
        Lba:
            return
        Lbb:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgt.<init>(com.google.android.gms.internal.ads.zzbgs):void");
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzJ(bundle);
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zza() {
        try {
            if (this.zza.zzh() != null) {
                this.zzd.zzb(this.zza.zzh());
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception occurred while getting video controller", e8);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double zzc() {
        try {
            double zze = this.zza.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzd() {
        try {
            IObjectWrapper zzl = this.zza.zzl();
            if (zzl != null) {
                return ObjectWrapper.t0(zzl);
            }
            return null;
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zze() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzf() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzg() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzh() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzi() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzj() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzk() {
        return this.zzb;
    }
}
