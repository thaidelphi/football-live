package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import java.util.HashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f3 extends l2 implements View.OnClickListener {
    public static boolean D = false;
    public AnimatingProgressBar A;
    public FrameLayout B;
    public final String C;

    /* renamed from: x  reason: collision with root package name */
    public RelativeLayout f21930x;

    /* renamed from: y  reason: collision with root package name */
    public NavigationBarLayout f21931y;

    /* renamed from: z  reason: collision with root package name */
    public WebView f21932z;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            f3.this.A.setProgress(i10);
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            if (str == null || str.equals("")) {
                return;
            }
            f3.this.f21931y.f23324f.setText(str);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final Context f21934a;

        /* renamed from: b  reason: collision with root package name */
        public final f3 f21935b;

        /* renamed from: c  reason: collision with root package name */
        public final NavigationBarLayout f21936c;

        /* renamed from: d  reason: collision with root package name */
        public final AnimatingProgressBar f21937d;

        /* renamed from: e  reason: collision with root package name */
        public int f21938e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f21939f = false;

        public b(Activity activity, NavigationBarLayout navigationBarLayout, AnimatingProgressBar animatingProgressBar, f3 f3Var) {
            this.f21934a = activity;
            this.f21937d = animatingProgressBar;
            this.f21936c = navigationBarLayout;
            this.f21935b = f3Var;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            if (f3.D) {
                return;
            }
            this.f21936c.a(webView);
            int i10 = this.f21938e - 1;
            this.f21938e = i10;
            if (i10 == 0) {
                this.f21939f = false;
                this.f21937d.a();
                if (this.f21937d.isShown()) {
                    this.f21937d.setVisibility(8);
                }
                this.f21936c.a(webView);
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (f3.D) {
                return;
            }
            if (this.f21939f) {
                this.f21938e = 1;
                this.f21937d.a();
                this.f21936c.a(webView);
            } else {
                this.f21938e = Math.max(this.f21938e, 1);
            }
            this.f21937d.setVisibility(0);
            this.f21936c.f23325g.setText(str);
            this.f21936c.a(webView);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            this.f21937d.a();
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView != null && str != null && !o9.c(webView.getContext(), str) && !f3.D) {
                if (!this.f21939f) {
                    this.f21939f = true;
                    this.f21937d.a();
                    this.f21938e = 0;
                }
                this.f21938e++;
                if (com.startapp.sdk.adsbase.a.b(str) && !com.startapp.sdk.adsbase.a.a(str)) {
                    return false;
                }
                this.f21938e = 1;
                com.startapp.sdk.adsbase.a.a(this.f21934a, str);
                f3 f3Var = this.f21935b;
                if (f3Var != null) {
                    f3Var.i();
                }
            }
            return true;
        }
    }

    public f3(String str) {
        this.C = str;
    }

    @Override // com.startapp.l2
    public final void a(Bundle bundle) {
        c5.a(this.f22201b).a(this.f22203d, new IntentFilter("com.startapp.android.CloseAdActivity"));
        D = false;
        this.f21930x = new RelativeLayout(this.f22201b);
        String str = this.C;
        if (this.f21931y == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f22201b);
            this.f21931y = navigationBarLayout;
            navigationBarLayout.setDescendantFocusability(262144);
            navigationBarLayout.setBackgroundColor(Color.parseColor("#e9e9e9"));
            navigationBarLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, j9.a(navigationBarLayout.getContext(), 60)));
            navigationBarLayout.setId(IronSourceConstants.IS_CHECK_READY_TRUE);
            HashMap hashMap = new HashMap();
            hashMap.put("BACK", new c6(14, 22, "back_.png"));
            hashMap.put("BACK_DARK", new c6(14, 22, "back_dark.png"));
            hashMap.put("FORWARD", new c6(14, 22, "forward_.png"));
            hashMap.put("FORWARD_DARK", new c6(14, 22, "forward_dark.png"));
            hashMap.put("X", new c6(23, 23, "x_dark.png"));
            hashMap.put("BROWSER", new c6(28, 28, "browser_icon_dark.png"));
            navigationBarLayout.f23327i = hashMap;
            NavigationBarLayout navigationBarLayout2 = this.f21931y;
            navigationBarLayout2.getClass();
            Typeface typeface = Typeface.DEFAULT;
            Context context = navigationBarLayout2.getContext();
            int i10 = NavigationBarLayout.f23317j;
            TextView textView = new TextView(context);
            textView.setTypeface(typeface, 1);
            textView.setTextSize(1, 16.46f);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(i10);
            textView.setId(IronSourceConstants.IS_CHECK_READY_FALSE);
            navigationBarLayout2.f23324f = textView;
            Context context2 = navigationBarLayout2.getContext();
            int i11 = NavigationBarLayout.f23318k;
            TextView textView2 = new TextView(context2);
            textView2.setTypeface(typeface, 1);
            textView2.setTextSize(1, 12.12f);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setTextColor(i11);
            textView2.setId(2107);
            navigationBarLayout2.f23325g = textView2;
            navigationBarLayout2.f23324f.setText("Loading...");
            RelativeLayout relativeLayout = new RelativeLayout(navigationBarLayout2.getContext());
            navigationBarLayout2.f23319a = relativeLayout;
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            navigationBarLayout2.f23319a.addView(navigationBarLayout2.f23324f, j9.a(navigationBarLayout2.getContext(), new int[]{0, 0, 0, 0}, new int[0]));
            RelativeLayout relativeLayout2 = navigationBarLayout2.f23319a;
            TextView textView3 = navigationBarLayout2.f23325g;
            RelativeLayout.LayoutParams a10 = j9.a(navigationBarLayout2.getContext(), new int[]{0, 0, 0, 0}, new int[0]);
            a10.addRule(3, IronSourceConstants.IS_CHECK_READY_FALSE);
            relativeLayout2.addView(textView3, a10);
            for (c6 c6Var : navigationBarLayout2.f23327i.values()) {
                Context context3 = navigationBarLayout2.getContext();
                String str2 = c6Var.f21842d;
                Bitmap b10 = a1.b(context3, str2);
                if (b10 == null) {
                    b10 = a1.b(context3, str2);
                }
                if (b10 != null) {
                    c6Var.f21839a = Bitmap.createScaledBitmap(b10, j9.a(navigationBarLayout2.getContext(), c6Var.f21840b), j9.a(navigationBarLayout2.getContext(), c6Var.f21841c), true);
                }
            }
            Context context4 = navigationBarLayout2.getContext();
            Bitmap bitmap = ((c6) navigationBarLayout2.f23327i.get("X")).f21839a;
            ImageView imageView = new ImageView(context4);
            imageView.setImageBitmap(bitmap);
            imageView.setId(IronSourceConstants.IS_CHECK_CAPPED_TRUE);
            navigationBarLayout2.f23320b = imageView;
            Context context5 = navigationBarLayout2.getContext();
            Bitmap bitmap2 = ((c6) navigationBarLayout2.f23327i.get("BROWSER")).f21839a;
            ImageView imageView2 = new ImageView(context5);
            imageView2.setImageBitmap(bitmap2);
            imageView2.setId(IronSourceConstants.IS_CHECK_PLACEMENT_CAPPED);
            navigationBarLayout2.f23322d = imageView2;
            Context context6 = navigationBarLayout2.getContext();
            Bitmap bitmap3 = ((c6) navigationBarLayout2.f23327i.get("BACK")).f21839a;
            ImageView imageView3 = new ImageView(context6);
            imageView3.setImageBitmap(bitmap3);
            imageView3.setId(2105);
            navigationBarLayout2.f23323e = imageView3;
            Context context7 = navigationBarLayout2.getContext();
            Bitmap bitmap4 = ((c6) navigationBarLayout2.f23327i.get("FORWARD")).f21839a;
            ImageView imageView4 = new ImageView(context7);
            imageView4.setImageBitmap(bitmap4);
            imageView4.setId(2106);
            navigationBarLayout2.f23321c = imageView4;
            int a11 = j9.a(navigationBarLayout2.getContext(), 10);
            navigationBarLayout2.f23321c.setPadding(a11, a11, a11, a11);
            navigationBarLayout2.f23321c.setEnabled(false);
            navigationBarLayout2.f23323e.setPadding(a11, a11, a11, a11);
            navigationBarLayout2.addView(navigationBarLayout2.f23320b, j9.a(navigationBarLayout2.getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
            ImageView imageView5 = navigationBarLayout2.f23322d;
            RelativeLayout.LayoutParams a12 = j9.a(navigationBarLayout2.getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
            a12.addRule(0, IronSourceConstants.IS_CHECK_CAPPED_TRUE);
            navigationBarLayout2.addView(imageView5, a12);
            RelativeLayout relativeLayout3 = navigationBarLayout2.f23319a;
            RelativeLayout.LayoutParams a13 = j9.a(navigationBarLayout2.getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
            a13.addRule(0, IronSourceConstants.IS_CHECK_PLACEMENT_CAPPED);
            navigationBarLayout2.addView(relativeLayout3, a13);
            this.f21931y.setButtonsListener(this);
        }
        this.f21930x.addView(this.f21931y);
        this.A = new AnimatingProgressBar(this.f22201b, null, 16842872);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.A.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.A.setBackgroundColor(-1);
        this.A.setId(2108);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, j9.a(this.f22201b, 4));
        layoutParams.addRule(3, IronSourceConstants.IS_CHECK_READY_TRUE);
        this.f21930x.addView(this.A, layoutParams);
        this.B = new FrameLayout(this.f22201b);
        if (this.f21932z == null) {
            try {
                j();
                this.f21932z.loadUrl(str);
            } catch (Throwable th) {
                l3.a(th);
                this.f21931y.a();
                com.startapp.sdk.adsbase.a.a((Context) this.f22201b, str);
                this.f22201b.finish();
            }
        }
        this.B.addView(this.f21932z);
        this.B.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, 2108);
        this.f21930x.addView(this.B, layoutParams2);
        if (bundle != null) {
            this.f21932z.restoreState(bundle);
        }
        this.f22201b.setContentView(this.f21930x, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.startapp.l2
    public final void b(Bundle bundle) {
        this.f21932z.saveState(bundle);
    }

    @Override // com.startapp.l2
    public final void e() {
    }

    @Override // com.startapp.l2
    public final void f() {
    }

    public final void i() {
        try {
            D = true;
            this.f21932z.stopLoading();
            this.f21932z.removeAllViews();
            this.f21932z.postInvalidate();
            y.c(this.f21932z);
            this.f21932z.destroy();
            this.f21932z = null;
        } catch (Exception unused) {
        }
        this.f21931y.a();
        this.f22201b.finish();
    }

    public final void j() {
        WebView c10 = com.startapp.sdk.components.a.a(this.f22201b).f23225a.a().c();
        this.f21932z = c10;
        c10.getSettings().setJavaScriptEnabled(true);
        this.f21932z.getSettings().setUseWideViewPort(true);
        this.f21932z.getSettings().setLoadWithOverviewMode(true);
        this.f21932z.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f21932z.getSettings().setBuiltInZoomControls(true);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f21932z.getSettings().setDisplayZoomControls(false);
        }
        this.f21932z.setWebViewClient(new b(this.f22201b, this.f21931y, this.A, this));
        this.f21932z.setWebChromeClient(new a());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case IronSourceConstants.IS_CHECK_CAPPED_TRUE /* 2103 */:
                i();
                return;
            case IronSourceConstants.IS_CHECK_PLACEMENT_CAPPED /* 2104 */:
                WebView webView = this.f21932z;
                if (webView != null) {
                    com.startapp.sdk.adsbase.a.a((Context) this.f22201b, webView.getUrl());
                    i();
                    return;
                }
                return;
            case 2105:
                WebView webView2 = this.f21932z;
                if (webView2 == null || !webView2.canGoBack()) {
                    return;
                }
                this.A.a();
                this.f21932z.goBack();
                return;
            case 2106:
                WebView webView3 = this.f21932z;
                if (webView3 == null || !webView3.canGoForward()) {
                    return;
                }
                this.A.a();
                this.f21932z.goForward();
                return;
            default:
                return;
        }
    }

    @Override // com.startapp.l2
    public final boolean a(int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i10 == 4) {
            WebView webView = this.f21932z;
            if (webView != null && webView.canGoBack()) {
                this.A.a();
                this.f21932z.goBack();
                return true;
            }
            i();
            return true;
        }
        return false;
    }
}
