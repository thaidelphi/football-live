package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzglf {
    public static final zzguh zza = zzguh.zzb(new byte[0]);

    public static final zzguh zza(int i10) {
        return zzguh.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final zzguh zzb(int i10) {
        return zzguh.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
