package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.2R  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2R implements InterfaceC0979Nh {
    public static byte[] A09;
    public static String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final String A0B;
    public long A00;
    public InterfaceC2163oZ A01;
    public final InterfaceC2161oX A02;
    public final C2151oN A03;
    public final C2151oN A04;
    public final List<Rect> A05;
    public final Map<String, C2150oM> A06;
    public final boolean A07;
    public final boolean A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 73);
            i13++;
        }
    }

    public static void A03() {
        A09 = new byte[]{20, 40, 41, 51, 96, 54, 41, 37, 55, 48, 47, 41, 46, 52, 96, 40, 33, 51, 96, 46, 47, 52, 96, 34, 37, 37, 46, 96, 45, 37, 33, 51, 53, 50, 37, 36, 96, 47, 50, 96, 41, 51, 96, 33, 96, 39, 50, 47, 53, 48, 96, 55, 40, 41, 35, 40, 96, 55, 41, 44, 44, 96, 46, 37, 54, 37, 50, 96, 50, 37, 52, 53, 50, 46, 96, 33, 96, 45, 37, 33, 51, 53, 50, 37, 45, 37, 46, 52, 96, 51, 41, 46, 35, 37, 96, 41, 52, 103, 51, 96, 45, 33, 36, 37, 96, 53, 48, 96, 47, 38, 96, 51, 53, 34, 54, 41, 37, 55, 51, 96, 52, 40, 33, 52, 96, 35, 47, 53, 44, 36, 96, 34, 37, 96, 47, 38, 38, 51, 35, 50, 37, 37, 46, 16, 27, 9, 45, 29, 31, 16, 61, 38, 63, 63, 115, 37, 58, 54, 36, 115, 35, 33, 60, 35, 54, 33, 39, 42, 115, 53, 60, 33, 115, 33, 54, 62, 60, 37, 54, 55, 115, 58, 39, 54, 62, 115, 30, 2, 11, 25, 63, 8, 29, 2, 31, 25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0979Nh
    public final void A6F(List<C2166oc<?, ?>> list) {
        Collection A00;
        Collection A002;
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (list != null) {
            A06(list);
        }
        if (0 != 0) {
            String obj = toString();
            List<Rect> list2 = this.A05;
            A00 = this.A04.A00();
            A002 = this.A03.A00();
            new C2149oL(obj, this, list2, A00, A002);
            throw new NullPointerException(A02(143, 7, 55));
        }
    }

    static {
        A03();
        A0B = C2R.class.getSimpleName();
    }

    public C2R(InterfaceC2161oX interfaceC2161oX) {
        this(interfaceC2161oX, false, false);
    }

    public C2R(InterfaceC2161oX interfaceC2161oX, boolean z10, boolean z11) {
        this.A06 = new HashMap();
        this.A04 = new C2151oN();
        this.A03 = new C2151oN();
        this.A05 = new ArrayList(1);
        this.A02 = interfaceC2161oX;
        this.A08 = z10;
        this.A07 = z11;
    }

    public static Rect A00(C2150oM c2150oM) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        if (c2150oM != null) {
            rect = c2150oM.A02;
            if (rect.top != Integer.MIN_VALUE) {
                rect2 = c2150oM.A02;
                if (rect2.left != Integer.MIN_VALUE) {
                    rect3 = c2150oM.A02;
                    if (rect3.right != Integer.MIN_VALUE) {
                        rect4 = c2150oM.A02;
                        if (rect4.bottom != Integer.MIN_VALUE) {
                            rect5 = c2150oM.A02;
                            return rect5;
                        }
                    }
                }
            }
        }
        throw new IllegalStateException(A02(0, 143, 9));
    }

    private C2150oM A01(C2166oc c2166oc, Rect rect, Rect rect2) {
        boolean A06;
        Rect rect3;
        List list;
        C2150oM c2150oM = this.A06.get(c2166oc.A02);
        A06 = this.A04.A06(c2166oc);
        if (A06) {
            if (c2150oM != null) {
                c2150oM.A01 = EnumC2154oQ.A04;
            } else {
                c2150oM = C2150oM.A03(this.A00);
                this.A06.put(c2166oc.A02, c2150oM);
            }
        }
        C2150oM viewProperties = (C2150oM) Preconditions.checkNotNull(c2150oM);
        rect3 = viewProperties.A02;
        rect3.set(rect2);
        list = c2150oM.A03;
        list.add(new Rect(rect));
        return c2150oM;
    }

    private void A04(C2151oN c2151oN) {
        Collection<C2166oc> A01;
        List list;
        A01 = c2151oN.A01();
        for (C2166oc c2166oc : A01) {
            C2150oM c2150oM = this.A06.get(c2166oc.A02);
            if (c2150oM == null) {
                if (0 != 0) {
                    String str = A02(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 36, 26) + c2166oc.A02;
                    throw new NullPointerException(A02(186, 10, 36));
                }
            } else {
                c2150oM.A01 = EnumC2154oQ.A03;
                list = c2150oM.A03;
                list.clear();
                c2166oc.A03(this);
                if (this.A08) {
                    this.A06.remove(c2150oM);
                }
            }
        }
    }

    private void A05(C2151oN c2151oN) {
        Collection<C2166oc> A00;
        A00 = c2151oN.A00();
        for (C2166oc c2166oc : A00) {
            c2166oc.A03(this);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oc != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(java.util.List<com.facebook.ads.redexgen.X.C2166oc<?, ?>> r7) {
        /*
            r6 = this;
            java.util.Iterator r5 = r7.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r3 = r5.next()
            com.facebook.ads.redexgen.X.oc r3 = (com.facebook.ads.redexgen.X.C2166oc) r3
            java.util.Map<java.lang.String, com.facebook.ads.redexgen.X.oM> r1 = r6.A06
            java.lang.String r0 = r3.A02
            java.lang.Object r0 = r1.get(r0)
            com.facebook.ads.redexgen.X.oM r0 = (com.facebook.ads.redexgen.X.C2150oM) r0
            if (r0 == 0) goto L4
            boolean r4 = r3.A04
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C2R.A0A
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L30
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L30:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C2R.A0A
            java.lang.String r1 = "nPwsVC"
            r0 = 7
            r2[r0] = r1
            if (r4 == 0) goto L4
            com.facebook.ads.redexgen.X.oQ r4 = r3.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C2R.A0A
            r0 = 5
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L60
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C2R.A0A
            java.lang.String r1 = "zj"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L4
        L56:
            com.facebook.ads.redexgen.X.oQ r1 = r3.A01
            com.facebook.ads.redexgen.X.oQ r0 = com.facebook.ads.redexgen.X.EnumC2154oQ.A03
            if (r1 == r0) goto L4
            r3.A03(r6)
            goto L4
        L60:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C2R.A0A
            java.lang.String r1 = "4Gl"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "t26"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L4
            goto L56
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2R.A06(java.util.List):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0979Nh
    public final void A3w(C2166oc c2166oc, Rect rect, Rect rect2) {
        boolean A06;
        List list;
        Rect rect3;
        List list2;
        A01(c2166oc, rect, rect2);
        C2166oc c2166oc2 = c2166oc.A05;
        C2166oc parentViewpointData = C2166oc.A0B;
        if (c2166oc2 == parentViewpointData || c2166oc2 == null) {
            return;
        }
        A06 = this.A03.A06(c2166oc2);
        C2150oM parentViewProperties = this.A06.get(c2166oc2.A02);
        if (A06) {
            if (parentViewProperties == null) {
                parentViewProperties = C2150oM.A03(this.A00);
                rect3 = parentViewProperties.A02;
                rect3.set(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
                this.A06.put(c2166oc2.A02, parentViewProperties);
            } else {
                list2 = parentViewProperties.A03;
                list2.clear();
                if (!this.A07 || c2166oc2.A04()) {
                    parentViewProperties.A01 = EnumC2154oQ.A04;
                }
            }
        }
        Preconditions.checkNotNull(parentViewProperties);
        list = parentViewProperties.A03;
        ((List) Preconditions.checkNotNull(list)).add(new Rect(rect));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0979Nh
    public final void A4X(long j10, List<Rect> list) {
        Collection A01;
        Collection<C2166oc> A012;
        List list2;
        this.A00 = j10;
        this.A05.clear();
        Iterator<Rect> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (hasNext) {
                this.A05.add(new Rect(it.next()));
            } else {
                A01 = this.A04.A01();
                Iterator it2 = A01.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!hasNext2) {
                            break;
                        }
                        this.A06.remove(((C2166oc) it2.next()).A02);
                    } else if (!hasNext2) {
                        break;
                    } else {
                        this.A06.remove(((C2166oc) it2.next()).A02);
                    }
                }
                A012 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[0] = "Au";
                for (C2166oc viewpointData : A012) {
                    this.A06.remove(viewpointData.A02);
                }
                for (C2150oM c2150oM : this.A06.values()) {
                    list2 = c2150oM.A03;
                    list2.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2153oP
    public final void A83(C2166oc c2166oc, Rect rect) {
        List<Rect> list;
        rect.setEmpty();
        list = ((C2150oM) Preconditions.checkNotNull(this.A06.get(c2166oc.A02))).A03;
        for (Rect rect2 : list) {
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2153oP
    public final EnumC2154oQ A9K(C2166oc c2166oc) {
        EnumC2154oQ enumC2154oQ;
        enumC2154oQ = ((C2150oM) Preconditions.checkNotNull(this.A06.get(c2166oc.A02))).A01;
        if (c2166oc.A04) {
            if (c2166oc.A00 == EnumC2167od.A04) {
                EnumC2154oQ viewState = EnumC2154oQ.A03;
                return viewState;
            }
            EnumC2154oQ viewState2 = EnumC2154oQ.A04;
            if (enumC2154oQ == viewState2 && !c2166oc.A04()) {
                EnumC2154oQ viewState3 = EnumC2154oQ.A02;
                return viewState3;
            }
        }
        return enumC2154oQ;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2153oP
    public final void A9M(Rect rect) {
        rect.setEmpty();
        for (Rect rect2 : this.A05) {
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2153oP
    public final float A9N(C2166oc c2166oc) {
        List<Rect> list;
        C2150oM c2150oM = this.A06.get(c2166oc.A02);
        if (c2150oM != null) {
            Rect A00 = A00(c2150oM);
            int height = A00.height() * A00.width();
            int totalVisibleArea = 0;
            list = c2150oM.A03;
            for (Rect rect : list) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / height;
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0979Nh
    public final void AJ0(InterfaceC2163oZ interfaceC2163oZ) {
        this.A01 = interfaceC2163oZ;
    }
}
