package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdjf {
    private final com.google.android.gms.ads.internal.util.zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdjf(com.google.android.gms.ads.internal.util.zzbo zzboVar, Clock clock, Executor executor) {
        this.zza = zzboVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    public static /* synthetic */ Bitmap zza(zzdjf zzdjfVar, double d10, boolean z10, zzaol zzaolVar) {
        byte[] bArr = zzaolVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfZ)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzdjfVar.zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzga)).intValue())) / 2);
            }
        }
        return zzdjfVar.zzc(bArr, options);
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long b10 = this.zzb.b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b11 = this.zzb.b();
        if (decodeByteArray != null) {
            long j10 = b11 - b10;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z10 = Looper.getMainLooper().getThread() == Thread.currentThread();
            com.google.android.gms.ads.internal.util.zze.zza("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j10 + " on ui thread: " + z10);
        }
        return decodeByteArray;
    }

    public final b6.a zzb(String str, final double d10, final boolean z10) {
        return zzgap.zzm(this.zza.zza(str), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdje
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return zzdjf.zza(zzdjf.this, d10, z10, (zzaol) obj);
            }
        }, this.zzc);
    }
}
