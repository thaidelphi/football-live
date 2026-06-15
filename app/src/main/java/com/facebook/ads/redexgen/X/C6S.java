package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.6S  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C6S {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C1987lU<C6K, C6Q> A00 = new C1987lU<>();
    public final AnonymousClass46<C6K> A01 = new AnonymousClass46<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private C05505x A00(C6K c6k, int i10) {
        C6Q A0B;
        C05505x info;
        int A08 = this.A00.A08(c6k);
        if (A08 >= 0 && (A0B = this.A00.A0B(A08)) != null) {
            int i11 = A0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i11 & i10) != 0) {
                int i12 = A0B.A00;
                int index = ~i10;
                A0B.A00 = i12 & index;
                if (i10 == 4) {
                    info = A0B.A02;
                } else if (i10 == 8) {
                    info = A0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = A0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(A08);
                    C6Q.A02(A0B);
                }
                return info;
            }
        }
        return null;
    }

    public final C05505x A03(C6K c6k) {
        return A00(c6k, 8);
    }

    public final C05505x A04(C6K c6k) {
        return A00(c6k, 4);
    }

    public final C6K A05(long j10) {
        return this.A01.A08(j10);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C6Q.A01();
    }

    public final void A08(long j10, C6K c6k) {
        this.A01.A0B(j10, c6k);
    }

    public final void A09(C6K c6k) {
        C6Q c6q = this.A00.get(c6k);
        if (c6q == null) {
            c6q = C6Q.A00();
            this.A00.put(c6k, c6q);
        }
        c6q.A00 |= 1;
    }

    public final void A0A(C6K c6k) {
        C6Q c6q = this.A00.get(c6k);
        if (c6q == null) {
            return;
        }
        c6q.A00 &= -2;
    }

    public final void A0B(C6K c6k) {
        int A06 = this.A01.A06() - 1;
        while (true) {
            if (A06 < 0) {
                break;
            } else if (c6k == this.A01.A07(A06)) {
                this.A01.A0A(A06);
                break;
            } else {
                A06--;
            }
        }
        C6Q info = this.A00.remove(c6k);
        if (info != null) {
            C6Q.A02(info);
        }
    }

    public final void A0C(C6K c6k) {
        A0A(c6k);
    }

    public final void A0D(C6K c6k, C05505x c05505x) {
        C6Q c6q = this.A00.get(c6k);
        if (c6q == null) {
            c6q = C6Q.A00();
            this.A00.put(c6k, c6q);
        }
        c6q.A00 |= 2;
        c6q.A02 = c05505x;
    }

    public final void A0E(C6K c6k, C05505x c05505x) {
        C6Q c6q = this.A00.get(c6k);
        if (c6q == null) {
            c6q = C6Q.A00();
            this.A00.put(c6k, c6q);
        }
        c6q.A01 = c05505x;
        c6q.A00 |= 8;
    }

    public final void A0F(C6K c6k, C05505x c05505x) {
        C6Q c6q = this.A00.get(c6k);
        if (c6q == null) {
            c6q = C6Q.A00();
            this.A00.put(c6k, c6q);
        }
        c6q.A02 = c05505x;
        c6q.A00 |= 4;
    }

    public final void A0G(C6R c6r) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            C6K A09 = this.A00.A09(size);
            C6Q A0A = this.A00.A0A(size);
            if ((A0A.A00 & 3) == 3) {
                c6r.AJe(A09);
            } else {
                int index = A0A.A00;
                if ((index & 1) != 0) {
                    if (A0A.A02 == null) {
                        c6r.AJe(A09);
                    } else {
                        c6r.AGJ(A09, A0A.A02, A0A.A01);
                    }
                } else if ((A0A.A00 & 14) == 14) {
                    c6r.AGH(A09, A0A.A02, A0A.A01);
                } else if ((A0A.A00 & 12) == 12) {
                    c6r.AGL(A09, A0A.A02, A0A.A01);
                } else {
                    int index2 = A0A.A00;
                    if ((index2 & 4) != 0) {
                        c6r.AGJ(A09, A0A.A02, null);
                    } else {
                        int index3 = A0A.A00;
                        if ((index3 & 8) != 0) {
                            C05505x c05505x = A0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            c6r.AGH(A09, c05505x, A0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C6Q.A02(A0A);
        }
    }

    public final boolean A0H(C6K c6k) {
        C6Q record = this.A00.get(c6k);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(C6K c6k) {
        C6Q record = this.A00.get(c6k);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
