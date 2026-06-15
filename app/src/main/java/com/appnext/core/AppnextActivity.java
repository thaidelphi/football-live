package com.appnext.core;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.appnext.core.h;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class AppnextActivity extends Activity {
    private RelativeLayout cw;
    protected RelativeLayout cx;
    protected Handler handler;
    protected String placementID;
    protected C0400r userAction;
    protected String cv = "";
    protected String guid = "";
    protected String banner = "";

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S() {
        RelativeLayout relativeLayout = this.cw;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            this.cw.removeAllViewsInLayout();
            if (this.cw.getParent() != null) {
                ((RelativeLayout) this.cw.getParent()).removeView(this.cw);
            }
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(null);
        }
        this.cw = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(AppnextAd appnextAd, h.a aVar) {
        C0400r c0400r = this.userAction;
        if (c0400r == null || appnextAd == null) {
            return;
        }
        c0400r.a(appnextAd, appnextAd.getImpressionURL(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(AppnextAd appnextAd, h.a aVar) {
        C0400r c0400r = this.userAction;
        if (c0400r == null || appnextAd == null) {
            return;
        }
        c0400r.a(appnextAd, appnextAd.getAppURL(), this.placementID, aVar);
    }

    protected abstract SettingsManager getConfig();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            p.ac().a(new Runnable() { // from class: com.appnext.core.AppnextActivity.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (i.g(AppnextActivity.this)) {
                        return;
                    }
                    AppnextActivity.this.finish();
                    AppnextActivity.this.runOnUiThread(new Runnable() { // from class: com.appnext.core.AppnextActivity.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                AppnextActivity.this.onError(AppnextError.CONNECTION_ERROR);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            });
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(128);
            super.onCreate(bundle);
            this.handler = new Handler();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            this.handler.removeCallbacks(null);
            this.handler = null;
        } catch (Throwable unused) {
        }
        try {
            this.userAction.destroy();
            this.userAction = null;
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextActivity$onDestroy", th);
        }
    }

    protected abstract void onError(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(ViewGroup viewGroup, Drawable drawable) {
        try {
            if (this.cw != null) {
                S();
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.cw = relativeLayout;
            relativeLayout.setBackgroundColor(Color.parseColor("#77ffffff"));
            viewGroup.addView(this.cw);
            this.cw.getLayoutParams().height = -1;
            this.cw.getLayoutParams().width = -1;
            ProgressBar progressBar = new ProgressBar(this, null, 16842871);
            progressBar.setIndeterminateDrawable(drawable);
            progressBar.setIndeterminate(true);
            this.cw.addView(progressBar);
            RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(1000L);
            rotateAnimation.setRepeatCount(-1);
            progressBar.setAnimation(rotateAnimation);
            ((RelativeLayout.LayoutParams) progressBar.getLayoutParams()).addRule(13, -1);
            this.cw.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.core.AppnextActivity.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            this.handler.postDelayed(new Runnable() { // from class: com.appnext.core.AppnextActivity.3
                @Override // java.lang.Runnable
                public final void run() {
                    AppnextActivity.this.S();
                }
            }, 16000L);
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextActivity$showClickMask", th);
        }
    }
}
