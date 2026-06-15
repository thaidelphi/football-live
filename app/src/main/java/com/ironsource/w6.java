package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.w6;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class w6 extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ov f21257a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements ov {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View this_apply) {
            kotlin.jvm.internal.n.f(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(w2 adTools, long j10) {
            kotlin.jvm.internal.n.f(adTools, "$adTools");
            adTools.e().h().a(false, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(w6 this$0, View view, View this_apply) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(w2 adTools, long j10) {
            kotlin.jvm.internal.n.f(adTools, "$adTools");
            adTools.e().h().a(true, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final w2 adTools, final long j10) {
            kotlin.jvm.internal.n.f(adTools, "$adTools");
            adTools.d(new Runnable() { // from class: com.ironsource.j20
                @Override // java.lang.Runnable
                public final void run() {
                    w6.a.d(w2.this, j10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(w2 adTools, long j10) {
            kotlin.jvm.internal.n.f(adTools, "$adTools");
            adTools.e().h().a(j10);
        }

        @Override // com.ironsource.ov
        public void a(View view, FrameLayout.LayoutParams layoutParams, final w2 adTools) {
            kotlin.jvm.internal.n.f(view, "view");
            kotlin.jvm.internal.n.f(layoutParams, "layoutParams");
            kotlin.jvm.internal.n.f(adTools, "adTools");
            final View childAt = w6.this.getChildAt(0);
            final long e8 = mm.f19249r.d().d().e();
            if (e8 <= 0) {
                w6.this.removeView(childAt);
                w6.this.addView(view, layoutParams);
                adTools.d(new Runnable() { // from class: com.ironsource.h20
                    @Override // java.lang.Runnable
                    public final void run() {
                        w6.a.a(w2.this, e8);
                    }
                });
                return;
            }
            adTools.d(new Runnable() { // from class: com.ironsource.g20
                @Override // java.lang.Runnable
                public final void run() {
                    w6.a.b(w2.this, e8);
                }
            });
            view.setAlpha(0.0f);
            w6.this.addView(view, layoutParams);
            if (childAt != null) {
                final w6 w6Var = w6.this;
                childAt.animate().alpha(0.0f).setDuration(e8).withStartAction(new Runnable() { // from class: com.ironsource.f20
                    @Override // java.lang.Runnable
                    public final void run() {
                        w6.a.a(childAt);
                    }
                }).withEndAction(new Runnable() { // from class: com.ironsource.k20
                    @Override // java.lang.Runnable
                    public final void run() {
                        w6.a.a(w6.this, childAt, childAt);
                    }
                }).start();
            }
            view.animate().alpha(1.0f).setDuration(e8).withEndAction(new Runnable() { // from class: com.ironsource.i20
                @Override // java.lang.Runnable
                public final void run() {
                    w6.a.c(w2.this, e8);
                }
            }).start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(Context context) {
        super(context);
        kotlin.jvm.internal.n.f(context, "context");
        this.f21257a = new a();
    }

    public final ov getViewBinder() {
        return this.f21257a;
    }
}
