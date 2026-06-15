package com.startapp.sdk.ads.video.player;

import android.media.MediaPlayer;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.VideoView;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.startapp.ab;
import com.startapp.j6;
import com.startapp.l3;
import com.startapp.na;
import com.startapp.ra;
import com.startapp.sa;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.h;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.ta;
import com.startapp.ua;
import com.startapp.va;
import com.startapp.w0;
import com.startapp.wa;
import com.startapp.xa;
import com.startapp.ya;
import com.startapp.za;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class NativeVideoPlayer extends w0 implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener {

    /* renamed from: g  reason: collision with root package name */
    public MediaPlayer f22820g;

    /* renamed from: h  reason: collision with root package name */
    public final VideoView f22821h;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum MediaErrorExtra {
        MEDIA_ERROR_IO,
        MEDIA_ERROR_MALFORMED,
        MEDIA_ERROR_UNSUPPORTED,
        MEDIA_ERROR_TIMED_OUT
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum MediaErrorType {
        MEDIA_ERROR_UNKNOWN,
        MEDIA_ERROR_SERVER_DIED
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements MediaPlayer.OnBufferingUpdateListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            va vaVar = NativeVideoPlayer.this.f23495f;
            if (vaVar != null) {
                ((ta) vaVar).a(i10);
            }
        }
    }

    public NativeVideoPlayer(VideoView videoView) {
        this.f22821h = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    public final void a(String str) {
        this.f23490a = str;
        if (str != null) {
            try {
                this.f22821h.setVideoPath(str);
            } catch (Throwable th) {
                l3.a(th);
                onError(this.f22820g, 1, 0);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        wa waVar = this.f23493d;
        if (waVar != null) {
            ((h) waVar).a();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        MediaErrorType mediaErrorType;
        MediaErrorExtra mediaErrorExtra;
        boolean z10 = false;
        if (this.f23492c != null) {
            int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1;
            xa xaVar = this.f23492c;
            if (i10 == 100) {
                mediaErrorType = MediaErrorType.MEDIA_ERROR_SERVER_DIED;
            } else {
                mediaErrorType = MediaErrorType.MEDIA_ERROR_UNKNOWN;
            }
            VideoPlayerInterface$VideoPlayerErrorType videoPlayerInterface$VideoPlayerErrorType = mediaErrorType == MediaErrorType.MEDIA_ERROR_SERVER_DIED ? VideoPlayerInterface$VideoPlayerErrorType.SERVER_DIED : VideoPlayerInterface$VideoPlayerErrorType.UNKNOWN;
            if (i11 == -1010) {
                mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED;
            } else if (i11 == -1007) {
                mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_MALFORMED;
            } else if (i11 != -110) {
                mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_IO;
            } else {
                mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_TIMED_OUT;
            }
            String obj = mediaErrorExtra.toString();
            ab abVar = new ab(videoPlayerInterface$VideoPlayerErrorType, obj, currentPosition);
            ua uaVar = (ua) xaVar;
            VideoMode videoMode = uaVar.f23450a;
            if (videoMode.P != null) {
                if (videoMode.f22751c0 && videoMode.f22754f0 <= videoMode.f22755g0 && currentPosition > 0 && obj.equals("MEDIA_ERROR_IO")) {
                    VideoMode videoMode2 = uaVar.f23450a;
                    videoMode2.f22754f0++;
                    ProgressBar progressBar = videoMode2.T;
                    if (progressBar != null && progressBar.isShown()) {
                        z10 = true;
                    }
                    if (!z10) {
                        videoMode2.f22761m0.postDelayed(new na(videoMode2), AdsCommonMetaData.f22889h.G().h());
                    }
                    VideoMode videoMode3 = uaVar.f23450a;
                    videoMode3.P.a(videoMode3.w().c());
                    uaVar.f23450a.P.a(currentPosition);
                } else {
                    uaVar.f23450a.a(abVar);
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        MediaEvents mediaEvents;
        this.f22820g = mediaPlayer;
        mediaPlayer.setOnSeekCompleteListener(this);
        ya yaVar = this.f23491b;
        if (yaVar != null) {
            sa saVar = (sa) yaVar;
            VideoMode videoMode = saVar.f22521a;
            int i10 = videoMode.f22758j0;
            if (i10 > 0) {
                NativeVideoPlayer nativeVideoPlayer = videoMode.P;
                if (nativeVideoPlayer != null) {
                    nativeVideoPlayer.a(i10);
                }
                VideoMode videoMode2 = saVar.f22521a;
                VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                j6 j6Var = videoMode2.H;
                if (j6Var != null && (mediaEvents = j6Var.f22142c) != null) {
                    mediaEvents.resume();
                }
                videoMode2.a(videoMode2.f22758j0, new VideoPausedTrackingParams(videoMode2.f22216q, videoMode2.a(videoMode2.f22758j0), videoMode2.E, videoMode2.Y, pauseOrigin, videoMode2.f22760l0), "resumed", videoMode2.w().i().n());
                videoMode2.Y++;
            } else if (videoMode.A()) {
                saVar.f22521a.F();
            }
        }
        if (com.startapp.sdk.adsbase.a.b(this.f23490a) && (mediaPlayer2 = this.f22820g) != null) {
            mediaPlayer2.setOnBufferingUpdateListener(new a());
        } else if (com.startapp.sdk.adsbase.a.b(this.f23490a)) {
        } else {
            d.b.f22797a.f22795b = this.f23495f;
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        za zaVar = this.f23494e;
        if (zaVar != null) {
            ((ra) zaVar).f22477a.F();
        }
    }

    public final void a(int i10) {
        try {
            MediaPlayer mediaPlayer = this.f22820g;
            if (mediaPlayer != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(i10, 3);
                } else {
                    mediaPlayer.seekTo(i10);
                }
            }
        } catch (Throwable th) {
            l3.a(th);
        }
    }
}
