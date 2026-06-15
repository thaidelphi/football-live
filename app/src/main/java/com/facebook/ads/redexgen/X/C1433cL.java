package com.facebook.ads.redexgen.X;

import android.animation.AnimatorSet;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.cL  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1433cL extends RelativeLayout implements JJ, IF {
    public static byte[] A0F;
    public static String[] A0G = {"3L6CoO6YtrcW", "MjcsiBOYcGfrGyZBxeZgAjKXsDYhFJK", "NbVxNqWnj3", "Ob7MM92eIAC3XgmL", "XSQst8sM3v9Waw60ED5t21eOsn1IQUtw", "wvdS5a619fbySZdqvbmzcB7w", "WLvo7626w9dzVwCTBg7InBeeg1a7HKE3", "kYDrs41aRZaYTR0SA8npQuCfjZz7Tio6"};
    public static final C1414c2 A0H;
    public static final C1408bw A0I;
    public static final C1406bu A0J;
    public static final C1401bp A0K;
    public static final C1400bo A0L;
    public static final C1397bl A0M;
    public static final C1395bj A0N;
    public static final C1394bi A0O;
    public float A00;
    public int A01;
    public AF A02;
    public IM A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final Handler A09;
    public final View.OnTouchListener A0A;
    public final C1900k1 A0B;
    public final C9J<C9K, C9I> A0C;
    public final List<IQ> A0D;
    public final JG A0E;

    public static String A0G(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0G;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[6] = "HxnswxUpcuHv1wuLD4berTHtADZcXTin";
            strArr2[4] = "I3xDTi7RY5fAtwEllKfD6KKH3DCBcY9z";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 57);
            i13++;
        }
    }

    public static void A0J() {
        A0F = new byte[]{93, -80, -94, -96, 93, -79, -84, -79, -98, -87, 93, -76, -98, -79, -96, -91, 93, -79, -90, -86, -94, 125, -81, -84, -84, -97, -88, -82, -90, -77, 90, -101, -82, 90};
    }

    static {
        A0J();
        A0J = new C1406bu();
        A0H = new C1414c2();
        A0K = new C1401bp();
        A0L = new C1400bo();
        A0I = new C1408bw();
        A0M = new C1397bl();
        A0O = new C1394bi();
        A0N = new C1395bj();
    }

    public C1433cL(C1900k1 c1900k1) {
        super(c1900k1);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C9J<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new IE(this);
        this.A0B = c1900k1;
        if (A0V(c1900k1)) {
            this.A0E = new TextureView$SurfaceTextureListenerC1340an(c1900k1);
        } else {
            this.A0E = new TextureView$SurfaceTextureListenerC1339am(c1900k1);
        }
        A0H();
    }

    public C1433cL(C1900k1 c1900k1, AttributeSet attributeSet) {
        super(c1900k1, attributeSet);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C9J<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new IE(this);
        this.A0B = c1900k1;
        if (A0V(c1900k1)) {
            this.A0E = new TextureView$SurfaceTextureListenerC1340an(c1900k1, attributeSet);
        } else {
            this.A0E = new TextureView$SurfaceTextureListenerC1339am(c1900k1, attributeSet);
        }
        A0H();
    }

    public C1433cL(C1900k1 c1900k1, AttributeSet attributeSet, int i10) {
        super(c1900k1, attributeSet, i10);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C9J<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new IE(this);
        this.A0B = c1900k1;
        if (A0V(c1900k1)) {
            this.A0E = new TextureView$SurfaceTextureListenerC1340an(c1900k1, attributeSet, i10);
        } else {
            this.A0E = new TextureView$SurfaceTextureListenerC1339am(c1900k1, attributeSet, i10);
        }
        A0H();
    }

    private float A06(JG jg) {
        int videoHeight = jg.getVideoHeight();
        if (videoHeight == 0) {
            return 1.0f;
        }
        int height = jg.getVideoWidth();
        return height / videoHeight;
    }

    public static /* synthetic */ C1401bp A0E() {
        C1401bp c1401bp = A0K;
        if (A0G[7].charAt(27) != '4') {
            String[] strArr = A0G;
            strArr[5] = "Ykw7x5qbt5Y8x48JghoZKWeO";
            strArr[0] = "cKnPTPxPmv7r";
            return c1401bp;
        }
        throw new RuntimeException();
    }

    private void A0H() {
        this.A07 = C06419m.A0s(this.A0B);
        this.A0B.A0F().A3T();
        this.A0E.setRequestedVolume(1.0f);
        this.A0E.setVideoStateChangeListener(this);
        this.A03 = new IM(this.A0B, this.A0E);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        D3.A0I(this.A03);
        addView(this.A03, layoutParams);
        setOnTouchListener(this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A08.postDelayed(new C1437cP(this), this.A01);
    }

    private final void A0K() {
        for (IQ iq : this.A0D) {
            boolean z10 = iq instanceof AbstractC1418c6;
            String[] strArr = A0G;
            if (strArr[6].charAt(13) != strArr[4].charAt(13)) {
                throw new RuntimeException();
            }
            A0G[3] = "f6iKlyOeYddBSkQQnaXOCc7KzH8j";
            if (z10) {
                A0R((AbstractC1418c6) iq);
            }
            iq.AAk(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i10) {
        if (C06419m.A0z(this.A0B)) {
            Toast.makeText(this.A0B, A0G(21, 13, 1) + (i10 / 1000.0f) + A0G(0, 21, 4), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AE ae) {
        if (this.A02 == null) {
            return;
        }
        this.A02.A04(ae, null);
    }

    private void A0Q(IQ iq) {
        if (iq instanceof AbstractC1418c6) {
            A0S((AbstractC1418c6) iq);
        }
        iq.AJa(this);
    }

    private void A0R(AbstractC1418c6 abstractC1418c6) {
        if (abstractC1418c6.getParent() == null) {
            if (abstractC1418c6 instanceof KA) {
                this.A03.A02(abstractC1418c6);
            } else {
                addView(abstractC1418c6);
            }
        }
    }

    private void A0S(AbstractC1418c6 abstractC1418c6) {
        if (abstractC1418c6 instanceof KA) {
            this.A03.A03(abstractC1418c6);
        } else {
            D3.A0H(abstractC1418c6);
        }
    }

    public static boolean A0T(float f10) {
        return f10 <= 0.6f;
    }

    public static boolean A0U(float f10) {
        return f10 >= 1.7f && f10 <= 1.8f;
    }

    private boolean A0V(C1900k1 c1900k1) {
        return C06419m.A2r(c1900k1, J3.A03());
    }

    public final void A0Y() {
        this.A0E.setVideoStateChangeListener(null);
        this.A0E.destroy();
    }

    public final void A0Z() {
        if (A0p()) {
            return;
        }
        this.A0E.A9T();
    }

    public final void A0a() {
        for (IQ iq : this.A0D) {
            A0Q(iq);
        }
        this.A0D.clear();
    }

    public final void A0b(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (this.A00 == 1.0f) {
            this.A00 = A06(this.A0E);
        }
        if (i10 == 1) {
            layoutParams.addRule(10);
        } else if (A0U(this.A00)) {
            layoutParams.addRule(13);
        } else {
            layoutParams.addRule(9);
        }
        IM im = this.A03;
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "Fk13SNDKaQVX0dV87s1e6TAwbDOb9nQX";
        im.setLayoutParams(layoutParams);
    }

    public final void A0c(int i10) {
        this.A08.removeCallbacksAndMessages(null);
        this.A0E.seekTo(i10);
    }

    public final void A0d(int i10) {
        this.A0E.AJK(i10);
    }

    public final void A0e(AnimatorSet animatorSet, boolean z10) {
        this.A03.A01(animatorSet, z10);
    }

    public final void A0f(II ii) {
        C1434cM c1434cM = new C1434cM(this);
        if (this.A07) {
            ExecutorC0712Cx.A00(c1434cM);
        } else {
            this.A09.post(c1434cM);
        }
        this.A0E.AJ7(ii.A03());
    }

    public final void A0g(IP ip, int i10) {
        if (this.A04 && this.A0E.getState() == JI.A06) {
            this.A04 = false;
        }
        this.A0E.AJC(ip, i10);
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        A0G[3] = "hMpnI8E";
    }

    public final void A0h(IQ iq) {
        this.A0D.add(iq);
    }

    public final void A0i(IQ iq) {
        this.A0D.remove(iq);
        A0Q(iq);
    }

    public final void A0j(boolean z10) {
        A0k(z10, 0);
    }

    public final void A0k(boolean z10, int i10) {
        if (A0p()) {
            return;
        }
        this.A0E.AFz(z10, i10);
    }

    public final void A0l(boolean z10, boolean z11, int i10) {
        this.A06 = z11;
        A0k(z10, i10);
    }

    public final boolean A0m() {
        return this.A0E.A9g();
    }

    public final boolean A0n() {
        return this.A0E.A9h();
    }

    public final boolean A0o() {
        return getVolume() == 0.0f;
    }

    public final boolean A0p() {
        return getState() == JI.A05;
    }

    public final boolean A0q() {
        return A0p() && this.A0E.AAR();
    }

    public final boolean A0r() {
        return getState() == JI.A0A;
    }

    public final boolean A0s() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.IF
    public final boolean AAF() {
        return A0V(this.A0B);
    }

    @Override // com.facebook.ads.redexgen.X.IF
    public final boolean AAK() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void ADD(long j10, long j11, long j12, float f10) {
        if (!C06419m.A1t(this.A0B)) {
            return;
        }
        this.A0C.A02(new KZ(j10, j11, j12, f10));
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void AE3() {
        A0k(true, 4);
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void AE4() {
        A0g(IP.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void AF1(int i10, int i11) {
        C1435cN c1435cN = new C1435cN(this, i10, i11);
        if (this.A07) {
            ExecutorC0712Cx.A00(c1435cN);
        } else {
            this.A09.post(c1435cN);
        }
        A0I();
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "9p5A7Zams3NJ3CBp1FBA5yfXzv5AdeGa";
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void AFl(JI ji) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        C1436cO c1436cO = new C1436cO(this, ji, currentPositionInMillis, currentPositionMS);
        if (this.A07) {
            ExecutorC0712Cx.A00(c1436cO);
        } else {
            this.A09.post(c1436cO);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IF
    public int getCurrentPositionInMillis() {
        return this.A0E.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0E.getDuration();
    }

    public C9J<C9K, C9I> getEventBus() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.X.IF
    public long getInitialBufferTime() {
        return this.A0E.getInitialBufferTime();
    }

    public List<IQ> getPlugins() {
        return this.A0D;
    }

    public JI getState() {
        return this.A0E.getState();
    }

    public Handler getStateHandler() {
        return this.A09;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0E;
    }

    public int getVideoHeight() {
        return this.A0E.getVideoHeight();
    }

    public View getVideoImplView() {
        return this.A0E.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.IF
    public IP getVideoStartReason() {
        return this.A0E.getStartReason();
    }

    public View getVideoView() {
        return this.A03;
    }

    public int getVideoWidth() {
        return this.A0E.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.IF
    public float getVolume() {
        return this.A0E.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0C.A02(A0N);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0C.A02(A0O);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.A0E != null) {
            this.A0E.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(AF af) {
        this.A02 = af;
    }

    public void setIsFullScreen(boolean z10) {
        this.A05 = z10;
        this.A0E.setFullScreen(z10);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(String str) {
        this.A0E.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i10) {
        this.A01 = i10;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            A0a();
        } else {
            A0K();
            if (A0G[2].length() != 10) {
                throw new RuntimeException();
            }
            A0G[2] = "2vtziZXFfU";
            this.A0E.setup(uri);
        }
        this.A04 = false;
    }

    public void setVideoURI(String str) {
        this.A0B.A0F().A3a(str);
        setVideoURI(str != null ? C5.A00(str) : null);
    }

    public void setVolume(float f10) {
        if (f10 == 1.0f) {
            A0M(AE.A0n);
            this.A0B.A0F().A3e();
        } else {
            A0M(AE.A0m);
            this.A0B.A0F().A3d();
        }
        this.A0E.setRequestedVolume(f10);
        getEventBus().A02(A0M);
    }
}
