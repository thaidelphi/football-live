package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhs extends zzba {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzz zzf;
    public final int zzg;
    public final zzty zzh;
    final boolean zzi;

    private zzhs(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    public static zzhs zzb(Throwable th, String str, int i10, zzz zzzVar, int i11, boolean z10, int i12) {
        return new zzhs(1, th, null, i12, str, i10, zzzVar, zzzVar == null ? 4 : i11, z10);
    }

    public static zzhs zzc(IOException iOException, int i10) {
        return new zzhs(0, iOException, i10);
    }

    public static zzhs zzd(RuntimeException runtimeException, int i10) {
        return new zzhs(2, runtimeException, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzhs zza(zzty zztyVar) {
        String message = getMessage();
        int i10 = zzeh.zza;
        return new zzhs(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zztyVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzhs(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.zzz r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L5f
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L65
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            int r2 = com.google.android.gms.internal.ads.zzeh.zza
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L65
        L5f:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L65:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L72
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L72:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhs.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzz, int, boolean):void");
    }

    private zzhs(String str, Throwable th, int i10, int i11, String str2, int i12, zzz zzzVar, int i13, zzty zztyVar, long j10, boolean z10) {
        super(str, th, i10, Bundle.EMPTY, j10);
        int i14;
        boolean z11;
        if (z10) {
            i14 = i11;
            if (i14 == 1) {
                i14 = 1;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            i14 = i11;
            z11 = true;
        }
        zzcv.zzd(z11);
        zzcv.zzd(th != null);
        this.zzc = i14;
        this.zzd = str2;
        this.zze = i12;
        this.zzf = zzzVar;
        this.zzg = i13;
        this.zzh = zztyVar;
        this.zzi = z10;
    }
}
