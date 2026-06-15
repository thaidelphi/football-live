package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.cc;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.l3;
import com.startapp.sdk.ads.splash.SplashConfig;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g {

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22748a;

        static {
            int[] iArr = new int[SplashConfig.Theme.values().length];
            f22748a = iArr;
            try {
                iArr[SplashConfig.Theme.DEEP_BLUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22748a[SplashConfig.Theme.SKY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22748a[SplashConfig.Theme.ASHEN_SKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22748a[SplashConfig.Theme.BLAZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22748a[SplashConfig.Theme.GLOOMY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22748a[SplashConfig.Theme.OCEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static RelativeLayout a(Activity activity, SplashConfig splashConfig) {
        int round;
        int round2;
        int round3;
        int round4;
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(1475346437);
        relativeLayout.setBackgroundColor(-1);
        RelativeLayout relativeLayout2 = new RelativeLayout(activity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        relativeLayout.addView(relativeLayout2, layoutParams);
        Point point = new Point(Math.round(TypedValue.applyDimension(1, (float) IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, activity.getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 28, activity.getResources().getDisplayMetrics())));
        if (splashConfig.getOrientation() == SplashConfig.Orientation.PORTRAIT) {
            round = Math.round(TypedValue.applyDimension(1, 5, activity.getResources().getDisplayMetrics()));
            round2 = Math.round(TypedValue.applyDimension(1, 8, activity.getResources().getDisplayMetrics()));
            round3 = Math.round(TypedValue.applyDimension(1, 75, activity.getResources().getDisplayMetrics()));
            round4 = Math.round(TypedValue.applyDimension(1, 130, activity.getResources().getDisplayMetrics()));
        } else {
            round = Math.round(TypedValue.applyDimension(1, 5, activity.getResources().getDisplayMetrics()));
            round2 = Math.round(TypedValue.applyDimension(1, 8, activity.getResources().getDisplayMetrics()));
            round3 = Math.round(TypedValue.applyDimension(1, 40, activity.getResources().getDisplayMetrics()));
            round4 = Math.round(TypedValue.applyDimension(1, 100, activity.getResources().getDisplayMetrics()));
        }
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(splashConfig.getLogo());
        imageView.setId(101);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(round4, round4);
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        layoutParams2.setMargins(0, 0, 0, round);
        relativeLayout2.addView(imageView, layoutParams2);
        TextView textView = new TextView(activity);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setText(splashConfig.getAppName());
        textView.setId(100);
        textView.setTextSize(1, 26.0f);
        textView.setTextColor(Color.rgb(255, 255, 255));
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, 101);
        layoutParams3.setMargins(0, 0, 0, round3);
        relativeLayout2.addView(textView, layoutParams3);
        try {
            WebView c10 = com.startapp.sdk.components.a.a(activity).f23225a.a().c();
            c10.setId(102);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(point.x, point.y);
            layoutParams4.addRule(14);
            layoutParams4.addRule(3, 100);
            layoutParams4.setMargins(0, 0, 0, round2);
            c10.setBackgroundColor(Color.argb(0, 0, 0, 0));
            c10.setVerticalScrollBarEnabled(false);
            c10.setHorizontalScrollBarEnabled(false);
            c10.loadDataWithBaseURL(null, "<html>\n<style>\n#fountainG{\nposition:relative;\nwidth:141px;\nheight:17px}\n.fountainG{\nposition:absolute;\ntop:0;\nbackground-color:#000000;\nwidth:18px;\nheight:18px;\n-moz-animation-name:bounce_fountainG;\n-moz-animation-duration:2s;\n-moz-animation-iteration-count:infinite;\n-moz-animation-direction:linear;\n-moz-transform:scale(.3);\n-moz-border-radius:12px;\n-webkit-animation-name:bounce_fountainG;\n-webkit-animation-duration:2s;\n-webkit-animation-iteration-count:infinite;\n-webkit-animation-direction:linear;\n-webkit-transform:scale(.3);\n-webkit-border-radius:12px;\n-ms-animation-name:bounce_fountainG;\n-ms-animation-duration:2s;\n-ms-animation-iteration-count:infinite;\n-ms-animation-direction:linear;\n-ms-transform:scale(.3);\n-ms-border-radius:12px;\n-o-animation-name:bounce_fountainG;\n-o-animation-duration:2s;\n-o-animation-iteration-count:infinite;\n-o-animation-direction:linear;\n-o-transform:scale(.3);\n-o-border-radius:12px;\nanimation-name:bounce_fountainG;\nanimation-duration:2s;\nanimation-iteration-count:infinite;\nanimation-direction:linear;\ntransform:scale(.3);\nborder-radius:12px;\n}\n#fountainG_1{\nleft:0;\n-moz-animation-delay:0.8s;\n-webkit-animation-delay:0.8s;\n-ms-animation-delay:0.8s;\n-o-animation-delay:0.8s;\nanimation-delay:0.8s;\n}\n#fountainG_2{\nleft:18px;\n-moz-animation-delay:1s;\n-webkit-animation-delay:1s;\n-ms-animation-delay:1s;\n-o-animation-delay:1s;\nanimation-delay:1s;\n}\n#fountainG_3{\nleft:35px;\n-moz-animation-delay:1.2s;\n-webkit-animation-delay:1.2s;\n-ms-animation-delay:1.2s;\n-o-animation-delay:1.2s;\nanimation-delay:1.2s;\n}\n#fountainG_4{\nleft:53px;\n-moz-animation-delay:1.4s;\n-webkit-animation-delay:1.4s;\n-ms-animation-delay:1.4s;\n-o-animation-delay:1.4s;\nanimation-delay:1.4s;\n}\n#fountainG_5{\nleft:71px;\n-moz-animation-delay:1.6s;\n-webkit-animation-delay:1.6s;\n-ms-animation-delay:1.6s;\n-o-animation-delay:1.6s;\nanimation-delay:1.6s;\n}\n#fountainG_6{\nleft:88px;\n-moz-animation-delay:1.8s;\n-webkit-animation-delay:1.8s;\n-ms-animation-delay:1.8s;\n-o-animation-delay:1.8s;\nanimation-delay:1.8s;\n}\n#fountainG_7{\nleft:106px;\n-moz-animation-delay:2s;\n-webkit-animation-delay:2s;\n-ms-animation-delay:2s;\n-o-animation-delay:2s;\nanimation-delay:2s;\n}\n#fountainG_8{\nleft:123px;\n-moz-animation-delay:2.2s;\n-webkit-animation-delay:2.2s;\n-ms-animation-delay:2.2s;\n-o-animation-delay:2.2s;\nanimation-delay:2.2s;\n}\n@-moz-keyframes bounce_fountainG{\n0%{\n-moz-transform:scale(1);\nbackground-color:#000000;\n}\n100%{\n-moz-transform:scale(.3);\nbackground-color:rgba(255,255,255,0.2);\n}\n}\n@-webkit-keyframes bounce_fountainG{\n0%{\n-webkit-transform:scale(1);\nbackground-color:#000000;\n}\n100%{\n-webkit-transform:scale(.3);\nbackground-color:rgba(255,255,255,0.2);\n}\n}\n@-ms-keyframes bounce_fountainG{\n0%{\n-ms-transform:scale(1);\nbackground-color:#000000;\n}\n100%{\n-ms-transform:scale(.3);\nbackground-color:rgba(255,255,255,0.2);\n}\n}\n@-o-keyframes bounce_fountainG{\n0%{\n-o-transform:scale(1);\nbackground-color:#000000;\n}\n100%{\n-o-transform:scale(.3);\nbackground-color:rgba(255,255,255,0.2);\n}\n}\n@keyframes bounce_fountainG{\n0%{\ntransform:scale(1);\nbackground-color:#000000;\n}\n100%{\ntransform:scale(.3);\nbackground-color:rgba(255,255,255,0.2);\n}\n}\n</style>\n<body style=\"margin:0;padding:0\">\n<div id=\"fountainG\">\n<div id=\"fountainG_1\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_2\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_3\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_4\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_5\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_6\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_7\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_8\" class=\"fountainG\">\n</div>\n</div>\n</body>\n</html>", "text/html", cc.N, null);
            relativeLayout2.addView(c10, layoutParams4);
        } catch (Throwable th) {
            l3.a(th);
        }
        TextView textView2 = new TextView(activity);
        textView2.setText("Loading...");
        textView2.setId(105);
        textView2.setTextSize(1, 18.0f);
        textView2.setTextColor(Color.rgb(208, 210, 210));
        textView2.setGravity(17);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, 102);
        layoutParams5.setMargins(0, 0, 0, 0);
        relativeLayout2.addView(textView2, layoutParams5);
        return relativeLayout;
    }
}
