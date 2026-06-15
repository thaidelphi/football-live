package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzafi implements zzau {
    public final String zza;
    public final String zzb;

    public zzafi(String str, String str2) {
        this.zza = zzfsb.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafi zzafiVar = (zzafi) obj;
            if (this.zza.equals(zzafiVar.zza) && this.zzb.equals(zzafiVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "VC: " + this.zza + b9.i.f16692b + this.zzb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        char c10;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                zzarVar.zzr(this.zzb);
                return;
            case 1:
                zzarVar.zze(this.zzb);
                return;
            case 2:
                zzarVar.zzd(this.zzb);
                return;
            case 3:
                zzarVar.zzc(this.zzb);
                return;
            case 4:
                Integer zzf = zzfyy.zzf(this.zzb, 10);
                if (zzf != null) {
                    zzarVar.zzu(zzf);
                    return;
                }
                return;
            case 5:
                Integer zzf2 = zzfyy.zzf(this.zzb, 10);
                if (zzf2 != null) {
                    zzarVar.zzt(zzf2);
                    return;
                }
                return;
            case 6:
                Integer zzf3 = zzfyy.zzf(this.zzb, 10);
                if (zzf3 != null) {
                    zzarVar.zzi(zzf3);
                    return;
                }
                return;
            case 7:
                Integer zzf4 = zzfyy.zzf(this.zzb, 10);
                if (zzf4 != null) {
                    zzarVar.zzs(zzf4);
                    return;
                }
                return;
            case '\b':
                zzarVar.zzj(this.zzb);
                return;
            case '\t':
                zzarVar.zzh(this.zzb);
                return;
            default:
                return;
        }
    }
}
