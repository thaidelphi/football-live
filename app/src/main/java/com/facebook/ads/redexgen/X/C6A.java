package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.6A  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C6A {
    public static byte[] A09;
    public static String[] A0A = {"", "d6jyZ4YF4aAx6mY2oyMV8cMH3x1tTmGX", "6ShmsSFKDmdiSeaEbVJI0pMmhv", "Jy6CLSdjiTJVmxisrmhO9od6ZqYVQGpz", "aKDRqPZxmSwbRmY5O7VQCqOvGq0yRVmO", "vr6xx06LqTBYtEPA9ZzozSqPDwzkbNaY", "Y84hViIy7qYskGYmJ3QVEouknT", ""};
    public AnonymousClass69 A01;
    public C6I A04;
    public final /* synthetic */ MG A08;
    public final ArrayList<C6K> A05 = new ArrayList<>();
    public ArrayList<C6K> A02 = null;
    public final ArrayList<C6K> A06 = new ArrayList<>();
    public final List<C6K> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{113, 56, 34, 16, 37, 37, 48, 50, 57, 52, 53, 107, 56, 86, 17, 24, 24, 13, 27, 10, 68, 32, 39, 41, 64, 125, 108, 100, 41, 106, 102, 124, 103, 125, 51, 79, 72, 21, 18, 7, 18, 3, 92, 121, 91, 86, 86, 95, 94, 26, 73, 89, 72, 91, 74, 26, 76, 83, 95, 77, 26, 77, 83, 78, 82, 26, 91, 84, 26, 83, 84, 76, 91, 86, 83, 94, 26, 76, 83, 95, 77, 20, 26, 115, 84, 76, 91, 86, 83, 94, 26, 76, 83, 95, 77, 73, 26, 89, 91, 84, 84, 85, 78, 26, 88, 95, 26, 72, 95, 79, 73, 95, 94, 26, 92, 72, 85, 87, 26, 73, 89, 72, 91, 74, 22, 26, 78, 82, 95, 67, 26, 73, 82, 85, 79, 86, 94, 26, 72, 95, 88, 85, 79, 84, 94, 26, 92, 72, 85, 87, 26, 72, 95, 89, 67, 89, 86, 95, 72, 26, 74, 85, 85, 86, 20, 116, 83, 94, 82, 83, 78, 84, 78, 73, 88, 83, 94, 68, 29, 89, 88, 73, 88, 94, 73, 88, 89, 19, 29, 116, 83, 75, 92, 81, 84, 89, 29, 84, 73, 88, 80, 29, 77, 82, 78, 84, 73, 84, 82, 83, 29, 31, 56, 53, 57, 56, 37, 63, 37, 34, 51, 56, 53, 47, 118, 50, 51, 34, 51, 53, 34, 51, 50, 120, 118, 31, 56, 32, 55, 58, 63, 50, 118, 32, 63, 51, 33, 118, 62, 57, 58, 50, 51, 36, 118, 55, 50, 55, 38, 34, 51, 36, 118, 38, 57, 37, 63, 34, 63, 57, 56, 89, 126, 102, 113, 124, 121, 116, 48, 121, 100, 117, 125, 48, 96, Byte.MAX_VALUE, 99, 121, 100, 121, Byte.MAX_VALUE, 126, 48, 18, 34, 51, 32, 49, 49, 36, 37, 97, 46, 51, 97, 32, 53, 53, 32, 34, 41, 36, 37, 97, 55, 40, 36, 54, 50, 97, 44, 32, 56, 97, 47, 46, 53, 97, 35, 36, 97, 51, 36, 34, 56, 34, 45, 36, 37, 111, 97, 40, 50, 18, 34, 51, 32, 49, 123, 108, 85, 72, 24, 92, 93, 76, 89, 91, 80, 93, 92, 24, 78, 81, 93, 79, 24, 75, 80, 87, 77, 84, 92, 24, 90, 93, 24, 74, 93, 85, 87, 78, 93, 92, 24, 94, 74, 87, 85, 24, 106, 93, 91, 65, 91, 84, 93, 74, 110, 81, 93, 79, 24, 90, 93, 94, 87, 74, 93, 24, 81, 76, 24, 91, 89, 86, 24, 90, 93, 24, 74, 93, 91, 65, 91, 84, 93, 92, 2, 24, 87, 113, 122, 106, 109, 100, 35, 119, 108, 35, 113, 102, 96, 122, 96, 111, 102, 35, 98, 109, 35, 106, 100, 109, 108, 113, 102, 103, 35, 117, 106, 102, 116, 35, 107, 108, 111, 103, 102, 113, 45, 35, 90, 108, 118, 35, 112, 107, 108, 118, 111, 103, 35, 101, 106, 113, 112, 119, 35, 96, 98, 111, 111, 35, 112, 119, 108, 115, 74, 100, 109, 108, 113, 106, 109, 100, 85, 106, 102, 116, 43, 117, 106, 102, 116, 42, 35, 97, 102, 101, 108, 113, 102, 35, 96, 98, 111, 111, 106, 109, 100, 35, 113, 102, 96, 122, 96, 111, 102, 45, 48, 50, 35, 1, 62, 50, 32, 17, 56, 37, 7, 56, 36, 62, 35, 62, 56, 57, 22, 57, 51, 3, 46, 39, 50, 29, 16, 8, 30, 4, 5, 81, 24, 31, 21, 20, 9, 81, 2, 25, 30, 4, 29, 21, 81, 31, 30, 5, 81, 19, 20, 81, 92, 64, 81, 16, 23, 5, 20, 3, 81, 4, 31, 25, 24, 21, 24, 31, 22, 81, 16, 81, 7, 24, 20, 6, 75, 69, 68, 124, 67, 79, 93, 120, 79, 73, 83, 73, 70, 79, 78};
    }

    static {
        A05();
    }

    public C6A(MG mg) {
        this.A08 = mg;
    }

    private final View A00(int i10, boolean z10) {
        return A0I(i10, z10, Long.MAX_VALUE).A0H;
    }

    private final C6K A01(int i10) {
        int size;
        int A04;
        if (this.A02 == null || (size = this.A02.size()) == 0) {
            return null;
        }
        for (int i11 = 0; i11 < size; i11++) {
            C6K c6k = this.A02.get(i11);
            if (!c6k.A0g()) {
                int i12 = c6k.A0I();
                if (i12 == i10) {
                    c6k.A0T(32);
                    return c6k;
                }
            }
        }
        if (this.A08.A04.A0A() && (A04 = this.A08.A00.A04(i10)) > 0) {
            int offsetPosition = this.A08.A04.A0C();
            if (A04 < offsetPosition) {
                long A042 = this.A08.A04.A04(A04);
                for (int i13 = 0; i13 < size; i13++) {
                    C6K c6k2 = this.A02.get(i13);
                    if (!c6k2.A0g()) {
                        int offsetPosition2 = (c6k2.A0K() > A042 ? 1 : (c6k2.A0K() == A042 ? 0 : -1));
                        if (offsetPosition2 == 0) {
                            c6k2.A0T(32);
                            return c6k2;
                        }
                    }
                }
            }
        }
        return null;
    }

    private final C6K A02(int i10, boolean z10) {
        View A08;
        int size = this.A05.size();
        for (int i11 = 0; i11 < size; i11++) {
            C6K c6k = this.A05.get(i11);
            if (!c6k.A0g()) {
                int scrapCount = c6k.A0I();
                if (scrapCount == i10 && !c6k.A0Z() && (this.A08.A0s.A09 || !c6k.A0a())) {
                    c6k.A0T(32);
                    return c6k;
                }
            }
        }
        if (!z10 && (A08 = this.A08.A01.A08(i10)) != null) {
            C6K A0F = MG.A0F(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0S(A08);
                A0F.A0T(8224);
                return A0F;
            }
            throw new IllegalStateException(A04(565, 52, 123) + A0F + this.A08.A1J());
        }
        int size2 = this.A06.size();
        for (int i12 = 0; i12 < size2; i12++) {
            C6K holder = this.A06.get(i12);
            String[] strArr = A0A;
            String str = strArr[7];
            String str2 = strArr[0];
            int cacheSize = str.length();
            int scrapCount2 = str2.length();
            if (cacheSize != scrapCount2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "JIr6ryR6hWTh2WYmHdarh5TP4xAypylw";
            strArr2[1] = "npmC62BAQEqZygYceoAiNhkQGghR92x0";
            if (!holder.A0Z()) {
                int scrapCount3 = holder.A0I();
                if (scrapCount3 == i10) {
                    if (!z10) {
                        this.A06.remove(i12);
                    }
                    return holder;
                }
            }
        }
        return null;
    }

    private final C6K A03(long j10, int i10, boolean z10) {
        int count = this.A05.size();
        for (int i11 = count - 1; i11 >= 0; i11--) {
            C6K c6k = this.A05.get(i11);
            int count2 = (c6k.A0K() > j10 ? 1 : (c6k.A0K() == j10 ? 0 : -1));
            if (count2 == 0 && !c6k.A0g()) {
                int count3 = c6k.A0H();
                if (i10 == count3) {
                    c6k.A0T(32);
                    boolean A0a = c6k.A0a();
                    String[] strArr = A0A;
                    String str = strArr[2];
                    String str2 = strArr[6];
                    int i12 = str.length();
                    int count4 = str2.length();
                    if (i12 == count4) {
                        String[] strArr2 = A0A;
                        strArr2[4] = "3Wf6vMFZ4V6K3VYEAeXlgILB3Kqn8tmj";
                        strArr2[1] = "2gRFj7AUivxslEY3Do0gPT185jjA6g6i";
                        if (A0a && !this.A08.A0s.A07()) {
                            c6k.A0U(2, 14);
                        }
                        return c6k;
                    }
                } else if (z10) {
                    continue;
                } else {
                    this.A05.remove(i11);
                    MG mg = this.A08;
                    View view = c6k.A0H;
                    String[] strArr3 = A0A;
                    String str3 = strArr3[7];
                    String str4 = strArr3[0];
                    int i13 = str3.length();
                    int count5 = str4.length();
                    if (i13 == count5) {
                        String[] strArr4 = A0A;
                        strArr4[5] = "QSy8SYzj9TGZXONlvrRd2Hl7xNggaX2t";
                        strArr4[3] = "FStY7c67BTbAcWAeNWEJdNOuKPlMCdqH";
                        mg.removeDetachedView(view, false);
                        A0R(c6k.A0H);
                    }
                }
                throw new RuntimeException();
            }
        }
        int count6 = this.A06.size();
        for (int i14 = count6 - 1; i14 >= 0; i14--) {
            C6K c6k2 = this.A06.get(i14);
            int count7 = (c6k2.A0K() > j10 ? 1 : (c6k2.A0K() == j10 ? 0 : -1));
            if (count7 == 0) {
                int count8 = c6k2.A0H();
                if (i10 == count8) {
                    if (!z10) {
                        this.A06.remove(i14);
                    }
                    return c6k2;
                } else if (!z10) {
                    A07(i14);
                    String[] strArr5 = A0A;
                    String str5 = strArr5[7];
                    String str6 = strArr5[0];
                    int cacheSize = str5.length();
                    int count9 = str6.length();
                    if (cacheSize != count9) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0A;
                    strArr6[2] = "Px4MCeB3tpw5Kws4bgsL6OQ2tD";
                    strArr6[6] = "cZzmTfGm3PDqBsfSjCaAnG9aB7";
                    return null;
                }
            }
        }
        return null;
    }

    private final void A06() {
        boolean z10;
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        z10 = MG.A1E;
        if (z10) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i10) {
        A0Z(this.A06.get(i10), true);
        this.A06.remove(i10);
    }

    private void A08(ViewGroup viewGroup, boolean z10) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z10) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    private void A09(C6K c6k) {
        if (this.A08.A1q()) {
            View view = c6k.A0H;
            if (C4h.A00(view) == 0) {
                C4h.A09(view, 1);
            }
            if (C4h.A0F(view)) {
                return;
            }
            String[] strArr = A0A;
            if (strArr[4].charAt(14) != strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "r5izwM6EITTd8J0QgfTuliuK3Ylx6gnH";
            strArr2[3] = "CLm8SGIYJT8sX0J5oMrTiG0qZUHKeksn";
            c6k.A0T(16384);
            C4h.A0B(view, this.A08.A09.A0A());
        }
    }

    private void A0A(C6K c6k) {
        if (c6k.A0H instanceof ViewGroup) {
            A08((ViewGroup) c6k.A0H, false);
        }
    }

    private final void A0B(C6K c6k) {
        if (0 != 0) {
            throw new NullPointerException(A04(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 14, 32));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(c6k);
        }
    }

    private final boolean A0C(C6K c6k) {
        if (c6k.A0a()) {
            return this.A08.A0s.A07();
        }
        if (c6k.A03 >= 0 && c6k.A03 < this.A08.A04.A0C()) {
            if (!this.A08.A0s.A07()) {
                int A03 = this.A08.A04.A03(c6k.A03);
                int type = c6k.A0H();
                if (A03 != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0A() || c6k.A0K() == this.A08.A04.A04(c6k.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 92) + c6k + this.A08.A1J());
    }

    private boolean A0D(C6K c6k, int i10, int i11, long j10) {
        c6k.A08 = this.A08;
        int A0H = c6k.A0H();
        long nanoTime = this.A08.getNanoTime();
        int viewType = (j10 > Long.MAX_VALUE ? 1 : (j10 == Long.MAX_VALUE ? 0 : -1));
        if (viewType != 0 && !this.A01.A0A(A0H, nanoTime, j10)) {
            return false;
        }
        this.A08.A04.A09(c6k, i10);
        this.A01.A05(c6k.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(c6k);
        if (this.A08.A0s.A07()) {
            c6k.A04 = i11;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i10) {
        return this.A05.get(i10).A0H;
    }

    public final View A0G(int i10) {
        return A00(i10, false);
    }

    public final AnonymousClass69 A0H() {
        if (this.A01 == null) {
            this.A01 = new AnonymousClass69();
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x025e, code lost:
        if (r6 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0261, code lost:
        r5 = (com.facebook.ads.redexgen.X.AnonymousClass63) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0242, code lost:
        if (r6 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0244, code lost:
        r5 = (com.facebook.ads.redexgen.X.AnonymousClass63) r22.A08.generateLayoutParams(r5);
        r11.A0H.setLayoutParams(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.C6K A0I(int r23, boolean r24, long r25) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6A.A0I(int, boolean, long):com.facebook.ads.redexgen.X.6K");
    }

    public final List<C6K> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A0M();
        }
        int i11 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i11; scrapCount++) {
            this.A05.get(scrapCount).A0M();
        }
        if (this.A02 != null) {
            int changedScrapCount = this.A02.size();
            for (int scrapCount2 = 0; scrapCount2 < changedScrapCount; scrapCount2++) {
                this.A02.get(scrapCount2).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        if (this.A02 != null) {
            this.A02.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnonymousClass63 anonymousClass63 = (AnonymousClass63) this.A06.get(i10).A0H.getLayoutParams();
            if (anonymousClass63 != null) {
                anonymousClass63.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0A()) {
            int size = this.A06.size();
            for (int i10 = 0; i10 < size; i10++) {
                C6K c6k = this.A06.get(i10);
                if (c6k != null) {
                    c6k.A0T(6);
                    c6k.A0W(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i10 = this.A08.A06 != null ? this.A08.A06.A00 : 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i10;
        int extraCache2 = this.A06.size();
        for (int i11 = extraCache2 - 1; i11 >= 0; i11--) {
            int size = this.A06.size();
            int i12 = this.A00;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int i13 = str.charAt(9);
            int extraCache3 = str2.charAt(9);
            if (i13 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "FM5srU9o6TBj8QlSYYqmaX9MZyJMPTMr";
            strArr2[3] = "mnADOFh1HT7Eu0tfTP5EsiAEmob0QgOc";
            if (size > i12) {
                A07(i11);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i10) {
        this.A03 = i10;
        A0O();
    }

    public final void A0R(View view) {
        C6K A0F = MG.A0F(view);
        A0F.A0F = null;
        A0F.A0G = false;
        A0F.A0O();
        A0X(A0F);
    }

    public final void A0S(View view) {
        C6K A0F = MG.A0F(view);
        if (A0F.A0i(12) || !A0F.A0d() || this.A08.A1y(A0F)) {
            if (!A0F.A0Z() || A0F.A0a() || this.A08.A04.A0A()) {
                A0F.A0V(this, false);
                this.A05.add(A0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 48) + this.A08.A1J());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0F.A0V(this, true);
        this.A02.add(A0F);
    }

    public final void A0T(View view) {
        C6K A0F = MG.A0F(view);
        if (A0F.A0c()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0F.A0b()) {
            A0F.A0S();
        } else if (A0F.A0g()) {
            A0F.A0O();
        }
        A0X(A0F);
    }

    public final void A0U(AbstractC05435q abstractC05435q, AbstractC05435q abstractC05435q2, boolean z10) {
        A0P();
        A0H().A08(abstractC05435q, abstractC05435q2, z10);
    }

    public final void A0V(AnonymousClass69 anonymousClass69) {
        if (this.A01 != null) {
            this.A01.A04();
        }
        this.A01 = anonymousClass69;
        if (anonymousClass69 != null) {
            AnonymousClass69 anonymousClass692 = this.A01;
            AbstractC05435q adapter = this.A08.getAdapter();
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "lsZK0accpgBQgJYjkQv5Abfcayw6pcR0";
            strArr2[1] = "Z7g3Rn3k4gV3vNYe90sCMa52PcoBzFf1";
            anonymousClass692.A07(adapter);
        }
    }

    public final void A0W(C6I c6i) {
        this.A04 = c6i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0X(com.facebook.ads.redexgen.X.C6K r9) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6A.A0X(com.facebook.ads.redexgen.X.6K):void");
    }

    public final void A0Y(C6K c6k) {
        boolean z10;
        z10 = c6k.A0G;
        if (z10) {
            ArrayList<C6K> arrayList = this.A02;
            String[] strArr = A0A;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "g9dUUHlnr2dNWy2bvXbXpUnxFV";
            strArr2[6] = "1VljHDZyW4yQ7QRXruVc6WBcEp";
            arrayList.remove(c6k);
        } else {
            this.A05.remove(c6k);
        }
        c6k.A0F = null;
        c6k.A0G = false;
        c6k.A0O();
    }

    public final void A0Z(C6K c6k, boolean z10) {
        MG.A0s(c6k);
        if (c6k.A0i(16384)) {
            c6k.A0U(0, 16384);
            C4h.A0B(c6k.A0H, null);
        }
        if (z10) {
            A0B(c6k);
        }
        c6k.A08 = null;
        A0H().A09(c6k);
    }
}
