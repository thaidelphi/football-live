package com.startapp.sdk.inappbrowser;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.c6;
import com.startapp.j9;
import java.util.HashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NavigationBarLayout extends RelativeLayout {

    /* renamed from: j  reason: collision with root package name */
    public static final int f23317j = Color.rgb(78, 86, 101);

    /* renamed from: k  reason: collision with root package name */
    public static final int f23318k = Color.rgb(148, 155, 166);

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f23319a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f23320b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f23321c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f23322d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f23323e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f23324f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f23325g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f23326h;

    /* renamed from: i  reason: collision with root package name */
    public HashMap f23327i;

    public NavigationBarLayout(Context context) {
        super(context);
        this.f23326h = Boolean.FALSE;
    }

    public final void a(WebView webView) {
        if (this.f23326h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f23323e.setImageBitmap(((c6) this.f23327i.get("BACK_DARK")).f21839a);
                this.f23323e.setEnabled(true);
            } else {
                this.f23323e.setImageBitmap(((c6) this.f23327i.get("BACK")).f21839a);
                this.f23323e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f23321c.setImageBitmap(((c6) this.f23327i.get("FORWARD_DARK")).f21839a);
                this.f23321c.setEnabled(true);
            } else {
                this.f23321c.setImageBitmap(((c6) this.f23327i.get("FORWARD")).f21839a);
                this.f23321c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f23324f.setText(webView.getTitle());
            }
        } else if (webView.canGoBack()) {
            this.f23323e.setImageBitmap(((c6) this.f23327i.get("BACK_DARK")).f21839a);
            addView(this.f23323e, j9.a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            View view = this.f23321c;
            RelativeLayout.LayoutParams a10 = j9.a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            a10.addRule(1, 2105);
            addView(view, a10);
            removeView(this.f23319a);
            this.f23319a.removeView(this.f23325g);
            this.f23319a.removeView(this.f23324f);
            this.f23319a.addView(this.f23324f, j9.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f23319a;
            TextView textView = this.f23325g;
            RelativeLayout.LayoutParams a11 = j9.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            a11.addRule(3, IronSourceConstants.IS_CHECK_READY_FALSE);
            relativeLayout.addView(textView, a11);
            RelativeLayout.LayoutParams a12 = j9.a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            a12.addRule(1, 2106);
            a12.addRule(0, IronSourceConstants.IS_CHECK_PLACEMENT_CAPPED);
            addView(this.f23319a, a12);
            this.f23326h = Boolean.TRUE;
        }
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f23320b.setOnClickListener(onClickListener);
        this.f23323e.setOnClickListener(onClickListener);
        this.f23321c.setOnClickListener(onClickListener);
        this.f23322d.setOnClickListener(onClickListener);
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 11) {
            ((BitmapDrawable) this.f23320b.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f23322d.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f23323e.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f23321c.getDrawable()).getBitmap().recycle();
        }
        this.f23327i = null;
    }
}
