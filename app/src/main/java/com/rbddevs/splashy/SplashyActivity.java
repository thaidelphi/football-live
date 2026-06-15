package com.rbddevs.splashy;

import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.b9;
import i8.t;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.n;
import l7.h;
/* compiled from: SplashyActivity.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SplashyActivity extends AppCompatActivity {

    /* renamed from: e  reason: collision with root package name */
    private static h f21723e;

    /* renamed from: f  reason: collision with root package name */
    public static SplashyActivity f21724f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f21725g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private long f21726a = 2000;

    /* renamed from: b  reason: collision with root package name */
    private boolean f21727b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21728c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f21729d;

    /* compiled from: SplashyActivity.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        private a() {
        }

        public final h a() {
            return SplashyActivity.f21723e;
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* compiled from: SplashyActivity.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (SplashyActivity.this.f()) {
                ProgressBar pbLoad = (ProgressBar) SplashyActivity.this.d(l7.c.f27556c);
                n.b(pbLoad, "pbLoad");
                pbLoad.setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SplashyActivity.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (SplashyActivity.this.f()) {
                ProgressBar pbLoad = (ProgressBar) SplashyActivity.this.d(l7.c.f27556c);
                n.b(pbLoad, "pbLoad");
                pbLoad.setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SplashyActivity.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d implements Animation.AnimationListener {
        d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (SplashyActivity.this.f()) {
                ProgressBar pbLoad = (ProgressBar) SplashyActivity.this.d(l7.c.f27556c);
                n.b(pbLoad, "pbLoad");
                pbLoad.setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SplashyActivity.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f21734b;

        e(long j10) {
            this.f21734b = j10;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (SplashyActivity.this.f()) {
                ProgressBar pbLoad = (ProgressBar) SplashyActivity.this.d(l7.c.f27556c);
                n.b(pbLoad, "pbLoad");
                pbLoad.setVisibility(0);
            }
            SplashyActivity splashyActivity = SplashyActivity.this;
            int i10 = l7.c.f27559f;
            TextView tvTitle = (TextView) splashyActivity.d(i10);
            n.b(tvTitle, "tvTitle");
            tvTitle.setVisibility(0);
            SplashyActivity splashyActivity2 = SplashyActivity.this;
            int i11 = l7.c.f27558e;
            TextView tvSubTitle = (TextView) splashyActivity2.d(i11);
            n.b(tvSubTitle, "tvSubTitle");
            tvSubTitle.setVisibility(0);
            TextView tvTitle2 = (TextView) SplashyActivity.this.d(i10);
            n.b(tvTitle2, "tvTitle");
            SplashyActivity splashyActivity3 = SplashyActivity.this;
            int i12 = l7.a.f27548c;
            tvTitle2.setAnimation(AnimationUtils.loadAnimation(splashyActivity3, i12));
            TextView tvSubTitle2 = (TextView) SplashyActivity.this.d(i11);
            n.b(tvSubTitle2, "tvSubTitle");
            tvSubTitle2.setAnimation(AnimationUtils.loadAnimation(SplashyActivity.this, i12));
            TextView tvTitle3 = (TextView) SplashyActivity.this.d(i10);
            n.b(tvTitle3, "tvTitle");
            Animation animation2 = tvTitle3.getAnimation();
            n.b(animation2, "tvTitle.animation");
            animation2.setDuration(this.f21734b);
            TextView tvSubTitle3 = (TextView) SplashyActivity.this.d(i11);
            n.b(tvSubTitle3, "tvSubTitle");
            Animation animation3 = tvSubTitle3.getAnimation();
            n.b(animation3, "tvSubTitle.animation");
            animation3.setDuration(this.f21734b);
            TextView tvTitle4 = (TextView) SplashyActivity.this.d(i10);
            n.b(tvTitle4, "tvTitle");
            Animation animation4 = tvTitle4.getAnimation();
            n.b(animation4, "tvTitle.animation");
            animation4.setFillAfter(false);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashyActivity.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SplashyActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashyActivity.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h a10;
            a aVar = SplashyActivity.f21725g;
            if (aVar.a() != null && (a10 = aVar.a()) != null) {
                a10.a();
            }
            SplashyActivity.this.finish();
        }
    }

    private final void g() {
        if (getIntent().hasExtra("animation_type")) {
            long longExtra = getIntent().getLongExtra("animation_duration", 800L);
            Serializable serializableExtra = getIntent().getSerializableExtra("animation_type");
            if (serializableExtra == l7.g.SLIDE_IN_TOP_BOTTOM) {
                ProgressBar pbLoad = (ProgressBar) d(l7.c.f27556c);
                n.b(pbLoad, "pbLoad");
                pbLoad.setVisibility(8);
                int i10 = l7.c.f27555b;
                ImageView ivLogo = (ImageView) d(i10);
                n.b(ivLogo, "ivLogo");
                ivLogo.setAnimation(AnimationUtils.loadAnimation(this, l7.a.f27550e));
                int i11 = l7.c.f27559f;
                TextView tvTitle = (TextView) d(i11);
                n.b(tvTitle, "tvTitle");
                int i12 = l7.a.f27546a;
                tvTitle.setAnimation(AnimationUtils.loadAnimation(this, i12));
                int i13 = l7.c.f27558e;
                TextView tvSubTitle = (TextView) d(i13);
                n.b(tvSubTitle, "tvSubTitle");
                tvSubTitle.setAnimation(AnimationUtils.loadAnimation(this, i12));
                ImageView ivLogo2 = (ImageView) d(i10);
                n.b(ivLogo2, "ivLogo");
                Animation animation = ivLogo2.getAnimation();
                n.b(animation, "ivLogo.animation");
                animation.setDuration(longExtra);
                TextView tvTitle2 = (TextView) d(i11);
                n.b(tvTitle2, "tvTitle");
                Animation animation2 = tvTitle2.getAnimation();
                n.b(animation2, "tvTitle.animation");
                animation2.setDuration(longExtra);
                TextView tvSubTitle2 = (TextView) d(i13);
                n.b(tvSubTitle2, "tvSubTitle");
                Animation animation3 = tvSubTitle2.getAnimation();
                n.b(animation3, "tvSubTitle.animation");
                animation3.setDuration(longExtra);
                ImageView ivLogo3 = (ImageView) d(i10);
                n.b(ivLogo3, "ivLogo");
                ivLogo3.getAnimation().setAnimationListener(new b());
            } else if (serializableExtra == l7.g.SLIDE_IN_LEFT_BOTTOM) {
                ProgressBar pbLoad2 = (ProgressBar) d(l7.c.f27556c);
                n.b(pbLoad2, "pbLoad");
                pbLoad2.setVisibility(8);
                int i14 = l7.c.f27555b;
                ImageView ivLogo4 = (ImageView) d(i14);
                n.b(ivLogo4, "ivLogo");
                ivLogo4.setAnimation(AnimationUtils.loadAnimation(this, l7.a.f27547b));
                int i15 = l7.c.f27559f;
                TextView tvTitle3 = (TextView) d(i15);
                n.b(tvTitle3, "tvTitle");
                int i16 = l7.a.f27546a;
                tvTitle3.setAnimation(AnimationUtils.loadAnimation(this, i16));
                int i17 = l7.c.f27558e;
                TextView tvSubTitle3 = (TextView) d(i17);
                n.b(tvSubTitle3, "tvSubTitle");
                tvSubTitle3.setAnimation(AnimationUtils.loadAnimation(this, i16));
                ImageView ivLogo5 = (ImageView) d(i14);
                n.b(ivLogo5, "ivLogo");
                Animation animation4 = ivLogo5.getAnimation();
                n.b(animation4, "ivLogo.animation");
                animation4.setDuration(longExtra);
                TextView tvTitle4 = (TextView) d(i15);
                n.b(tvTitle4, "tvTitle");
                Animation animation5 = tvTitle4.getAnimation();
                n.b(animation5, "tvTitle.animation");
                animation5.setDuration(longExtra);
                TextView tvSubTitle4 = (TextView) d(i17);
                n.b(tvSubTitle4, "tvSubTitle");
                Animation animation6 = tvSubTitle4.getAnimation();
                n.b(animation6, "tvSubTitle.animation");
                animation6.setDuration(longExtra);
                ImageView ivLogo6 = (ImageView) d(i14);
                n.b(ivLogo6, "ivLogo");
                ivLogo6.getAnimation().setAnimationListener(new c());
            } else if (serializableExtra == l7.g.SLIDE_IN_LEFT_RIGHT) {
                ProgressBar pbLoad3 = (ProgressBar) d(l7.c.f27556c);
                n.b(pbLoad3, "pbLoad");
                pbLoad3.setVisibility(8);
                int i18 = l7.c.f27555b;
                ImageView ivLogo7 = (ImageView) d(i18);
                n.b(ivLogo7, "ivLogo");
                ivLogo7.setAnimation(AnimationUtils.loadAnimation(this, l7.a.f27547b));
                int i19 = l7.c.f27559f;
                TextView tvTitle5 = (TextView) d(i19);
                n.b(tvTitle5, "tvTitle");
                int i20 = l7.a.f27549d;
                tvTitle5.setAnimation(AnimationUtils.loadAnimation(this, i20));
                int i21 = l7.c.f27558e;
                TextView tvSubTitle5 = (TextView) d(i21);
                n.b(tvSubTitle5, "tvSubTitle");
                tvSubTitle5.setAnimation(AnimationUtils.loadAnimation(this, i20));
                ImageView ivLogo8 = (ImageView) d(i18);
                n.b(ivLogo8, "ivLogo");
                Animation animation7 = ivLogo8.getAnimation();
                n.b(animation7, "ivLogo.animation");
                animation7.setDuration(longExtra);
                TextView tvTitle6 = (TextView) d(i19);
                n.b(tvTitle6, "tvTitle");
                Animation animation8 = tvTitle6.getAnimation();
                n.b(animation8, "tvTitle.animation");
                animation8.setDuration(longExtra);
                TextView tvSubTitle6 = (TextView) d(i21);
                n.b(tvSubTitle6, "tvSubTitle");
                Animation animation9 = tvSubTitle6.getAnimation();
                n.b(animation9, "tvSubTitle.animation");
                animation9.setDuration(longExtra);
                ImageView ivLogo9 = (ImageView) d(i18);
                n.b(ivLogo9, "ivLogo");
                ivLogo9.getAnimation().setAnimationListener(new d());
            } else if (serializableExtra == l7.g.SLIDE_LEFT_ENTER) {
                ProgressBar pbLoad4 = (ProgressBar) d(l7.c.f27556c);
                n.b(pbLoad4, "pbLoad");
                pbLoad4.setVisibility(8);
                TextView tvTitle7 = (TextView) d(l7.c.f27559f);
                n.b(tvTitle7, "tvTitle");
                tvTitle7.setVisibility(4);
                TextView tvSubTitle7 = (TextView) d(l7.c.f27558e);
                n.b(tvSubTitle7, "tvSubTitle");
                tvSubTitle7.setVisibility(4);
                int i22 = l7.c.f27555b;
                ImageView ivLogo10 = (ImageView) d(i22);
                n.b(ivLogo10, "ivLogo");
                ivLogo10.setAnimation(AnimationUtils.loadAnimation(this, l7.a.f27547b));
                ImageView ivLogo11 = (ImageView) d(i22);
                n.b(ivLogo11, "ivLogo");
                Animation animation10 = ivLogo11.getAnimation();
                n.b(animation10, "ivLogo.animation");
                animation10.setDuration(longExtra);
                ImageView ivLogo12 = (ImageView) d(i22);
                n.b(ivLogo12, "ivLogo");
                ivLogo12.getAnimation().setAnimationListener(new e(longExtra));
            } else if (serializableExtra == l7.g.GLOW_LOGO) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(longExtra);
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                ImageView ivLogo13 = (ImageView) d(l7.c.f27555b);
                n.b(ivLogo13, "ivLogo");
                ivLogo13.setAnimation(alphaAnimation);
            } else if (serializableExtra == l7.g.GLOW_LOGO_TITLE) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(longExtra);
                alphaAnimation2.setInterpolator(new LinearInterpolator());
                alphaAnimation2.setRepeatCount(-1);
                alphaAnimation2.setRepeatMode(2);
                ImageView ivLogo14 = (ImageView) d(l7.c.f27555b);
                n.b(ivLogo14, "ivLogo");
                ivLogo14.setAnimation(alphaAnimation2);
                TextView tvTitle8 = (TextView) d(l7.c.f27559f);
                n.b(tvTitle8, "tvTitle");
                tvTitle8.setAnimation(alphaAnimation2);
            } else if (serializableExtra == l7.g.GROW_LOGO_FROM_CENTER) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(longExtra);
                scaleAnimation.setFillAfter(true);
                ImageView ivLogo15 = (ImageView) d(l7.c.f27555b);
                n.b(ivLogo15, "ivLogo");
                ivLogo15.setAnimation(scaleAnimation);
            }
        }
    }

    private final void h() {
        if (getIntent().getBooleanExtra("click_to_hide", false)) {
            ((RelativeLayout) d(l7.c.f27557d)).setOnClickListener(new f());
        }
    }

    private final void i() {
        if (getIntent().hasExtra("full_screen") && getIntent().getBooleanExtra("full_screen", false) && Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(RecyclerView.UNDEFINED_DURATION);
            getWindow().clearFlags(67108864);
            Window window = getWindow();
            n.b(window, "window");
            window.setStatusBarColor(0);
            Window window2 = getWindow();
            n.b(window2, "window");
            window2.setNavigationBarColor(0);
            getWindow().setFlags(AdRequest.MAX_CONTENT_URL_LENGTH, AdRequest.MAX_CONTENT_URL_LENGTH);
        }
    }

    private final void j() {
        ApplicationInfo applicationInfo = getApplicationInfo();
        n.b(applicationInfo, "applicationInfo");
        if (getIntent().hasExtra("show_logo") && !getIntent().getBooleanExtra("show_logo", true)) {
            ImageView ivLogo = (ImageView) d(l7.c.f27555b);
            n.b(ivLogo, "ivLogo");
            ivLogo.setVisibility(8);
        }
        if (getIntent().hasExtra("logo")) {
            ((ImageView) d(l7.c.f27555b)).setImageResource(getIntent().getIntExtra("logo", applicationInfo.icon));
        } else {
            ((ImageView) d(l7.c.f27555b)).setImageResource(applicationInfo.icon);
        }
        if (getIntent().hasExtra("logo_width") || getIntent().hasExtra("logo_height")) {
            int intExtra = getIntent().getIntExtra("logo_width", 200);
            int intExtra2 = getIntent().getIntExtra("logo_height", 200);
            Resources resources = getResources();
            n.b(resources, "resources");
            Resources resources2 = getResources();
            n.b(resources2, "resources");
            int i10 = l7.c.f27555b;
            ImageView ivLogo2 = (ImageView) d(i10);
            n.b(ivLogo2, "ivLogo");
            ivLogo2.getLayoutParams().width = (int) TypedValue.applyDimension(1, intExtra, resources.getDisplayMetrics());
            ImageView ivLogo3 = (ImageView) d(i10);
            n.b(ivLogo3, "ivLogo");
            ivLogo3.getLayoutParams().height = (int) TypedValue.applyDimension(1, intExtra2, resources2.getDisplayMetrics());
            ((ImageView) d(i10)).requestLayout();
        }
        if (getIntent().hasExtra("logo_scale_type")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("logo_scale_type");
            if (serializableExtra != null) {
                int i11 = l7.c.f27555b;
                ImageView ivLogo4 = (ImageView) d(i11);
                n.b(ivLogo4, "ivLogo");
                ivLogo4.setScaleType((ImageView.ScaleType) serializableExtra);
                ((ImageView) d(i11)).requestLayout();
                return;
            }
            throw new t("null cannot be cast to non-null type android.widget.ImageView.ScaleType");
        }
    }

    private final void k() {
        if (getIntent().hasExtra("show_progress")) {
            boolean booleanExtra = getIntent().getBooleanExtra("show_progress", false);
            this.f21728c = booleanExtra;
            if (booleanExtra) {
                ProgressBar pbLoad = (ProgressBar) d(l7.c.f27556c);
                n.b(pbLoad, "pbLoad");
                pbLoad.setVisibility(0);
            }
        }
        if (getIntent().hasExtra("progress_color")) {
            int intExtra = getIntent().getIntExtra("progress_color", l7.b.f27551a);
            ProgressBar pbLoad2 = (ProgressBar) d(l7.c.f27556c);
            n.b(pbLoad2, "pbLoad");
            pbLoad2.getIndeterminateDrawable().setColorFilter(androidx.core.content.a.d(this, intExtra), PorterDuff.Mode.SRC_IN);
        }
        if (getIntent().hasExtra("progress_color_value")) {
            String stringExtra = getIntent().getStringExtra("progress_color_value");
            ProgressBar pbLoad3 = (ProgressBar) d(l7.c.f27556c);
            n.b(pbLoad3, "pbLoad");
            pbLoad3.getIndeterminateDrawable().setColorFilter(Color.parseColor(stringExtra), PorterDuff.Mode.SRC_IN);
        }
    }

    private final void l() {
        if (getIntent().hasExtra("background_color")) {
            ((ImageView) d(l7.c.f27554a)).setBackgroundColor(androidx.core.content.a.d(this, getIntent().getIntExtra("background_color", l7.b.f27553c)));
        }
        if (getIntent().hasExtra("background_color_value")) {
            ((ImageView) d(l7.c.f27554a)).setBackgroundColor(Color.parseColor(getIntent().getStringExtra("background_color_value")));
        }
        if (getIntent().hasExtra("background_image")) {
            ((ImageView) d(l7.c.f27554a)).setBackgroundResource(getIntent().getIntExtra("background_image", l7.b.f27553c));
        }
    }

    private final void m() {
        if (getIntent().hasExtra("subtitle")) {
            int i10 = l7.c.f27558e;
            TextView tvSubTitle = (TextView) d(i10);
            n.b(tvSubTitle, "tvSubTitle");
            d0 d0Var = d0.f27370a;
            String format = String.format("%s ", Arrays.copyOf(new Object[]{getIntent().getStringExtra("subtitle")}, 1));
            n.b(format, "java.lang.String.format(format, *args)");
            tvSubTitle.setText(format);
            TextView tvSubTitle2 = (TextView) d(i10);
            n.b(tvSubTitle2, "tvSubTitle");
            tvSubTitle2.setVisibility(0);
        }
        if (getIntent().hasExtra("subtitle_resource")) {
            int i11 = l7.c.f27558e;
            TextView tvSubTitle3 = (TextView) d(i11);
            n.b(tvSubTitle3, "tvSubTitle");
            tvSubTitle3.setText(getResources().getString(getIntent().getIntExtra("subtitle_resource", l7.e.f27561a)));
            TextView tvSubTitle4 = (TextView) d(i11);
            n.b(tvSubTitle4, "tvSubTitle");
            tvSubTitle4.setVisibility(0);
        }
        if (getIntent().hasExtra("subtitle_size")) {
            TextView tvSubTitle5 = (TextView) d(l7.c.f27558e);
            n.b(tvSubTitle5, "tvSubTitle");
            tvSubTitle5.setTextSize(getIntent().getFloatExtra("subtitle_size", 18.0f));
        }
        if (getIntent().hasExtra("subtitle_color")) {
            ((TextView) d(l7.c.f27558e)).setTextColor(androidx.core.content.a.d(this, getIntent().getIntExtra("subtitle_color", l7.b.f27552b)));
        }
        if (getIntent().hasExtra("subtitle_color_value")) {
            ((TextView) d(l7.c.f27558e)).setTextColor(Color.parseColor(getIntent().getStringExtra("subtitle_color_value")));
        }
        if (getIntent().hasExtra("subtitle_italic") && !getIntent().getBooleanExtra("subtitle_italic", true)) {
            ((TextView) d(l7.c.f27558e)).setTypeface(null, 0);
        }
        if (!getIntent().hasExtra("subtitle_font_style") || getIntent().getStringExtra("subtitle_font_style") == null) {
            return;
        }
        Typeface createFromAsset = Typeface.createFromAsset(getAssets(), getIntent().getStringExtra("subtitle_font_style"));
        TextView tvSubTitle6 = (TextView) d(l7.c.f27558e);
        n.b(tvSubTitle6, "tvSubTitle");
        tvSubTitle6.setTypeface(createFromAsset);
    }

    private final void n() {
        if (getIntent().hasExtra("time")) {
            this.f21726a = getIntent().getLongExtra("time", this.f21726a);
        }
        if (getIntent().hasExtra("intermediate_time")) {
            this.f21727b = getIntent().getBooleanExtra("intermediate_time", false);
        }
    }

    private final void o() {
        ApplicationInfo applicationInfo = getApplicationInfo();
        n.b(applicationInfo, "applicationInfo");
        if (getIntent().hasExtra("show_title") && !getIntent().getBooleanExtra("show_title", true)) {
            TextView tvTitle = (TextView) d(l7.c.f27559f);
            n.b(tvTitle, "tvTitle");
            tvTitle.setVisibility(8);
        }
        if (getIntent().hasExtra(b9.h.D0)) {
            TextView tvTitle2 = (TextView) d(l7.c.f27559f);
            n.b(tvTitle2, "tvTitle");
            tvTitle2.setText(getIntent().getStringExtra(b9.h.D0));
        } else if (getIntent().hasExtra("title_resource")) {
            TextView tvTitle3 = (TextView) d(l7.c.f27559f);
            n.b(tvTitle3, "tvTitle");
            tvTitle3.setText(getResources().getString(getIntent().getIntExtra("title_resource", applicationInfo.labelRes)));
        } else {
            TextView tvTitle4 = (TextView) d(l7.c.f27559f);
            n.b(tvTitle4, "tvTitle");
            tvTitle4.setText(getResources().getString(applicationInfo.labelRes));
        }
        if (getIntent().hasExtra("title_size")) {
            TextView tvTitle5 = (TextView) d(l7.c.f27559f);
            n.b(tvTitle5, "tvTitle");
            tvTitle5.setTextSize(getIntent().getFloatExtra("title_size", 40.0f));
        }
        if (getIntent().hasExtra("title_color")) {
            ((TextView) d(l7.c.f27559f)).setTextColor(androidx.core.content.a.d(this, getIntent().getIntExtra("title_color", l7.b.f27551a)));
        }
        if (getIntent().hasExtra("title_color_value")) {
            ((TextView) d(l7.c.f27559f)).setTextColor(Color.parseColor(getIntent().getStringExtra("title_color_value")));
        }
        if (!getIntent().hasExtra("title_font_style") || getIntent().getStringExtra("title_font_style") == null) {
            return;
        }
        Typeface createFromAsset = Typeface.createFromAsset(getAssets(), getIntent().getStringExtra("title_font_style"));
        TextView tvTitle6 = (TextView) d(l7.c.f27559f);
        n.b(tvTitle6, "tvTitle");
        tvTitle6.setTypeface(createFromAsset);
    }

    private final void p() {
        new Handler().postDelayed(new g(), this.f21726a);
    }

    public View d(int i10) {
        if (this.f21729d == null) {
            this.f21729d = new HashMap();
        }
        View view = (View) this.f21729d.get(Integer.valueOf(i10));
        if (view == null) {
            View findViewById = findViewById(i10);
            this.f21729d.put(Integer.valueOf(i10), findViewById);
            return findViewById;
        }
        return view;
    }

    public final boolean f() {
        return this.f21728c;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(l7.f.f27562a);
        super.onCreate(bundle);
        setContentView(l7.d.f27560a);
        f21724f = this;
        j();
        o();
        m();
        k();
        l();
        i();
        h();
        g();
        n();
        if (this.f21727b) {
            return;
        }
        p();
    }
}
