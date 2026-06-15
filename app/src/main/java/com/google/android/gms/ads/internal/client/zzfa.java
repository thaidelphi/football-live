package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbfs;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzfa implements MediaContent {

    /* renamed from: a  reason: collision with root package name */
    private final zzbev f11283a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoController f11284b = new VideoController();

    /* renamed from: c  reason: collision with root package name */
    private final zzbfs f11285c;

    public zzfa(zzbev zzbevVar, zzbfs zzbfsVar) {
        this.f11283a = zzbevVar;
        this.f11285c = zzbfsVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.f11283a.zze();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.f11283a.zzf();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.f11283a.zzg();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            IObjectWrapper zzi = this.f11283a.zzi();
            if (zzi != null) {
                return (Drawable) ObjectWrapper.t0(zzi);
            }
            return null;
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if (this.f11283a.zzh() != null) {
                this.f11284b.zzb(this.f11283a.zzh());
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception occurred while getting video controller", e8);
        }
        return this.f11284b;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.f11283a.zzl();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.f11283a.zzj(ObjectWrapper.u0(drawable));
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final zzbfs zza() {
        return this.f11285c;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.f11283a.zzk();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return false;
        }
    }

    public final zzbev zzc() {
        return this.f11283a;
    }
}
