package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.dI  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1492dI extends AnonymousClass67 {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public GU A02;
    public JL A04;
    public List<C0821Hc> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C1972lC A0C;
    public final C6F A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final GY A0F = new C1498dO(this);
    public GW A03 = new C1497dN(this);
    public final GX A0E = new C1493dJ(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, 81, 91, 103, 78, 81, 90, 91, 92, 103, 94, 81, 76, 77, 87, 103, 88, 73, 90, 73, 85, -51, -58, -61, -52, -60, -68, -42, -61, -68, -51, -68, -61, -42, -57, -72, -55, -72, -60};
    }

    static {
        A08();
    }

    public C1492dI(C04331h c04331h, int i10, List<C0821Hc> list, JL jl, Bundle bundle) {
        this.A0C = c04331h.getLayoutManager();
        this.A0A = i10;
        this.A05 = list;
        this.A04 = jl;
        this.A0D = new C1971lB(c04331h.getContext());
        this.A0B = c04331h.getContext();
        c04331h.A1h(this);
        A0D(bundle);
    }

    private AbstractC1646fo A03(int i10, int i11) {
        return A04(i10, i11, true);
    }

    private AbstractC1646fo A04(int i10, int i11, boolean z10) {
        AbstractC1646fo abstractC1646fo = null;
        while (i10 <= i11) {
            AbstractC1646fo abstractC1646fo2 = (AbstractC1646fo) this.A0C.A1m(i10);
            if (abstractC1646fo2 == null || abstractC1646fo2.A1E()) {
                return null;
            }
            boolean A0a = A0a(abstractC1646fo2);
            if (abstractC1646fo == null && abstractC1646fo2.A1F() && A0a && !this.A0G.contains(Integer.valueOf(i10)) && (!z10 || A0I(abstractC1646fo2, this.A0A))) {
                abstractC1646fo = abstractC1646fo2;
            }
            if (abstractC1646fo2.A1F() && !A0a) {
                A0C(i10, false);
            }
            i10++;
        }
        return abstractC1646fo;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        AbstractC1646fo A03 = A03(lastVisibleItem, firstVisibleItem);
        if (A03 != null) {
            A03.A1C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int A23 = this.A0C.A23();
        if (A23 != -1) {
            int curPos = this.A05.size();
            if (A23 < curPos - 1) {
                int curPos2 = A23 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i10) {
        AbstractC1646fo A04 = A04(i10 + 1, this.A0C.A25(), false);
        if (A04 != null) {
            A04.A1C();
            A0U(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i10, int i11) {
        while (i10 <= i11) {
            A0T(i10);
            i10++;
        }
    }

    private final void A0B(int i10, int i11) {
        A0S(i10);
        A0S(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i10, boolean z10) {
        if (z10) {
            this.A0G.add(Integer.valueOf(i10));
        } else {
            this.A0G.remove(Integer.valueOf(i10));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC0786Ft abstractC0786Ft, int i10) {
        int allowedAreaMaxX;
        int furthestX;
        if (i10 == 2) {
            allowedAreaMaxX = CP.A04.widthPixels - 1;
        } else {
            int width = abstractC0786Ft.getWidth();
            int allowedAreaMinX = CP.A04.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i10 == 2) {
            furthestX = 1;
        } else {
            int i11 = CP.A04.widthPixels;
            int allowedAreaMinX2 = abstractC0786Ft.getWidth();
            furthestX = (int) (((i11 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x10 = abstractC0786Ft.getX();
        int allowedAreaMinX3 = abstractC0786Ft.getWidth();
        if (((int) (x10 + allowedAreaMinX3)) <= allowedAreaMaxX) {
            int allowedAreaMinX4 = (abstractC0786Ft.getX() > furthestX ? 1 : (abstractC0786Ft.getX() == furthestX ? 0 : -1));
            if (allowedAreaMinX4 >= 0) {
                return true;
            }
        }
        return false;
    }

    private boolean A0J(AbstractC1646fo abstractC1646fo) {
        if (this.A08 && abstractC1646fo.A1F()) {
            this.A08 = false;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass67
    public void A0L(MG mg, int i10) {
        super.A0L(mg, i10);
        if (i10 == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass67
    public void A0M(MG mg, int i10, int i11) {
        super.A0M(mg, i10, i11);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i10);
    }

    public final GW A0N() {
        return this.A03;
    }

    public final GX A0O() {
        return this.A0E;
    }

    public final GY A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int A25 = this.A0C.A25();
        for (int A24 = this.A0C.A24(); A24 <= A25 && A24 >= 0; A24++) {
            AbstractC1646fo card = (AbstractC1646fo) this.A0C.A1m(A24);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A1E()) {
                this.A01 = A24;
                card.A1B();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC1646fo abstractC1646fo = (AbstractC1646fo) this.A0C.A1m(this.A01);
        if (abstractC1646fo != null && this.A01 >= 0) {
            abstractC1646fo.A1C();
        }
    }

    public final void A0S(int i10) {
        AbstractC1646fo abstractC1646fo = (AbstractC1646fo) this.A0C.A1m(i10);
        if (abstractC1646fo != null && !A0a(abstractC1646fo)) {
            A0Z(abstractC1646fo, false);
        }
    }

    public final void A0T(int i10) {
        AbstractC1646fo abstractC1646fo = (AbstractC1646fo) this.A0C.A1m(i10);
        if (abstractC1646fo == null) {
            return;
        }
        if (A0a(abstractC1646fo)) {
            A0Z(abstractC1646fo, true);
        }
        if (!A0J(abstractC1646fo) || this.A05 == null) {
            return;
        }
        this.A0F.setVolume(this.A05.get(((Integer) abstractC1646fo.getTag(-1593835536)).intValue()).A03().A0F().A0A() ? 0.0f : 1.0f);
    }

    public final void A0U(int i10) {
        this.A0D.A0A(i10);
        this.A0C.A1L(this.A0D);
    }

    public final void A0V(int i10, int i11, int i12) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A23();
        if (recomputeFrom == -1) {
            recomputeFrom = i12 < 0 ? i10 : i11;
        }
        this.A02.AJf(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void A0Y(GU gu) {
        this.A02 = gu;
    }

    public void A0Z(AbstractC1646fo abstractC1646fo, boolean z10) {
        if (A0H()) {
            A0X(abstractC1646fo, z10);
        }
        if (!z10 && abstractC1646fo.A1E()) {
            abstractC1646fo.A1B();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
