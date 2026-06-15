package com.google.android.gms.internal.ads;

import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaya {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzayp zze;
    private final zzayx zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzaya(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = z10;
        this.zze = new zzayp(i13);
        this.zzf = new zzayx(i14, i15, i16);
    }

    private final void zzm(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                this.zzh.add(str);
                this.zzk += str.length();
                if (z10) {
                    this.zzi.add(str);
                    this.zzj.add(new zzayl(f10, f11, f12, f13, this.zzi.size() - 1));
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            sb.append((String) arrayList.get(i11));
            sb.append(' ');
            i11++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaya) {
            if (obj == this) {
                return true;
            }
            String str = ((zzaya) obj).zzo;
            return str != null && str.equals(this.zzo);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i10 = this.zzl;
        int i11 = this.zzn;
        int i12 = this.zzk;
        String zzn = zzn(arrayList, 100);
        String zzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        return "ActivityContent fetchId: " + i10 + " score:" + i11 + " total_length:" + i12 + "\n text: " + zzn + "\n viewableText" + zzn2 + "\n signture: " + str + "\n viewableSignture: " + str2 + "\n viewableSignatureForVertical: " + str3;
    }

    final int zza(int i10, int i11) {
        return this.zzd ? this.zzb : (i10 * this.zza) + (i11 * this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzo;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzg(int i10) {
        this.zzl = i10;
    }

    public final void zzh(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzm(str, z10, f10, f11, f12, f13);
    }

    public final void zzi(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzm(str, z10, f10, f11, f12, f13);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("ActivityContent: negative number of WebViews.");
            }
            zzj();
        }
    }

    public final void zzj() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
                if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzK()) {
                    this.zzo = this.zze.zza(this.zzh);
                    this.zzp = this.zze.zza(this.zzi);
                }
                if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzL()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    public final void zzk() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
            }
        }
    }

    public final boolean zzl() {
        boolean z10;
        synchronized (this.zzg) {
            z10 = this.zzm == 0;
        }
        return z10;
    }
}
