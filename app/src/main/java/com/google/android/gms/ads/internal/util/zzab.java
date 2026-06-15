package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzab {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11399a = false;

    /* renamed from: b  reason: collision with root package name */
    private float f11400b = 1.0f;

    private final synchronized boolean a() {
        return this.f11400b >= 0.0f;
    }

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    public final synchronized float zza() {
        if (a()) {
            return this.f11400b;
        }
        return 1.0f;
    }

    public final synchronized void zzc(boolean z10) {
        this.f11399a = z10;
    }

    public final synchronized void zzd(float f10) {
        this.f11400b = f10;
    }

    public final synchronized boolean zze() {
        return this.f11399a;
    }
}
