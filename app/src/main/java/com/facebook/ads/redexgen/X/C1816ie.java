package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
/* renamed from: com.facebook.ads.redexgen.X.ie  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1816ie implements com.facebook.ads.Ad, NativeAdBaseApi, Repairable, InterfaceC0657Ac {
    public static C05987t A0k;
    public static byte[] A0l;
    public static String[] A0m = {"0QrYY16WpsBKaBkyPEA33iBIoR05UhVT", "YnnsFrkLVth43aFbA8XanJ7Af1ELV", "Oxqa2FUUnPLQ7GUfsty3Y0efzjvyqNtk", "SIKP4BEcnF1kam64buW5uj4ZKlEjFxDR", "vEVPI6RQ4lovzpZyrpWOxFDddvUHwWNp", "NGWOmnzpb", "djSS0JJWnZq1rlBsvyeXY9GnDKzed", "NhvbMWoFDj5W6o0bWnGe4dztWB8buZER"};
    public static final String A0n;
    public static final WeakHashMap<View, WeakReference<C1816ie>> A0o;
    public long A00;
    public Drawable A01;
    public View.OnTouchListener A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public NativeAdLayout A07;
    public C2G A08;
    public C2065mk A09;
    public C0957Mj A0A;
    public C2030mB A0B;
    public C7z A0C;
    public C06248u A0D;
    public AQ A0E;
    public View$OnClickListenerC1817ig A0F;
    public InterfaceC1815id A0G;
    public AW A0H;
    public AX A0I;
    public EnumC0664Al A0J;
    public EB A0K;
    public F9 A0L;
    public C0810Gr A0M;
    public C0830Hl A0N;
    public JK A0O;
    public JK A0P;
    public JL A0Q;
    public JL A0R;
    public String A0S;
    public String A0T;
    public WeakReference<C1946kl> A0U;
    public WeakReference<JK> A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public C2076mv A0a;
    public final C05987t A0b;
    public final C1900k1 A0c;
    public final AT A0d;
    public final C0659Ae A0e;
    public final C0710Cv A0f;
    public final String A0g;
    public final String A0h;
    public final List<View> A0i;
    public volatile boolean A0j;

    public static String A0W(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0l, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A0e() {
        A0l = new byte[]{-32, 26, 38, 31, 30, -15, 34, -20, 30, 33, -18, 32, -13, -22, -24, -22, -20, -21, -23, 26, -20, -62, -27, -95, -17, -16, -11, -95, -19, -16, -30, -27, -26, -27, 38, 73, 57, 74, 82, 85, 81, 70, 89, 74, 5, 12, 10, 88, 12, 5, 78, 88, 5, 83, 84, 89, 5, 70, 5, 83, 70, 89, 78, 91, 74, 5, 70, 73, -20, -24, -25, 27, 10, 15, 11, 20, 9, 11, -12, 11, 26, 29, 21, 24, 17, -33, -6, 2, 5, -2, -3, -71, 13, 8, -71, 5, 8, -6, -3, -71, -26, -2, -3, 2, -6, -57, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 14, 1, 19, 0, 8, 13, -65, 19, 4, 12, 15, 11, 0, 19, 4, -65, -24, -29, -65, 5, 17, 14, 12, -65, 1, 8, 3, -65, 15, 0, 24, 11, 14, 0, 3, -65, -58, -60, 18, -58, -13, 24, 30, 15, 28, 24, 11, 22, -54, 15, 28, 28, 25, 28, -40, -76, -23, 14, 22, 1, 12, 9, 4, -64, 19, 5, 20, -64, 15, 6, -64, 3, 12, 9, 3, 11, 1, 2, 12, 5, -64, 22, 9, 5, 23, 19, 34, 58, 57, 62, 54, 43, 62, 58, 76, -11, 59, 68, 71, -11, 62, 56, 68, 67, -11, 62, 72, -11, 62, 72, -11, 66, 62, 72, 72, 62, 67, 60, 3, 0, 24, 23, 28, 20, 9, 28, 24, 42, -45, 28, 38, -45, 32, 28, 38, 38, 28, 33, 26, -31, 29, 69, 67, 68, -16, 64, 66, 63, 70, 57, 52, 53, -16, 49, -16, 38, 57, 53, 71, 52, 71, 90, 79, 92, 75, 6, 39, 74, 6, 93, 71, 89, 6, 71, 82, 88, 75, 71, 74, 95, 6, 88, 75, 77, 79, 89, 90, 75, 88, 75, 74, 6, 93, 79, 90, 78, 6, 71, 6, 60, 79, 75, 93, 20, 6, 39, 91, 90, 85, 6, 91, 84, 88, 75, 77, 79, 89, 90, 75, 88, 79, 84, 77, 6, 71, 84, 74, 6, 86, 88, 85, 73, 75, 75, 74, 79, 84, 77, 20, 35, 54, 73, 62, 75, 58, -11, 54, 57, -11, 57, 58, 72, 73, 71, 68, 78, 58, 57, -55, -36, -17, -28, -15, -32, -101, -36, -33, -101, -25, -22, -36, -33, -101, -19, -32, -20, -16, -32, -18, -17, -32, -33, -31, -12, -16, 2, -85, -20, -9, -3, -16, -20, -17, 4, -85, -3, -16, -14, -12, -2, -1, -16, -3, -16, -17, -85, 2, -12, -1, -13, -85, -20, -85, -39, -20, -1, -12, 1, -16, -52, -17, -71, -85, -52, 0, -1, -6, -85, 0, -7, -3, -16, -14, -12, -2, -1, -16, -3, -12, -7, -14, -85, -20, -7, -17, -85, -5, -3, -6, -18, -16, -16, -17, -12, -7, -14, -71, -22, -3, -7, 11, -76, 2, 3, 8, -76, 6, -7, -5, -3, 7, 8, -7, 6, -7, -8, -76, 11, -3, 8, -4, -76, 8, -4, -3, 7, -76, -30, -11, 8, -3, 10, -7, -43, -8, 10, 13, -55, 22, 14, 13, 18, 10, -55, 29, 34, 25, 14, -55, 18, 28, -55, 23, 24, 29, -55, 28, 30, 25, 25, 24, 27, 29, 14, 13, -41, 46, 61, 54, 56, 12, 9, 57, 5, 10, 9, 51, 52, 66, 67, 65, 62, 72, 81, 84, 70, 73, 38, 73, 69, 72, 58, 61, 26, 61, 1, 2, -7, 60, 58, 69, 69, 62, 61, -7, 70, 72, 75, 62, -7, 77, 65, 58, 71, -7, 72, 71, 60, 62, -27, -40, -21, -32, -19, -36};
        String[] strArr = A0m;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0m[3] = "WbNUBB1XQVUYjPuN5kyqwH0pcEyoS9gz";
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c6, code lost:
        if (r6.A0S() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02c8, code lost:
        r12.A0O = new com.facebook.ads.redexgen.X.C1820ij(r12);
        r12.A0Q = new com.facebook.ads.redexgen.X.JL(r13, 1, new java.lang.ref.WeakReference(r12.A0O), r12.A0c);
        r12.A0Q.A0Y(false);
        r12.A0Q.A0X(r6.A09());
        r12.A0Q.A0U();
        r12.A0c.A0F().ABt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fb, code lost:
        r1 = new java.util.ArrayList(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0302, code lost:
        if (r12.A05 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0304, code lost:
        r7 = r12.A05;
        r4 = com.facebook.ads.redexgen.X.C1816ie.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0317, code lost:
        if (r4[2].charAt(3) == r4[7].charAt(3)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0319, code lost:
        r4 = com.facebook.ads.redexgen.X.C1816ie.A0m;
        r4[0] = "7BxfhPTBtrovnc2SNqJYjum2f5qDPcpL";
        r4[4] = "Q5pxYg7VFdMmLRDnYTITcnTwa1eIsVWj";
        r1.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0328, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0330, code lost:
        if (r2.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0332, code lost:
        A1L((android.view.View) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x033c, code lost:
        r0 = A10();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0340, code lost:
        if (r16 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0342, code lost:
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0348, code lost:
        if (r0.A1E() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x034a, code lost:
        A1L(r13);
        r1.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0350, code lost:
        r7 = A00();
        r12.A0P = new com.facebook.ads.redexgen.X.C1819ii(r12, r14, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x035d, code lost:
        if ((r14 instanceof com.facebook.ads.internal.api.AdNativeComponentView) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x035f, code lost:
        r12.A03 = ((com.facebook.ads.internal.api.AdNativeComponentView) r14).getAdContentsView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x036d, code lost:
        if (com.facebook.ads.redexgen.X.C06419m.A1s(r12.A0c) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x036f, code lost:
        r4 = A1C();
        r6 = A12().A0B();
        r5 = r12.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x037d, code lost:
        if (r4 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x037f, code lost:
        r4 = A0W(0, 0, 121);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0387, code lost:
        r6.AJt(r5, r4, r12.A03 instanceof com.facebook.ads.redexgen.X.IM, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x038f, code lost:
        r12.A0R = new com.facebook.ads.redexgen.X.JL(r12.A03, r7, A03(), true, new java.lang.ref.WeakReference(r12.A0P), r12.A0c);
        r12.A0R.A0Y(!A0r());
        r12.A0R.A0W(A01());
        r12.A0R.A0X(A02());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03c7, code lost:
        if ((r12.A03 instanceof com.facebook.ads.redexgen.X.C0766Ez) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03c9, code lost:
        r5 = (com.facebook.ads.redexgen.X.C0766Ez) r12.A03;
        r4 = com.facebook.ads.redexgen.X.C1816ie.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03df, code lost:
        if (r4[0].charAt(21) == r4[4].charAt(21)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03e1, code lost:
        com.facebook.ads.redexgen.X.C1816ie.A0m[3] = "9jWMkBrIWAaQq3BshIoiK9kOFApm7Mnb";
        r5.A06(r12.A0R);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03ed, code lost:
        r12.A09 = new com.facebook.ads.redexgen.X.C2065mk(r12.A0c, new com.facebook.ads.redexgen.X.Cif(r12, null), r12.A0R, r12.A0a);
        r12.A09.A0H(r1);
        com.facebook.ads.redexgen.X.C1816ie.A0o.put(r13, new java.lang.ref.WeakReference<>(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0415, code lost:
        if (com.facebook.ads.redexgen.X.C06419m.A1A(r12.A0c) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0417, code lost:
        r12.A0L = new com.facebook.ads.redexgen.X.F9();
        r12.A0L.A0C(r12.A0g);
        r12.A0L.A0B(r12.A0c.getPackageName());
        r12.A0L.A0A(r12.A0R);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0439, code lost:
        if (r12.A0a == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0445, code lost:
        if (r12.A0a.A0E().A03() <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0447, code lost:
        r0 = r12.A0a.A0E();
        r12.A0L.A08(r0.A03(), r0.A04());
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x045a, code lost:
        r4 = r12.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0468, code lost:
        if (com.facebook.ads.redexgen.X.C1816ie.A0m[3].charAt(5) == 'B') goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x046a, code lost:
        if (r4 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x046c, code lost:
        r12.A0L.A09(r12.A0D.A0C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0477, code lost:
        r12.A04.getOverlay().add(r12.A0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0482, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0483, code lost:
        r2 = com.facebook.ads.redexgen.X.C1816ie.A0m;
        r2[6] = "iJInlaPqSCsodlo1snRpIwz9DPt1A";
        r2[1] = "DYzZZFtfMBLderHMiZZFXfgJZWHC0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x048f, code lost:
        if (r4 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0494, code lost:
        if (r12.A0A == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x049c, code lost:
        if (r12.A0A.A0J() == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x049e, code lost:
        r12.A0L.A09(r12.A0A.A0J().A0C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04ae, code lost:
        r12.A03 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0222, code lost:
        if (r8 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0224, code lost:
        android.util.Log.w(com.facebook.ads.redexgen.X.C1816ie.A0n, A0W(275, 80, 118));
        unregisterView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0236, code lost:
        r8 = com.facebook.ads.redexgen.X.C1816ie.A0o.containsKey(r13);
        r2 = com.facebook.ads.redexgen.X.C1816ie.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x024c, code lost:
        if (r2[6].length() == r2[1].length()) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0253, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x025b, code lost:
        if (r8 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025e, code lost:
        r2 = com.facebook.ads.redexgen.X.C1816ie.A0m;
        r2[0] = "r1dCEV0W05obqeylsxysUOCLLtyqbDkO";
        r2[4] = "jsU6g8E1kSPqSuKqGJQzSRDrUMjHNr5E";
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x026a, code lost:
        if (r8 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0278, code lost:
        if (com.facebook.ads.redexgen.X.C1816ie.A0o.get(r13).get() == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027a, code lost:
        android.util.Log.w(com.facebook.ads.redexgen.X.C1816ie.A0n, A0W(398, 75, 27));
        com.facebook.ads.redexgen.X.C1816ie.A0o.get(r13).get().unregisterView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x029a, code lost:
        r12.A0F = new com.facebook.ads.redexgen.X.View$OnClickListenerC1817ig(r12, r12.A0c, null);
        r12.A04 = r13;
        r12.A06 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02aa, code lost:
        if ((r13 instanceof android.view.ViewGroup) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02ac, code lost:
        r12.A0K = new com.facebook.ads.redexgen.X.EB(r12.A0c, new com.facebook.ads.redexgen.X.C1821ik(r12));
        ((android.view.ViewGroup) r13).addView(r12.A0K);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0g(android.view.View r13, android.view.View r14, java.util.List<android.view.View> r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1816ie.A0g(android.view.View, android.view.View, java.util.List, boolean):void");
    }

    static {
        A0e();
        A0n = C1816ie.class.getSimpleName();
        A0o = new WeakHashMap<>();
    }

    public C1816ie(Context context, String str, AT at, boolean z10) {
        this.A0h = UUID.randomUUID().toString();
        this.A0J = EnumC0664Al.A06;
        this.A0E = AQ.A04;
        this.A08 = C2G.A03;
        this.A0U = new WeakReference<>(null);
        this.A0i = new ArrayList();
        this.A0f = new C0710Cv();
        this.A0Z = false;
        this.A0Y = false;
        this.A00 = -1L;
        if (context instanceof C1900k1) {
            this.A0c = (C1900k1) context;
        } else if (!z10) {
            this.A0c = C05686p.A04(context);
        } else {
            this.A0c = C05686p.A03(context);
        }
        this.A0c.A0O(this);
        this.A0g = str;
        this.A0d = at;
        if (A0k != null) {
            this.A0b = A0k;
        } else {
            this.A0b = new C05987t(this.A0c);
        }
        this.A05 = new View(context);
        this.A0e = new C0659Ae(this.A0c, this);
    }

    public C1816ie(C1816ie c1816ie) {
        this((Context) c1816ie.A0c, (String) null, c1816ie.A0d, true);
        this.A0D = c1816ie.A0D;
        this.A0a = c1816ie.A0a;
        this.A0B = c1816ie.A0B;
        this.A0j = true;
        this.A05 = new View(this.A0c);
    }

    public C1816ie(C1900k1 c1900k1, C2076mv c2076mv, C06248u c06248u, AT at) {
        this((Context) c1900k1, (String) null, at, true);
        this.A0a = c2076mv;
        this.A0D = c06248u;
        this.A0j = true;
        this.A05 = new View(c1900k1);
    }

    public C1816ie(C1900k1 c1900k1, C2076mv c2076mv, C06248u c06248u, AT at, C2030mB c2030mB) {
        this(c1900k1, c2076mv, c06248u, at);
        this.A0B = c2030mB;
    }

    private int A00() {
        if (this.A0D != null) {
            return this.A0D.A04();
        }
        if (this.A0A == null || this.A0A.A0J() == null) {
            return 1;
        }
        C06248u A0J = this.A0A.A0J();
        String[] strArr = A0m;
        String str = strArr[6];
        String str2 = strArr[1];
        int length = str.length();
        int viewabilityThreshold = str2.length();
        if (length != viewabilityThreshold) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[2] = "P5kYLn6xwAUrjDfDuw88TuaVt88D3vtD";
        strArr2[7] = "ZJzVQNISDO4cH7XUZ38T2d7bCdM1k8uN";
        return A0J.A04();
    }

    private int A01() {
        if (this.A0D != null) {
            return this.A0D.A07();
        }
        if (this.A0a != null) {
            return this.A0a.A0C();
        }
        if (this.A0A != null && this.A0A.A0J() != null) {
            return this.A0A.A0J().A07();
        }
        return 0;
    }

    private int A02() {
        if (this.A0D != null) {
            return this.A0D.A08();
        }
        if (this.A0a != null) {
            return this.A0a.A0D();
        }
        if (this.A0A != null && this.A0A.A0J() != null) {
            return this.A0A.A0J().A08();
        }
        return 1000;
    }

    private int A03() {
        if (this.A0D != null) {
            return this.A0D.A09();
        }
        C0957Mj c0957Mj = this.A0A;
        if (A0m[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        A0m[5] = "Xt";
        if (c0957Mj == null || this.A0A.A0J() == null) {
            return 0;
        }
        return this.A0A.A0J().A09();
    }

    public static Drawable A05(C1900k1 c1900k1, Bitmap bitmap, boolean z10, String str) {
        BitmapDrawable A00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c1900k1.getResources(), bitmap);
        if (!z10 || (A00 = AbstractC0829Hk.A00(c1900k1, str)) == null) {
            return bitmapDrawable;
        }
        Drawable iconViewDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, A00});
        return iconViewDrawable;
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws C0661Ah {
        EnumC0664Al A00 = C0668Aq.A00(str2);
        if (A00 != null) {
            EnumC0664Al template = EnumC0664Al.A05;
            if (A00 == template) {
                return new NativeBannerAd(context, str);
            }
            EnumC0664Al template2 = EnumC0664Al.A06;
            if (A00 == template2) {
                return new NativeAd(context, str);
            }
            throw new C0661Ah(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(34, 34, 117), A00));
        }
        throw new C0661Ah(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(106, 50, 47), str2));
    }

    private final C2076mv A0C() {
        C2076mv c2076mv = this.A0a;
        if (c2076mv != null && c2076mv.A0R()) {
            return c2076mv;
        }
        return null;
    }

    private C2063mi A0F() {
        return A0G(false);
    }

    private C2063mi A0G(boolean z10) {
        if (this.A0a != null) {
            C2076mv c2076mv = this.A0a;
            if (A0m[3].charAt(5) == 'B') {
                String[] strArr = A0m;
                strArr[0] = "rkQiEYXoMEhriwkmxTS9YqbekXjRctvV";
                strArr[4] = "aQIgqL6bCxVEsMgFZvYj1f08oAvgjHgO";
                if (c2076mv.A0R()) {
                    if (z10) {
                        C2076mv c2076mv2 = this.A0a;
                        if (A0m[3].charAt(5) == 'B') {
                            A0m[3] = "EWl26Bqfon8mX0lHHC6z05409Pwx5AXq";
                            c2076mv2.A0I();
                        }
                    }
                    return this.A0a.A0E();
                }
            }
            throw new RuntimeException();
        }
        return new C2063mi();
    }

    public static C1818ih A0K() {
        return new C1818ih();
    }

    public static C1816ie A0L(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (C1816ie) ((C6Z) Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (C1816ie) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A0M */
    public final AU getAdChoicesIcon() {
        return A0F().A0D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A0O */
    public final AV getAdStarRating() {
        return A0F().A0G();
    }

    private AdPlacementType A0R() {
        if (this.A0J == EnumC0664Al.A06) {
            return AdPlacementType.NATIVE;
        }
        return AdPlacementType.NATIVE_BANNER;
    }

    private void A0a() {
        for (View view : this.A0i) {
            view.setOnClickListener(null);
            if (A0m[3].charAt(5) != 'B') {
                throw new RuntimeException();
            }
            A0m[3] = "reBfvBMaH6BqwlxZ2WqAQZq3knZpIvyz";
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0i.clear();
    }

    private void A0b() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            C2.A0M(new C2(), this.A0c, C5.A00(getAdChoicesLinkUrl()), A1C());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        this.A0f.A05();
        this.A0e.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d() {
        if (this.A0Q != null) {
            this.A0Q.A0V();
            this.A0c.A0F().ABu();
            this.A0Q = null;
        }
    }

    public static void A0f(Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (A0m[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        String[] strArr = A0m;
        strArr[6] = "LXDT52DRzEPuIKBbeK5QN38hLQjcy";
        strArr[1] = "Z1aNossC2MxjaxQyIIrn4vHalGw3J";
        imageView.setBackground(null);
    }

    private void A0h(FrameLayout frameLayout, String str) {
        if (this.A0N != null) {
            frameLayout.removeView(this.A0N);
        }
        this.A0N = AbstractC0829Hk.A01(C05686p.A03(this.A0c), str);
        if (this.A0N != null) {
            frameLayout.addView(this.A0N, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0N);
        }
    }

    private void A0i(C2076mv c2076mv, boolean z10) {
        if (c2076mv == null) {
            return;
        }
        boolean equals = this.A0E.equals(AQ.A04);
        String A0W = A0W(595, 6, 7);
        if (equals) {
            C2063mi A0E = c2076mv.A0E();
            String clientToken = c2076mv.A7E();
            if (!TextUtils.isEmpty(clientToken)) {
                this.A0b.A0d(new AF(clientToken, this.A0c.A0A()));
            }
            AU A0F = A0E.A0F();
            String[] strArr = A0m;
            if (strArr[2].charAt(3) == strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            A0m[3] = "olK6BBrMvSH2F6L4J2jXYHYWLLMocGr7";
            if (A0F != null) {
                C05967r c05967r = new C05967r(A0E.A0F().getUrl(), A0E.A0F().getHeight(), A0E.A0F().getWidth(), c2076mv.A0G(), A0W(595, 6, 7));
                c05967r.A00 = this.A0C;
                this.A0b.A0V();
                this.A0b.A0b(c05967r);
            }
            if (!this.A0J.equals(EnumC0664Al.A05)) {
                if (A0E.A0E() != null) {
                    this.A0b.A0b(new C05967r(A0E.A0E().getUrl(), A0E.A0E().getHeight(), A0E.A0E().getWidth(), c2076mv.A0G(), A0W(595, 6, 7)));
                }
                if (c2076mv.A0H() != null) {
                    for (C1816ie c1816ie : c2076mv.A0H()) {
                        if (c1816ie.getAdCoverImage() != null) {
                            this.A0b.A0b(new C05967r(c1816ie.getAdCoverImage().getUrl(), c1816ie.getAdCoverImage().getHeight(), c1816ie.getAdCoverImage().getWidth(), c2076mv.A0G(), A0W(595, 6, 7)));
                        }
                    }
                }
                String A0b = A0E.A0b();
                if (!TextUtils.isEmpty(A0b)) {
                    this.A0b.A0a(new C05947p(A0b, c2076mv.A0G(), A0W(595, 6, 7), A0E.A0A()));
                }
            }
            AbstractC2058md A0C = A0E.A0C();
            if (A0C != null && A0C.A1F()) {
                C05947p c05947p = new C05947p(A0C.A0f(), A0C.A0r(), A0W);
                c05947p.A04 = true;
                c05947p.A03 = A0W(0, 5, 66);
                this.A0b.A0X(c05947p);
            }
        }
        this.A0b.A0W(new C1822il(this, c2076mv, z10), new C05917m(c2076mv.A0G(), A0W));
    }

    private void A0j(C2I c2i) {
        if (this.A0a == null) {
            return;
        }
        this.A0a.A0K(c2i);
    }

    public static void A0k(NativeAdImageApi nativeAdImageApi, ImageView imageView, C1900k1 c1900k1) {
        if (nativeAdImageApi != null && imageView != null) {
            new AsyncTaskC1695gc(imageView, c1900k1).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0n(InterfaceC1815id interfaceC1815id) {
        this.A0G = interfaceC1815id;
    }

    private final void A0o(String str) {
        this.A0S = str;
    }

    private void A0p(List<View> list, View view) {
        if (this.A0d != null && this.A0d.AJ3(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                A0p(list, viewGroup.getChildAt(i10));
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A19() == AZ.A05 || A19() == AZ.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0r() {
        return A0F().A0e();
    }

    public final long A0y() {
        return this.A00;
    }

    public final C2076mv A0z() {
        return this.A0a;
    }

    public final AbstractC2058md A10() {
        return A0F().A0C();
    }

    public final C05987t A11() {
        return this.A0b;
    }

    public final C1900k1 A12() {
        return this.A0c;
    }

    public final View$OnClickListenerC1817ig A13() {
        return this.A0F;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A14 */
    public final AU getAdCoverImage() {
        return A0F().A0E();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A15 */
    public final AU getAdIcon() {
        return A0F().A0F();
    }

    public final InterfaceC1815id A16() {
        return this.A0G;
    }

    public final AW A17() {
        return this.A0H;
    }

    public final AX A18() {
        return this.A0I;
    }

    public final AZ A19() {
        return A0F().A0H();
    }

    public final C0710Cv A1A() {
        return this.A0f;
    }

    public final JL A1B() {
        return this.A0R;
    }

    public final String A1C() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A7E();
    }

    public final String A1D() {
        return this.A0T;
    }

    public final String A1E() {
        return A0G(true).A0N();
    }

    public final String A1F() {
        return A0G(true).A0O();
    }

    public final String A1G() {
        return A0F().A0a();
    }

    public final String A1H() {
        if (this.A0a == null || TextUtils.isEmpty(this.A0a.A0E().A0b())) {
            return null;
        }
        return this.A0b.A0S(this.A0a.A0E().A0b());
    }

    public final List<C1816ie> A1I() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A0H();
    }

    public final void A1J() {
        if (!AbstractC04853h.A00(this.A0c.A02()).A0O(this.A0c, false)) {
            A0b();
            if (A0m[5].length() == 3) {
                throw new RuntimeException();
            }
            A0m[3] = "yREZ0BSYt8CSunaR9f1myx0zIAs3a5bO";
            return;
        }
        EH A01 = EI.A01(this.A0c, this.A0c.A0A(), A1C(), this.A07);
        if (A01 == null) {
            A0b();
            return;
        }
        ((C1929kU) this.A07.getNativeAdLayoutApi()).A03(A01);
        A01.A0K();
    }

    public final void A1K(Drawable drawable) {
        this.A01 = drawable;
        A1f(drawable != null, true);
    }

    public final void A1L(View view) {
        this.A0i.add(view);
        view.setOnClickListener(this.A0F);
        view.setOnTouchListener(this.A0F);
        if (C06419m.A1A(view.getContext())) {
            view.setOnLongClickListener(this.A0F);
        }
    }

    public final void A1M(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, imageView, arrayList, true);
    }

    public final void A1N(View view, ImageView imageView, List<View> clickableViews) {
        A0g(view, imageView, clickableViews, true);
    }

    public final void A1O(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, adNativeComponentView, arrayList, false);
    }

    public final void A1P(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews) {
        A0g(view, adNativeComponentView, clickableViews, false);
    }

    public final void A1Q(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews, boolean z10) {
        A0g(view, adNativeComponentView, clickableViews, z10);
    }

    public final void A1R(View view, AdNativeComponentView adNativeComponentView, boolean z10) {
        List<View> clickableViews = new ArrayList<>();
        A0p(clickableViews, view);
        A0g(view, adNativeComponentView, clickableViews, z10);
    }

    public final void A1S(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Y = true;
        }
    }

    public final void A1T(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Z = true;
        }
    }

    public final void A1U(NativeAdBase nativeAdBase, NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0n(new M0(nativeAdListener, nativeAdBase));
    }

    public final void A1V(NativeAdLayout nativeAdLayout) {
        this.A07 = nativeAdLayout;
    }

    public final void A1W(C2076mv c2076mv) {
        A0i(c2076mv, true);
        if (this.A0G != null && c2076mv.A0H() != null) {
            C1824in c1824in = new C1824in(this);
            for (C1816ie c1816ie : c2076mv.A0H()) {
                if (A0m[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0m;
                strArr[0] = "7JUEXy8BV6wMe69mvRG8Hisl1h58kfsH";
                strArr[4] = "Ag7M0cktqfZPxcWhbEyn8XCMGlxm5ALn";
                c1816ie.A0j(c1824in);
            }
        }
    }

    public final void A1X(C1946kl c1946kl) {
        this.A0U = new WeakReference<>(c1946kl);
    }

    public final void A1Y(AQ aq, String str, C7z c7z) {
        if (str == null) {
            this.A0c.A0F().A3G();
        } else {
            this.A0c.A0F().A3F();
        }
        this.A00 = System.currentTimeMillis();
        boolean z10 = this.A0j;
        String[] strArr = A0m;
        if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
            String[] strArr2 = A0m;
            strArr2[0] = "knecuAJjZigTf7VsFCGhTGCW7dxKplKn";
            strArr2[4] = "uRrNlLGUJL1gxvEKewtOLFu1Ztix0dl1";
            if (z10) {
                AdSettings.IntegrationErrorMode A00 = C3A.A00(this.A0c);
                String A0W = A0W(565, 30, 105);
                AdSettings.IntegrationErrorMode integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
                if (!integrationErrorMode.equals(A00)) {
                    C0660Ag c0660Ag = new C0660Ag(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(565, 30, 105));
                    A12().A0F().A3D(C0709Cu.A01(this.A00), c0660Ag.A03().getErrorCode(), c0660Ag.A04());
                    if (this.A0G != null) {
                        this.A0G.AD4(c0660Ag);
                    } else {
                        Log.e(A0W(68, 17, 54), A0W);
                    }
                    C06058b c06058b = new C06058b(A0W);
                    A12().A08().AAu(A0W(542, 3, 93), AbstractC06048a.A0c, c06058b);
                } else {
                    throw new C3F(A0W);
                }
            }
            this.A0j = true;
            this.A0E = aq;
            if (aq.equals(AQ.A05)) {
                C2G c2g = C2G.A05;
                if (A0m[3].charAt(5) == 'B') {
                    A0m[3] = "N11XMBa1eBkGGouoRChlRsXEwEtHvHDZ";
                    this.A08 = c2g;
                }
            }
            this.A0C = c7z;
            AnonymousClass37 anonymousClass37 = new AnonymousClass37(this.A0g, this.A0J, A0R(), null, 1, new C2023m4());
            anonymousClass37.A05(aq);
            anonymousClass37.A06(this.A0S);
            anonymousClass37.A07(this.A0T);
            this.A0A = new C0957Mj(this.A0c, anonymousClass37);
            this.A0A.A0S(new C1825io(this));
            this.A0A.A0W(str);
            return;
        }
        throw new RuntimeException();
    }

    public final void A1Z(AW aw) {
        this.A0H = aw;
    }

    public final void A1a(AX ax) {
        this.A0I = ax;
    }

    public final void A1b(EnumC0664Al enumC0664Al) {
        if (!A0r()) {
            if (EnumC0664Al.A05.equals(enumC0664Al)) {
                this.A0c.A0F().A3J(AdPlacementType.NATIVE_BANNER.toString(), this.A0g);
            } else {
                this.A0c.A0F().A3J(AdPlacementType.NATIVE.toString(), this.A0g);
            }
        }
        this.A0J = enumC0664Al;
    }

    public final void A1c(JK jk) {
        this.A0V = new WeakReference<>(jk);
    }

    public final void A1d(boolean z10) {
        this.A0W = z10;
    }

    public final void A1e(boolean z10) {
        this.A0X = z10;
    }

    public final void A1f(boolean z10, boolean z11) {
        String A0W;
        if (z10) {
            if (this.A0E.equals(AQ.A05)) {
                boolean A0r = A0r();
                if (A0m[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0m;
                strArr[6] = "maLBxQjysuwmJ75m3YPaJDHU5JlBu";
                strArr[1] = "hXXEi4DazsshJWFEyRiAh7tUxgC1d";
                if (!A0r && this.A0G != null) {
                    this.A0G.AE5();
                }
            }
            if (this.A0R != null) {
                this.A0R.A0U();
                this.A0e.A09();
                return;
            }
            return;
        }
        if (this.A0R != null) {
            C2076mv adapter = A0z();
            if (adapter != null) {
                A0W = adapter.A0G();
            } else if (A0m[5].length() != 3) {
                String[] strArr2 = A0m;
                strArr2[2] = "2ETmOz1YodPf8MKRGGB9YcIoy7FDTpAq";
                strArr2[7] = "k5VZ8yDbY0Zqj8FxkeEerY08JJe7M6tR";
                A0W = A0W(0, 0, 121);
            } else {
                String[] strArr3 = A0m;
                strArr3[0] = "JjUCnZOckAfeDcKZajvIf0dyi7sruRRg";
                strArr3[4] = "GlO3j5qd4HFQ8L5mPWBpkp3onxgG8Q98";
                A0W = A0W(0, 0, 121);
            }
            this.A0e.A0C(this.A0c, A0W);
            this.A0R.A0V();
        }
        if (this.A0G != null && z11) {
            C0660Ag A01 = C0660Ag.A01(AdErrorType.BROKEN_MEDIA_ERROR, A0W(85, 21, 41));
            A12().A0F().A3D(C0709Cu.A01(this.A00), A01.A03().getErrorCode(), A01.A04());
            this.A0G.AD4(A01);
        }
    }

    public final boolean A1g() {
        return this.A07 == null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Ac
    public final int A7T() {
        View view = this.A06;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof IM) {
                return ((IM) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new C0655Aa(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        AbstractC0669Au.A05(A0W(552, 7, 95), A0W(355, 19, 101), A0W(545, 7, 101));
        if (C06419m.A1s(this.A0c)) {
            A12().A0B().AJZ(this.A03);
        }
        if (!A0r()) {
            this.A0c.A0F().A3K();
        }
        if (this.A0A != null) {
            this.A0A.A0Y(true);
            this.A0A.A0K();
            this.A0A = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0E.equals(AQ.A05)) {
            this.A08 = C2G.A04;
        }
        this.A0E = AQ.A04;
        A0i(this.A0a, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdBodyText() {
        return A0G(true).A0I();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdCallToAction() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        return getAdChoicesIcon().getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesLinkUrl() {
        return A0F().A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesText() {
        return A0F().A0K();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdHeadline() {
        return A0G(true).A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdLinkDescription() {
        return A0G(true).A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdSocialContext() {
        return A0G(true).A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdTranslation() {
        return A0G(true).A0T();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdUntrimmedBodyText() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdvertiserName() {
        return A0G(true).A0V();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        AU nativeAdImage;
        if (this.A0a == null || (nativeAdImage = this.A0a.A0E().A0E()) == null) {
            return 0.0f;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        if (height > 0) {
            float f10 = width;
            float f11 = height;
            String[] strArr = A0m;
            if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                A0m[3] = "OUTl4BjdLTzCi4kmpI6eA9pKBM08eKMp";
                return f10 / f11;
            }
            throw new RuntimeException();
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0h;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0g;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final Drawable getPreloadedIconViewDrawable() {
        AU A0F;
        Bitmap A0M;
        C2076mv adapter = this.A0a;
        if (adapter != null && (A0F = A0F().A0F()) != null && (A0M = this.A0b.A0M(A0F.getUrl())) != null) {
            return A05(A12(), A0M, A1g(), A1D());
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getPromotedTranslation() {
        return A0G(true).A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getSponsoredTranslation() {
        return A0G(true).A0R();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        return this.A0a != null && this.A0a.A0Q();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z10 = true;
        if (this.A0A != null) {
            C0957Mj c0957Mj = this.A0A;
            String[] strArr = A0m;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[2] = "gqyuy6F7WThaJUOfAsIyr4sziGGBhw0f";
            strArr2[7] = "L6lbko7Rv34huPFym8TvMBezY1vQkdWf";
            z10 = c0957Mj.A0Z();
        } else if (this.A0B != null) {
            z10 = this.A0B.A0A();
        }
        this.A0c.A0F().A5V(z10);
        return z10;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        return this.A0a != null && this.A0a.A0R();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        AbstractC0669Au.A05(A0W(559, 6, 117), A0W(374, 24, 11), A0W(13, 8, 68));
        A1Y(AQ.A00(NativeAdBase.MediaCacheFlag.ALL), null, new C7z(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        AbstractC0669Au.A05(A0W(559, 6, 117), A0W(374, 24, 11), A0W(5, 8, 76));
        ((C0655Aa) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        if (this.A05 != null) {
            this.A05.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A04 != null) {
            this.A04.post(new C1826ip(this));
        }
        String str = A0W(156, 16, 58) + AbstractC0700Cl.A03(this.A0c, th);
        A12().A0F().A3D(C0709Cu.A01(this.A00), 2001, str);
        if (this.A0G != null) {
            this.A0G.AD4(new C0660Ag(2001, str));
        }
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0o(extraHints.getHints());
        this.A0T = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void unregisterView() {
        C0830Hl c0830Hl = this.A0N;
        if (c0830Hl != null) {
            ViewParent parent = c0830Hl.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c0830Hl);
            }
            this.A0N = null;
        }
        if (this.A04 == null || this.A06 == null) {
            return;
        }
        if (!A0r()) {
            InterfaceC04311f A0F = this.A0c.A0F();
            String[] strArr = A0m;
            if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                A0m[3] = "w9n8TBisrss8zAM8EiwpgeUnlq2PaQ6F";
                A0F.unregisterView();
            }
            throw new RuntimeException();
        }
        if (C06419m.A1s(this.A0c)) {
            A12().A0B().AJZ(this.A03);
        }
        if (A0o.containsKey(this.A04) && A0o.get(this.A04).get() == this) {
            View view = this.A04;
            String[] strArr2 = A0m;
            if (strArr2[2].charAt(3) != strArr2[7].charAt(3)) {
                String[] strArr3 = A0m;
                strArr3[6] = "1kkuB6xtwDeF3EtU3aavEsH64nQcK";
                strArr3[1] = "rb6NM7K87kMKFcLdVL5rugEXgDuZd";
                if ((view instanceof ViewGroup) && this.A0K != null) {
                    ((ViewGroup) this.A04).removeView(this.A0K);
                    this.A0K = null;
                }
                if (this.A0a != null) {
                    this.A0a.A0J();
                }
                if (this.A0L != null && C06419m.A1A(this.A0c)) {
                    this.A0L.A07();
                    View view2 = this.A04;
                    String[] strArr4 = A0m;
                    if (strArr4[2].charAt(3) == strArr4[7].charAt(3)) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A0m;
                    strArr5[0] = "4gE9LeNlQroHqEeWf1EzJsbNX9PRfDme";
                    strArr5[4] = "TBDkrxJbHtSaZ13hkNs0RNY8SzE0jpKy";
                    view2.getOverlay().remove(this.A0L);
                }
                A0o.remove(this.A04);
                A0a();
                this.A04 = null;
                this.A06 = null;
                if (this.A0R != null) {
                    this.A0R.A0V();
                    this.A0R = null;
                }
                A0d();
                this.A09 = null;
                return;
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException(A0W(473, 38, 36));
    }
}
