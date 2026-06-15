package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class VideoController {
    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Object f11104a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private zzea f11105b;

    /* renamed from: c  reason: collision with root package name */
    private VideoLifecycleCallbacks f11106c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z10) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @KeepForSdk
    public int getPlaybackState() {
        synchronized (this.f11104a) {
            zzea zzeaVar = this.f11105b;
            if (zzeaVar == null) {
                return 0;
            }
            try {
                return zzeaVar.zzh();
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call getPlaybackState on video controller.", e8);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.f11104a) {
            videoLifecycleCallbacks = this.f11106c;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z10;
        synchronized (this.f11104a) {
            z10 = this.f11105b != null;
        }
        return z10;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.f11104a) {
            zzea zzeaVar = this.f11105b;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.zzo();
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call isClickToExpandEnabled.", e8);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.f11104a) {
            zzea zzeaVar = this.f11105b;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.zzp();
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call isUsingCustomPlayerControls.", e8);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.f11104a) {
            zzea zzeaVar = this.f11105b;
            if (zzeaVar == null) {
                return true;
            }
            try {
                return zzeaVar.zzq();
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call isMuted on video controller.", e8);
                return true;
            }
        }
    }

    public void mute(boolean z10) {
        synchronized (this.f11104a) {
            zzea zzeaVar = this.f11105b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzj(z10);
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call mute on video controller.", e8);
            }
        }
    }

    public void pause() {
        synchronized (this.f11104a) {
            zzea zzeaVar = this.f11105b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzk();
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call pause on video controller.", e8);
            }
        }
    }

    public void play() {
        synchronized (this.f11104a) {
            zzea zzeaVar = this.f11105b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzl();
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call play on video controller.", e8);
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfw zzfwVar;
        synchronized (this.f11104a) {
            this.f11106c = videoLifecycleCallbacks;
            zzea zzeaVar = this.f11105b;
            if (zzeaVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfwVar = null;
            } else {
                try {
                    zzfwVar = new zzfw(videoLifecycleCallbacks);
                } catch (RemoteException e8) {
                    zzo.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e8);
                }
            }
            zzeaVar.zzm(zzfwVar);
        }
    }

    public void stop() {
        synchronized (this.f11104a) {
            zzea zzeaVar = this.f11105b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzn();
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call stop on video controller.", e8);
            }
        }
    }

    public final zzea zza() {
        zzea zzeaVar;
        synchronized (this.f11104a) {
            zzeaVar = this.f11105b;
        }
        return zzeaVar;
    }

    public final void zzb(zzea zzeaVar) {
        synchronized (this.f11104a) {
            this.f11105b = zzeaVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.f11106c;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }
}
