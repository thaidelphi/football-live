package com.google.android.exoplayer2.ui;

import a5.p0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b5.a0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.c;
import java.util.ArrayList;
import java.util.List;
import n3.l2;
import n3.l3;
import n3.o;
import n3.o2;
import n3.p2;
import n3.q3;
import n3.r2;
import n3.u1;
import n3.z1;
import y4.m;
import y4.n;
import y5.q;
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class PlayerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final a f10902a;

    /* renamed from: b  reason: collision with root package name */
    private final AspectRatioFrameLayout f10903b;

    /* renamed from: c  reason: collision with root package name */
    private final View f10904c;

    /* renamed from: d  reason: collision with root package name */
    private final View f10905d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10906e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f10907f;

    /* renamed from: g  reason: collision with root package name */
    private final SubtitleView f10908g;

    /* renamed from: h  reason: collision with root package name */
    private final View f10909h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f10910i;

    /* renamed from: j  reason: collision with root package name */
    private final c f10911j;

    /* renamed from: k  reason: collision with root package name */
    private final FrameLayout f10912k;

    /* renamed from: l  reason: collision with root package name */
    private final FrameLayout f10913l;

    /* renamed from: m  reason: collision with root package name */
    private p2 f10914m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10915n;

    /* renamed from: o  reason: collision with root package name */
    private c.e f10916o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10917p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f10918q;

    /* renamed from: r  reason: collision with root package name */
    private int f10919r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10920s;

    /* renamed from: t  reason: collision with root package name */
    private a5.k<? super l2> f10921t;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f10922u;

    /* renamed from: v  reason: collision with root package name */
    private int f10923v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10924w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f10925x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10926y;

    /* renamed from: z  reason: collision with root package name */
    private int f10927z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class a implements p2.d, View.OnLayoutChangeListener, View.OnClickListener, c.e {

        /* renamed from: a  reason: collision with root package name */
        private final l3.b f10928a = new l3.b();

        /* renamed from: b  reason: collision with root package name */
        private Object f10929b;

        public a() {
        }

        @Override // n3.p2.d
        public /* synthetic */ void B(boolean z10) {
            r2.i(this, z10);
        }

        @Override // com.google.android.exoplayer2.ui.c.e
        public void C(int i10) {
            PlayerView.this.I();
        }

        @Override // n3.p2.d
        public /* synthetic */ void D(o oVar) {
            r2.d(this, oVar);
        }

        @Override // n3.p2.d
        public void F(int i10) {
            PlayerView.this.H();
            PlayerView.this.K();
            PlayerView.this.J();
        }

        @Override // n3.p2.d
        public /* synthetic */ void K(boolean z10) {
            r2.y(this, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void L(int i10, boolean z10) {
            r2.e(this, i10, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void N(l3 l3Var, int i10) {
            r2.B(this, l3Var, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void O(z1 z1Var) {
            r2.k(this, z1Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void P(l2 l2Var) {
            r2.q(this, l2Var);
        }

        @Override // n3.p2.d
        public void Q() {
            if (PlayerView.this.f10904c != null) {
                PlayerView.this.f10904c.setVisibility(4);
            }
        }

        @Override // n3.p2.d
        public /* synthetic */ void R(p2 p2Var, p2.c cVar) {
            r2.f(this, p2Var, cVar);
        }

        @Override // n3.p2.d
        public /* synthetic */ void T(u1 u1Var, int i10) {
            r2.j(this, u1Var, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void U(int i10, int i11) {
            r2.A(this, i10, i11);
        }

        @Override // n3.p2.d
        public void V(p2.e eVar, p2.e eVar2, int i10) {
            if (PlayerView.this.w() && PlayerView.this.f10925x) {
                PlayerView.this.u();
            }
        }

        @Override // n3.p2.d
        public /* synthetic */ void W(p2.b bVar) {
            r2.a(this, bVar);
        }

        @Override // n3.p2.d
        public /* synthetic */ void Y(int i10) {
            r2.t(this, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void a(boolean z10) {
            r2.z(this, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void a0(boolean z10) {
            r2.g(this, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void b0() {
            r2.x(this);
        }

        @Override // n3.p2.d
        public /* synthetic */ void d0(boolean z10, int i10) {
            r2.s(this, z10, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void g(Metadata metadata) {
            r2.l(this, metadata);
        }

        @Override // n3.p2.d
        public void g0(boolean z10, int i10) {
            PlayerView.this.H();
            PlayerView.this.J();
        }

        @Override // n3.p2.d
        public /* synthetic */ void h(List list) {
            r2.b(this, list);
        }

        @Override // n3.p2.d
        public /* synthetic */ void k0(l2 l2Var) {
            r2.r(this, l2Var);
        }

        @Override // n3.p2.d
        public void m0(q3 q3Var) {
            p2 p2Var = (p2) a5.a.e(PlayerView.this.f10914m);
            l3 t10 = p2Var.t();
            if (t10.u()) {
                this.f10929b = null;
            } else if (!p2Var.l().c()) {
                this.f10929b = t10.k(p2Var.D(), this.f10928a, true).f28132b;
            } else {
                Object obj = this.f10929b;
                if (obj != null) {
                    int f10 = t10.f(obj);
                    if (f10 != -1) {
                        if (p2Var.N() == t10.j(f10, this.f10928a).f28133c) {
                            return;
                        }
                    }
                    this.f10929b = null;
                }
            }
            PlayerView.this.L(false);
        }

        @Override // n3.p2.d
        public void n(n4.e eVar) {
            if (PlayerView.this.f10908g != null) {
                PlayerView.this.f10908g.setCues(eVar.f28634a);
            }
        }

        @Override // n3.p2.d
        public /* synthetic */ void n0(boolean z10) {
            r2.h(this, z10);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.F();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            PlayerView.o((TextureView) view, PlayerView.this.f10927z);
        }

        @Override // n3.p2.d
        public /* synthetic */ void t(int i10) {
            r2.w(this, i10);
        }

        @Override // n3.p2.d
        public void u(a0 a0Var) {
            PlayerView.this.G();
        }

        @Override // n3.p2.d
        public /* synthetic */ void w(o2 o2Var) {
            r2.n(this, o2Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void z(int i10) {
            r2.p(this, i10);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean A(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                y(this.f10903b, intrinsicWidth / intrinsicHeight);
                this.f10907f.setImageDrawable(drawable);
                this.f10907f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void B(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean C() {
        p2 p2Var = this.f10914m;
        if (p2Var == null) {
            return true;
        }
        int M = p2Var.M();
        return this.f10924w && (M == 1 || M == 4 || !this.f10914m.A());
    }

    private void E(boolean z10) {
        if (N()) {
            this.f10911j.setShowTimeoutMs(z10 ? 0 : this.f10923v);
            this.f10911j.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        if (!N() || this.f10914m == null) {
            return;
        }
        if (!this.f10911j.I()) {
            x(true);
        } else if (this.f10926y) {
            this.f10911j.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        p2 p2Var = this.f10914m;
        a0 F = p2Var != null ? p2Var.F() : a0.f5095e;
        int i10 = F.f5097a;
        int i11 = F.f5098b;
        int i12 = F.f5099c;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * F.f5100d) / i11;
        View view = this.f10905d;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.f10927z != 0) {
                view.removeOnLayoutChangeListener(this.f10902a);
            }
            this.f10927z = i12;
            if (i12 != 0) {
                this.f10905d.addOnLayoutChangeListener(this.f10902a);
            }
            o((TextureView) this.f10905d, this.f10927z);
        }
        y(this.f10903b, this.f10906e ? 0.0f : f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        int i10;
        if (this.f10909h != null) {
            p2 p2Var = this.f10914m;
            boolean z10 = true;
            if (p2Var == null || p2Var.M() != 2 || ((i10 = this.f10919r) != 2 && (i10 != 1 || !this.f10914m.A()))) {
                z10 = false;
            }
            this.f10909h.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        c cVar = this.f10911j;
        if (cVar != null && this.f10915n) {
            if (cVar.getVisibility() == 0) {
                setContentDescription(this.f10926y ? getResources().getString(m.f33106a) : null);
                return;
            } else {
                setContentDescription(getResources().getString(m.f33110e));
                return;
            }
        }
        setContentDescription(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (w() && this.f10925x) {
            u();
        } else {
            x(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        a5.k<? super l2> kVar;
        TextView textView = this.f10910i;
        if (textView != null) {
            CharSequence charSequence = this.f10922u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f10910i.setVisibility(0);
                return;
            }
            p2 p2Var = this.f10914m;
            l2 j10 = p2Var != null ? p2Var.j() : null;
            if (j10 != null && (kVar = this.f10921t) != null) {
                this.f10910i.setText((CharSequence) kVar.a(j10).second);
                this.f10910i.setVisibility(0);
                return;
            }
            this.f10910i.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(boolean z10) {
        p2 p2Var = this.f10914m;
        if (p2Var != null && p2Var.p(30) && !p2Var.l().c()) {
            if (z10 && !this.f10920s) {
                p();
            }
            if (p2Var.l().d(2)) {
                t();
                return;
            }
            p();
            if (M() && (z(p2Var.V()) || A(this.f10918q))) {
                return;
            }
            t();
        } else if (this.f10920s) {
        } else {
            t();
            p();
        }
    }

    private boolean M() {
        if (this.f10917p) {
            a5.a.h(this.f10907f);
            return true;
        }
        return false;
    }

    private boolean N() {
        if (this.f10915n) {
            a5.a.h(this.f10911j);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    private void p() {
        View view = this.f10904c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void q(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(y4.i.f33077f));
        imageView.setBackgroundColor(resources.getColor(y4.h.f33071a));
    }

    private static void r(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(y4.i.f33077f, null));
        imageView.setBackgroundColor(resources.getColor(y4.h.f33071a, null));
    }

    private void t() {
        ImageView imageView = this.f10907f;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f10907f.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean v(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() {
        p2 p2Var = this.f10914m;
        return p2Var != null && p2Var.f() && this.f10914m.A();
    }

    private void x(boolean z10) {
        if (!(w() && this.f10925x) && N()) {
            boolean z11 = this.f10911j.I() && this.f10911j.getShowTimeoutMs() <= 0;
            boolean C = C();
            if (z10 || z11 || C) {
                E(C);
            }
        }
    }

    private boolean z(z1 z1Var) {
        byte[] bArr = z1Var.f28551j;
        if (bArr == null) {
            return false;
        }
        return A(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public void D() {
        E(C());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        p2 p2Var = this.f10914m;
        if (p2Var != null && p2Var.f()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean v10 = v(keyEvent.getKeyCode());
        if (v10 && N() && !this.f10911j.I()) {
            x(true);
        } else if (!s(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            if (v10 && N()) {
                x(true);
                return false;
            }
            return false;
        } else {
            x(true);
        }
        return true;
    }

    public List<y4.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f10913l;
        if (frameLayout != null) {
            arrayList.add(new y4.a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        c cVar = this.f10911j;
        if (cVar != null) {
            arrayList.add(new y4.a(cVar, 1));
        }
        return q.l(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) a5.a.i(this.f10912k, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f10924w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f10926y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f10923v;
    }

    public Drawable getDefaultArtwork() {
        return this.f10918q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f10913l;
    }

    public p2 getPlayer() {
        return this.f10914m;
    }

    public int getResizeMode() {
        a5.a.h(this.f10903b);
        return this.f10903b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f10908g;
    }

    public boolean getUseArtwork() {
        return this.f10917p;
    }

    public boolean getUseController() {
        return this.f10915n;
    }

    public View getVideoSurfaceView() {
        return this.f10905d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!N() || this.f10914m == null) {
            return false;
        }
        x(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        F();
        return super.performClick();
    }

    public boolean s(KeyEvent keyEvent) {
        return N() && this.f10911j.A(keyEvent);
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        a5.a.h(this.f10903b);
        this.f10903b.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f10924w = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f10925x = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        a5.a.h(this.f10911j);
        this.f10926y = z10;
        I();
    }

    public void setControllerShowTimeoutMs(int i10) {
        a5.a.h(this.f10911j);
        this.f10923v = i10;
        if (this.f10911j.I()) {
            D();
        }
    }

    public void setControllerVisibilityListener(c.e eVar) {
        a5.a.h(this.f10911j);
        c.e eVar2 = this.f10916o;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            this.f10911j.J(eVar2);
        }
        this.f10916o = eVar;
        if (eVar != null) {
            this.f10911j.y(eVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        a5.a.f(this.f10910i != null);
        this.f10922u = charSequence;
        K();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f10918q != drawable) {
            this.f10918q = drawable;
            L(false);
        }
    }

    public void setErrorMessageProvider(a5.k<? super l2> kVar) {
        if (this.f10921t != kVar) {
            this.f10921t = kVar;
            K();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f10920s != z10) {
            this.f10920s = z10;
            L(false);
        }
    }

    public void setPlayer(p2 p2Var) {
        a5.a.f(Looper.myLooper() == Looper.getMainLooper());
        a5.a.a(p2Var == null || p2Var.u() == Looper.getMainLooper());
        p2 p2Var2 = this.f10914m;
        if (p2Var2 == p2Var) {
            return;
        }
        if (p2Var2 != null) {
            p2Var2.q(this.f10902a);
            if (p2Var2.p(27)) {
                View view = this.f10905d;
                if (view instanceof TextureView) {
                    p2Var2.E((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    p2Var2.P((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f10908g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f10914m = p2Var;
        if (N()) {
            this.f10911j.setPlayer(p2Var);
        }
        H();
        K();
        L(true);
        if (p2Var != null) {
            if (p2Var.p(27)) {
                View view2 = this.f10905d;
                if (view2 instanceof TextureView) {
                    p2Var.w((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    p2Var.h((SurfaceView) view2);
                }
                G();
            }
            if (this.f10908g != null && p2Var.p(28)) {
                this.f10908g.setCues(p2Var.n().f28634a);
            }
            p2Var.x(this.f10902a);
            x(false);
            return;
        }
        u();
    }

    public void setRepeatToggleModes(int i10) {
        a5.a.h(this.f10911j);
        this.f10911j.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        a5.a.h(this.f10903b);
        this.f10903b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f10919r != i10) {
            this.f10919r = i10;
            H();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        a5.a.h(this.f10911j);
        this.f10911j.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        a5.a.h(this.f10911j);
        this.f10911j.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        a5.a.h(this.f10911j);
        this.f10911j.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        a5.a.h(this.f10911j);
        this.f10911j.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        a5.a.h(this.f10911j);
        this.f10911j.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        a5.a.h(this.f10911j);
        this.f10911j.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f10904c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        a5.a.f((z10 && this.f10907f == null) ? false : true);
        if (this.f10917p != z10) {
            this.f10917p = z10;
            L(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11 = false;
        a5.a.f((z10 && this.f10911j == null) ? false : true);
        if (z10 || hasOnClickListeners()) {
            z11 = true;
        }
        setClickable(z11);
        if (this.f10915n == z10) {
            return;
        }
        this.f10915n = z10;
        if (N()) {
            this.f10911j.setPlayer(this.f10914m);
        } else {
            c cVar = this.f10911j;
            if (cVar != null) {
                cVar.F();
                this.f10911j.setPlayer(null);
            }
        }
        I();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f10905d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public void u() {
        c cVar = this.f10911j;
        if (cVar != null) {
            cVar.F();
        }
    }

    protected void y(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        int i16;
        boolean z15;
        boolean z16;
        int i17;
        boolean z17;
        a aVar = new a();
        this.f10902a = aVar;
        if (isInEditMode()) {
            this.f10903b = null;
            this.f10904c = null;
            this.f10905d = null;
            this.f10906e = false;
            this.f10907f = null;
            this.f10908g = null;
            this.f10909h = null;
            this.f10910i = null;
            this.f10911j = null;
            this.f10912k = null;
            this.f10913l = null;
            ImageView imageView = new ImageView(context);
            if (p0.f482a >= 23) {
                r(getResources(), imageView);
            } else {
                q(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i18 = y4.l.f33105c;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.H, i10, 0);
            try {
                int i19 = n.R;
                boolean hasValue = obtainStyledAttributes.hasValue(i19);
                int color = obtainStyledAttributes.getColor(i19, 0);
                int resourceId = obtainStyledAttributes.getResourceId(n.N, i18);
                boolean z18 = obtainStyledAttributes.getBoolean(n.T, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(n.J, 0);
                boolean z19 = obtainStyledAttributes.getBoolean(n.U, true);
                int i20 = obtainStyledAttributes.getInt(n.S, 1);
                int i21 = obtainStyledAttributes.getInt(n.O, 0);
                int i22 = obtainStyledAttributes.getInt(n.Q, 5000);
                boolean z20 = obtainStyledAttributes.getBoolean(n.L, true);
                boolean z21 = obtainStyledAttributes.getBoolean(n.I, true);
                i13 = obtainStyledAttributes.getInteger(n.P, 0);
                this.f10920s = obtainStyledAttributes.getBoolean(n.M, this.f10920s);
                boolean z22 = obtainStyledAttributes.getBoolean(n.K, true);
                obtainStyledAttributes.recycle();
                z12 = z20;
                z10 = z21;
                i12 = i21;
                z15 = z19;
                i16 = resourceId2;
                z14 = z18;
                z13 = hasValue;
                i15 = color;
                i14 = i20;
                i18 = resourceId;
                i11 = i22;
                z11 = z22;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i11 = 5000;
            z10 = true;
            i12 = 0;
            z11 = true;
            i13 = 0;
            z12 = true;
            i14 = 1;
            i15 = 0;
            z13 = false;
            z14 = true;
            i16 = 0;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i18, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(y4.j.f33081d);
        this.f10903b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            B(aspectRatioFrameLayout, i12);
        }
        View findViewById = findViewById(y4.j.f33098u);
        this.f10904c = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i15);
        }
        if (aspectRatioFrameLayout != null && i14 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i14 == 2) {
                this.f10905d = new TextureView(context);
            } else if (i14 == 3) {
                try {
                    this.f10905d = (View) Class.forName("c5.l").getConstructor(Context.class).newInstance(context);
                    z17 = true;
                    this.f10905d.setLayoutParams(layoutParams);
                    this.f10905d.setOnClickListener(aVar);
                    this.f10905d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f10905d, 0);
                    z16 = z17;
                } catch (Exception e8) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e8);
                }
            } else if (i14 != 4) {
                this.f10905d = new SurfaceView(context);
            } else {
                try {
                    this.f10905d = (View) Class.forName("b5.i").getConstructor(Context.class).newInstance(context);
                } catch (Exception e10) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            }
            z17 = false;
            this.f10905d.setLayoutParams(layoutParams);
            this.f10905d.setOnClickListener(aVar);
            this.f10905d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f10905d, 0);
            z16 = z17;
        } else {
            this.f10905d = null;
            z16 = false;
        }
        this.f10906e = z16;
        this.f10912k = (FrameLayout) findViewById(y4.j.f33078a);
        this.f10913l = (FrameLayout) findViewById(y4.j.f33088k);
        ImageView imageView2 = (ImageView) findViewById(y4.j.f33079b);
        this.f10907f = imageView2;
        this.f10917p = z14 && imageView2 != null;
        if (i16 != 0) {
            this.f10918q = androidx.core.content.a.f(getContext(), i16);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(y4.j.f33099v);
        this.f10908g = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View findViewById2 = findViewById(y4.j.f33080c);
        this.f10909h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f10919r = i13;
        TextView textView = (TextView) findViewById(y4.j.f33085h);
        this.f10910i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i23 = y4.j.f33082e;
        c cVar = (c) findViewById(i23);
        View findViewById3 = findViewById(y4.j.f33083f);
        if (cVar != null) {
            this.f10911j = cVar;
            i17 = 0;
        } else if (findViewById3 != null) {
            i17 = 0;
            c cVar2 = new c(context, null, 0, attributeSet);
            this.f10911j = cVar2;
            cVar2.setId(i23);
            cVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(cVar2, indexOfChild);
        } else {
            i17 = 0;
            this.f10911j = null;
        }
        c cVar3 = this.f10911j;
        this.f10923v = cVar3 != null ? i11 : i17;
        this.f10926y = z12;
        this.f10924w = z10;
        this.f10925x = z11;
        this.f10915n = (!z15 || cVar3 == null) ? i17 : 1;
        if (cVar3 != null) {
            cVar3.F();
            this.f10911j.y(aVar);
        }
        if (z15) {
            setClickable(true);
        }
        I();
    }
}
