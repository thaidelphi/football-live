package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* renamed from: com.facebook.ads.redexgen.X.Qx */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1068Qx {
    public static byte[] A0R;
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
    public HashMap<C1246Yc, YW> A0G;
    public HashSet<Integer> A0H;
    public List<String> A0I;
    public List<String> A0J;
    public List<String> A0K;
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public List<String> A0L;
    public List<String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0j();
    }

    public static String A0b(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0R, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 26);
        }
        return new String(copyOfRange);
    }

    public static void A0j() {
        A0R = new byte[]{-59, -61, -46, -42, -53, -47, -48, -53, -48, -55};
    }

    @Deprecated
    public C1068Qx() {
        this.A06 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A05 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A04 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A03 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A0F = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A0E = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A0Q = true;
        this.A0M = C0958Mm.A01();
        this.A0D = 0;
        this.A0L = C0958Mm.A01();
        this.A0I = C0958Mm.A01();
        this.A0B = 0;
        this.A02 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A01 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A0J = C0958Mm.A01();
        this.A0K = C0958Mm.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap<>();
        this.A0H = new HashSet<>();
    }

    public C1068Qx(Context context) {
        this();
        A0r(context);
        A0s(context, true);
    }

    public C1068Qx(Bundle bundle) {
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
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        List A01;
        String str27;
        str = YN.A0e;
        this.A06 = bundle.getInt(str, YN.A0U.A06);
        str2 = YN.A0d;
        this.A05 = bundle.getInt(str2, YN.A0U.A05);
        str3 = YN.A0c;
        this.A04 = bundle.getInt(str3, YN.A0U.A04);
        str4 = YN.A0b;
        this.A03 = bundle.getInt(str4, YN.A0U.A03);
        str5 = YN.A0i;
        this.A0A = bundle.getInt(str5, YN.A0U.A0A);
        str6 = YN.A0h;
        this.A09 = bundle.getInt(str6, YN.A0U.A09);
        str7 = YN.A0g;
        this.A08 = bundle.getInt(str7, YN.A0U.A08);
        str8 = YN.A0f;
        this.A07 = bundle.getInt(str8, YN.A0U.A07);
        str9 = YN.A0v;
        this.A0F = bundle.getInt(str9, YN.A0U.A0F);
        str10 = YN.A0t;
        this.A0E = bundle.getInt(str10, YN.A0U.A0E);
        str11 = YN.A0u;
        this.A0Q = bundle.getBoolean(str11, YN.A0U.A0Q);
        str12 = YN.A0p;
        this.A0M = OI.A07((String[]) AbstractC1782i4.A00(bundle.getStringArray(str12), new String[0]));
        str13 = YN.A0q;
        this.A0D = bundle.getInt(str13, YN.A0U.A0D);
        str14 = YN.A0o;
        String[] preferredVideoLanguages1 = (String[]) AbstractC1782i4.A00(bundle.getStringArray(str14), new String[0]);
        this.A0L = A0a(preferredVideoLanguages1);
        str15 = YN.A0j;
        String[] stringArray = bundle.getStringArray(str15);
        String[] preferredVideoLanguages12 = new String[0];
        this.A0I = A0a((String[]) AbstractC1782i4.A00(stringArray, preferredVideoLanguages12));
        str16 = YN.A0l;
        this.A0B = bundle.getInt(str16, YN.A0U.A0B);
        str17 = YN.A0a;
        this.A02 = bundle.getInt(str17, YN.A0U.A02);
        str18 = YN.A0Z;
        this.A01 = bundle.getInt(str18, YN.A0U.A01);
        str19 = YN.A0k;
        String[] stringArray2 = bundle.getStringArray(str19);
        String[] preferredVideoLanguages13 = new String[0];
        this.A0J = OI.A07((String[]) AbstractC1782i4.A00(stringArray2, preferredVideoLanguages13));
        str20 = YN.A0m;
        String[] stringArray3 = bundle.getStringArray(str20);
        String[] preferredVideoLanguages14 = new String[0];
        this.A0K = A0a((String[]) AbstractC1782i4.A00(stringArray3, preferredVideoLanguages14));
        str21 = YN.A0n;
        this.A0C = bundle.getInt(str21, YN.A0U.A0C);
        str22 = YN.A0Y;
        this.A00 = bundle.getInt(str22, YN.A0U.A00);
        str23 = YN.A0s;
        this.A0P = bundle.getBoolean(str23, YN.A0U.A0P);
        str24 = YN.A0X;
        this.A0O = bundle.getBoolean(str24, YN.A0U.A0O);
        str25 = YN.A0W;
        this.A0N = bundle.getBoolean(str25, YN.A0U.A0N);
        str26 = YN.A0r;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(str26);
        if (parcelableArrayList == null) {
            A01 = C0958Mm.A01();
        } else {
            A01 = C1595ey.A01(YW.A03, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i10 = 0; i10 < A01.size(); i10++) {
            YW yw = (YW) A01.get(i10);
            this.A0G.put(yw.A00, yw);
        }
        str27 = YN.A0V;
        int[] iArr = (int[]) AbstractC1782i4.A00(bundle.getIntArray(str27), new int[0]);
        this.A0H = new HashSet<>();
        for (int i11 : iArr) {
            this.A0H.add(Integer.valueOf(i11));
        }
    }

    public C1068Qx(YN yn) {
        A0l(yn);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static OI<String> A0a(String[] strArr) {
        C4T A01 = OI.A01();
        for (String str : (String[]) AbstractC1589es.A01(strArr)) {
            A01.A04(AbstractC1672gE.A0k((String) AbstractC1589es.A01(str)));
        }
        return A01.A05();
    }

    private void A0k(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC1672gE.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0b(0, 10, 72))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = OI.A04(AbstractC1672gE.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0l(YN yn) {
        this.A06 = yn.A06;
        this.A05 = yn.A05;
        this.A04 = yn.A04;
        this.A03 = yn.A03;
        this.A0A = yn.A0A;
        this.A09 = yn.A09;
        this.A08 = yn.A08;
        this.A07 = yn.A07;
        this.A0F = yn.A0F;
        this.A0E = yn.A0E;
        this.A0Q = yn.A0Q;
        this.A0M = yn.A0M;
        this.A0D = yn.A0D;
        this.A0L = yn.A0L;
        this.A0I = yn.A0I;
        this.A0B = yn.A0B;
        this.A02 = yn.A02;
        this.A01 = yn.A01;
        this.A0J = yn.A0J;
        this.A0K = yn.A0K;
        this.A0C = yn.A0C;
        this.A00 = yn.A00;
        this.A0P = yn.A0P;
        this.A0O = yn.A0O;
        this.A0N = yn.A0N;
        this.A0H = new HashSet<>(yn.A0H);
        this.A0G = new HashMap<>(yn.A0G);
    }

    public C1068Qx A0q(int i10, int i11, boolean z10) {
        this.A0F = i10;
        this.A0E = i11;
        this.A0Q = z10;
        return this;
    }

    public C1068Qx A0r(Context context) {
        if (AbstractC1672gE.A02 >= 19) {
            A0k(context);
        }
        return this;
    }

    public C1068Qx A0s(Context context, boolean z10) {
        Point viewportSize = AbstractC1672gE.A0W(context);
        return A0q(viewportSize.x, viewportSize.y, z10);
    }

    public C1068Qx A0t(YN yn) {
        A0l(yn);
        return this;
    }

    public YN A0u() {
        return new YN(this);
    }
}
