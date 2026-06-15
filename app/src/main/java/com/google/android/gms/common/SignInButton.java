package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private int f12035a;

    /* renamed from: b  reason: collision with root package name */
    private int f12036b;

    /* renamed from: c  reason: collision with root package name */
    private View f12037c;

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f12038d;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface ButtonSize {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface ColorScheme {
    }

    private final void b(Context context) {
        View view = this.f12037c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f12037c = zaz.a(context, this.f12035a, this.f12036b);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i10 = this.f12035a;
            int i11 = this.f12036b;
            zaaa zaaaVar = new zaaa(context, null);
            zaaaVar.a(context.getResources(), i10, i11);
            this.f12037c = zaaaVar;
        }
        addView(this.f12037c);
        this.f12037c.setEnabled(isEnabled());
        this.f12037c.setOnClickListener(this);
    }

    public void a(int i10, int i11) {
        this.f12035a = i10;
        this.f12036b = i11;
        b(getContext());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f12038d;
        if (onClickListener == null || view != this.f12037c) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i10) {
        a(this.f12035a, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f12037c.setEnabled(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12038d = onClickListener;
        View view = this.f12037c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.f12035a, this.f12036b);
    }

    public void setSize(int i10) {
        a(i10, this.f12036b);
    }
}
