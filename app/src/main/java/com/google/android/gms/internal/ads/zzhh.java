package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzhh {
    private final float zza = 1.0f;

    public zzhh(final Context context, Handler handler, zzhg zzhgVar) {
        zzftr.zza(new zzftn() { // from class: com.google.android.gms.internal.ads.zzhf
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                Objects.requireNonNull(audioManager);
                return audioManager;
            }
        });
    }

    public final float zza() {
        return 1.0f;
    }
}
