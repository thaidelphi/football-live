package com.appnext.nativeads;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.appnext.a.a;
import com.appnext.core.i;
import java.io.File;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MediaView extends RelativeLayout {
    private boolean clickEnabled;
    private boolean fg;
    private NativeAd fh;
    private MediaType fi;
    private boolean finished;
    private NativeAdData fj;
    private com.appnext.a.a fk;
    private com.appnext.a.b fl;
    private View fm;
    private a fn;
    private boolean fo;
    private int fp;
    private Handler mHandler;
    private MediaPlayer mediaPlayer;
    private boolean mute;
    private Runnable tick;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum MediaType {
        VIDEO,
        STATIC
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends ImageView {
        public a(Context context) {
            super(context);
        }
    }

    public MediaView(Context context) {
        super(context);
        this.fg = true;
        this.mute = false;
        this.clickEnabled = true;
        this.fo = false;
        this.finished = false;
        this.fp = 0;
        this.tick = new Runnable() { // from class: com.appnext.nativeads.MediaView.8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (MediaView.this.mediaPlayer != null && MediaView.this.mediaPlayer.isPlaying()) {
                        MediaView mediaView = MediaView.this;
                        mediaView.fp = mediaView.mediaPlayer.getCurrentPosition();
                    }
                } catch (Throwable unused) {
                }
                if (MediaView.this.mHandler != null) {
                    MediaView.this.mHandler.postDelayed(MediaView.this.tick, 500L);
                }
            }
        };
    }

    private void aE() {
        try {
            this.fl = new com.appnext.a.b(getContext());
            this.fh.downloadAndDisplayImage(getContext(), this.fl, this.fj.getWideImageURL());
            addView(this.fl);
            ((RelativeLayout.LayoutParams) this.fl.getLayoutParams()).addRule(13);
            this.fl.getLayoutParams().width = -1;
            this.fl.getLayoutParams().height = -2;
            this.fl.setAdjustViewBounds(true);
        } catch (Throwable th) {
            com.appnext.base.a.a("MediaView$initStatic", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i10) {
        if (this.fi == MediaType.VIDEO) {
            if (i10 < 90) {
                pause();
            } else if (this.fo || !isAutoPLay() || this.finished) {
            } else {
                play();
            }
        }
    }

    public void destroy() {
        removeAllViews();
        try {
            com.appnext.a.a aVar = this.fk;
            if (aVar != null) {
                aVar.setOnCompletionListener(null);
                this.fk.setOnErrorListener(null);
                this.fk.setOnPreparedListener(null);
                this.fk.suspend();
                this.fk = null;
                this.mediaPlayer.release();
                this.mediaPlayer = null;
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("MediaView$destroy", th);
        }
        try {
            com.appnext.a.b bVar = this.fl;
            if (bVar != null) {
                bVar.setImageBitmap(null);
                this.fl = null;
            }
        } catch (Throwable th2) {
            com.appnext.base.a.a("MediaView$destroy", th2);
        }
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public boolean isAutoPLay() {
        return this.fg;
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    public boolean isMute() {
        return this.mute;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception unused) {
        }
    }

    public void pause() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                return;
            }
            this.mediaPlayer.pause();
            ((ImageView) this.fm).setImageResource(R.drawable.apnxt_na_play);
        } catch (Throwable unused) {
        }
    }

    public void play() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer == null || mediaPlayer.isPlaying()) {
                return;
            }
            this.mediaPlayer.start();
            ((ImageView) this.fm).setImageResource(0);
        } catch (Throwable th) {
            com.appnext.base.a.a("MediaView$play", th);
        }
    }

    public void setAutoPLay(boolean z10) {
        this.fg = z10;
    }

    public void setClickEnabled(boolean z10) {
        this.clickEnabled = z10;
    }

    public void setMute(boolean z10) {
        this.mute = z10;
        try {
            if (this.mediaPlayer != null) {
                if (isMute()) {
                    this.mediaPlayer.setVolume(0.0f, 0.0f);
                } else {
                    this.mediaPlayer.setVolume(1.0f, 1.0f);
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("MediaView$setMute", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(NativeAd nativeAd, NativeAdData nativeAdData, MediaType mediaType) {
        Uri parse;
        try {
            this.fh = nativeAd;
            this.fj = nativeAdData;
            this.fi = mediaType;
            if (mediaType == MediaType.VIDEO) {
                this.fk = new com.appnext.a.a(getContext().getApplicationContext());
                this.mHandler = new Handler();
                this.fk.setPlayPauseListener(new a.InterfaceC0144a() { // from class: com.appnext.nativeads.MediaView.1
                    @Override // com.appnext.a.a.InterfaceC0144a
                    public final void aF() {
                        ((ImageView) MediaView.this.fm).setImageResource(0);
                    }

                    @Override // com.appnext.a.a.InterfaceC0144a
                    public final void onPause() {
                        ((ImageView) MediaView.this.fm).setImageResource(R.drawable.apnxt_na_play);
                    }
                });
                this.fk.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.appnext.nativeads.MediaView.2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        try {
                            if (Build.VERSION.SDK_INT >= 16) {
                                MediaView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            } else {
                                MediaView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                            }
                            if (MediaView.this.fk == null) {
                                return;
                            }
                            if (MediaView.this.getLayoutParams().height == -2) {
                                MediaView.this.fk.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                            } else if (MediaView.this.getLayoutParams().height == -1) {
                                MediaView.this.fk.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                            } else if (MediaView.this.getLayoutParams().height < i.a(MediaView.this.getContext(), 200.0f)) {
                                MediaView.this.fk.setLayoutParams(new RelativeLayout.LayoutParams(-1, i.a(MediaView.this.getContext(), 200.0f)));
                            } else {
                                MediaView.this.fk.setLayoutParams(new RelativeLayout.LayoutParams(-1, MediaView.this.getHeight()));
                            }
                            ((RelativeLayout.LayoutParams) MediaView.this.fk.getLayoutParams()).addRule(13);
                            ((RelativeLayout.LayoutParams) MediaView.this.fm.getLayoutParams()).addRule(13);
                        } catch (Throwable th) {
                            com.appnext.base.a.a("MediaView$initVideo", th);
                        }
                    }
                });
                this.fk.setLayoutParams(new RelativeLayout.LayoutParams(-1, 1));
                addView(this.fk);
                this.fk.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.appnext.nativeads.MediaView.3
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        try {
                            MediaView.this.mediaPlayer = mediaPlayer;
                            if (MediaView.this.isMute()) {
                                MediaView.this.mediaPlayer.setVolume(0.0f, 0.0f);
                            } else {
                                MediaView.this.mediaPlayer.setVolume(1.0f, 1.0f);
                            }
                            MediaView.this.mHandler.removeCallbacksAndMessages(null);
                            MediaView.this.mHandler.post(MediaView.this.tick);
                            MediaView.this.mediaPlayer.seekTo(MediaView.this.fp);
                            MediaView.this.mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.appnext.nativeads.MediaView.3.1
                                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                                public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                                    try {
                                        if (!MediaView.this.isAutoPLay() || MediaView.this.fk == null || MediaView.this.fh == null || MediaView.this.fh.getNativeAdView().getVisiblePercent(MediaView.this.fk) <= 90) {
                                            return;
                                        }
                                        MediaView.this.play();
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                            new Handler().postDelayed(new Runnable() { // from class: com.appnext.nativeads.MediaView.3.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        MediaView.this.fm.getLayoutParams().height = MediaView.this.fk.getMeasuredHeight();
                                    } catch (Throwable th) {
                                        com.appnext.base.a.a("MediaView$initVideo", th);
                                    }
                                }
                            }, 200L);
                            MediaView.this.mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.appnext.nativeads.MediaView.3.3
                                @Override // android.media.MediaPlayer.OnInfoListener
                                public final boolean onInfo(MediaPlayer mediaPlayer2, int i10, int i11) {
                                    return false;
                                }
                            });
                        } catch (Throwable unused) {
                        }
                    }
                });
                this.fk.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.appnext.nativeads.MediaView.4
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                        return true;
                    }
                });
                this.fk.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.appnext.nativeads.MediaView.5
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        try {
                            if (MediaView.this.mediaPlayer == null || MediaView.this.mediaPlayer.getCurrentPosition() == 0 || MediaView.this.mediaPlayer.getDuration() == 0) {
                                return;
                            }
                            if (MediaView.this.finished) {
                                return;
                            }
                            MediaView.this.finished = true;
                            if (MediaView.this.isClickEnabled()) {
                                return;
                            }
                            ((ImageView) MediaView.this.fm).setImageResource(R.drawable.apnxt_na_play);
                        } catch (Throwable th) {
                            com.appnext.base.a.a("MediaView$initVideo", th);
                        }
                    }
                });
                String selectedVideo = this.fj.getSelectedVideo();
                if (selectedVideo != null && !selectedVideo.equals("")) {
                    View aVar = new a(getContext());
                    this.fm = aVar;
                    addView(aVar);
                    this.fm.getLayoutParams().height = -1;
                    this.fm.getLayoutParams().width = -1;
                    ((ImageView) this.fm).setImageResource(R.drawable.apnxt_na_play);
                    ((ImageView) this.fm).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    this.fm.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.nativeads.MediaView.6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            try {
                                if (MediaView.this.fk != null && MediaView.this.fk.isPlaying()) {
                                    if (MediaView.this.isClickEnabled()) {
                                        if (!MediaView.this.isAutoPLay()) {
                                            ((ImageView) MediaView.this.fm).setImageResource(R.drawable.apnxt_na_play);
                                        }
                                        MediaView.super.callOnClick();
                                        return;
                                    }
                                    MediaView.this.fo = true;
                                    MediaView.this.fk.pause();
                                    return;
                                }
                                MediaView.this.fo = false;
                                MediaView.this.finished = false;
                                MediaView.this.fk.start();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    if (isAutoPLay()) {
                        ((ImageView) this.fm).setImageResource(0);
                    }
                    a aVar2 = new a(getContext());
                    this.fn = aVar2;
                    addView(aVar2);
                    this.fn.getLayoutParams().height = i.a(getContext(), 30.0f);
                    this.fn.getLayoutParams().width = i.a(getContext(), 30.0f);
                    if (isMute()) {
                        this.fn.setImageResource(R.drawable.apnxt_na_mute);
                    } else {
                        this.fn.setImageResource(R.drawable.apnxt_na_unmute);
                    }
                    this.fn.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.nativeads.MediaView.7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            try {
                                MediaView mediaView = MediaView.this;
                                mediaView.setMute(!mediaView.isMute());
                                if (MediaView.this.isMute()) {
                                    MediaView.this.fn.setImageResource(R.drawable.apnxt_na_mute);
                                } else {
                                    MediaView.this.fn.setImageResource(R.drawable.apnxt_na_unmute);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    com.appnext.a.a aVar3 = this.fk;
                    String b10 = i.b(selectedVideo);
                    String str = getContext().getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
                    if (new File(str + b10).exists()) {
                        parse = Uri.parse(str + b10);
                    } else {
                        parse = Uri.parse(selectedVideo);
                    }
                    aVar3.setVideoURI(parse);
                }
                removeView(this.fk);
                this.fk = null;
                aE();
            } else {
                aE();
            }
            if (getBackground() == null) {
                setBackgroundColor(-16777216);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("MediaView$initData", th);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fg = true;
        this.mute = false;
        this.clickEnabled = true;
        this.fo = false;
        this.finished = false;
        this.fp = 0;
        this.tick = new Runnable() { // from class: com.appnext.nativeads.MediaView.8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (MediaView.this.mediaPlayer != null && MediaView.this.mediaPlayer.isPlaying()) {
                        MediaView mediaView = MediaView.this;
                        mediaView.fp = mediaView.mediaPlayer.getCurrentPosition();
                    }
                } catch (Throwable unused) {
                }
                if (MediaView.this.mHandler != null) {
                    MediaView.this.mHandler.postDelayed(MediaView.this.tick, 500L);
                }
            }
        };
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.fg = true;
        this.mute = false;
        this.clickEnabled = true;
        this.fo = false;
        this.finished = false;
        this.fp = 0;
        this.tick = new Runnable() { // from class: com.appnext.nativeads.MediaView.8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (MediaView.this.mediaPlayer != null && MediaView.this.mediaPlayer.isPlaying()) {
                        MediaView mediaView = MediaView.this;
                        mediaView.fp = mediaView.mediaPlayer.getCurrentPosition();
                    }
                } catch (Throwable unused) {
                }
                if (MediaView.this.mHandler != null) {
                    MediaView.this.mHandler.postDelayed(MediaView.this.tick, 500L);
                }
            }
        };
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.fg = true;
        this.mute = false;
        this.clickEnabled = true;
        this.fo = false;
        this.finished = false;
        this.fp = 0;
        this.tick = new Runnable() { // from class: com.appnext.nativeads.MediaView.8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (MediaView.this.mediaPlayer != null && MediaView.this.mediaPlayer.isPlaying()) {
                        MediaView mediaView = MediaView.this;
                        mediaView.fp = mediaView.mediaPlayer.getCurrentPosition();
                    }
                } catch (Throwable unused) {
                }
                if (MediaView.this.mHandler != null) {
                    MediaView.this.mHandler.postDelayed(MediaView.this.tick, 500L);
                }
            }
        };
    }
}
