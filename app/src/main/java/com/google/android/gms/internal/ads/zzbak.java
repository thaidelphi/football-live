package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbar;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbak {
    private final zzbaq zza;
    private final zzbar.zzt.zza zzb;
    private final boolean zzc;

    private zzbak() {
        this.zzb = zzbar.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbaq();
    }

    public static zzbak zza() {
        return new zzbak();
    }

    private final synchronized String zzd(int i10) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzah(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().b()), Integer.valueOf(i10 - 1), Base64.encodeToString(this.zzb.zzbr().zzaV(), 3));
    }

    private final synchronized void zze(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfob.zza(zzfoa.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzd(i10).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i10) {
        zzbar.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(com.google.android.gms.ads.internal.util.zzs.zzd());
        zzbao zzbaoVar = new zzbao(this.zza, this.zzb.zzbr().zzaV(), null);
        int i11 = i10 - 1;
        zzbaoVar.zza(i11);
        zzbaoVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void zzb(zzbaj zzbajVar) {
        if (this.zzc) {
            try {
                zzbajVar.zza(this.zzb);
            } catch (NullPointerException e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i10) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfb)).booleanValue()) {
                zze(i10);
            } else {
                zzf(i10);
            }
        }
    }

    public zzbak(zzbaq zzbaqVar) {
        this.zzb = zzbar.zzt.zzj();
        this.zza = zzbaqVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfa)).booleanValue();
    }
}
