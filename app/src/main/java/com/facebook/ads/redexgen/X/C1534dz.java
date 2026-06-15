package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* renamed from: com.facebook.ads.redexgen.X.dz  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1534dz extends FrameLayout implements DS {
    public static byte[] A0L;
    public static String[] A0M = {"2u2dP7fJh3RTJE0f5j", "V84xfC9vRBWBw28ag3Wa", "AJ9OWsf0IOCB9JkMwpi03POlIdxFWB0O", "t4KHUJW6pNylT", "agpCzVGtSfjd9ImL9ArnGOWeGltiI7KT", "yQxi0n265GvpKMbNVeZVKXQg4YYx4N", "9gQlnw56", "rIoCFSW2UJYE3I7OlTOsSCWVSaoSra"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public FT A03;
    public AbstractC1603f6 A04;
    public I7 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C2056mb A0A;
    public final InterfaceC05636k A0B;
    public final C05987t A0C;
    public final C1900k1 A0D;
    public final A7 A0E;
    public final AF A0F;
    public final View$OnSystemUiVisibilityChangeListenerC0705Cq A0G;
    public final DR A0H;
    public final FullScreenAdToolbar A0I;
    public final EC A0J;
    public final ArrayList<HG> A0K;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.X.AbstractC1603f6 A09(boolean r26, int r27) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1534dz.A09(boolean, int):com.facebook.ads.redexgen.X.f6");
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0L = new byte[]{-103, -24, -33, -103, -1, 34, -34};
    }

    static {
        A0E();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C1534dz(C1900k1 c1900k1, EC ec, A7 a72, C2056mb c2056mb, C05987t c05987t, DR dr) {
        super(c1900k1);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new C1547eC(this);
        this.A0D = c1900k1;
        this.A0J = ec;
        this.A0E = a72;
        this.A0A = c2056mb;
        this.A0C = c05987t;
        this.A0H = dr;
        this.A0F = new AF(this.A0A.A1Z(0).A1g(), this.A0E);
        this.A0G = new View$OnSystemUiVisibilityChangeListenerC0705Cq(this);
        this.A0G.A05(EnumC0704Cp.A02);
        this.A05 = new I7(this.A0D, this.A0J, this.A0A.A0s(), dr);
        this.A0I = A05();
        addView(this.A0I, new FrameLayout.LayoutParams(-1, this.A0I.getToolbarHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
        if (r5 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
        A0D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r5 == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1534dz.A00():int");
    }

    private int A01(int i10) {
        if (this.A0A.A1i()) {
            C2056mb c2056mb = this.A0A;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "SFVCTE3Hv2F6eV4jkYzgVN3BuZvLlt";
            strArr2[7] = "be2ILDbetBMqGPrAeiZBpkZxeTc1wp";
            if (i10 < c2056mb.A1d().size() && i10 >= 0) {
                return this.A0A.A1d().get(i10).intValue();
            }
        }
        return this.A0A.A0Y();
    }

    public static /* synthetic */ int A02(C1534dz c1534dz, int i10) {
        int i11 = c1534dz.A01 + i10;
        c1534dz.A01 = i11;
        return i11;
    }

    private FullScreenAdToolbar A05() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0D, this.A0H, this.A0F, 2, -1, false);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.setToolbarListener(new C1538e3(this));
        return fullScreenAdToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        int A00 = A00();
        if (A00 != 0) {
            this.A0D.A0F().A4o(A00);
        }
    }

    private void A0C() {
        if (this.A00 > 0 && !TextUtils.isEmpty(this.A0A.A1Z(this.A00 - 1).A1g())) {
            A7 a72 = this.A0E;
            String A1g = this.A0A.A1Z(this.A00 - 1).A1g();
            FB A03 = new FB().A03(this.A04 != null ? this.A04.getAdViewabilityChecker() : null);
            AbstractC1603f6 abstractC1603f6 = this.A04;
            String[] strArr = A0M;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "pDlFeLBfyToKKboIUgGc0hC9I32LVeJD";
            strArr2[4] = "3B6yIVnUpbF0PBycHqRFA1bh2UEjPzxQ";
            a72.AAr(A1g, A03.A02(abstractC1603f6 != null ? this.A04.getTouchDataRecorder() : null).A05());
        }
    }

    private void A0D() {
        this.A0D.A0F().A4m();
        this.A07 = true;
        this.A03 = new FT(this.A0D, this.A0A, this.A0E, this.A0H, this.A0I.getToolbarHeight(), this.A02);
        HG hg = null;
        Iterator<HG> it = this.A0K.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HG s10 = it.next();
            if (s10.A00 == HG.A06) {
                hg = s10;
                break;
            }
        }
        if (hg != null) {
            A0J(this.A03, hg);
        } else if (!this.A0K.isEmpty()) {
            A0J(this.A03, this.A0K.get(0));
        }
        A0R(true);
        this.A0I.setOnlyPageDetails(null);
        if (this.A04 != null) {
            D3.A0H(this.A04);
            this.A04.A11();
            this.A04 = null;
        }
        D3.A0H(this.A03);
        D3.A0E(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0F() {
        this.A0G.A05(EnumC0704Cp.A03);
    }

    private synchronized void A0G() {
        this.A0H.A4Z(this.A0J.A6b());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(float f10) {
        float seenCurrentPosMS;
        float A01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A1i() ? 0 : this.A01) + f10;
        if (A01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / A01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A1i()) {
            this.A06 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0I.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            setUnskippableSecondsComplete(true);
            this.A0I.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(int i10) {
        this.A0D.A0F().A4j(i10);
        setUnskippableSecondsComplete(true);
        A0G();
        A0C();
        this.A0H.A4Z(this.A0J.A7m());
    }

    private void A0J(ViewGroup viewGroup, HG hg) {
        if (hg.A00 == HG.A06 && hg.A03 != null) {
            AbstractC0779Fm.A00(this.A0D, viewGroup, hg.A03);
        } else {
            int i10 = hg.A01;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "6Qw2GncBlIK9qwoUetngT0jkAnHCQL";
            strArr2[7] = "iVxLMdIUnWJTFKOlNtOcmcGRsmSn6x";
            D3.A0K(viewGroup, i10);
        }
        this.A0I.setFullscreen(hg.A05);
        this.A0I.A0A(hg.A02, hg.A04);
    }

    private void A0K(AbstractC2058md abstractC2058md) {
        if (A0W(abstractC2058md) && this.A02 == 2) {
            this.A0I.setOnlyPageDetails(abstractC2058md.A1e());
        } else {
            this.A0I.setOnlyPageDetails(null);
        }
    }

    private final void A0L(C05576e c05576e) {
        c05576e.A0A(this.A0B);
        int i10 = c05576e.A05().getResources().getConfiguration().orientation;
        this.A02 = i10;
        A0S(this.A0A.A1f(), i10);
        A0F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0R(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0U()
            r4 = 0
            r3 = 1
            if (r0 == 0) goto La5
            boolean r0 = r6.A0T()
            if (r0 != 0) goto La5
            boolean r5 = r6.A0V()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1534dz.A0M
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lad
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1534dz.A0M
            java.lang.String r1 = "abX2oERzf98UggHhJlwc5xOu8ehA434Q"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "mcfqurarHSiAo6r6yfyhrMyo3UPU5OrE"
            r0 = 4
            r2[r0] = r1
            if (r5 != 0) goto La5
            r1 = 1
        L33:
            boolean r0 = r6.A0T()
            if (r0 != 0) goto L71
            if (r1 != 0) goto L71
            r6.setUnskippableSecondsComplete(r3)
            if (r7 == 0) goto L4d
            com.facebook.ads.internal.view.FullScreenAdToolbar r3 = r6.A0I
            r2 = 0
            r1 = 0
            r0 = 85
            java.lang.String r0 = A0A(r2, r1, r0)
            r3.setToolbarActionMessage(r0)
        L4d:
            com.facebook.ads.internal.view.FullScreenAdToolbar r3 = r6.A0I
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1534dz.A0M
            r0 = 6
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto La7
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1534dz.A0M
            java.lang.String r1 = "6hDdRvQvhZI2wvmWyf"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "dfELTL2TgrvtcbRt37j2"
            r0 = 1
            r2[r0] = r1
            r3.setToolbarActionMode(r4)
        L70:
            return
        L71:
            com.facebook.ads.internal.view.FullScreenAdToolbar r4 = r6.A0I
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1534dz.A0M
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L95
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1534dz.A0M
            java.lang.String r1 = "JMDiVFyp4yY8WixxdBAiYWzIdfNljSYZ"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "DEcXsd0kn675y00aYcKTg0COR2JcG3d3"
            r0 = 4
            r2[r0] = r1
            r4.setToolbarActionMode(r3)
            goto L70
        L95:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1534dz.A0M
            java.lang.String r1 = "uCb48oA3"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "eCwSqnipc7icS"
            r0 = 3
            r2[r0] = r1
            r4.setToolbarActionMode(r3)
            goto L70
        La5:
            r1 = 0
            goto L33
        La7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lad:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1534dz.A0R(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0S(boolean z10, int i10) {
        if (this.A04 != null) {
            this.A04.A11();
            this.A04.removeAllViews();
            D3.A0H(this.A04);
        }
        if (!A0T()) {
            setUnskippableSecondsComplete(true);
            if (A0U()) {
                A0D();
                return;
            } else {
                A0I(1);
                return;
            }
        }
        if (this.A0A.A1i()) {
            setUnskippableSecondsComplete(false);
            FullScreenAdToolbar fullScreenAdToolbar = this.A0I;
            String[] strArr = A0M;
            if (strArr[0].length() != strArr[1].length()) {
                String[] strArr2 = A0M;
                strArr2[5] = "hirdpqFqEpTGRF7TvzfLNB23PEQWY5";
                strArr2[7] = "Eb3FssofDa3ImZpKtnPvm2BrdUNNTg";
                fullScreenAdToolbar.setProgressImmediate(0.0f);
            }
            throw new RuntimeException();
        }
        boolean isLoaded = this.A0D.A01().AAB(this.A0A.A1Z(this.A00).A1g(), this.A0A.A1a());
        if (!isLoaded) {
            this.A0D.A0F().A4k();
            A0I(2);
            String[] strArr3 = A0M;
            if (strArr3[6].length() != strArr3[3].length()) {
                String[] strArr4 = A0M;
                strArr4[0] = "SeXhCWKDArfU2xbUHE";
                strArr4[1] = "icHjaKCGoPIgSTYVXjnx";
                return;
            }
            throw new RuntimeException();
        }
        AbstractC1603f6 A09 = A09(z10, i10);
        this.A04 = A09;
        AbstractC1603f6 abstractC1603f6 = this.A04;
        boolean isLoaded2 = this.A09;
        abstractC1603f6.A15(isLoaded2);
        setupToolbarForAd(A09);
        addView(this.A04, 0, A0N);
        this.A00++;
        this.A04.A14();
    }

    private boolean A0T() {
        return this.A00 < this.A0A.A1W();
    }

    private boolean A0U() {
        return this.A0A.A1V() == 2;
    }

    private final boolean A0V() {
        return this.A07;
    }

    public static boolean A0W(AbstractC2058md abstractC2058md) {
        return TextUtils.isEmpty(abstractC2058md.A1b().A0F().A09());
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AAj(Intent intent, Bundle bundle, C05576e c05576e) {
        this.A0H.A3v(this, A0N);
        A0L(c05576e);
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AEP(boolean z10) {
        if (this.A04 != null) {
            this.A04.A16(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AEs(boolean z10) {
        if (this.A04 != null) {
            this.A04.A17(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AI1(Bundle bundle) {
    }

    public AbstractC1603f6 getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof LB) {
            A0J(this.A04, this.A04.getFullScreenAdStyle());
            A0K(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A11();
            this.A04 = null;
        }
        this.A0D.A01().A4p(this.A0A.A1a());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(DR dr) {
    }

    public void setServerSideRewardHandler(I7 i72) {
        this.A05 = i72;
    }

    public void setUnskippableSecondsComplete(boolean z10) {
        this.A09 = z10;
        if (this.A04 != null) {
            this.A04.A15(this.A09);
        }
    }

    private void setupToolbarForAd(AbstractC1603f6 abstractC1603f6) {
        if (this.A0I == null) {
            return;
        }
        this.A06 = true;
        AbstractC2058md A1Z = this.A0A.A1Z(this.A00);
        this.A0I.A0D(this.A0D, A1Z.A1V());
        this.A0I.A0C(A1Z.A1e(), A1Z.A1g(), A01(this.A00));
        HG fullScreenAdStyle = abstractC1603f6.getFullScreenAdStyle();
        A0J(abstractC1603f6, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0I.setToolbarActionMessage(A0A(4, 3, 90) + (this.A00 + 1) + A0A(0, 4, 21) + this.A0A.A1W());
        if (this.A08) {
            this.A0I.setToolbarActionMode(1);
        }
        A0K(A1Z);
    }
}
