package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzebc {
    private o0.a zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebc(Context context) {
        this.zzb = context;
    }

    public final b6.a zza() {
        try {
            o0.a a10 = o0.a.a(this.zzb);
            this.zza = a10;
            if (a10 == null) {
                return zzgap.zzg(new IllegalStateException("MeasurementManagerFutures is null"));
            }
            return a10.b();
        } catch (Exception e8) {
            return zzgap.zzg(e8);
        }
    }

    public final b6.a zzb(Uri uri, InputEvent inputEvent) {
        try {
            o0.a aVar = this.zza;
            Objects.requireNonNull(aVar);
            return aVar.c(uri, inputEvent);
        } catch (Exception e8) {
            return zzgap.zzg(e8);
        }
    }
}
