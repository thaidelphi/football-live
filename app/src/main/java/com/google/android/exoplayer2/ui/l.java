package com.google.android.exoplayer2.ui;

import a5.p0;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class l extends FrameLayout implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.exoplayer2.ui.a f11037a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f11038b;

    /* renamed from: c  reason: collision with root package name */
    private List<n4.b> f11039c;

    /* renamed from: d  reason: collision with root package name */
    private y4.b f11040d;

    /* renamed from: e  reason: collision with root package name */
    private float f11041e;

    /* renamed from: f  reason: collision with root package name */
    private int f11042f;

    /* renamed from: g  reason: collision with root package name */
    private float f11043g;

    /* compiled from: WebViewSubtitleOutput.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebViewSubtitleOutput.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11045a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f11045a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11045a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11045a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(Context context) {
        this(context, null);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f11045a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    private static String d(y4.b bVar) {
        int i10 = bVar.f33063d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return i10 != 4 ? "unset" : p0.B("-0.05em -0.05em 0.15em %s", com.google.android.exoplayer2.ui.b.b(bVar.f33064e));
                }
                return p0.B("0.06em 0.08em 0.15em %s", com.google.android.exoplayer2.ui.b.b(bVar.f33064e));
            }
            return p0.B("0.1em 0.12em 0.15em %s", com.google.android.exoplayer2.ui.b.b(bVar.f33064e));
        }
        return p0.B("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", com.google.android.exoplayer2.ui.b.b(bVar.f33064e));
    }

    private String e(int i10, float f10) {
        float h10 = j.h(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return h10 == -3.4028235E38f ? "unset" : p0.B("%.2fpx", Float.valueOf(h10 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String h(n4.b bVar) {
        float f10 = bVar.f28613q;
        if (f10 != 0.0f) {
            int i10 = bVar.f28612p;
            return p0.B("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0144, code lost:
        if (r13 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
        if (r13 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
        r21 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014b, code lost:
        r22 = "top";
        r13 = 2;
        r23 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i() {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.l.i():void");
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<n4.b> list, y4.b bVar, float f10, int i10, float f11) {
        this.f11040d = bVar;
        this.f11041e = f10;
        this.f11042f = i10;
        this.f11043g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            n4.b bVar2 = list.get(i11);
            if (bVar2.f28600d != null) {
                arrayList.add(bVar2);
            } else {
                arrayList2.add(bVar2);
            }
        }
        if (!this.f11039c.isEmpty() || !arrayList2.isEmpty()) {
            this.f11039c = arrayList2;
            i();
        }
        this.f11037a.a(arrayList, bVar, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f11038b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f11039c.isEmpty()) {
            return;
        }
        i();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11039c = Collections.emptyList();
        this.f11040d = y4.b.f33059g;
        this.f11041e = 0.0533f;
        this.f11042f = 0;
        this.f11043g = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context, attributeSet);
        this.f11037a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f11038b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
