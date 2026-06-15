package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzej implements zzau {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzej(String str, byte[] bArr, int i10, int i11) {
        char c10;
        byte b10;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            if (i11 == 23) {
                if (bArr.length == 4) {
                    i11 = 23;
                    zzcv.zzd(r4);
                } else {
                    i11 = 23;
                }
            }
            r4 = false;
            zzcv.zzd(r4);
        } else if (c10 == 1 || c10 == 2) {
            if (i11 == 78) {
                if (bArr.length == 8) {
                    i11 = 78;
                    zzcv.zzd(r4);
                } else {
                    i11 = 78;
                }
            }
            r4 = false;
            zzcv.zzd(r4);
        } else if (c10 == 3) {
            zzcv.zzd(i11 == 0);
        } else if (c10 == 4) {
            if (i11 == 75) {
                if (bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    i11 = 75;
                    zzcv.zzd(r4);
                } else {
                    i11 = 75;
                }
            }
            r4 = false;
            zzcv.zzd(r4);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzej.class == obj.getClass()) {
            zzej zzejVar = (zzej) obj;
            if (this.zza.equals(zzejVar.zza) && Arrays.equals(this.zzb, zzejVar.zzb) && this.zzc == zzejVar.zzc && this.zzd == zzejVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[LOOP:0: B:24:0x0084->B:26:0x0087, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.zzd
            r1 = 0
            if (r0 == 0) goto L57
            r2 = 1
            if (r0 == r2) goto L50
            r2 = 23
            if (r0 == r2) goto L41
            r2 = 67
            if (r0 == r2) goto L36
            r2 = 75
            if (r0 == r2) goto L2a
            r2 = 78
            if (r0 == r2) goto L19
            goto L79
        L19:
            byte[] r0 = r5.zzb
            com.google.android.gms.internal.ads.zzdx r1 = new com.google.android.gms.internal.ads.zzdx
            r1.<init>(r0)
            long r0 = r1.zzw()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto La8
        L2a:
            byte[] r0 = r5.zzb
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto La8
        L36:
            byte[] r0 = r5.zzb
            int r0 = com.google.android.gms.internal.ads.zzfyy.zzd(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto La8
        L41:
            byte[] r0 = r5.zzb
            int r0 = com.google.android.gms.internal.ads.zzfyy.zzd(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto La8
        L50:
            byte[] r0 = r5.zzb
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeh.zzB(r0)
            goto La8
        L57:
            java.lang.String r0 = r5.zza
            java.lang.String r2 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L79
            java.util.List r0 = r5.zzb()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "track types = "
            r1.append(r2)
            java.lang.String r2 = ","
            com.google.android.gms.internal.ads.zzfsn.zzb(r1, r0, r2)
            java.lang.String r0 = r1.toString()
            goto La8
        L79:
            byte[] r0 = r5.zzb
            int r2 = com.google.android.gms.internal.ads.zzeh.zza
            int r2 = r0.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + r2
            r3.<init>(r2)
        L84:
            int r2 = r0.length
            if (r1 >= r2) goto La4
            r2 = r0[r1]
            int r2 = r2 >> 4
            r2 = r2 & 15
            r4 = 16
            char r2 = java.lang.Character.forDigit(r2, r4)
            r3.append(r2)
            r2 = r0[r1]
            r2 = r2 & 15
            char r2 = java.lang.Character.forDigit(r2, r4)
            r3.append(r2)
            int r1 = r1 + 1
            goto L84
        La4:
            java.lang.String r0 = r3.toString()
        La8:
            java.lang.String r1 = r5.zza
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mdta: key="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", value="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzej.toString():java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }

    public final List zzb() {
        zzcv.zzg(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b10 = this.zzb[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.zzb[i10 + 2]));
        }
        return arrayList;
    }
}
