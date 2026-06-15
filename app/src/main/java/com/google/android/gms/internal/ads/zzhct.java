package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzhct extends zzhcr {
    private int zzg;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzhct(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzaqb.zzc(byteBuffer.get());
        zzaqb.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
