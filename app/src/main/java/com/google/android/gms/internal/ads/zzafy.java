package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzafy extends zzaft {
    public final String zza;
    public final zzfvv zzb;

    public zzafy(String str, String str2, List list) {
        super(str);
        zzcv.zzd(!list.isEmpty());
        this.zza = str2;
        zzfvv zzl = zzfvv.zzl(list);
        this.zzb = zzl;
        String str3 = (String) zzl.get(0);
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafy.class == obj.getClass()) {
            zzafy zzafyVar = (zzafy) obj;
            String str = this.zzf;
            String str2 = zzafyVar.zzf;
            int i10 = zzeh.zza;
            if (Objects.equals(str, str2) && Objects.equals(this.zza, zzafyVar.zza) && this.zzb.equals(zzafyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzaft
    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        return this.zzf + ": description=" + this.zza + ": values=" + valueOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzaft, com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        char c10;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals(AdPreferences.TYPE_TEXT)) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 11;
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
            case 1:
                zzarVar.zzr((CharSequence) this.zzb.get(0));
                return;
            case 2:
            case 3:
                zzarVar.zze((CharSequence) this.zzb.get(0));
                return;
            case 4:
            case 5:
                zzarVar.zzc((CharSequence) this.zzb.get(0));
                return;
            case 6:
            case 7:
                zzarVar.zzd((CharSequence) this.zzb.get(0));
                return;
            case '\b':
            case '\t':
                int i10 = zzeh.zza;
                String[] split = ((String) this.zzb.get(0)).split("/", -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    zzarVar.zzu(Integer.valueOf(parseInt));
                    zzarVar.zzt(valueOf);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzarVar.zzm(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str2 = (String) this.zzb.get(0);
                    int parseInt2 = Integer.parseInt(str2.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str2.substring(0, 2));
                    zzarVar.zzl(Integer.valueOf(parseInt2));
                    zzarVar.zzk(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb((String) this.zzb.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        }
                        zzarVar.zzk((Integer) zzb.get(2));
                    }
                    zzarVar.zzl((Integer) zzb.get(1));
                }
                zzarVar.zzm((Integer) zzb.get(0));
                return;
            case 15:
                List zzb2 = zzb((String) this.zzb.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        }
                        zzarVar.zzn((Integer) zzb2.get(2));
                    }
                    zzarVar.zzo((Integer) zzb2.get(1));
                }
                zzarVar.zzp((Integer) zzb2.get(0));
                return;
            case 16:
            case 17:
                zzarVar.zzf((CharSequence) this.zzb.get(0));
                return;
            case 18:
            case 19:
                zzarVar.zzg((CharSequence) this.zzb.get(0));
                return;
            case 20:
            case 21:
                zzarVar.zzv((CharSequence) this.zzb.get(0));
                return;
            case 22:
                Integer zzf = zzfyy.zzf((String) this.zzb.get(0), 10);
                if (zzf == null) {
                    zzarVar.zzj((CharSequence) this.zzb.get(0));
                    return;
                }
                String zza = zzafu.zza(zzf.intValue());
                if (zza != null) {
                    zzarVar.zzj(zza);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
