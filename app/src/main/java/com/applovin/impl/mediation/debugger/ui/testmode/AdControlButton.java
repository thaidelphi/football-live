package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.j0;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final GradientDrawable f7762a;

    /* renamed from: b  reason: collision with root package name */
    private final Button f7763b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.a f7764c;

    /* renamed from: d  reason: collision with root package name */
    private b f7765d;

    /* renamed from: e  reason: collision with root package name */
    private MaxAdFormat f7766e;

    /* renamed from: f  reason: collision with root package name */
    private a f7767f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        if (b.LOAD == bVar) {
            return j0.a(R.color.applovin_sdk_brand_color, getContext());
        }
        if (b.LOADING == bVar) {
            return j0.a(R.color.applovin_sdk_brand_color, getContext());
        }
        return j0.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f7764c.a();
        } else {
            setEnabled(true);
            this.f7764c.b();
        }
        this.f7763b.setText(b(bVar));
        this.f7762a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f7765d;
    }

    public MaxAdFormat getFormat() {
        return this.f7766e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f7767f;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f7765d != bVar) {
            c(bVar);
        }
        this.f7765d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f7766e = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f7767f = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f7762a = gradientDrawable;
        Button button = new Button(getContext());
        this.f7763b = button;
        com.applovin.impl.a aVar = new com.applovin.impl.a(getContext(), 20, 16842873);
        this.f7764c = aVar;
        b bVar = b.LOAD;
        this.f7765d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.f7763b.setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{j0.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
