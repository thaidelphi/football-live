package com.appnext.ads.fullscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.appnext.R;
import com.appnext.core.k;
import com.ironsource.b9;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g extends Fragment {
    private ImageView P;
    private Button Q;
    private TextView R;
    private ImageView S;
    private Animation T;
    private ImageView U;
    private j W;

    /* renamed from: d  reason: collision with root package name */
    private Circle f10046d;
    private MediaPlayer mediaPlayer;
    private VideoView videoView;
    private final int TICK = 330;
    private int currentPosition = 0;
    private boolean finished = false;
    private int lastProgress = 0;
    private boolean started = false;
    private boolean V = false;
    @SuppressLint({"SetTextI18n"})
    Runnable tick = new Runnable() { // from class: com.appnext.ads.fullscreen.g.11
        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (g.this.videoView != null) {
                    g.this.videoView.getCurrentPosition();
                    g.this.videoView.getDuration();
                    if (g.this.videoView.getDuration() == -1) {
                        g.this.p();
                        return;
                    }
                    g.this.checkProgress();
                    if (g.this.f10046d.getVisibility() == 0) {
                        com.appnext.ads.fullscreen.a aVar = new com.appnext.ads.fullscreen.a(g.this.f10046d, 360.0f - (((g.this.videoView.getCurrentPosition() + 1) / g.this.videoView.getDuration()) * 360.0f));
                        aVar.setDuration(330L);
                        g.this.f10046d.startAnimation(aVar);
                    }
                    if (g.this.videoView.getCurrentPosition() >= g.this.videoView.getDuration() || g.this.finished) {
                        return;
                    }
                    g.this.mHandler.postDelayed(g.this.tick, 330L);
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("RollFragment$RunnableTick", th);
            }
        }
    };
    Runnable X = new Runnable() { // from class: com.appnext.ads.fullscreen.g.2
        @Override // java.lang.Runnable
        public final void run() {
            g.this.R.setAlpha(1.0f);
            g.this.R.animate().alpha(0.0f).setDuration(1000L);
        }
    };
    private Handler mHandler = new Handler();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends Animation {
        final int ac;
        View ae;
        int af;

        a(View view, int i10, int i11) {
            this.ae = view;
            this.ac = i10;
            this.af = i11;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f10, Transformation transformation) {
            try {
                ViewGroup.LayoutParams layoutParams = this.ae.getLayoutParams();
                int i10 = this.af;
                layoutParams.width = (int) (i10 + ((this.ac - i10) * f10));
                this.ae.requestLayout();
            } catch (Throwable th) {
                com.appnext.base.a.a("RollFragment$RunnableTick", th);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean willChangeBounds() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkProgress() {
        try {
            int currentPosition = (int) ((this.mediaPlayer.getCurrentPosition() / this.mediaPlayer.getDuration()) * 100.0f);
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
        } catch (Throwable th) {
            com.appnext.base.a.a("RollFragment$checkProgress", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer == null || mediaPlayer.getCurrentPosition() == 0 || this.mediaPlayer.getDuration() == 0) {
                return;
            }
            if (this.finished) {
                return;
            }
            this.mediaPlayer.getCurrentPosition();
            this.mediaPlayer.getDuration();
            this.finished = true;
            j jVar = this.W;
            if (jVar != null) {
                jVar.videoEnded();
            }
            report("video_ended");
        } catch (Throwable th) {
            com.appnext.base.a.a("RollFragment$videoCompleted", th);
        }
    }

    private void q() {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.apnxt_stream_loader);
            this.T = loadAnimation;
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.appnext.ads.fullscreen.g.3
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    if (g.this.S.getVisibility() != 8) {
                        g.this.S.startAnimation(g.this.T);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }
            });
            this.T.setRepeatCount(-1);
            this.T.setRepeatMode(1);
        } catch (Throwable th) {
            com.appnext.base.a.a("RollFragment$createAnimation", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void report(String str) {
        try {
            this.W.report(str, "S2");
        } catch (Throwable th) {
            com.appnext.base.a.a("RollFragment$report", th);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.W = (j) activity;
        q();
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, final Bundle bundle) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(this.W.getTemplate("S2"), viewGroup, false);
            ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.privacy);
            this.U = (ImageView) relativeLayout.findViewById(R.id.close);
            this.P = (ImageView) relativeLayout.findViewById(R.id.v_view);
            this.Q = (Button) relativeLayout.findViewById(R.id.install);
            this.f10046d = (Circle) relativeLayout.findViewById(R.id.circle);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.click_txt);
            this.R = textView;
            StringBuilder sb = new StringBuilder("You will be redirected to ");
            sb.append(this.W.isInstalled() ? "app" : "Google Play");
            sb.append(" once the ad will finish");
            textView.setText(sb.toString());
            this.S = (ImageView) relativeLayout.findViewById(R.id.loader);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.ads.fullscreen.g.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.this.W.privacyClicked();
                }
            });
            if (k.a(this.W.getSelectedAd(), this.W.getConfigManager())) {
                k.a((Context) this.W, imageView);
            }
            this.U.setVisibility(8);
            if (this.W.showClose()) {
                this.mHandler.postDelayed(new Runnable() { // from class: com.appnext.ads.fullscreen.g.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.U.setVisibility(0);
                    }
                }, this.W.closeDelay());
            }
            this.U.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.ads.fullscreen.g.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.this.W.closeClicked();
                }
            });
            if (getArguments() != null && getArguments().containsKey("showCta") && !getArguments().getBoolean("showCta")) {
                this.Q.setVisibility(8);
            }
            String ctaText = this.W.getCtaText();
            int i10 = Build.VERSION.SDK_INT;
            int parseInt = i10 >= 23 ? Integer.parseInt(com.appnext.core.b.a.q(getContext()).a(this.W.getLanguage(), "settings", "len")) : 0;
            if (!TextUtils.isEmpty(ctaText) && ctaText.length() > parseInt) {
                ctaText = ctaText.substring(0, parseInt);
            }
            this.Q.setText(ctaText);
            if (i10 >= 23) {
                this.Q.setTextSize(2, Integer.parseInt(com.appnext.core.b.a.q(getContext()).a(this.W.getLanguage(), "settings", "font_size_sp")));
            }
            this.Q.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.ads.fullscreen.g.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.this.W.installClicked(g.this.W.getSelectedAd());
                    g gVar = g.this;
                    a aVar = new a(gVar.Q, com.appnext.core.i.a(g.this.getActivity(), 40.0f), g.this.Q.getMeasuredWidth());
                    aVar.setDuration(300L);
                    aVar.setInterpolator(new AccelerateInterpolator());
                    aVar.setAnimationListener(new Animation.AnimationListener() { // from class: com.appnext.ads.fullscreen.g.6.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            g.this.P.setVisibility(0);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation) {
                            g.this.Q.setText("");
                        }
                    });
                    if (!g.this.Q.getText().equals("")) {
                        g.this.Q.startAnimation(aVar);
                    }
                    g.this.report("roll_click_cta_once");
                }
            });
            this.P.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.ads.fullscreen.g.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.this.R.setVisibility(0);
                    g.this.R.setAlpha(0.0f);
                    g.this.R.animate().alpha(1.0f).setDuration(1000L);
                    if (!g.this.V) {
                        g.this.V = true;
                        g.this.report("roll_click_cta_more");
                    }
                    int captionTextTime = g.this.W.getCaptionTextTime();
                    if (captionTextTime == -2) {
                        captionTextTime = Integer.parseInt(g.this.W.getConfigManager().t("caption_text_time"));
                    }
                    if (captionTextTime > 0) {
                        g.this.mHandler.postDelayed(g.this.X, captionTextTime * 1000);
                    }
                }
            });
            this.videoView = new VideoView(getActivity().getApplicationContext());
            this.videoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            ((ViewGroup) relativeLayout.findViewById(R.id.media)).addView(this.videoView, 0);
            this.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.appnext.ads.fullscreen.g.8
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    try {
                        g.this.mediaPlayer = mediaPlayer;
                        if (g.this.mediaPlayer != null) {
                            g.this.mediaPlayer.seekTo(g.this.currentPosition);
                            g.this.mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: com.appnext.ads.fullscreen.g.8.1
                                @Override // android.media.MediaPlayer.OnBufferingUpdateListener
                                public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i11) {
                                    try {
                                        if (i11 < 100) {
                                            g.this.S.setVisibility(0);
                                            g.this.S.startAnimation(g.this.T);
                                            g.this.mediaPlayer.pause();
                                        } else {
                                            g.this.S.clearAnimation();
                                            g.this.S.setVisibility(8);
                                            g.this.mediaPlayer.start();
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                            g.this.mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.appnext.ads.fullscreen.g.8.2
                                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                                public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                                    try {
                                        g.this.mediaPlayer.start();
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                            g.this.mediaPlayer.start();
                            Bundle bundle2 = bundle;
                            if ((bundle2 == null || !bundle2.getBoolean(b9.h.f16645d0)) && g.this.W != null) {
                                g.this.started = true;
                                g.this.W.videoStarted();
                                g.this.report("video_started");
                            }
                            g.this.mHandler.postDelayed(g.this.tick, 33L);
                            if (g.this.W.getMute()) {
                                g.this.mediaPlayer.setVolume(0.0f, 0.0f);
                            } else {
                                g.this.mediaPlayer.setVolume(1.0f, 1.0f);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            this.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.appnext.ads.fullscreen.g.9
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    g.this.p();
                }
            });
            this.videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.appnext.ads.fullscreen.g.10
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
                    return true;
                }
            });
            Uri selectedVideoUri = this.W.getSelectedVideoUri();
            if (selectedVideoUri != null) {
                this.videoView.setVideoURI(selectedVideoUri);
            }
            report("roll_loaded");
            return relativeLayout;
        } catch (Throwable th) {
            com.appnext.base.a.a("RollFragment$onCreateView", th);
            this.W.closeClicked();
            return null;
        }
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        try {
            VideoView videoView = this.videoView;
            if (videoView != null) {
                videoView.setOnCompletionListener(null);
                this.videoView.setOnErrorListener(null);
                this.videoView.setOnPreparedListener(null);
                this.videoView.suspend();
                this.videoView = null;
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("RollFragment$onDestroyView", th);
        }
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.mediaPlayer = null;
            }
        } catch (Throwable th2) {
            com.appnext.base.a.a("RollFragment$onDestroyView", th2);
        }
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            this.mHandler.removeCallbacks(this.tick);
            VideoView videoView = this.videoView;
            if (videoView != null) {
                videoView.pause();
                this.currentPosition = this.videoView.getCurrentPosition();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("RollFragment$videoCompleted", th);
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        MediaPlayer mediaPlayer;
        super.onResume();
        try {
            if (this.videoView == null || (mediaPlayer = this.mediaPlayer) == null || this.finished) {
                return;
            }
            mediaPlayer.seekTo(this.currentPosition);
            this.mediaPlayer.start();
            this.mHandler.postDelayed(this.tick, 33L);
        } catch (Throwable th) {
            com.appnext.base.a.a("RollFragment$onResume", th);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            bundle.putInt("currentPosition", this.currentPosition);
            bundle.putBoolean(b9.h.f16645d0, this.started);
            super.onSaveInstanceState(bundle);
        } catch (Throwable th) {
            com.appnext.base.a.a("RollFragment$onSaveInstanceState", th);
        }
    }

    @Override // android.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.currentPosition = bundle.getInt("currentPosition");
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.W = (j) context;
        q();
    }
}
