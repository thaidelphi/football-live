package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e extends View {

    /* renamed from: a  reason: collision with root package name */
    protected float f6612a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f6613b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f6619a;

        a(int i10) {
            this.f6619a = i10;
        }

        public int b() {
            return this.f6619a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(Context context) {
        super(context);
        this.f6612a = 1.0f;
        this.f6613b = context;
    }

    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f6612a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f10) {
        this.f6612a = f10;
    }

    public static e a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new h(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new i(context);
        }
        if (aVar.equals(a.TRANSPARENT_SKIP)) {
            return new j(context);
        }
        return new n(context);
    }
}
