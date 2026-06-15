package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.protobuf.CodedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzayo {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(CodedOutputStream.DEFAULT_BUFFER_SIZE);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        String str;
        try {
            this.zzb.close();
        } catch (IOException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("HashManager: Unable to convert to Base64.", e8);
        }
        try {
            try {
                this.zza.close();
                str = this.zza.toString();
            } catch (IOException e10) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("HashManager: Unable to convert to Base64.", e10);
                str = "";
            }
            return str;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
