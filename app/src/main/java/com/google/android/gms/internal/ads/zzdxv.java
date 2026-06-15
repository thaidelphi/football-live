package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdxv extends zzbtq {
    private final Context zza;
    private final zzgba zzb;
    private final zzdyd zzc;
    private final zzcjp zzd;
    private final ArrayDeque zze;
    private final zzffq zzf;
    private final zzbul zzg;

    public zzdxv(Context context, zzgba zzgbaVar, zzbul zzbulVar, zzcjp zzcjpVar, zzdyd zzdydVar, ArrayDeque arrayDeque, zzdya zzdyaVar, zzffq zzffqVar) {
        zzbbm.zza(context);
        this.zza = context;
        this.zzb = zzgbaVar;
        this.zzg = zzbulVar;
        this.zzc = zzdydVar;
        this.zzd = zzcjpVar;
        this.zze = arrayDeque;
        this.zzf = zzffqVar;
    }

    public static /* synthetic */ InputStream zzk(zzdxv zzdxvVar, b6.a aVar, b6.a aVar2, zzbud zzbudVar, zzffc zzffcVar) {
        String zze = ((zzbuf) aVar.get()).zze();
        String str = zzbudVar.zzh;
        zzdxvVar.zzo(new zzdxs((zzbuf) aVar.get(), (JSONObject) aVar2.get(), str, zze, zzffcVar));
        return new ByteArrayInputStream(zze.getBytes(StandardCharsets.UTF_8));
    }

    private final synchronized zzdxs zzl(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdxs zzdxsVar = (zzdxs) it.next();
            if (zzdxsVar.zzc.equals(str)) {
                it.remove();
                return zzdxsVar;
            }
        }
        return null;
    }

    private static b6.a zzm(b6.a aVar, zzfet zzfetVar, zzbnf zzbnfVar, zzffn zzffnVar, zzffc zzffcVar) {
        zzbmv zza = zzbnfVar.zza("AFMA_getAdDictionary", zzbnc.zza, new zzbmx() { // from class: com.google.android.gms.internal.ads.zzdxm
            @Override // com.google.android.gms.internal.ads.zzbmx
            public final Object zza(JSONObject jSONObject) {
                return new zzbuf(jSONObject);
            }
        });
        zzffm.zzd(aVar, zzffcVar);
        zzfdz zza2 = zzfetVar.zzb(zzfen.BUILD_URL, aVar).zzf(zza).zza();
        zzffm.zzc(zza2, zzffnVar, zzffcVar);
        return zza2;
    }

    private static b6.a zzn(final zzbud zzbudVar, zzfet zzfetVar, final zzesz zzeszVar) {
        zzfzw zzfzwVar = new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdxg
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzesz.this.zzb().zza(com.google.android.gms.ads.internal.client.zzbb.zzb().zzj((Bundle) obj), zzbudVar.zzm, false);
            }
        };
        return zzfetVar.zzb(zzfen.GMS_SIGNALS, zzgap.zzh(zzbudVar.zza)).zzf(zzfzwVar).zze(new zzfdx() { // from class: com.google.android.gms.internal.ads.zzdxh
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzo(zzdxs zzdxsVar) {
        zzp();
        this.zze.addLast(zzdxsVar);
    }

    private final synchronized void zzp() {
        int intValue = ((Long) zzbdt.zzb.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzq(b6.a aVar, zzbtv zzbtvVar, zzbud zzbudVar) {
        zzgap.zzr(zzgap.zzn(aVar, new zzfzw(this) { // from class: com.google.android.gms.internal.ads.zzdxn
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbp
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = inputStream;
                        try {
                            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                            try {
                                IOUtils.b(inputStream2, autoCloseOutputStream);
                                autoCloseOutputStream.close();
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                            } catch (Throwable th) {
                                try {
                                    autoCloseOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return zzgap.zzh(parcelFileDescriptor);
            }
        }, zzbyp.zza), new zzdxr(this, zzbudVar, zzbtvVar), zzbyp.zzg);
    }

    public final b6.a zzb(final zzbud zzbudVar, int i10) {
        if (!((Boolean) zzbdt.zza.zze()).booleanValue()) {
            return zzgap.zzg(new Exception("Split request is disabled."));
        }
        zzfcj zzfcjVar = zzbudVar.zzi;
        if (zzfcjVar == null) {
            return zzgap.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfcjVar.zzc != 0 && zzfcjVar.zzd != 0) {
            zzbnf zzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
            zzesz zzr = this.zzd.zzr(zzbudVar, i10);
            zzfet zzc = zzr.zzc();
            final b6.a zzn = zzn(zzbudVar, zzc, zzr);
            zzffn zzd = zzr.zzd();
            final zzffc zza = zzffb.zza(this.zza, 9);
            final b6.a zzm = zzm(zzn, zzc, zzb, zzd, zza);
            return zzc.zza(zzfen.GET_URL_AND_CACHE_KEY, zzn, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdxv.zzk(zzdxv.this, zzm, zzn, zzbudVar, zza);
                }
            }).zza();
        }
        return zzgap.zzg(new Exception("Caching is disabled."));
    }

    public final b6.a zzc(final zzbud zzbudVar, int i10) {
        zzffc zzffcVar;
        zzfdz zza;
        zzbnf zzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzesz zzr = this.zzd.zzr(zzbudVar, i10);
        zzbmv zza2 = zzb.zza("google.afma.response.normalize", zzdxu.zza, zzbnc.zzb);
        zzdxs zzdxsVar = null;
        if (!((Boolean) zzbdt.zza.zze()).booleanValue()) {
            String str = zzbudVar.zzj;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzdxsVar = zzl(zzbudVar.zzh);
            if (zzdxsVar == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzdxsVar == null) {
            zzffcVar = zzffb.zza(this.zza, 9);
        } else {
            zzffcVar = zzdxsVar.zzd;
        }
        zzffn zzd = zzr.zzd();
        zzd.zzd(zzbudVar.zza.getStringArrayList("ad_types"));
        zzdyc zzdycVar = new zzdyc(zzbudVar.zzg, zzd, zzffcVar);
        zzdxz zzdxzVar = new zzdxz(this.zza, zzbudVar.zzb.afmaVersion, this.zzg, i10);
        zzfet zzc = zzr.zzc();
        zzffc zza3 = zzffb.zza(this.zza, 11);
        if (zzdxsVar == null) {
            final b6.a zzn = zzn(zzbudVar, zzc, zzr);
            final b6.a zzm = zzm(zzn, zzc, zzb, zzd, zzffcVar);
            zzffc zza4 = zzffb.zza(this.zza, 10);
            final zzfdz zza5 = zzc.zza(zzfen.HTTP, zzm, zzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbud zzbudVar2;
                    Bundle bundle;
                    zzbuf zzbufVar = (zzbuf) b6.a.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue() && (bundle = (zzbudVar2 = zzbudVar).zzm) != null) {
                        bundle.putLong(zzdpn.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbufVar.zzc());
                        zzbudVar2.zzm.putLong(zzdpn.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbufVar.zzb());
                    }
                    return new zzdyb((JSONObject) zzn.get(), zzbufVar);
                }
            }).zze(zzdycVar).zze(new zzffi(zza4)).zze(zzdxzVar).zza();
            zzffm.zza(zza5, zzd, zza4);
            zzffm.zzd(zza5, zza3);
            zza = zzc.zza(zzfen.PRE_PROCESS, zzn, zzm, zza5).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue() && (bundle = zzbud.this.zzm) != null) {
                        bundle.putLong(zzdpn.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
                    }
                    return new zzdxu((zzdxy) zza5.get(), (JSONObject) zzn.get(), (zzbuf) zzm.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzdyb zzdybVar = new zzdyb(zzdxsVar.zzb, zzdxsVar.zza);
            zzffc zza6 = zzffb.zza(this.zza, 10);
            final zzfdz zza7 = zzc.zzb(zzfen.HTTP, zzgap.zzh(zzdybVar)).zze(zzdycVar).zze(new zzffi(zza6)).zze(zzdxzVar).zza();
            zzffm.zza(zza7, zzd, zza6);
            final b6.a zzh = zzgap.zzh(zzdxsVar);
            zzffm.zzd(zza7, zza3);
            zza = zzc.zza(zzfen.PRE_PROCESS, zza7, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    b6.a aVar = zzh;
                    return new zzdxu((zzdxy) b6.a.this.get(), ((zzdxs) aVar.get()).zzb, ((zzdxs) aVar.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzffm.zza(zza, zzd, zza3);
        return zza;
    }

    public final b6.a zzd(final zzbud zzbudVar, int i10) {
        zzbnf zzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbdz.zza.zze()).booleanValue()) {
            return zzgap.zzg(new Exception("Signal collection disabled."));
        }
        zzesz zzr = this.zzd.zzr(zzbudVar, i10);
        final zzerz zza = zzr.zza();
        zzbmv zza2 = zzb.zza("google.afma.request.getSignals", zzbnc.zza, zzbnc.zzb);
        zzffc zza3 = zzffb.zza(this.zza, 22);
        zzfdz zza4 = zzr.zzc().zzb(zzfen.GET_SIGNALS, zzgap.zzh(zzbudVar.zza)).zze(new zzffi(zza3)).zzf(new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdxo
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzerz.this.zza(com.google.android.gms.ads.internal.client.zzbb.zzb().zzj((Bundle) obj), zzbudVar.zzm, false);
            }
        }).zzb(zzfen.JS_SIGNALS).zzf(zza2).zza();
        zzffn zzd = zzr.zzd();
        zzd.zzd(zzbudVar.zza.getStringArrayList("ad_types"));
        zzd.zzf(zzbudVar.zza.getBundle("extras"));
        zzffm.zzb(zza4, zzd, zza3);
        if (((Boolean) zzbdm.zzf.zze()).booleanValue()) {
            zzdyd zzdydVar = this.zzc;
            Objects.requireNonNull(zzdydVar);
            zza4.addListener(new zzdxl(zzdydVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbtr
    public final void zze(zzbud zzbudVar, zzbtv zzbtvVar) {
        zzq(zzb(zzbudVar, Binder.getCallingUid()), zzbtvVar, zzbudVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtr
    public final void zzf(zzbud zzbudVar, zzbtv zzbtvVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue() && (bundle = zzbudVar.zzm) != null) {
            bundle.putLong(zzdpn.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        zzq(zzd(zzbudVar, Binder.getCallingUid()), zzbtvVar, zzbudVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtr
    public final void zzg(zzbud zzbudVar, zzbtv zzbtvVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue() && (bundle = zzbudVar.zzm) != null) {
            bundle.putLong(zzdpn.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        b6.a zzc = zzc(zzbudVar, Binder.getCallingUid());
        zzq(zzc, zzbtvVar, zzbudVar);
        if (((Boolean) zzbdm.zze.zze()).booleanValue()) {
            zzdyd zzdydVar = this.zzc;
            Objects.requireNonNull(zzdydVar);
            zzc.addListener(new zzdxl(zzdydVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtr
    public final void zzh(String str, zzbtv zzbtvVar) {
        zzq(zzj(str), zzbtvVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbtr
    public final void zzi(zzbtn zzbtnVar, zzbtw zzbtwVar) {
        if (!((Boolean) zzbeb.zza.zze()).booleanValue()) {
            try {
                zzbtwVar.zzf("", zzbtnVar);
                return;
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e8);
                return;
            }
        }
        this.zzd.zzF();
        String str = zzbtnVar.zza;
        zzgap.zzr(zzgap.zzh(null), new zzdxp(this, zzbtwVar, zzbtnVar), zzbyp.zzg);
    }

    public final b6.a zzj(String str) {
        if (!((Boolean) zzbdt.zza.zze()).booleanValue()) {
            return zzgap.zzg(new Exception("Split request is disabled."));
        }
        zzdxq zzdxqVar = new zzdxq(this);
        if (zzl(str) == null) {
            return zzgap.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzgap.zzh(zzdxqVar);
    }
}
