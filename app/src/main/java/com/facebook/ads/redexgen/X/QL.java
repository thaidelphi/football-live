package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class QL extends C1068Qx {
    public static String[] A0G = {"MEP0RusGJ", "aisi", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "YG0qp9u1qYoiRP5KHMpp78TBUCMtUf0J", "hLF1x9dYc", "pBfQRGaAvNTHENySPCl5ogMBSjCPbpOz", "hQHGakiMTJn5HrhUKsneJmP8PWCXiAuF", "VzzbUY8xO1BM674pyHReQ6MrMnxgDaEs"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    @MetaExoPlayerCustomization("D25277746 - If all qualities are filtered out, do not use a fixed selection but differ to adaptive track selection in hero.")
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final SparseArray<Map<C1063Qs, QH>> A0E;
    public final SparseBooleanArray A0F;

    @Deprecated
    public QL() {
        this.A0E = new SparseArray<>();
        this.A0F = new SparseBooleanArray();
        A04();
    }

    public QL(Context context) {
        super(context);
        this.A0E = new SparseArray<>();
        this.A0F = new SparseBooleanArray();
        A04();
    }

    @MetaExoPlayerCustomization("Modified to support setExceedRendererCapabilitiesIfAllFilteredOut")
    public QL(Bundle bundle) {
        super(bundle);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        A04();
        C05485v c05485v = C05485v.A0J;
        A1C(bundle.getBoolean(C05485v.A0D(), c05485v.A0C));
        str = C05485v.A0Q;
        A16(bundle.getBoolean(str, c05485v.A06));
        str2 = C05485v.A0R;
        A17(bundle.getBoolean(str2, c05485v.A07));
        str3 = C05485v.A0P;
        A15(bundle.getBoolean(str3, c05485v.A05));
        str4 = C05485v.A0T;
        A19(bundle.getBoolean(str4, c05485v.A09));
        str5 = C05485v.A0M;
        A12(bundle.getBoolean(str5, c05485v.A02));
        str6 = C05485v.A0N;
        A13(bundle.getBoolean(str6, c05485v.A03));
        str7 = C05485v.A0K;
        A10(bundle.getBoolean(str7, c05485v.A00));
        str8 = C05485v.A0L;
        A11(bundle.getBoolean(str8, c05485v.A01));
        str9 = C05485v.A0S;
        A18(bundle.getBoolean(str9, c05485v.A08));
        str10 = C05485v.A0V;
        A1B(bundle.getBoolean(str10, c05485v.A0B));
        str11 = C05485v.A0b;
        A1D(bundle.getBoolean(str11, c05485v.A0D));
        str12 = C05485v.A0O;
        A14(bundle.getBoolean(str12, c05485v.A04));
        A1A(bundle.getBoolean(C05485v.A09(), c05485v.A0A));
        this.A0E = new SparseArray<>();
        A05(bundle);
        str13 = C05485v.A0X;
        this.A0F = A03(bundle.getIntArray(str13));
    }

    @MetaExoPlayerCustomization("To support exceedRendererCapabilitiesIfAllFilteredOut")
    public QL(C05485v c05485v) {
        super(c05485v);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.A0C = c05485v.A0C;
        this.A06 = c05485v.A06;
        this.A07 = c05485v.A07;
        this.A05 = c05485v.A05;
        this.A09 = c05485v.A09;
        this.A02 = c05485v.A02;
        this.A03 = c05485v.A03;
        this.A00 = c05485v.A00;
        this.A01 = c05485v.A01;
        this.A08 = c05485v.A08;
        this.A0B = c05485v.A0B;
        this.A0D = c05485v.A0D;
        this.A04 = c05485v.A04;
        this.A0A = c05485v.A0A;
        sparseArray = c05485v.A0E;
        this.A0E = A00(sparseArray);
        sparseBooleanArray = c05485v.A0F;
        this.A0F = sparseBooleanArray.clone();
    }

    public static SparseArray<Map<C1063Qs, QH>> A00(SparseArray<Map<C1063Qs, QH>> sparseArray) {
        SparseArray<Map<C1063Qs, QH>> sparseArray2 = new SparseArray<>();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }

    private SparseBooleanArray A03(int[] iArr) {
        if (iArr == null) {
            return new SparseBooleanArray();
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
        for (int i10 : iArr) {
            sparseBooleanArray.append(i10, true);
        }
        return sparseBooleanArray;
    }

    @MetaExoPlayerCustomization("To support setting exceedRendererCapabilitiesIfAllFilteredOut")
    private void A04() {
        this.A0C = true;
        this.A06 = false;
        this.A07 = true;
        this.A05 = false;
        this.A09 = true;
        this.A02 = false;
        this.A03 = false;
        this.A00 = false;
        this.A01 = false;
        this.A08 = true;
        this.A0B = true;
        this.A0D = false;
        this.A04 = true;
        this.A0A = false;
    }

    private void A05(Bundle bundle) {
        String str;
        String str2;
        OI A01;
        String str3;
        SparseArray<DefaultTrackSelector.SelectionOverride> selectionOverrides;
        str = C05485v.A0Z;
        int[] intArray = bundle.getIntArray(str);
        str2 = C05485v.A0a;
        ArrayList<Bundle> trackGroupArrayBundles = bundle.getParcelableArrayList(str2);
        if (trackGroupArrayBundles == null) {
            A01 = OI.A03();
        } else {
            A01 = C1595ey.A01(C1063Qs.A05, trackGroupArrayBundles);
        }
        str3 = C05485v.A0Y;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(str3);
        if (sparseParcelableArray == null) {
            selectionOverrides = new SparseArray<>();
        } else {
            selectionOverrides = C1595ey.A00(QH.A05, sparseParcelableArray);
        }
        if (intArray == null || intArray.length != A01.size()) {
            return;
        }
        for (int i10 = 0; i10 < intArray.length; i10++) {
            A0w(intArray[i10], (C1063Qs) A01.get(i10), (QH) selectionOverrides.get(i10));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1068Qx
    /* renamed from: A0v */
    public final QL A0q(int i10, int i11, boolean z10) {
        super.A0q(i10, i11, z10);
        return this;
    }

    @Deprecated
    public final QL A0w(int i10, C1063Qs c1063Qs, QH qh) {
        Map<C1063Qs, QH> map = this.A0E.get(i10);
        if (map == null) {
            map = new HashMap<>();
            this.A0E.put(i10, map);
        }
        if (map.containsKey(c1063Qs)) {
            boolean A1E = AbstractC1672gE.A1E(map.get(c1063Qs), qh);
            if (A0G[6].charAt(5) == 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[0] = "W6btIdXSM";
            strArr[2] = "h";
            if (A1E) {
                return this;
            }
        }
        map.put(c1063Qs, qh);
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C1068Qx
    /* renamed from: A0x */
    public final QL A0r(Context context) {
        super.A0r(context);
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C1068Qx
    /* renamed from: A0y */
    public final QL A0s(Context context, boolean z10) {
        super.A0s(context, z10);
        return this;
    }

    public final QL A0z(YN yn) {
        super.A0t(yn);
        return this;
    }

    public final QL A10(boolean z10) {
        this.A00 = z10;
        return this;
    }

    public final QL A11(boolean z10) {
        this.A01 = z10;
        return this;
    }

    public final QL A12(boolean z10) {
        this.A02 = z10;
        return this;
    }

    public final QL A13(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final QL A14(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final QL A15(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final QL A16(boolean z10) {
        this.A06 = z10;
        return this;
    }

    public final QL A17(boolean z10) {
        this.A07 = z10;
        return this;
    }

    public final QL A18(boolean z10) {
        this.A08 = z10;
        return this;
    }

    public final QL A19(boolean z10) {
        this.A09 = z10;
        return this;
    }

    @MetaExoPlayerCustomization("D25277746")
    public final QL A1A(boolean z10) {
        this.A0A = z10;
        return this;
    }

    public final QL A1B(boolean z10) {
        this.A0B = z10;
        return this;
    }

    public final QL A1C(boolean z10) {
        this.A0C = z10;
        return this;
    }

    public final QL A1D(boolean z10) {
        this.A0D = z10;
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C1068Qx
    /* renamed from: A1E */
    public final C05485v A0u() {
        return new C05485v(this);
    }
}
