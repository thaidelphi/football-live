package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Aq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0668Aq {
    public static byte[] A04;
    public static String[] A05 = {"ZYrzMRmVY0fKuwQx318rNacSlgEREo8W", "DFlEfnYj9N0tv35MBsRVrv0NQ03vrQp9", "7c1jEy6Yvwz0PD0sTLnvRvzL7JrMoPnP", "hf", "LVfRkpSB2W01n6UoKBvMpgi93s4V", "wjSsCSJEOA2zcxlJjQpf4WZQJP", "cgSUujLLCITlA6k0bkAALzG3bpp7bkqz", "L2ObalbYjPtjYVm4HCkeGK0BV8R2iNFP"};
    public final EnumC0667Ap A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C0668Aq(AnonymousClass85 anonymousClass85, String str, String str2, EnumC0664Al enumC0664Al) throws C0661Ah {
        String A01 = A01(270, 21, 91);
        String A012 = A01(291, 11, 58);
        String A013 = A01(247, 14, 109);
        String A014 = A01(310, 4, 38);
        String A015 = A01(302, 8, 37);
        if (TextUtils.isEmpty(str)) {
            this.A00 = EnumC0667Ap.A04;
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (C0666Ao.A00[EnumC0667Ap.valueOf(jSONObject.getString(A014).toUpperCase()).ordinal()]) {
                case 1:
                    this.A00 = EnumC0667Ap.A03;
                    this.A01 = Long.valueOf(jSONObject.getString(A01(241, 6, 127)));
                    if (jSONObject.has(A013)) {
                        this.A02 = jSONObject.getString(A013);
                    } else {
                        this.A02 = null;
                    }
                    this.A03 = jSONObject.getString(A01(261, 9, 88));
                    if (!jSONObject.getString(A012).equals(anonymousClass85.A05().A9J()) && !ProcessUtils.isRemoteRenderingProcess()) {
                        throw new C0661Ah(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(0, 54, 122), this.A01, jSONObject.getString(A012), anonymousClass85.A05().A9J()));
                    }
                    if (!jSONObject.getString(A01).equals(str2)) {
                        throw new C0661Ah(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(54, 50, 11), this.A01, jSONObject.getString(A01), str2));
                    }
                    HashSet hashSet = new HashSet(Arrays.asList(Integer.valueOf(EnumC0664Al.A0H.A04()), Integer.valueOf(EnumC0664Al.A0K.A04()), Integer.valueOf(EnumC0664Al.A0I.A04()), Integer.valueOf(EnumC0664Al.A0J.A04())));
                    if (jSONObject.getInt(A015) != enumC0664Al.A04()) {
                        if (!hashSet.contains(Integer.valueOf(jSONObject.getInt(A015))) || !hashSet.contains(Integer.valueOf(enumC0664Al.A04()))) {
                            throw new C0661Ah(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(104, 48, 28), this.A01, Integer.valueOf(jSONObject.getInt(A015)), enumC0664Al));
                        }
                        return;
                    }
                    return;
                default:
                    throw new C0661Ah(AdErrorType.BID_PAYLOAD_ERROR, A01(210, 28, 68) + jSONObject.getString(A014));
            }
        } catch (JSONException e8) {
            anonymousClass85.A08().AAu(A01(238, 3, 5), AbstractC06048a.A0P, new C06058b(e8));
            throw new C0661Ah(AdErrorType.BID_PAYLOAD_ERROR, A01(152, 18, 88), e8);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{34, 9, 4, 64, 69, 4, 64, 6, 15, 18, 64, 51, 36, 43, 64, 22, 5, 18, 19, 9, 15, 14, 64, 69, 19, 64, 2, 5, 9, 14, 7, 64, 21, 19, 5, 4, 64, 15, 14, 64, 51, 36, 43, 64, 22, 5, 18, 19, 9, 15, 14, 64, 69, 19, 83, 120, 117, 49, 52, 117, 49, 119, 126, 99, 49, 97, 125, 112, 114, 116, 124, 116, Byte.MAX_VALUE, 101, 49, 52, 98, 49, 115, 116, 120, Byte.MAX_VALUE, 118, 49, 100, 98, 116, 117, 49, 126, Byte.MAX_VALUE, 49, 97, 125, 112, 114, 116, 124, 116, Byte.MAX_VALUE, 101, 49, 52, 98, 68, 111, 98, 38, 35, 98, 38, 96, 105, 116, 38, 114, 99, 107, 118, 106, 103, 114, 99, 38, 35, 117, 38, 100, 99, 111, 104, 97, 38, 115, 117, 99, 98, 38, 105, 104, 38, 114, 99, 107, 118, 106, 103, 114, 99, 38, 35, 117, 11, 44, 52, 35, 46, 43, 38, 98, 0, 43, 38, 18, 35, 59, 46, 45, 35, 38, 71, 118, 126, 99, Byte.MAX_VALUE, 114, 103, 118, 51, 54, 96, 51, 122, 96, 51, 125, 124, 103, 51, 101, 114, Byte.MAX_VALUE, 122, 119, 51, 113, 114, 125, 125, 118, 97, 51, 103, 118, 126, 99, Byte.MAX_VALUE, 114, 103, 118, 11, 48, 45, 43, 46, 46, 49, 44, 42, 59, 58, 126, 28, 55, 58, 14, 63, 39, 50, 49, 63, 58, 126, 42, 39, 46, 59, 126, 126, 111, 118, 7, 12, 1, 58, 12, 1, 21, 30, 19, 40, 3, 30, 26, 18, 40, 3, 24, 28, 18, 25, 38, 39, 52, 43, 33, 39, 29, 43, 38, 51, 36, 50, 46, 45, 55, 36, 37, 30, 49, 45, 32, 34, 36, 44, 36, 47, 53, 30, 40, 37, 83, 68, 75, Byte.MAX_VALUE, 86, 69, 82, 83, 73, 79, 78, 75, 90, 82, 79, 83, 94, 75, 90, 72, 69, 76, 89};
    }

    static {
        A02();
    }

    public C0668Aq() {
        this.A00 = EnumC0667Ap.A04;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public static EnumC0664Al A00(String str) throws C0661Ah {
        try {
            return EnumC0664Al.A00(new JSONObject(str).getInt(A01(302, 8, 37)));
        } catch (JSONException e8) {
            throw new C0661Ah(AdErrorType.BID_PAYLOAD_ERROR, A01(152, 18, 88), e8);
        }
    }

    public static void A03(EnumC0664Al enumC0664Al) throws C0661Ah {
        if (!EnumC0664Al.A0G.equals(enumC0664Al) && !EnumC0664Al.A0E.equals(enumC0664Al) && !EnumC0664Al.A0F.equals(enumC0664Al)) {
            boolean equals = EnumC0664Al.A0D.equals(enumC0664Al);
            if (A05[1].charAt(20) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "X5uVqi4FyBeSosvF2q5aVclYJStrMHB5";
            strArr[2] = "BOgVvqLcU58P5XEa1Smg5LyKHeBKxxT8";
            if (equals) {
                return;
            }
            throw new C0661Ah(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(170, 40, 9), Integer.valueOf(enumC0664Al.A04())));
        }
    }

    public final String A04() {
        if (this.A01 == null) {
            return null;
        }
        Long l10 = this.A01;
        if (A05[4].length() != 4) {
            A05[7] = "9BRFtSg6abebTfCvkl6x8CVGG9ZYJ4hw";
            return l10.toString();
        }
        throw new RuntimeException();
    }

    public final String A05() {
        return this.A02;
    }

    public final boolean A06() {
        return this.A00 != EnumC0667Ap.A04;
    }
}
