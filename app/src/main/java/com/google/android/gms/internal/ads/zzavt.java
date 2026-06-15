package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavt extends zzaws {
    private static final zzawt zzh = new zzawt();
    private final zzarb zzi;
    private final Context zzj;
    private final zzasx zzk;

    public zzavt(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11, Context context, zzaqs zzaqsVar, zzarb zzarbVar, zzasx zzasxVar) {
        super(zzavfVar, "Ve21h85y8zyXmD7mYX40CbhQPgnShWjzbHE4yCJKJ6FL+RV7KGtw6p1aNaOQtQCP", "DdaQauG5oPDgpLWEm8FjS9mWezFUY9FDIRvqk+aVXxI=", zzarfVar, i10, 27);
        this.zzj = context;
        this.zzi = zzarbVar;
        this.zzk = zzasxVar;
    }

    private final zzasu zzc() throws IllegalAccessException, InvocationTargetException {
        int zza;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcN)).booleanValue()) {
            zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcS)).intValue();
        } else {
            zza = this.zzi.zza();
        }
        zzasu zzasuVar = new zzasu((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzasx zzasxVar = this.zzk;
        if (zzasxVar != null && zzasxVar.zza() != null) {
            try {
                str = (String) zzasxVar.zza().get(zza, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzasuVar.zza = str;
            return zzasuVar;
        }
        str = "E";
        zzasuVar.zza = str;
        return zzasuVar;
    }

    private final String zzd() {
        try {
            if (this.zza.zzk() != null) {
                this.zza.zzk().get();
            }
            zzasa zzc = this.zza.zzc();
            if (zzc == null || !zzc.zzaf()) {
                return null;
            }
            return zzc.zzg();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        int i10;
        zzasu zzasuVar;
        zzasu zzasuVar2;
        AtomicReference zza = zzh.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzasu zzasuVar3 = (zzasu) zza.get();
            if (zzasuVar3 == null || zzavi.zzd(zzasuVar3.zza) || zzasuVar3.zza.equals("E") || zzasuVar3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzavi.zzd(null)) {
                    if (!zzavi.zzd(null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    bool.booleanValue();
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                if (this.zzk != null) {
                    zzasuVar = zzc();
                } else {
                    Boolean valueOf = Boolean.valueOf(i10 == 3 && !this.zzi.zzd());
                    Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcB);
                    String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcA)).booleanValue() ? zzb() : null;
                    if (bool2.booleanValue() && this.zza.zzo() && zzavi.zzd(zzb)) {
                        zzb = zzd();
                    }
                    zzasu zzasuVar4 = new zzasu((String) this.zze.invoke(null, this.zzj, valueOf, zzb));
                    if (zzavi.zzd(zzasuVar4.zza) || zzasuVar4.zza.equals("E")) {
                        int i11 = i10 - 1;
                        if (i11 == 3) {
                            String zzd = zzd();
                            if (!zzavi.zzd(zzd)) {
                                zzasuVar4.zza = zzd;
                            }
                        } else if (i11 == 4) {
                            throw null;
                        }
                    }
                    zzasuVar = zzasuVar4;
                }
                zza.set(zzasuVar);
            }
            zzasuVar2 = (zzasu) zza.get();
        }
        synchronized (this.zzd) {
            if (zzasuVar2 != null) {
                this.zzd.zzv(zzasuVar2.zza);
                this.zzd.zzV(zzasuVar2.zzb);
                this.zzd.zzX(zzasuVar2.zzc);
                this.zzd.zzi(zzasuVar2.zzd);
                this.zzd.zzu(zzasuVar2.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] zzf = zzavi.zzf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcC));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzavi.zzf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcD)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzj();
            if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                final zzgbj zze = zzgbj.zze();
                context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzawu
                    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                    public final void onChecksumsReady(List list) {
                        zzgbj zzgbjVar = zzgbj.this;
                        if (list == null) {
                            zzgbjVar.zzc(null);
                            return;
                        }
                        try {
                            int size = list.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                ApkChecksum apkChecksum = (ApkChecksum) list.get(i10);
                                if (apkChecksum.getType() == 8) {
                                    zzgbjVar.zzc(zzavi.zzb(apkChecksum.getValue()));
                                    return;
                                }
                            }
                            zzgbjVar.zzc(null);
                        } catch (Throwable unused) {
                            zzgbjVar.zzc(null);
                        }
                    }
                });
                return (String) zze.get();
            }
            return null;
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
