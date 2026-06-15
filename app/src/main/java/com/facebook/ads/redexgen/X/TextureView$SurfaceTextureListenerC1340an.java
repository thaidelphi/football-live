package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.an  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TextureView$SurfaceTextureListenerC1340an extends TextureView implements TextureView.SurfaceTextureListener, J0, JG, J2 {
    public static byte[] A0O;
    public static String[] A0P = {"HP", "vI", "IkPvJjq0d6kyiPKTTS2lCNhYTces79dt", "hRUerIi7AJ3jOkGNT2UiHpaxkSFge2bW", "Avvx3DFr2S27", "gmbQyyKnf6LsZqIL76N8lXPSt8AAYSbH", "tA8cc29oavr4xgkZce", "dMNAf6LzALyzJxRA4XpvvVCIX8V0s"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    public Surface A07;
    public View A08;
    public MediaController A09;
    public C1900k1 A0A;
    public IP A0B;
    public J3 A0C;
    public JI A0D;
    public JI A0E;
    public JJ A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0O = new byte[]{-54, -14, -14, -22, -17, -24, -93, -28, -17, -6, -28, -4, -10, -93, -9, -21, -11, -14, -6, -93, -28, -15, -93, -24, -5, -26, -24, -13, -9, -20, -14, -15, -93, -6, -20, -9, -21, -93, -10, -24, -9, -59, -28, -26, -18, -22, -11, -14, -8, -15, -25, -57, -11, -28, -6, -28, -27, -17, -24, -93, -14, -15, -93, -47, -14, -8, -22, -28, -9, -93, -28, -27, -14, -7, -24, -79, -93, -10, -14, -93, -6, -24, -93, -10, -20, -17, -24, -15, -9, -17, -4, -93, -20, -22, -15, -14, -11, -24, -93, -20, -9, -79, -22, 18, 18, 10, 15, 8, -61, 4, 15, 26, 4, 28, 22, -61, 23, 11, 21, 18, 26, -61, 4, 17, -61, 8, 27, 6, 8, 19, 23, 12, 18, 17, -61, 26, 12, 23, 11, -61, 22, 8, 23, -23, 18, 21, 8, 10, 21, 18, 24, 17, 7, -61, 18, 17, -61, -15, 18, 24, 10, 4, 23, -61, 4, 5, 18, 25, 8, -47, -61, 22, 18, -61, 26, 8, -61, 22, 12, 15, 8, 17, 23, 15, 28, -61, 12, 10, 17, 18, 21, 8, -61, 12, 23, -47, -11, 8, 3, 4, 14, -65, 18, 19, 0, 19, 4, -65, 2, 7, 0, 13, 6, 4, 3, -65, 19, 14, -65, -60, -62, -53, -62, -49, -58, -64};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C06419m.A1t(this.A0A)) {
            JI ji = this.A0D;
            if (A0P[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0P;
            strArr[0] = "Md";
            strArr[1] = "f0";
            if (ji == JI.A08) {
                return;
            }
            if (!this.A0L) {
                this.A0L = true;
                this.A0A.A0F().AI5();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long currentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0F != null) {
                this.A0F.ADD(currentPosition, currentPosition2, currentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0Q = TextureView$SurfaceTextureListenerC1340an.class.getSimpleName();
    }

    public TextureView$SurfaceTextureListenerC1340an(C1900k1 c1900k1) {
        super(c1900k1);
        this.A0D = JI.A04;
        this.A0E = JI.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = IP.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1900k1;
    }

    public TextureView$SurfaceTextureListenerC1340an(C1900k1 c1900k1, AttributeSet attributeSet) {
        super(c1900k1, attributeSet);
        this.A0D = JI.A04;
        this.A0E = JI.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = IP.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1900k1;
    }

    public TextureView$SurfaceTextureListenerC1340an(C1900k1 c1900k1, AttributeSet attributeSet, int i10) {
        super(c1900k1, attributeSet, i10);
        this.A0D = JI.A04;
        this.A0E = JI.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = IP.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1900k1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
        if (r5.A0K == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A04() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.k1 r1 = r5.A0A
            com.facebook.ads.redexgen.X.J3 r0 = new com.facebook.ads.redexgen.X.J3
            r0.<init>(r1)
            r5.A0C = r0
            com.facebook.ads.redexgen.X.J3 r0 = r5.A0C
            r0.A0H(r5)
            com.facebook.ads.redexgen.X.J3 r0 = r5.A0C
            r0.A0G(r5)
            com.facebook.ads.redexgen.X.J3 r0 = r5.A0C
            r3 = 0
            r0.A0I(r3)
            boolean r0 = r5.A0J
            if (r0 == 0) goto L4a
            boolean r0 = r5.A0I
            if (r0 != 0) goto L4a
            com.facebook.ads.redexgen.X.k1 r0 = r5.A0A
            android.app.Activity r1 = r0.A0E()
            if (r1 == 0) goto L66
            android.widget.MediaController r0 = new android.widget.MediaController
            r0.<init>(r1)
            r5.A09 = r0
            android.widget.MediaController r1 = r5.A09
            android.view.View r0 = r5.A08
            if (r0 != 0) goto L63
            r0 = r5
        L37:
            r1.setAnchorView(r0)
            android.widget.MediaController r1 = r5.A09
            com.facebook.ads.redexgen.X.J9 r0 = new com.facebook.ads.redexgen.X.J9
            r0.<init>(r5)
            r1.setMediaPlayer(r0)
            android.widget.MediaController r1 = r5.A09
            r0 = 1
            r1.setEnabled(r0)
        L4a:
            java.lang.String r0 = r5.A0G
            if (r0 == 0) goto La4
            java.lang.String r4 = r5.A0G
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC1340an.A0P
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 18
            if (r1 == r0) goto L8e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L63:
            android.view.View r0 = r5.A08
            goto L37
        L66:
            r4 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC1340an.A0P
            r0 = 5
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 121(0x79, float:1.7E-43)
            if (r1 == r0) goto L7f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC1340an.A0P
            java.lang.String r1 = "TO7k5EC8ZWp6tpojZW"
            r0 = 6
            r2[r0] = r1
            r5.A09 = r4
            goto L4a
        L7f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC1340an.A0P
            java.lang.String r1 = "fS"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "9d"
            r0 = 1
            r2[r0] = r1
            r5.A09 = r4
            goto L4a
        L8e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC1340an.A0P
            java.lang.String r1 = "Pg"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "vu"
            r0 = 1
            r2[r0] = r1
            int r0 = r4.length()
            if (r0 == 0) goto La4
            boolean r0 = r5.A0K
            if (r0 == 0) goto Lb1
        La4:
            com.facebook.ads.redexgen.X.J3 r2 = r5.A0C
            com.facebook.ads.redexgen.X.k1 r0 = r5.A0A
            com.facebook.ads.redexgen.X.k0 r1 = r0.A02()
            android.net.Uri r0 = r5.A06
            r2.A0F(r1, r0)
        Lb1:
            com.facebook.ads.redexgen.X.JI r0 = com.facebook.ads.redexgen.X.JI.A08
            r5.setVideoState(r0)
            boolean r0 = r5.isAvailable()
            if (r0 == 0) goto Lc3
            android.graphics.SurfaceTexture r0 = r5.getSurfaceTexture()
            r5.onSurfaceTextureAvailable(r0, r3, r3)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC1340an.A04():void");
    }

    private void A05() {
        J1 videoFormat;
        if (this.A0C != null && (videoFormat = this.A0C.A08()) != null) {
            A08(videoFormat.A01, videoFormat.A00);
        }
    }

    private void A06() {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
        }
        if (this.A0C != null) {
            this.A0C.A09();
            this.A0C = null;
        }
        this.A09 = null;
        this.A0N = false;
        setVideoState(JI.A04);
    }

    private void A08(int i10, int i11) {
        if (i10 != this.A03 || i11 != this.A02) {
            this.A03 = i10;
            this.A02 = i11;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return J3.A03();
    }

    public final /* synthetic */ void A0A() {
        Activity activity = this.A0A.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A9T();
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public final void A9T() {
        if (!this.A0H) {
            AFz(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public final boolean A9g() {
        return this.A0C != null && this.A0C.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public final boolean A9h() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public final boolean AAR() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.X.J0
    public final void AEY(String str, Exception exc) {
        this.A0A.A0F().ABr(str);
        this.A0A.A0F().A3Y(1);
        setVideoState(JI.A03);
        this.A0A.A08().AAu(A03(219, 7, 15), AbstractC06048a.A1N, new C06058b(exc));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        r3 = com.facebook.ads.redexgen.X.JI.A05;
        r2 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC1340an.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r2[4].length() == r2[7].length()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC1340an.A0P[6] = "dNFvbzP2EYglZVOCcO";
        setVideoState(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    @Override // com.facebook.ads.redexgen.X.J0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AEZ(boolean r8, int r9) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC1340an.AEZ(boolean, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.J2
    public final void AFi(int i10, int i11, int i12, float f10) {
        A08(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public final void AFz(boolean z10, int i10) {
        this.A0A.A0F().A3U(i10);
        this.A0E = JI.A05;
        this.A0M = z10;
        if (this.A0C != null) {
            this.A0C.A0I(false);
        } else {
            setVideoState(JI.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public final void AJ7(int i10) {
        this.A0A.A0F().ABs(i10);
        setVideoState(JI.A09);
        AJK(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public final void AJC(IP ip, int i10) {
        this.A0A.A0F().A3f(i10);
        this.A0M = false;
        this.A0E = JI.A0A;
        this.A0B = ip;
        if (this.A0C == null) {
            setup(this.A06);
        } else if (this.A0D != JI.A07 && this.A0D != JI.A05 && this.A0D != JI.A06) {
        } else {
            this.A0C.A0I(true);
            JI ji = JI.A0A;
            String[] strArr = A0P;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[0] = "Wi";
            strArr2[1] = "9L";
            setVideoState(ji);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public final void AJK(int i10) {
        this.A0A.A0F().A3h(i10);
        this.A0E = JI.A04;
        if (this.A0C != null) {
            this.A0C.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(JI.A04);
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public int getCurrentPosition() {
        if (this.A0C != null) {
            return (int) this.A0C.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public int getDuration() {
        if (this.A0C == null) {
            return 0;
        }
        return (int) this.A0C.A07();
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public IP getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public JI getState() {
        return this.A0D;
    }

    public JI getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C06419m.A2b(getContext()) && !isHardwareAccelerated()) {
            setVideoState(JI.A03);
            AJK(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.A07 != null) {
            this.A07.release();
        }
        this.A07 = new Surface(surfaceTexture);
        if (this.A0C == null) {
            return;
        }
        this.A0C.A0E(this.A07);
        if (this.A0D == JI.A05 && !this.A0M) {
            AJC(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
            if (this.A0C != null) {
                this.A0C.A0E(null);
            }
        }
        if (this.A0D != JI.A05) {
            AFz(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.A0C == null) {
            return;
        }
        if (this.A09 != null && this.A09.isShowing()) {
            return;
        }
        if (!z10) {
            if (this.A0D != JI.A05) {
                if ((this.A0A.A0H().A01() || C06419m.A1x(this.A0A)) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.J8
                        @Override // java.lang.Runnable
                        public final void run() {
                            TextureView$SurfaceTextureListenerC1340an.this.A0A();
                        }
                    }, 1000L);
                } else {
                    A9T();
                }
            }
        } else if (this.A0D != JI.A05 || this.A0M) {
        } else {
            AJC(this.A0B, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public final void seekTo(int i10) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i10);
            return;
        }
        this.A05 = i10;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.w(A0Q, A03(0, 102, 53));
        }
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public void setBackgroundPlaybackEnabled(boolean z10) {
        this.A0H = z10;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new JB(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.w(A0Q, A03(102, 94, 85));
        }
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public void setFullScreen(boolean z10) {
        this.A0J = z10;
        if (z10 && !this.A0I) {
            setOnTouchListener(new JA(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public void setRequestedVolume(float f10) {
        this.A00 = f10;
        if (this.A0C != null && this.A0D != JI.A08 && this.A0D != JI.A04) {
            this.A0C.A0C(f10);
        }
    }

    public void setTestMode(boolean z10) {
        this.A0K = z10;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public void setVideoMPD(String str) {
        this.A0G = str;
    }

    private void setVideoState(JI ji) {
        if (ji != this.A0D) {
            if (this.A0A.A05().AAD()) {
                String str = A03(196, 23, 81) + ji;
            }
            this.A0D = ji;
            if (this.A0D == JI.A0A) {
                this.A0N = true;
            }
            if (this.A0F != null) {
                this.A0F.AFl(ji);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public void setVideoStateChangeListener(JJ jj) {
        this.A0F = jj;
    }

    @Override // com.facebook.ads.redexgen.X.JG
    public void setup(Uri uri) {
        this.A0A.A0F().A3X();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
