package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.5v  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05485v extends YN implements InterfaceC0973Nb {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    @MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final SparseArray<Map<C1063Qs, QH>> A0E;
    public final SparseBooleanArray A0F;
    public static String[] A0G = {"", "CN7S8zFAdfJ9bVqwMW5SENbnF587rDMj", "ECtvHbgJLZyJlGB78wDP7r1UThztX0Vy", "vZtVD3U5uaTLh0U8YiXzC85k7FHIe0Qs", "kpJyRxDTLVyluzy4Ki", "I2f81on3HcFOk9u5oPzBv5nIGa89bXIT", "pIHA85qiURHoc0OmgkveP1MohnBa7K19", "P0ETTFDWchCwGrAdEF6EXZ7NnZlGXY62"};
    public static final C05485v A0J = new QL().A0u();
    @Deprecated
    public static final C05485v A0I = A0J;
    public static final String A0W = AbstractC1672gE.A0h(1000);
    public static final String A0Q = AbstractC1672gE.A0h(1001);
    public static final String A0R = AbstractC1672gE.A0h(1002);
    public static final String A0T = AbstractC1672gE.A0h(1003);
    public static final String A0M = AbstractC1672gE.A0h(1004);
    public static final String A0N = AbstractC1672gE.A0h(1005);
    public static final String A0K = AbstractC1672gE.A0h(1006);
    public static final String A0V = AbstractC1672gE.A0h(1007);
    public static final String A0b = AbstractC1672gE.A0h(1008);
    public static final String A0O = AbstractC1672gE.A0h(1009);
    public static final String A0Z = AbstractC1672gE.A0h(1010);
    public static final String A0a = AbstractC1672gE.A0h(1011);
    public static final String A0Y = AbstractC1672gE.A0h(1012);
    public static final String A0X = AbstractC1672gE.A0h(com.ironsource.d9.f16965i);
    public static final String A0P = AbstractC1672gE.A0h(com.ironsource.d9.f16966j);
    public static final String A0L = AbstractC1672gE.A0h(1015);
    public static final String A0S = AbstractC1672gE.A0h(com.ironsource.d9.f16968l);
    public static final String A0U = AbstractC1672gE.A0h(1017);
    public static final InterfaceC0972Na<C05485v> A0H = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.QM
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            C05485v A0u;
            A0u = new QL(bundle).A0u();
            return A0u;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0O(Map<C1063Qs, QH> map, Map<C1063Qs, QH> map2) {
        Map.Entry<C1063Qs, QH> next;
        C1063Qs key;
        if (map2.size() != map.size()) {
            return false;
        }
        Set<Map.Entry<C1063Qs, QH>> entrySet = map.entrySet();
        if (A0G[0].length() != 20) {
            A0G[6] = "31qVyA37JmHIq7wJWl6tQ8rYGcKQjTnj";
            Iterator<Map.Entry<C1063Qs, QH>> it = entrySet.iterator();
            do {
                boolean hasNext = it.hasNext();
                String[] strArr = A0G;
                if (strArr[3].charAt(29) == strArr[2].charAt(29)) {
                    String[] strArr2 = A0G;
                    strArr2[5] = "yEjaVA6ulEwRrX3LDmFuvRh8vmcDT6Dr";
                    strArr2[7] = "pBkPhNgZ1sM3uFKmd2X4jzJEolZPtmfi";
                    if (!hasNext) {
                        return true;
                    }
                } else if (!hasNext) {
                    return true;
                }
                next = it.next();
                key = next.getKey();
                if (!map2.containsKey(key)) {
                    break;
                }
            } while (AbstractC1672gE.A1E(next.getValue(), map2.get(key)));
            return false;
        }
        throw new RuntimeException();
    }

    public C05485v(QL ql) {
        super(ql);
        this.A0C = QL.A06(ql);
        this.A06 = QL.A07(ql);
        this.A07 = QL.A08(ql);
        this.A05 = QL.A09(ql);
        this.A09 = QL.A0A(ql);
        this.A02 = QL.A0B(ql);
        this.A03 = QL.A0C(ql);
        this.A00 = QL.A0D(ql);
        this.A01 = QL.A0E(ql);
        this.A08 = QL.A0F(ql);
        this.A0B = QL.A0G(ql);
        this.A0D = QL.A0H(ql);
        this.A04 = QL.A0I(ql);
        this.A0E = QL.A01(ql);
        this.A0F = QL.A02(ql);
        this.A0A = QL.A0J(ql);
    }

    public static C05485v A02(Context context) {
        return new QL(context).A0u();
    }

    public static /* synthetic */ String A09() {
        String str = A0U;
        String[] strArr = A0G;
        if (strArr[5].charAt(26) != strArr[7].charAt(26)) {
            String[] strArr2 = A0G;
            strArr2[3] = "mtf43clS1eUU5UHx5TRFOAR5zRqTy0Kh";
            strArr2[2] = "CrDKZHTScJRyP82QiFXNC9HezVyEH0fT";
            return str;
        }
        throw new RuntimeException();
    }

    public static /* synthetic */ String A0D() {
        String str = A0W;
        if (A0G[0].length() != 20) {
            A0G[0] = "6LY";
            return str;
        }
        throw new RuntimeException();
    }

    public static boolean A0M(SparseArray<Map<C1063Qs, QH>> sparseArray, SparseArray<Map<C1063Qs, QH>> sparseArray2) {
        int size = sparseArray.size();
        int firstSize = sparseArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInSecond = 0; indexInSecond < size; indexInSecond++) {
            int keyAt = sparseArray.keyAt(indexInSecond);
            String[] strArr = A0G;
            String str = strArr[5];
            String str2 = strArr[7];
            int indexInFirst = str.charAt(26);
            int firstSize2 = str2.charAt(26);
            if (indexInFirst == firstSize2) {
                throw new RuntimeException();
            }
            A0G[6] = "wixiVooXq8HdB8U083lu4f3TdrAsOKAk";
            int firstSize3 = sparseArray2.indexOfKey(keyAt);
            if (firstSize3 < 0 || !A0O(sparseArray.valueAt(indexInSecond), sparseArray2.valueAt(firstSize3))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final QL A0P() {
        return new QL(this);
    }

    @Deprecated
    public final QH A0Q(int i10, C1063Qs c1063Qs) {
        Map<C1063Qs, QH> map = this.A0E.get(i10);
        if (map != null) {
            return map.get(c1063Qs);
        }
        return null;
    }

    public final boolean A0R(int i10) {
        return this.A0F.get(i10);
    }

    @Deprecated
    public final boolean A0S(int i10, C1063Qs c1063Qs) {
        Map<C1063Qs, QH> map = this.A0E.get(i10);
        return map != null && map.containsKey(c1063Qs);
    }

    @Override // com.facebook.ads.redexgen.X.YN
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A0G[0].length() == 20) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "V1cytgY1ecLGUxbfCQ4Qe5VFfNWaEeXc";
            strArr[7] = "gmZ51llyJGBZ5cGYVq8w3xbcdRfXtWAW";
            if (cls == obj.getClass()) {
                C05485v c05485v = (C05485v) obj;
                if (super.equals(c05485v) && this.A0C == c05485v.A0C && this.A06 == c05485v.A06 && this.A07 == c05485v.A07 && this.A05 == c05485v.A05 && this.A09 == c05485v.A09 && this.A02 == c05485v.A02 && this.A03 == c05485v.A03 && this.A00 == c05485v.A00 && this.A01 == c05485v.A01 && this.A08 == c05485v.A08 && this.A0B == c05485v.A0B && this.A0D == c05485v.A0D && this.A04 == c05485v.A04 && A0N(this.A0F, c05485v.A0F) && A0M(this.A0E, c05485v.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.YN
    public final int hashCode() {
        int result = super.hashCode();
        int result2 = this.A06 ? 1 : 0;
        int result3 = this.A05 ? 1 : 0;
        int result4 = this.A02 ? 1 : 0;
        int result5 = this.A00 ? 1 : 0;
        int result6 = this.A08 ? 1 : 0;
        int result7 = this.A0D ? 1 : 0;
        return (((((((((((((((((((((((((((1 * 31) + result) * 31) + (this.A0C ? 1 : 0)) * 31) + result2) * 31) + (this.A07 ? 1 : 0)) * 31) + result3) * 31) + (this.A09 ? 1 : 0)) * 31) + result4) * 31) + (this.A03 ? 1 : 0)) * 31) + result5) * 31) + (this.A01 ? 1 : 0)) * 31) + result6) * 31) + (this.A0B ? 1 : 0)) * 31) + result7) * 31) + (this.A04 ? 1 : 0);
    }
}
