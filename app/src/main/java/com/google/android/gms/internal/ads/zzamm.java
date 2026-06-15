package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzamm implements zzacj {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzamj zzi;
    private zzacm zzj;
    private boolean zzk;
    private final zzee zza = new zzee(0);
    private final zzdx zzc = new zzdx((int) CodedOutputStream.DEFAULT_BUFFER_SIZE);
    private final SparseArray zzb = new SparseArray();
    private final zzamk zzd = new zzamk();

    /* JADX WARN: Removed duplicated region for block: B:64:0x014b  */
    @Override // com.google.android.gms.internal.ads.zzacj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzack r17, com.google.android.gms.internal.ads.zzadf r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamm.zzb(com.google.android.gms.internal.ads.zzack, com.google.android.gms.internal.ads.zzadf):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ zzacj zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ List zzd() {
        return zzfvv.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zze(zzacm zzacmVar) {
        this.zzj = zzacmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 != r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[LOOP:0: B:14:0x002c->B:16:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzacj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzee r5 = r4.zza
            long r0 = r5.zzf()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.zzd()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.zzi(r7)
        L24:
            com.google.android.gms.internal.ads.zzamj r5 = r4.zzi
            r6 = 0
            if (r5 == 0) goto L2c
            r5.zzd(r7)
        L2c:
            android.util.SparseArray r5 = r4.zzb
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.zzb
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzaml r5 = (com.google.android.gms.internal.ads.zzaml) r5
            r5.zzb()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamm.zzf(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        byte[] bArr = new byte[14];
        zzaby zzabyVar = (zzaby) zzackVar;
        zzabyVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            zzabyVar.zzl(bArr[13] & 7, false);
            zzabyVar.zzm(bArr, 0, 3, false);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }
}
