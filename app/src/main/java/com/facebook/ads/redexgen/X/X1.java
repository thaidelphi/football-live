package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class X1 {
    public static byte[] A0M;
    public static String[] A0N = {"87vfFjz9nqSHmhjPu0ngkw6yXNDg6JBs", "lQNVpz6fLj3PkBQjmzoqeGDwiQDTFeoc", "9xzqL2A5yXFijMlo5", "NfJTULe1WuJRDiU5fZWbBQYJ", "4sGZb4d4Dh", "qG5dEjsCGR8dreLxNwvSvbHbK2GEPHYX", "K7hWJZAVrC9rBYD0L0qTwuf0he7ZWJUA", "33hoQlk72PU6vDD9mvUMzQHg7UDd1tgj"};
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final int[] A0W;
    public static final int[] A0X;
    public static final boolean[] A0Y;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final List<SpannableString> A0L = new ArrayList();
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0M = new byte[]{-5, 20, 11, 30, 22, 11, 9, 26, 11, 10, -58, 16, 27, 25, 26, 15, 12, 15, 9, 7, 26, 15, 21, 20, -58, 28, 7, 18, 27, 11, -32, -58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.X0 A05() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.X1.A05():com.facebook.ads.redexgen.X.X0");
    }

    static {
        A04();
        A0P = A01(2, 2, 2, 0);
        A0O = A01(0, 0, 0, 0);
        A0Q = A01(0, 0, 0, 3);
        A0V = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0W = new int[]{0, 0, 0, 0, 0, 0, 2};
        A0X = new int[]{3, 3, 3, 3, 3, 3, 1};
        A0Y = new boolean[]{false, false, false, true, true, true, false};
        A0U = new int[]{A0O, A0Q, A0O, A0O, A0Q, A0O, A0O};
        A0T = new int[]{0, 1, 2, 3, 4, 3, 4};
        A0S = new int[]{0, 0, 0, 0, 0, 3, 3};
        A0R = new int[]{A0O, A0O, A0O, A0O, A0O, A0Q, A0Q};
    }

    public X1() {
        A08();
    }

    public static int A00(int i10, int i11, int i12) {
        return A01(i10, i11, i12, 0);
    }

    public static int A01(int i10, int i11, int i12, int i13) {
        int i14;
        AbstractC1589es.A00(i10, 0, 4);
        AbstractC1589es.A00(i11, 0, 4);
        AbstractC1589es.A00(i12, 0, 4);
        AbstractC1589es.A00(i13, 0, 4);
        switch (i13) {
            case 0:
            case 1:
                i14 = 255;
                break;
            case 2:
                i14 = 127;
                break;
            case 3:
                i14 = 0;
                break;
            default:
                i14 = 255;
                break;
        }
        int alpha = i10 > 1 ? 255 : 0;
        return Color.argb(i14, alpha, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    private final SpannableString A02() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A06 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, length, 33);
            }
            if (this.A0C != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A0C, length, 33);
            }
            if (this.A04 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A03), this.A04, length, 33);
            }
            if (this.A02 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.A01), this.A02, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void A06() {
        int length = this.A0K.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A0K.delete(length2, length);
        }
    }

    public final void A07() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
    }

    public final void A08() {
        A07();
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        this.A0E = A0O;
        this.A03 = A0P;
        this.A01 = A0O;
    }

    public final void A09(char c10) {
        if (c10 == '\n') {
            List<SpannableString> list = this.A0L;
            if (A0N[4].length() == 29) {
                throw new RuntimeException();
            }
            A0N[2] = "xbeJ3YjaHbJc";
            list.add(A02());
            this.A0K.clear();
            if (this.A06 != -1) {
                this.A06 = 0;
            }
            if (this.A0C != -1) {
                this.A0C = 0;
            }
            int i10 = this.A04;
            if (A0N[3].length() == 23) {
                throw new RuntimeException();
            }
            A0N[2] = "vkb";
            if (i10 != -1) {
                this.A04 = 0;
            }
            if (this.A02 != -1) {
                this.A02 = 0;
            }
            while (true) {
                if ((this.A0I && this.A0L.size() >= this.A0B) || this.A0L.size() >= 15) {
                    this.A0L.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.A0K.append(c10);
        }
    }

    public final void A0A(int i10, int i11) {
        if (this.A0A != i10) {
            A09('\n');
        }
        this.A0A = i10;
    }

    public final void A0B(int i10, int i11, int i12) {
        if (this.A04 != -1 && this.A03 != i10) {
            this.A0K.setSpan(new ForegroundColorSpan(this.A03), this.A04, this.A0K.length(), 33);
        }
        if (i10 != A0P) {
            this.A04 = this.A0K.length();
            this.A03 = i10;
        }
        if (this.A02 != -1 && this.A01 != i11) {
            this.A0K.setSpan(new BackgroundColorSpan(this.A01), this.A02, this.A0K.length(), 33);
        }
        if (i11 != A0O) {
            this.A02 = this.A0K.length();
            this.A01 = i11;
        }
    }

    public final void A0C(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
        if (this.A06 != -1) {
            if (!z10) {
                this.A0K.setSpan(new StyleSpan(2), this.A06, this.A0K.length(), 33);
                this.A06 = -1;
            }
        } else if (z10) {
            this.A06 = this.A0K.length();
        }
        if (this.A0C != -1) {
            if (!z11) {
                this.A0K.setSpan(new UnderlineSpan(), this.A0C, this.A0K.length(), 33);
                this.A0C = -1;
            }
        } else if (!z11) {
        } else {
            this.A0C = this.A0K.length();
        }
    }

    public final void A0D(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        this.A0E = i10;
        this.A07 = i15;
    }

    public final void A0E(boolean z10) {
        this.A0J = z10;
    }

    public final void A0F(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.A0G = true;
        this.A0J = z10;
        this.A0I = z11;
        this.A09 = i10;
        this.A0H = z13;
        this.A0D = i11;
        this.A05 = i12;
        this.A00 = i15;
        if (this.A0B != i13 + 1) {
            this.A0B = i13 + 1;
            while (true) {
                if ((!z11 || this.A0L.size() < this.A0B) && this.A0L.size() < 15) {
                    break;
                }
                this.A0L.remove(0);
            }
        }
        if (i16 != 0) {
            int i18 = this.A0F;
            if (A0N[5].charAt(21) != 'b') {
                throw new RuntimeException();
            }
            A0N[3] = "PIzmB6tVBK";
            if (i18 != i16) {
                this.A0F = i16;
                int i19 = i16 - 1;
                A0D(A0U[i19], A0Q, A0Y[i19], 0, A0W[i19], A0X[i19], A0V[i19]);
            }
        }
        if (i17 != 0 && this.A08 != i17) {
            this.A08 = i17;
            int i20 = i17 - 1;
            A0C(0, 1, 1, false, false, A0S[i20], A0T[i20]);
            A0B(A0P, A0R[i20], A0O);
        }
    }

    public final boolean A0G() {
        return this.A0G;
    }

    public final boolean A0H() {
        if (A0G()) {
            boolean isEmpty = this.A0L.isEmpty();
            if (A0N[2].length() == 27) {
                throw new RuntimeException();
            }
            A0N[2] = "24BBozT32xAEIkDuR2X5JMI7BCymKlSF";
            if (!isEmpty || this.A0K.length() != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0I() {
        return this.A0J;
    }
}
