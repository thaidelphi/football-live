package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcbh {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzaqf zzaqfVar;
        zzaqe zzaqeVar;
        long j10 = this.zza;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzaqa(new zzcbg(duplicate), zzcbk.zzb).zzd().iterator();
            while (true) {
                zzaqfVar = null;
                if (!it.hasNext()) {
                    zzaqeVar = null;
                    break;
                }
                zzaqc zzaqcVar = (zzaqc) it.next();
                if (zzaqcVar instanceof zzaqe) {
                    zzaqeVar = (zzaqe) zzaqcVar;
                    break;
                }
            }
            Iterator it2 = zzaqeVar.zzd().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzaqc zzaqcVar2 = (zzaqc) it2.next();
                if (zzaqcVar2 instanceof zzaqf) {
                    zzaqfVar = (zzaqf) zzaqcVar2;
                    break;
                }
            }
            long zzc = (zzaqfVar.zzc() * 1000) / zzaqfVar.zzd();
            this.zza = zzc;
            return zzc;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
