package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfnk {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfmr zze;
    private boolean zzf;

    public zzfnk(Context context, int i10, zzfmr zzfmrVar, boolean z10) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i10 - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfmrVar;
        this.zzf = z10;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzawx zzawxVar) {
        zzawy zzd = zzaxa.zzd();
        zzd.zze(zzawxVar.zzc().zzk());
        zzd.zza(zzawxVar.zzc().zzj());
        zzd.zzb(zzawxVar.zzc().zza());
        zzd.zzd(zzawxVar.zzc().zzc());
        zzd.zzc(zzawxVar.zzc().zzb());
        return Hex.a(((zzaxa) zzd.zzbr()).zzaV());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i10, long j10) {
        this.zze.zza(i10, j10);
    }

    private final void zzj(int i10, long j10, String str) {
        this.zze.zzb(i10, j10, str);
    }

    private final zzaxa zzk(int i10) {
        String string;
        zzgvu zzb;
        if (i10 == 1) {
            string = this.zzc.getString(zzh(), null);
        } else {
            string = this.zzc.getString(zzg(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] c10 = Hex.c(string);
            zzgvc zzgvcVar = zzgvc.zzb;
            zzgvc zzv = zzgvc.zzv(c10, 0, c10.length);
            if (this.zzf) {
                zzb = zzgvu.zza();
            } else {
                zzb = zzgvu.zzb();
            }
            return zzaxa.zzi(zzv, zzb);
        } catch (zzgwz unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzawx zzawxVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfne.zze(new File(zze(zzawxVar.zzc().zzk()), "pcbc"), zzawxVar.zzd().zzA())) {
                zzi(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN, currentTimeMillis);
                return false;
            }
            String zzf = zzf(zzawxVar);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean zzb(zzawx zzawxVar, zzfnj zzfnjVar) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaxa zzk = zzk(1);
            String zzk2 = zzawxVar.zzc().zzk();
            if (zzk != null && zzk.zzk().equals(zzk2)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zze = zze(zzk2);
            if (zze.exists()) {
                zzj(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT, currentTimeMillis2, "d:" + (true != zze.isDirectory() ? "0" : "1") + ",f:" + (true != zze.isFile() ? "0" : "1"));
                zzi(4015, currentTimeMillis2);
            } else if (!zze.mkdirs()) {
                zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? "0" : "1"));
                zzi(4015, currentTimeMillis2);
                return false;
            }
            File zze2 = zze(zzk2);
            File file = new File(zze2, "pcam.jar");
            File file2 = new File(zze2, "pcbc");
            if (!zzfne.zze(file, zzawxVar.zzf().zzA())) {
                zzi(4016, currentTimeMillis);
                return false;
            } else if (!zzfne.zze(file2, zzawxVar.zzd().zzA())) {
                zzi(4017, currentTimeMillis);
                return false;
            } else if (zzfnjVar != null && !zzfnjVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                zzfne.zzd(zze2);
                return false;
            } else {
                String zzf = zzf(zzawxVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.zzc.getString(zzh(), null);
                SharedPreferences.Editor edit = this.zzc.edit();
                edit.putString(zzh(), zzf);
                if (string != null) {
                    edit.putString(zzg(), string);
                }
                if (!edit.commit()) {
                    zzi(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzaxa zzk3 = zzk(1);
                if (zzk3 != null) {
                    hashSet.add(zzk3.zzk());
                }
                zzaxa zzk4 = zzk(2);
                if (zzk4 != null) {
                    hashSet.add(zzk4.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfne.zzd(file3);
                    }
                }
                zzi(5014, currentTimeMillis);
                return true;
            }
        }
    }

    public final zzfnc zzc(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaxa zzk = zzk(1);
            if (zzk == null) {
                zzi(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zzk());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfnc(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaxa zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zzk());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            } else if (!new File(zze, "pcbc").exists()) {
                zzi(4027, currentTimeMillis);
                return false;
            } else {
                zzi(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
