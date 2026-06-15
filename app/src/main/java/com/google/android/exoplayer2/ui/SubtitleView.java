package com.google.android.exoplayer2.ui;

import a5.p0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n4.b;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private List<n4.b> f10931a;

    /* renamed from: b  reason: collision with root package name */
    private y4.b f10932b;

    /* renamed from: c  reason: collision with root package name */
    private int f10933c;

    /* renamed from: d  reason: collision with root package name */
    private float f10934d;

    /* renamed from: e  reason: collision with root package name */
    private float f10935e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10936f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10937g;

    /* renamed from: h  reason: collision with root package name */
    private int f10938h;

    /* renamed from: i  reason: collision with root package name */
    private a f10939i;

    /* renamed from: j  reason: collision with root package name */
    private View f10940j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(List<n4.b> list, y4.b bVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10931a = Collections.emptyList();
        this.f10932b = y4.b.f33059g;
        this.f10933c = 0;
        this.f10934d = 0.0533f;
        this.f10935e = 0.08f;
        this.f10936f = true;
        this.f10937g = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.f10939i = aVar;
        this.f10940j = aVar;
        addView(aVar);
        this.f10938h = 1;
    }

    private n4.b a(n4.b bVar) {
        b.C0322b b10 = bVar.b();
        if (!this.f10936f) {
            j.e(b10);
        } else if (!this.f10937g) {
            j.f(b10);
        }
        return b10.a();
    }

    private void c(int i10, float f10) {
        this.f10933c = i10;
        this.f10934d = f10;
        f();
    }

    private void f() {
        this.f10939i.a(getCuesWithStylingPreferencesApplied(), this.f10932b, this.f10934d, this.f10933c, this.f10935e);
    }

    private List<n4.b> getCuesWithStylingPreferencesApplied() {
        if (this.f10936f && this.f10937g) {
            return this.f10931a;
        }
        ArrayList arrayList = new ArrayList(this.f10931a.size());
        for (int i10 = 0; i10 < this.f10931a.size(); i10++) {
            arrayList.add(a(this.f10931a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (p0.f482a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private y4.b getUserCaptionStyle() {
        if (p0.f482a >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                return y4.b.a(captioningManager.getUserStyle());
            }
            return y4.b.f33059g;
        }
        return y4.b.f33059g;
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f10940j);
        View view = this.f10940j;
        if (view instanceof l) {
            ((l) view).g();
        }
        this.f10940j = t10;
        this.f10939i = t10;
        addView(t10);
    }

    public void b(float f10, boolean z10) {
        c(z10 ? 1 : 0, f10);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f10937g = z10;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f10936f = z10;
        f();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f10935e = f10;
        f();
    }

    public void setCues(List<n4.b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f10931a = list;
        f();
    }

    public void setFractionalTextSize(float f10) {
        b(f10, false);
    }

    public void setStyle(y4.b bVar) {
        this.f10932b = bVar;
        f();
    }

    public void setViewType(int i10) {
        if (this.f10938h == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new com.google.android.exoplayer2.ui.a(getContext()));
        } else if (i10 == 2) {
            setView(new l(getContext()));
        } else {
            throw new IllegalArgumentException();
        }
        this.f10938h = i10;
    }
}
