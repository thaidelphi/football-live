package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzsc extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzrz zzc;
    public final String zzd;

    public zzsc(zzz zzzVar, Throwable th, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + zzzVar.toString(), th, zzzVar.zzo, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i10), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzsc zza(zzsc zzscVar, zzsc zzscVar2) {
        return new zzsc(zzscVar.getMessage(), zzscVar.getCause(), zzscVar.zza, false, zzscVar.zzc, zzscVar.zzd, zzscVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzsc(com.google.android.gms.internal.ads.zzz r11, java.lang.Throwable r12, boolean r13, com.google.android.gms.internal.ads.zzrz r14) {
        /*
            r10 = this;
            java.lang.String r13 = r14.zza
            java.lang.String r0 = r11.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.zzo
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L2d
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            goto L2e
        L2d:
            r11 = 0
        L2e:
            r8 = r11
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsc.<init>(com.google.android.gms.internal.ads.zzz, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.zzrz):void");
    }

    private zzsc(String str, Throwable th, String str2, boolean z10, zzrz zzrzVar, String str3, zzsc zzscVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzrzVar;
        this.zzd = str3;
    }
}
