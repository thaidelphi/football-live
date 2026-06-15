package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.mv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2076mv implements InterfaceC04501y, AnonymousClass23 {
    public static byte[] A0C;
    public static String[] A0D = {"axrzCdv0FVVdCRJ2G5bzsKW6gzdnjkd", "bTiRlDodVRVUvI5asAv5OrmPjdR2kQoL", "0F0kzsbgf", "9OhtkIX5JTQzZAf31yyS0L6RFdCICf7G", "a5UohLNEI7iVSyxaj4LiJgBVL6R7sy1L", "7foeJoxu0TAivWs2uWCvQbVxkZa0ERHH", "EHJaWrfXkxbvFmDXjSXoaOL8kiGJisUm", "EwwWMCMqNj"};
    public static final String A0E;
    public int A00;
    public C2063mi A01;
    public C2I A02;
    public C2J A03;
    public AT A04;
    public List<C1816ie> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1900k1 A0A;
    public final String A0B;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 27);
            if (A0D[0].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "ypXQoKhxcHRWJrqojmqi5sMtZ7xfThaX";
            strArr[6] = "2LOy6kLjroQDrfbojOuFHdbjLd88ORkx";
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{55, 18, 23, 6, 2, 19, 4, 86, 23, 26, 4, 19, 23, 18, 15, 86, 26, 25, 23, 18, 19, 18, 86, 18, 23, 2, 23, 2, 45, 40, 34, 42, 97, 41, 32, 49, 49, 36, 47, 36, 37, 97, 46, 47, 97, 45, 46, 34, 42, 50, 34, 51, 36, 36, 47, 97, 32, 37, 87, 120, 125, 119, Byte.MAX_VALUE, 52, 120, 123, 115, 115, 113, 112, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 46, 44, 63, 41, 46, 35, 57, 85, 87, 68, 82, 95, 88, 82, 114, 101, 50, 61, 56, 32, 49, 38, 49, 48, 11, 55, 56, 61, 55, 63, 11, 48, 49, 56, 53, 45, 11, 57, 39, 22, 12, 32, 28, 13, 26, 30, 11, 22, 9, 26, 32, 30, 12, 32, 28, 11, 30, 32, 9, 77, Byte.MAX_VALUE, 112, 101, 120, 103, 116, 36, 57, 54, 39, 36, 63, 56, 35, 106, 113, 118, 110, 106, 122, 86, 123, 10, 21, 25, 11};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C2077mw(this, map2, A03(map)), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    static {
        A04();
        A0E = C2076mv.class.getSimpleName();
    }

    public C2076mv(C1900k1 c1900k1) {
        this(c1900k1, new C2063mi());
    }

    public C2076mv(C1900k1 c1900k1, C2063mi c2063mi) {
        this.A0B = UUID.randomUUID().toString();
        this.A00 = 200;
        this.A01 = c2063mi;
        this.A0A = c1900k1;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        String A02 = A02(162, 4, 103);
        if (map.containsKey(A02)) {
            hashMap.put(A02, map.get(A02));
        }
        String A022 = A02(146, 8, 76);
        if (map.containsKey(A022)) {
            hashMap.put(A022, map.get(A022));
        }
        return hashMap;
    }

    private void A05(C2063mi c2063mi) {
        if (!this.A06) {
            this.A01 = c2063mi;
            List<C2063mi> A0c = this.A01.A0c();
            if (A0c != null && A0c.size() > 0) {
                int size = A0c.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    C2076mv adapter = new C2076mv(this.A0A);
                    adapter.A05(A0c.get(i10));
                    arrayList.add(new C1816ie(this.A0A, adapter, (C06248u) null, this.A04));
                }
                this.A05 = arrayList;
            }
            this.A06 = true;
            this.A07 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 109));
    }

    private boolean A07() {
        return (!(this.A01.A0e() || TextUtils.isEmpty(this.A01.A0V())) || (!TextUtils.isEmpty(this.A01.A0S()) && this.A01.A0e())) && (this.A01.A0F() != null || this.A01.A0e()) && (this.A01.A0E() != null || A8a() == AdPlacementType.NATIVE_BANNER);
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int A06 = this.A01.A06();
        if (A06 < 0 || A06 > 100) {
            return 0;
        }
        return A06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final C2063mi A0E() {
        return this.A01;
    }

    public final C2I A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0Y();
    }

    public final List<C1816ie> A0H() {
        if (!A0R()) {
            return null;
        }
        return this.A05;
    }

    public final void A0I() {
        if (!this.A09) {
            String A0Z = A0E().A0Z();
            if (A0Z != null) {
                A7 A0A = this.A0A.A0A();
                String[] strArr = A0D;
                if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[4] = "MHNGbcOaMZIG61BxjY7eI95TuiNlx0Gr";
                strArr2[6] = "kvjKrlZQ6RBIZv1Jj5ESJw4vFB55PB3z";
                A0A.AG7(A0Z);
            }
            this.A09 = true;
        }
    }

    public final void A0J() {
        if (this.A05 != null && !this.A05.isEmpty()) {
            for (C1816ie c1816ie : this.A05) {
                c1816ie.unregisterView();
            }
        }
    }

    public final void A0K(C2I c2i) {
        this.A02 = c2i;
    }

    public final void A0L(C1900k1 c1900k1, C2I c2i, A7 a72, AnonymousClass38 anonymousClass38, AT at) {
        int i10;
        this.A02 = c2i;
        this.A04 = at;
        JSONObject A03 = anonymousClass38.A03();
        C06248u A01 = anonymousClass38.A01();
        if (A01 != null) {
            i10 = A01.A06();
        } else {
            i10 = 200;
        }
        this.A00 = i10;
        A05(C2K.A00(c1900k1, A03, CV.A02(A03, A02(94, 2, 10))));
        if (AbstractC04511z.A06(c1900k1, this, a72)) {
            c1900k1.A0F().A4s();
            c2i.AEE(this, C0660Ag.A00(AdErrorType.NO_FILL));
            return;
        }
        if (c2i != null) {
            c2i.AEB(this);
        }
        this.A03 = new C2J(c1900k1, this.A0B, this, c2i);
        this.A03.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ff, code lost:
        if (r0 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2076mv.A0M(java.util.Map):void");
    }

    public final void A0N(Map<String, String> extraData) {
        this.A0A.A0A().AAq(this.A01.A7E(), extraData);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
        if (r4 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2076mv.A0O(java.util.Map):void");
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0Q() {
        return A0R() && this.A01.A0B() != null;
    }

    public final boolean A0R() {
        return this.A06 && this.A07;
    }

    public final boolean A0S() {
        return this.A01.A0d();
    }

    public final boolean A0T() {
        return C06419m.A1U(this.A0A) && A0R() && this.A01.A0f();
    }

    public final boolean A0U() {
        return C06419m.A1U(this.A0A) && A0R() && this.A01.A0g();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04501y
    public final String A7E() {
        return this.A01.A7E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04501y
    public final Collection<String> A7f() {
        return A0E().A7f();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04501y
    public final EnumC04491x A8A() {
        return A0E().A8A();
    }

    public AdPlacementType A8a() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final boolean AJQ() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final void onDestroy() {
        if (this.A03 != null) {
            C2J c2j = this.A03;
            String[] strArr = A0D;
            if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                throw new RuntimeException();
            }
            A0D[7] = "xLZjaQWgus";
            c2j.A03();
        }
    }
}
