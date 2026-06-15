package com.appnext.banners;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C0400r;
import com.appnext.core.ECPM;
import com.appnext.core.SettingsManager;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.appnext.core.d;
import com.appnext.core.h;
import com.appnext.core.i;
import com.appnext.core.k;
import com.appnext.core.l;
import com.appnext.core.p;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends BaseBannerAdapter {
    private BannerAdRequest adRequest;
    private ArrayList<AppnextAd> ads;
    private BannerAd bannerAd;
    private BannerAdData currentAd;
    private Handler mHandler;
    private MediaPlayer mediaPlayer;
    private C0400r userAction;
    private VideoView videoView;
    private final int TICK = 330;
    private boolean userMute = true;
    private String template = "";
    private int lastProgress = 0;
    private int currentPosition = 0;
    private boolean started = false;
    private boolean finished = false;
    private boolean reportedImpression = false;
    private boolean loaded = false;
    private boolean clickEnabled = true;
    private Runnable tick = new Runnable() { // from class: com.appnext.banners.a.16
        @Override // java.lang.Runnable
        public final void run() {
            try {
                a.this.checkProgress();
                a aVar = a.this;
                aVar.currentPosition = aVar.mediaPlayer.getCurrentPosition();
                if (a.this.mediaPlayer.getCurrentPosition() >= a.this.mediaPlayer.getDuration() || a.this.finished) {
                    return;
                }
                a.this.mHandler.postDelayed(a.this.tick, 330L);
            } catch (Throwable th) {
                com.appnext.base.a.a("BannerAdapter$Runnable", th);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void checkProgress() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                int currentPosition = (int) ((mediaPlayer.getCurrentPosition() / this.mediaPlayer.getDuration()) * 100.0f);
                if (currentPosition > 25 && this.lastProgress == 0) {
                    this.lastProgress = 25;
                    report("video_25");
                } else if (currentPosition > 50 && this.lastProgress == 25) {
                    this.lastProgress = 50;
                    report("video_50");
                } else if (currentPosition <= 75 || this.lastProgress != 50) {
                } else {
                    this.lastProgress = 75;
                    report("video_75");
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$checkProgress", th);
        }
    }

    private void createVideo(final ViewGroup viewGroup) {
        try {
            if (this.adRequest.isAutoPlay()) {
                report("auto_play_on");
            } else {
                report("auto_play_off");
            }
            if (this.adRequest.isMute()) {
                report("mute_on");
            } else {
                report("mute_off");
            }
            this.userMute = this.adRequest.isMute();
            int i10 = R.id.mute;
            ((ImageView) viewGroup.findViewById(i10)).setImageResource(this.userMute ? R.drawable.apnxt_banner_unmute : R.drawable.apnxt_banner_mute);
            viewGroup.findViewById(i10).setVisibility(0);
            viewGroup.findViewById(i10).setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar;
                    a.this.userMute = !aVar.userMute;
                    if (a.this.mediaPlayer != null) {
                        try {
                            MediaPlayer mediaPlayer = a.this.mediaPlayer;
                            float f10 = 0.0f;
                            float f11 = a.this.userMute ? 0.0f : 1.0f;
                            if (!a.this.userMute) {
                                f10 = 1.0f;
                            }
                            mediaPlayer.setVolume(f11, f10);
                            ((ImageView) viewGroup.findViewById(R.id.mute)).setImageResource(a.this.userMute ? R.drawable.apnxt_banner_unmute : R.drawable.apnxt_banner_mute);
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
            this.videoView = new VideoView(this.context.getApplicationContext());
            this.videoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            viewGroup.addView(this.videoView, 0);
            viewGroup.findViewById(R.id.click).setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (a.this.isClickEnabled() && a.this.mediaPlayer != null && a.this.mediaPlayer.isPlaying()) {
                        a.this.click();
                        return;
                    }
                    ViewGroup viewGroup2 = viewGroup;
                    int i11 = R.id.play;
                    ((ImageView) viewGroup2.findViewById(i11)).setImageResource(R.drawable.apnxt_banner_pause);
                    viewGroup.findViewById(i11).setVisibility(0);
                    a.this.pause();
                }
            });
            this.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.appnext.banners.a.11
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    a.this.mediaPlayer = mediaPlayer;
                    a.this.mediaPlayer.seekTo(a.this.currentPosition);
                    a.this.mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.appnext.banners.a.11.1
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                            if (!a.this.adRequest.isAutoPlay() || a.this.finished) {
                                return;
                            }
                            a aVar = a.this;
                            if (aVar.getVisiblePercent(aVar.rootView) <= 90 || a.this.mediaPlayer.isPlaying()) {
                                return;
                            }
                            a.this.play();
                            try {
                                a.this.rootView.findViewById(R.id.media).findViewById(R.id.play).setVisibility(8);
                            } catch (Throwable th) {
                                com.appnext.base.a.a("BannerAdapter$createVideo", th);
                            }
                            if (a.this.started) {
                                return;
                            }
                            a.this.report("video_started");
                            a.this.started = true;
                        }
                    });
                    if (a.this.adRequest.isAutoPlay() && !a.this.finished) {
                        a aVar = a.this;
                        if (aVar.getVisiblePercent(aVar.rootView) > 90) {
                            a.this.play();
                            try {
                                a.this.rootView.findViewById(R.id.media).findViewById(R.id.play).setVisibility(8);
                            } catch (Throwable th) {
                                com.appnext.base.a.a("BannerAdapter$createVideo", th);
                            }
                            if (!a.this.started) {
                                a.this.report("video_started");
                                a.this.started = true;
                            }
                        }
                    }
                    a.this.mHandler.postDelayed(a.this.tick, 33L);
                    if (a.this.userMute) {
                        a.this.mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        a.this.mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            });
            this.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.appnext.banners.a.13
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    if (a.this.mediaPlayer == null || a.this.mediaPlayer.getCurrentPosition() == 0 || a.this.mediaPlayer.getDuration() == 0 || a.this.finished) {
                        return;
                    }
                    a.this.mediaPlayer.getCurrentPosition();
                    a.this.mediaPlayer.getDuration();
                    a.this.finished = true;
                    a.this.report("video_ended");
                }
            });
            this.videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.appnext.banners.a.14
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
                    return true;
                }
            });
            this.videoView.setVideoURI(Uri.parse(getVideoUrl(getSelectedAd(), this.adRequest.getVideoLength())));
            int i11 = R.id.play;
            viewGroup.findViewById(i11).setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    viewGroup.findViewById(R.id.wide_image).setVisibility(8);
                    viewGroup.findViewById(R.id.play).setVisibility(8);
                    a.this.play();
                }
            });
            if (this.adRequest.isAutoPlay()) {
                return;
            }
            viewGroup.findViewById(i11).setVisibility(0);
            l.aa().a(this.context, (ImageView) viewGroup.findViewById(R.id.wide_image), getSelectedAd().getWideImageURL(), null);
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$createVideo", th);
        }
    }

    private void createWideImage(ImageView imageView) {
        report("static_creative");
        l.aa().a(this.context, imageView, getSelectedAd().getWideImageURL(), null);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.report("banner_click_else");
                a.this.click();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load() {
        try {
            if (this.adRequest == null) {
                return;
            }
            b.J().a(this.context, this.bannerAd, getPlacementId(), new d.a() { // from class: com.appnext.banners.a.17
                /* JADX WARN: Code restructure failed: missing block: B:69:0x0183, code lost:
                    if (r8 == 1) goto L65;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x0185, code lost:
                    if (r8 == 2) goto L63;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
                    r13.bz.report("loaded_medium_rectangle");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x018f, code lost:
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x0190, code lost:
                    r13.bz.report("loaded_large_banner");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
                    return;
                 */
                /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x012b A[Catch: all -> 0x01a0, TryCatch #2 {all -> 0x01a0, blocks: (B:3:0x0002, B:6:0x000b, B:8:0x002a, B:10:0x0039, B:12:0x004a, B:15:0x0051, B:17:0x0055, B:26:0x0082, B:29:0x00ee, B:47:0x0122, B:48:0x0125, B:49:0x0128, B:50:0x012b, B:34:0x0103, B:37:0x010b, B:40:0x0113, B:51:0x012d, B:53:0x0144, B:54:0x0155, B:72:0x0188, B:74:0x0190, B:75:0x0198, B:59:0x016a, B:62:0x0172, B:65:0x017a, B:19:0x0059, B:21:0x005f, B:22:0x0069), top: B:80:0x0002 }] */
                @Override // com.appnext.core.d.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final <T> void a(T r14) {
                    /*
                        Method dump skipped, instructions count: 421
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.a.AnonymousClass17.a(java.lang.Object):void");
                }

                @Override // com.appnext.core.d.a
                public final void error(String str) {
                    try {
                        String str2 = "";
                        char c10 = 65535;
                        switch (str.hashCode()) {
                            case -2026653947:
                                if (str.equals("Internal error")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -1958363695:
                                if (str.equals(AppnextError.NO_ADS)) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case -1477010874:
                                if (str.equals(AppnextError.CONNECTION_ERROR)) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -507110949:
                                if (str.equals(AppnextError.NO_MARKET)) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 350741825:
                                if (str.equals("Timeout")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 844170097:
                                if (str.equals(AppnextError.SLOW_CONNECTION)) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                        }
                        if (c10 == 0) {
                            str2 = "error_connection_error";
                        } else if (c10 == 1) {
                            str2 = "error_internal_error";
                        } else if (c10 == 2) {
                            str2 = "error_no_ads";
                        } else if (c10 == 3) {
                            str2 = "error_no_market";
                        } else if (c10 == 4) {
                            str2 = "error_slow_connection";
                        } else if (c10 == 5) {
                            str2 = "error_timeout";
                        }
                        a.this.report(str2);
                        if (a.this.getBannerListener() != null) {
                            a.this.getBannerListener().onError(new AppnextError(str));
                        }
                    } catch (Throwable th) {
                        com.appnext.base.a.a("BannerAdapter$load", th);
                    }
                }
            }, this.adRequest);
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$load", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void report(String str) {
        try {
            BannerAd bannerAd = this.bannerAd;
            if (bannerAd != null) {
                i.a(this.context, bannerAd.getTID(), this.bannerAd.getVID(), this.bannerAd.getAUID(), getPlacementId() == null ? "" : getPlacementId(), this.bannerAd.getSessionId(), str, this.template, getSelectedAd() != null ? getSelectedAd().getBannerID() : "", getSelectedAd() != null ? getSelectedAd().getCampaignID() : "");
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$report", th);
        }
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public void click() {
        report("click_event");
        if (getBannerListener() != null) {
            getBannerListener().onAdClicked();
        }
        this.userAction.a(getSelectedAd(), getSelectedAd().getAppURL(), getPlacementId(), new h.a() { // from class: com.appnext.banners.a.7
            @Override // com.appnext.core.h.a
            public final void error(String str) {
            }

            @Override // com.appnext.core.h.a
            public final void onMarket(String str) {
                try {
                    if (a.this.mediaPlayer == null || !a.this.mediaPlayer.isPlaying()) {
                        return;
                    }
                    a.this.pause();
                    ViewGroup viewGroup = a.this.rootView;
                    int i10 = R.id.media;
                    View findViewById = viewGroup.findViewById(i10);
                    int i11 = R.id.play;
                    ((ImageView) findViewById.findViewById(i11)).setImageResource(R.drawable.apnxt_banner_pause);
                    a.this.rootView.findViewById(i10).findViewById(i11).setVisibility(0);
                } catch (Throwable th) {
                    com.appnext.base.a.a("BannerAdapter$click", th);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r1 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r1 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        return new com.appnext.banners.MediumRectangleAd(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        return new com.appnext.banners.LargeBannerAd(r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.appnext.core.Ad createAd(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            com.appnext.banners.BannerSize r0 = r6.getBannerSize()     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L55
            r1 = -1
            int r2 = r0.hashCode()     // Catch: java.lang.Throwable -> L55
            r3 = -1966536496(0xffffffff8ac908d0, float:-1.9358911E-32)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L33
            r3 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
            if (r2 == r3) goto L29
            r3 = 1951953708(0x7458732c, float:6.859571E31)
            if (r2 == r3) goto L1f
            goto L3c
        L1f:
            java.lang.String r2 = "BANNER"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L3c
            r1 = 0
            goto L3c
        L29:
            java.lang.String r2 = "MEDIUM_RECTANGLE"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L3c
            r1 = r4
            goto L3c
        L33:
            java.lang.String r2 = "LARGE_BANNER"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L3c
            r1 = r5
        L3c:
            if (r1 == 0) goto L4f
            if (r1 == r5) goto L49
            if (r1 == r4) goto L43
            goto L5b
        L43:
            com.appnext.banners.MediumRectangleAd r0 = new com.appnext.banners.MediumRectangleAd     // Catch: java.lang.Throwable -> L55
            r0.<init>(r7, r8)     // Catch: java.lang.Throwable -> L55
            return r0
        L49:
            com.appnext.banners.LargeBannerAd r0 = new com.appnext.banners.LargeBannerAd     // Catch: java.lang.Throwable -> L55
            r0.<init>(r7, r8)     // Catch: java.lang.Throwable -> L55
            return r0
        L4f:
            com.appnext.banners.SmallBannerAd r0 = new com.appnext.banners.SmallBannerAd     // Catch: java.lang.Throwable -> L55
            r0.<init>(r7, r8)     // Catch: java.lang.Throwable -> L55
            return r0
        L55:
            r0 = move-exception
            java.lang.String r1 = "BannerAdapter$createAd"
            com.appnext.base.a.a(r1, r0)
        L5b:
            com.appnext.banners.SmallBannerAd r0 = new com.appnext.banners.SmallBannerAd
            r0.<init>(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.a.createAd(android.content.Context, java.lang.String):com.appnext.core.Ad");
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public void destroy() {
        super.destroy();
        try {
            C0400r c0400r = this.userAction;
            if (c0400r != null) {
                c0400r.destroy();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$destroy", th);
        }
        try {
            VideoView videoView = this.videoView;
            if (videoView != null) {
                videoView.setOnCompletionListener(null);
                this.videoView.setOnErrorListener(null);
                this.videoView.setOnPreparedListener(null);
                this.videoView.suspend();
                this.videoView = null;
                this.mediaPlayer.release();
                this.mediaPlayer = null;
            }
        } catch (Throwable th2) {
            com.appnext.base.a.a("BannerAdapter$destroy", th2);
        }
        try {
            BannerAd bannerAd = this.bannerAd;
            if (bannerAd != null) {
                bannerAd.destroy();
                this.bannerAd = null;
            }
        } catch (Throwable th3) {
            com.appnext.base.a.a("BannerAdapter$destroy", th3);
        }
        this.adRequest = null;
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th4) {
            com.appnext.base.a.a("BannerAdapter$destroy", th4);
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BannerAdRequest getAdRequest() {
        return this.adRequest;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ArrayList<AppnextAd> getAds() {
        return this.ads;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BannerAd getBannerAd() {
        return this.bannerAd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getButtonText(AppnextAd appnextAd) {
        try {
            String buttonText = new BannerAdData(appnextAd).getButtonText();
            boolean b10 = i.b(this.context, getSelectedAd().getAdPackage());
            String str = "existing";
            if (appnextAd != null && buttonText.equals("")) {
                if (b10) {
                    return com.appnext.core.b.a.q(this.context.getApplicationContext()).a(getLanguage(), "existing", d.K().t("existing_button_text"));
                }
                return com.appnext.core.b.a.q(this.context.getApplicationContext()).a(getLanguage(), "new", d.K().t("new_button_text"));
            }
            com.appnext.core.b.a q10 = com.appnext.core.b.a.q(this.context.getApplicationContext());
            String language = getLanguage();
            if (!b10) {
                str = "new";
            }
            return q10.a(language, str, buttonText);
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$getButtonText", th);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getCreativeType(AppnextAd appnextAd) {
        try {
            return this.adRequest.getCreativeType().equals(BannerAdRequest.TYPE_ALL) ? b.hasVideo(appnextAd) ? 0 : 1 : (this.adRequest.getCreativeType().equals("video") && b.hasVideo(appnextAd)) ? 0 : 1;
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$getCreativeType", th);
            return 0;
        }
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public void getECPM(final BannerAdRequest bannerAdRequest, final OnECPMLoaded onECPMLoaded) {
        try {
            if (bannerAdRequest != null) {
                if (getPlacementId() != null) {
                    if (getBannerSize() == null) {
                        throw new IllegalStateException("Missing banner size.");
                    }
                    if (onECPMLoaded != null) {
                        if (this.bannerAd == null) {
                            this.bannerAd = (BannerAd) createAd(this.context, getPlacementId());
                        }
                        this.bannerAd.setCategories(bannerAdRequest.getCategories());
                        this.bannerAd.setSpecificCategories(bannerAdRequest.getSpecificCategories());
                        this.bannerAd.setPostback(bannerAdRequest.getPostback());
                        b.J().a(this.context, this.bannerAd, getPlacementId(), new d.a() { // from class: com.appnext.banners.a.18
                            @Override // com.appnext.core.d.a
                            public final <T> void a(T t10) {
                                b J = b.J();
                                a aVar = a.this;
                                AppnextAd a10 = J.a(aVar.context, aVar.bannerAd, bannerAdRequest.getCreativeType());
                                if (a10 == null) {
                                    a.this.report("error_no_ads");
                                    OnECPMLoaded onECPMLoaded2 = onECPMLoaded;
                                    if (onECPMLoaded2 != null) {
                                        onECPMLoaded2.error(AppnextError.NO_ADS);
                                        return;
                                    }
                                    return;
                                }
                                OnECPMLoaded onECPMLoaded3 = onECPMLoaded;
                                if (onECPMLoaded3 != null) {
                                    onECPMLoaded3.ecpm(new ECPM(a10.getECPM(), a10.getPPR(), a10.getBannerID()));
                                }
                            }

                            @Override // com.appnext.core.d.a
                            public final void error(String str) {
                                OnECPMLoaded onECPMLoaded2 = onECPMLoaded;
                                if (onECPMLoaded2 != null) {
                                    onECPMLoaded2.error(str);
                                }
                            }
                        }, bannerAdRequest);
                        return;
                    }
                    throw new IllegalStateException("callback cannot be null.");
                }
                throw new IllegalStateException("Missing placement id.");
            }
            throw new IllegalStateException("BannerAdRequest cannot be null.");
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$load", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BannerAdData getSelectedAd() {
        return this.currentAd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C0400r getUserAction() {
        return this.userAction;
    }

    protected String getVideoUrl(AppnextAd appnextAd, String str) {
        if (str.equals("30")) {
            String videoUrl30Sec = appnextAd.getVideoUrl30Sec();
            if (videoUrl30Sec.equals("")) {
                videoUrl30Sec = appnextAd.getVideoUrl();
            }
            if (videoUrl30Sec.equals("")) {
                videoUrl30Sec = appnextAd.getVideoUrlHigh30Sec();
            }
            return videoUrl30Sec.equals("") ? appnextAd.getVideoUrlHigh() : videoUrl30Sec;
        }
        String videoUrl = appnextAd.getVideoUrl();
        if (videoUrl.equals("")) {
            videoUrl = appnextAd.getVideoUrl30Sec();
        }
        if (videoUrl.equals("")) {
            videoUrl = appnextAd.getVideoUrlHigh();
        }
        return videoUrl.equals("") ? appnextAd.getVideoUrlHigh30Sec() : videoUrl;
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public void impression() {
        try {
            synchronized (this) {
                if (this.loaded && !this.reportedImpression && this.userAction != null) {
                    this.reportedImpression = true;
                    p.ac().a(new Runnable() { // from class: com.appnext.banners.a.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (a.this.getSelectedAd() == null || a.this.bannerAd == null) {
                                    return;
                                }
                                a.this.getSelectedAd().getBannerID();
                                a.this.bannerAd.getAUID();
                                com.appnext.core.adswatched.a.m(a.this.context).j(a.this.getSelectedAd().getBannerID(), a.this.bannerAd.getAUID());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    if (getSelectedAd() != null) {
                        this.mHandler.postDelayed(new Runnable() { // from class: com.appnext.banners.a.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.this.userAction.d(a.this.getSelectedAd());
                            }
                        }, Integer.parseInt(d.K().t("postpone_impression_sec")) * 1000);
                        report("impression_event");
                        if (Boolean.parseBoolean(d.K().t("pview"))) {
                            this.mHandler.postDelayed(new Runnable() { // from class: com.appnext.banners.a.6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    a.this.userAction.a(a.this.getSelectedAd(), a.this.getSelectedAd().getAppURL(), null);
                                }
                            }, Integer.parseInt(d.K().t("postpone_vta_sec")) * 1000);
                        }
                        if (getBannerListener() != null) {
                            getBannerListener().adImpression();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$impression", th);
        }
    }

    protected void inflateView(int i10, final AppnextAd appnextAd) {
        try {
            View inflate = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(i10, this.rootView, false);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.19
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.report("banner_click_else");
                    a.this.click();
                }
            });
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.report("banner_click_icon");
                        a.this.click();
                    }
                });
                l.aa().a(this.context, imageView, appnextAd.getImageURL(), null);
            }
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(appnextAd.getAdTitle());
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.21
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.report("banner_click_else");
                        a.this.click();
                    }
                });
            }
            RatingBar ratingBar = (RatingBar) inflate.findViewById(R.id.ratingBar);
            if (ratingBar != null) {
                ratingBar.setRating(Float.parseFloat(appnextAd.getStoreRating()));
                ratingBar.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.22
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.report("banner_click_else");
                        a.this.click();
                    }
                });
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.description);
            if (textView2 != null) {
                textView2.setText(appnextAd.getAdDescription());
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.23
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.report("banner_click_else");
                        a.this.click();
                    }
                });
            }
            View findViewById = inflate.findViewById(R.id.install);
            ((TextView) findViewById).setText(getButtonText(appnextAd));
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.report("banner_click_cta");
                    a.this.click();
                }
            });
            View findViewById2 = inflate.findViewById(R.id.media);
            if (findViewById2 != null) {
                if (getCreativeType(appnextAd) != 0) {
                    createWideImage((ImageView) inflate.findViewById(R.id.wide_image));
                } else {
                    createVideo((ViewGroup) findViewById2);
                }
            }
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.privacy);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.banners.a.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.openLink(i.f(appnextAd));
                }
            });
            if (k.a(appnextAd, d.K())) {
                k.a(this.context, imageView2);
            }
            ViewGroup viewGroup = this.rootView;
            if (viewGroup != null && viewGroup.getChildCount() > 0) {
                this.rootView.removeViewAt(0);
            }
            this.rootView.addView(inflate);
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$inflateView", th);
        }
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public void init(ViewGroup viewGroup) {
        super.init(viewGroup);
        this.userAction = new C0400r(this.context, new C0400r.a() { // from class: com.appnext.banners.a.1
            @Override // com.appnext.core.C0400r.a
            public final Ad c() {
                return a.this.bannerAd;
            }

            @Override // com.appnext.core.C0400r.a
            public final AppnextAd d() {
                return a.this.getSelectedAd();
            }

            @Override // com.appnext.core.C0400r.a
            public final SettingsManager e() {
                return d.K();
            }

            @Override // com.appnext.core.C0400r.a
            public final void report(String str) {
                a.this.report(str);
            }
        });
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isReportedImpression() {
        return this.reportedImpression;
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public void loadAd(BannerAdRequest bannerAdRequest) {
        try {
            if (!i.h(this.context)) {
                BannerListener bannerListener = getBannerListener();
                if (bannerListener != null) {
                    bannerListener.onError(new AppnextError(AppnextError.CONNECTION_ERROR));
                }
            } else if (bannerAdRequest != null) {
                if (getPlacementId() != null) {
                    if (getBannerSize() != null) {
                        if (this.bannerAd == null) {
                            this.bannerAd = (BannerAd) createAd(this.context, getPlacementId());
                        }
                        this.bannerAd.setCategories(bannerAdRequest.getCategories());
                        this.bannerAd.setSpecificCategories(bannerAdRequest.getSpecificCategories());
                        this.bannerAd.setPostback(bannerAdRequest.getPostback());
                        this.adRequest = new BannerAdRequest(bannerAdRequest);
                        setClickEnabled(bannerAdRequest.isClickEnabled());
                        this.loaded = false;
                        this.reportedImpression = false;
                        if (i.q(i.d(this.context)) == 0) {
                            this.adRequest.setCreativeType("static");
                        }
                        d.K().a(this.context, getPlacementId(), new SettingsManager.ConfigCallback() { // from class: com.appnext.banners.a.12
                            @Override // com.appnext.core.SettingsManager.ConfigCallback
                            public final void error(String str) {
                                a.this.load();
                            }

                            @Override // com.appnext.core.SettingsManager.ConfigCallback
                            public final void loaded(HashMap<String, Object> hashMap) {
                                a.this.load();
                            }
                        });
                        return;
                    }
                    throw new IllegalStateException("Missing banner size.");
                }
                throw new IllegalStateException("Missing placement id.");
            } else {
                throw new IllegalStateException("BannerAdRequest cannot be null.");
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$loadAd", th);
        }
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public void onScrollChanged(int i10) {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer == null || this.finished) {
                return;
            }
            if (mediaPlayer.isPlaying() && i10 < 90) {
                try {
                    this.rootView.findViewById(R.id.media).findViewById(R.id.play).setVisibility(0);
                } catch (Throwable unused) {
                }
                pause();
            }
            if (this.mediaPlayer.isPlaying() || i10 <= 90 || !this.adRequest.isAutoPlay()) {
                return;
            }
            this.mediaPlayer.getCurrentPosition();
            this.mediaPlayer.getDuration();
            play();
            try {
                this.rootView.findViewById(R.id.media).findViewById(R.id.play).setVisibility(8);
            } catch (Throwable unused2) {
            }
            if (this.started) {
                return;
            }
            report("video_started");
            this.started = true;
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$onScrollChanged", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.banners.BaseBannerAdapter
    public void openLink(String str) {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                pause();
                ViewGroup viewGroup = this.rootView;
                int i10 = R.id.media;
                View findViewById = viewGroup.findViewById(i10);
                int i11 = R.id.play;
                ((ImageView) findViewById.findViewById(i11)).setImageResource(R.drawable.apnxt_banner_pause);
                this.rootView.findViewById(i10).findViewById(i11).setVisibility(0);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdapter$openLink", th);
        }
        if (str.contains("privacy_policy/index.")) {
            str = i.f(getSelectedAd());
        }
        try {
            super.openLink(str);
        } catch (Throwable th2) {
            com.appnext.base.a.a("BannerAdapter$openLink", th2);
            report("error_no_market");
        }
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public void pause() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.mediaPlayer.pause();
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public void play() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null || mediaPlayer.isPlaying()) {
            return;
        }
        this.mediaPlayer.start();
    }

    @Override // com.appnext.banners.BaseBannerAdapter
    public void setClickEnabled(boolean z10) {
        this.clickEnabled = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setReportedImpression(boolean z10) {
        this.reportedImpression = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSelectedAd(BannerAdData bannerAdData) {
        this.currentAd = bannerAdData;
    }
}
