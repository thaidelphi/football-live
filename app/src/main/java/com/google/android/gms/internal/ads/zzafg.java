package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzafg {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzafg() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzaff zzaffVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzaffVar.zza);
            zzb(this.zzb, zzaffVar.zzb);
            this.zzb.writeLong(zzaffVar.zzc);
            this.zzb.writeLong(zzaffVar.zzd);
            this.zzb.write(zzaffVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }
}
