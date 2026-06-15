package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.b7;
import com.applovin.impl.d7;
import com.applovin.impl.e7;
import com.applovin.impl.j7;
import com.applovin.impl.k7;
import com.applovin.impl.l0;
import com.applovin.impl.o4;
import com.applovin.impl.o7;
import com.applovin.impl.p7;
import com.applovin.impl.q7;
import com.applovin.impl.s7;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.u7;
import com.applovin.impl.x0;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final x0 countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private boolean isViewAttached;
    private int lastVideoPositionFromPauseMillis;
    private final com.applovin.impl.b lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private MediaPlayer mediaPlayer;
    private ImageView muteButtonImageView;
    private ImageView playPauseButtonImageView;
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final e7 vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set<o7> videoProgressTrackers;
    private final e videoUiEventHandler;
    private final AppLovinVideoView videoView;
    private boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                AppLovinVastMediaView.this.maybeHandlePause();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (!activity.equals(AppLovinVastMediaView.this.viewActivity) || AppLovinVastMediaView.this.isVideoPausedByUser) {
                return;
            }
            AppLovinVastMediaView.this.maybeHandleResume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements x0.b {
        b() {
        }

        @Override // com.applovin.impl.x0.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - (AppLovinVastMediaView.this.videoView.getDuration() - AppLovinVastMediaView.this.videoView.getCurrentPosition()));
            int videoPercentViewed = AppLovinVastMediaView.this.getVideoPercentViewed();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(AppLovinVastMediaView.this.videoProgressTrackers).iterator();
            while (it.hasNext()) {
                o7 o7Var = (o7) it.next();
                if (o7Var.a(seconds, videoPercentViewed)) {
                    hashSet.add(o7Var);
                    AppLovinVastMediaView.this.videoProgressTrackers.remove(o7Var);
                }
            }
            AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
            if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().x();
            } else if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().y();
            } else if (videoPercentViewed >= 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.x0.b
        public boolean b() {
            return !AppLovinVastMediaView.this.videoWasCompleted;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri c10;
            k7 j12 = AppLovinVastMediaView.this.vastAd.j1();
            if (j12 == null || (c10 = j12.c()) == null) {
                return;
            }
            n nVar = AppLovinVastMediaView.this.logger;
            if (n.a()) {
                n nVar2 = AppLovinVastMediaView.this.logger;
                nVar2.a(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + c10);
            }
            AppLovinVastMediaView.this.maybeFireTrackers(e7.d.INDUSTRY_ICON_CLICK);
            b7.a(c10, view.getContext(), AppLovinVastMediaView.this.sdk);
        }

        /* synthetic */ c(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class d implements AppLovinTouchToClickListener.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinNativeAdImpl f9000a;

        public d(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f9000a = appLovinNativeAdImpl;
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            Uri h02;
            AppLovinVastMediaView.this.maybeFireTrackers(e7.d.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().v();
            if (AppLovinVastMediaView.this.vastAd.F0() && (h02 = AppLovinVastMediaView.this.vastAd.h0()) != null) {
                n nVar = AppLovinVastMediaView.this.logger;
                if (n.a()) {
                    AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Clicking through video");
                }
                AppLovinVastMediaView.this.sdk.j().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.this.vastAd.b(motionEvent, false));
                this.f9000a.handleNativeAdClick(h02, null, motionEvent, (!((Boolean) AppLovinVastMediaView.this.sdk.a(o4.A)).booleanValue() || AppLovinVastMediaView.this.viewActivity == null) ? AppLovinVastMediaView.this.getContext() : AppLovinVastMediaView.this.viewActivity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            AppLovinVastMediaView.this.videoView.seekTo(0);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            n nVar = AppLovinVastMediaView.this.logger;
            if (n.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Video completed");
            }
            AppLovinVastMediaView.this.videoWasCompleted = true;
            AppLovinVastMediaView.this.finishVideo();
            if (AppLovinVastMediaView.this.replayIconContainer != null) {
                u7.a(AppLovinVastMediaView.this.replayIconContainer, (long) AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLovinVastMediaView.e.this.a();
                    }
                });
            } else {
                AppLovinVastMediaView.this.showMediaImageView();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
            appLovinVastMediaView.handleMediaError("Video view error (" + i10 + "," + i11 + ")");
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            if (i10 == 3) {
                AppLovinVastMediaView.this.countdownManager.b();
                if (AppLovinVastMediaView.this.isViewAttached) {
                    return false;
                }
                AppLovinVastMediaView.this.pauseVideo();
                return false;
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            AppLovinVastMediaView appLovinVastMediaView;
            AppLovinVastMediaView.this.mediaPlayer = mediaPlayer;
            AppLovinVastMediaView.this.mediaPlayer.setOnInfoListener(AppLovinVastMediaView.this.videoUiEventHandler);
            AppLovinVastMediaView.this.mediaPlayer.setOnErrorListener(AppLovinVastMediaView.this.videoUiEventHandler);
            float f10 = !AppLovinVastMediaView.this.isVideoMuted ? 1 : 0;
            AppLovinVastMediaView.this.mediaPlayer.setVolume(f10, f10);
            AppLovinVastMediaView.this.videoDurationMillis = appLovinVastMediaView.mediaPlayer.getDuration();
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().b((float) TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), d7.e(AppLovinVastMediaView.this.sdk));
            n nVar = AppLovinVastMediaView.this.logger;
            if (n.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + AppLovinVastMediaView.this.mediaPlayer);
            }
            if (AppLovinVastMediaView.this.isViewAttached) {
                AppLovinVastMediaView.this.videoView.start();
            }
        }

        /* synthetic */ e(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements View.OnClickListener {
        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            AppLovinVastMediaView.this.videoWasCompleted = false;
            AppLovinVastMediaView.this.automaticResumeHandled.set(false);
            AppLovinVastMediaView.this.sdk.e().a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
            AppLovinVastMediaView.this.maybeHandleResume();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AppLovinVastMediaView appLovinVastMediaView;
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.videoView.isPlaying()) {
                    AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                }
                AppLovinVastMediaView.this.isVideoPausedByUser = false;
                AppLovinVastMediaView.this.maybeHandleResume();
            } else if (view == AppLovinVastMediaView.this.muteButtonImageView) {
                if (AppLovinVastMediaView.this.mediaPlayer == null) {
                    return;
                }
                try {
                    AppLovinVastMediaView.this.isVideoMuted = !appLovinVastMediaView.isVideoMuted;
                    float f10 = !AppLovinVastMediaView.this.isVideoMuted ? 1 : 0;
                    AppLovinVastMediaView.this.mediaPlayer.setVolume(f10, f10);
                    AppLovinVastMediaView appLovinVastMediaView2 = AppLovinVastMediaView.this;
                    appLovinVastMediaView2.populateMuteImage(appLovinVastMediaView2.isVideoMuted);
                } catch (Throwable unused) {
                }
            } else if (view == AppLovinVastMediaView.this.replayIconContainer) {
                u7.b(AppLovinVastMediaView.this.replayIconContainer, (long) AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLovinVastMediaView.f.this.a();
                    }
                });
            }
        }

        /* synthetic */ f(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.j jVar, Context context) {
        super(appLovinNativeAdImpl, jVar, context);
        e eVar = new e(this, null);
        this.videoUiEventHandler = eVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new x0(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new a();
        e7 vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean G0 = vastAd.G0();
        this.isVideoStream = G0;
        if (G0) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        if (vastAd.p1()) {
            this.industryIconImageView = k7.a(vastAd.j1().e(), context, jVar);
            int dpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) jVar.a(o4.E4)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) jVar.a(o4.G4)).intValue()));
            this.industryIconImageView.setOnClickListener(new c(this, null));
            addView(this.industryIconImageView);
        }
        if (((Boolean) jVar.a(o4.L4)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            int i10 = 0;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) jVar.a(o4.K4)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            f fVar = new f(this, null);
            this.playPauseButtonImageView.setOnClickListener(fVar);
            int dpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) jVar.a(o4.I4)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2, dpToPx2));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                i10 = AppLovinSdkUtils.dpToPx(context, ((Integer) jVar.a(o4.H4)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(fVar);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            }
            int dpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) jVar.a(o4.J4)).intValue());
            this.videoWidgetLinearLayout.setPadding(dpToPx3, dpToPx3, dpToPx3, dpToPx3);
            int i11 = dpToPx3 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2 + i10 + i11, Math.max(dpToPx2, i10) + i11, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) jVar.a(o4.M4)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new f(this, null));
            ImageView imageView2 = new ImageView(getContext());
            int dpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) jVar.a(o4.N4)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(dpToPx4, dpToPx4, 17));
            imageView2.setImageResource(R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(getContext());
        this.videoView = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(jVar, o4.f8163m0, getContext(), new d(appLovinNativeAdImpl)));
        addView(appLovinVideoView);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(appLovinVideoView);
        hashSet.addAll(vastAd.a(e7.d.VIDEO, p7.f8364a));
    }

    private void checkCachedAdResourcesImmediately(boolean z10) {
        if (d7.a(z10, this.vastAd, this.sdk, getContext()).isEmpty()) {
            return;
        }
        handleUnavailableCachedResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(e7.d.VIDEO, "close");
        maybeHandlePause();
        this.sdk.e().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.getAdEventTracker().w();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.j().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoPercentViewed() {
        int currentPosition = this.videoView.getCurrentPosition();
        if (this.videoWasCompleted) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((currentPosition / ((float) this.videoDurationMillis)) * 100.0f);
        }
        return this.savedVideoPercentViewed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaError(String str) {
        if (n.a()) {
            this.logger.b(TAG, str);
        }
        maybeFireTrackers(e7.d.ERROR, j7.MEDIA_FILE_ERROR);
        this.vastAd.getAdEventTracker().b(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            this.sdk.D().a("handleVastVideoError", str, this.vastAd);
            finishVideo();
            showMediaImageView();
        }
    }

    private void handleUnavailableCachedResources() {
        if (n.a()) {
            this.logger.b(TAG, "Video failed due to unavailable resources");
        }
        finishVideo();
        showMediaImageView();
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() < this.vastAd.k0() || this.videoProgressTrackers.isEmpty()) {
            return;
        }
        if (n.a()) {
            n nVar = this.logger;
            nVar.k(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
        }
        maybeFireTrackers(this.videoProgressTrackers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(Set<o7> set) {
        maybeFireTrackers(set, j7.UNSPECIFIED);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.p1()) {
                maybeFireTrackers(e7.d.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = SystemClock.elapsedRealtime();
            maybeFireTrackers(e7.d.IMPRESSION);
            maybeFireTrackers(e7.d.VIDEO, "creativeView");
            this.vastAd.getAdEventTracker().g();
            this.vastAd.setHasShown(true);
            this.sdk.j().trackImpression(this.vastAd);
            this.viewActivity = com.applovin.impl.d.a(u7.b(this));
            this.sdk.e().a(this.lifecycleCallbacksAdapter);
            this.videoView.start();
            this.countdownManager.a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1L), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(e7.d.VIDEO, "pause");
            this.vastAd.getAdEventTracker().z();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(e7.d.VIDEO, "resume");
            this.vastAd.getAdEventTracker().A();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                if (n.a()) {
                    n nVar = this.logger;
                    nVar.a(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
                }
                this.videoView.start();
                this.countdownManager.b();
                this.lastVideoPositionFromPauseMillis = -1;
            } else if (n.a()) {
                this.logger.a(TAG, "Invalid last video position");
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseVideo() {
        if (n.a()) {
            this.logger.a(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.videoView.getCurrentPosition();
        this.videoView.pause();
        this.countdownManager.c();
        if (n.a()) {
            n nVar = this.logger;
            nVar.a(TAG, "Paused video at position " + this.lastVideoPositionFromPauseMillis + " ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean populateMuteImage(boolean z10) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        if (l0.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(z10 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return true;
            }
        }
        Uri M = z10 ? this.vastAd.M() : this.vastAd.d0();
        if (M == null) {
            return false;
        }
        ImageViewUtils.setImageUri(this.muteButtonImageView, M, this.sdk);
        return true;
    }

    private void populatePlayPauseImage(boolean z10) {
        ImageView imageView = this.playPauseButtonImageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(z10 ? R.drawable.applovin_ic_play_icon : R.drawable.applovin_ic_pause_icon);
    }

    private void prepareMediaPlayer() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        checkCachedAdResourcesImmediately(!this.isVideoStream);
        this.videoView.setVideoURI(this.vastAd.q0());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.pause();
            this.videoView.stopPlayback();
        }
        this.videoView.setOnTouchListener(null);
        this.viewActivity = null;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.vastAd.getAdEventTracker().f();
        this.countdownManager.a();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return TAG;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isViewAttached = true;
        maybeHandleOnAttachedToWindow();
        if (this.isVideoPausedByUser) {
            return;
        }
        maybeHandleResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isViewAttached = false;
        maybeHandlePause();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i10 >= 200 && i10 < 300) || this.videoWasCompleted || this.videoView.isPlaying()) {
                    return;
                }
                handleMediaError("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(e7.d dVar) {
        maybeFireTrackers(dVar, j7.UNSPECIFIED);
    }

    private void maybeFireTrackers(e7.d dVar, String str) {
        maybeFireTrackers(dVar, str, j7.UNSPECIFIED);
    }

    private void maybeFireTrackers(e7.d dVar, j7 j7Var) {
        maybeFireTrackers(dVar, "", j7Var);
    }

    private void maybeFireTrackers(e7.d dVar, String str, j7 j7Var) {
        maybeFireTrackers(this.vastAd.a(dVar, str), j7Var);
    }

    private void maybeFireTrackers(Set<o7> set, j7 j7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.videoView.getCurrentPosition());
        s7 o12 = this.vastAd.o1();
        Uri d10 = o12 != null ? o12.d() : null;
        if (n.a()) {
            n nVar = this.logger;
            nVar.a(TAG, "Firing " + set.size() + " tracker(s): " + set);
        }
        q7.a(set, seconds, d10, j7Var, this.sdk);
    }
}
