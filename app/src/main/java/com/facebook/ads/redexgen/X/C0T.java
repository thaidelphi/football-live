package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations;
import com.google.android.exoplayer2.ColorInfo;
import com.google.android.exoplayer2.video.DummySurface;
import com.ironsource.j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.0T */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0T extends AnonymousClass10 {
    public static boolean A0y;
    public static boolean A0z;
    public static byte[] A10;
    public static String[] A11 = {"v9JW9d6mC4vVOXkKiuoPSKLjDHsuSFtl", "gIeHAk6WOzq2Y5rDB1esWl6sHVKNasBe", "EXXUcYdUXUj0vKHwdmCt8An0AEm5LNUx", "3czcsYB4y2EByKzz5ZqHef8RpAiR40Nr", "fs5EyusZMzPeANn58", "Vmk2kqnLGS8cuaCfxBf7qdhnj23D1lK8", "wawdFFlTZY47ktG", "L98TU6fXHJGhXusLAmdJJvi5hEKm1qt"};
    public static final int[] A12;
    public C1019Ox A00;
    public float A01;
    public float A02;
    public float A03;
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
    public int A0G;
    public int A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public long A0P;
    public long A0Q;
    public long A0R;
    public MediaFormat A0S;
    public Surface A0T;
    public Surface A0U;
    public Y2 A0V;
    public C1685gS A0W;
    public InterfaceC1701gi A0X;
    public Object A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public final int A0k;
    public final int A0l;
    public final int A0m;
    public final int A0n;
    public final long A0o;
    public final Context A0p;
    public final C1687gU A0q;
    public final C1706gn A0r;
    public final C1709gq A0s;
    public final C1726h7 A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final long[] A0w;
    public final long[] A0x;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Point A07(Z2 z22, ZM zm) throws ZW {
        int[] iArr;
        boolean z10 = zm.A0A > zm.A0L;
        int i10 = z10 ? zm.A0A : zm.A0L;
        int i11 = z10 ? zm.A0L : zm.A0A;
        float f10 = i11 / i10;
        for (int i12 : A12) {
            int i13 = (int) (i12 * f10);
            if (i12 <= i10 || i13 <= i11) {
                return null;
            }
            if (AbstractC1672gE.A02 >= 21) {
                int i14 = z10 ? i13 : i12;
                if (!z10) {
                    i12 = i13;
                }
                Point A0N = z22.A0N(i14, i12);
                if (A11[1].charAt(9) != 'z') {
                    throw new RuntimeException();
                }
                String[] strArr = A11;
                strArr[6] = "eVrgFLGLScT3SQl";
                strArr[4] = "YUCpxf7mgZXJgqA9S";
                if (z22.A0R(A0N.x, A0N.y, zm.A01)) {
                    return A0N;
                }
            } else {
                int A05 = AbstractC1672gE.A05(i12, 16) * 16;
                int A052 = AbstractC1672gE.A05(i13, 16) * 16;
                if (A05 * A052 <= ZZ.A00()) {
                    int i15 = z10 ? A052 : A05;
                    if (!z10) {
                        A05 = A052;
                    }
                    return new Point(i15, A05);
                }
            }
        }
        return null;
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A10, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            String[] strArr = A11;
            if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
                throw new RuntimeException();
            }
            A11[1] = "mXsQu48WzzV6yd0DLsnHesgPlryuTOfM";
            copyOfRange[i13] = (byte) ((b10 - i12) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A10 = new byte[]{-69, -64, -70, -69, 100, 106, 100, 102, -73, -67, -73, -70, -82, -98, -99, -102, -92, -99, -77, 125, 109, 108, 105, 115, 108, -120, 113, 97, 102, 96, 97, 113, 98, 96, 97, 102, -111, 100, 96, -106, -116, -123, -123, -123, -126, -74, -81, -91, -98, -98, -98, -34, -38, -29, -31, -122, 124, 117, 118, 117, -90, 121, 125, 124, 114, 107, 109, 107, -100, 111, 115, -57, -52, -38, -57, -37, -32, -18, -24, -120, -102, -100, -102, -90, -97, 119, 119, -120, -117, -87, -69, -67, -69, -57, -64, -104, -104, -87, -84, -87, -80, -62, -60, -62, -50, -57, -97, -97, -80, -77, -78, -100, -82, -80, -82, -70, -77, -117, -117, -100, -97, -70, -115, 119, -92, -102, -88, -91, -93, -105, -82, 86, 119, 104, 108, 121, 106, 126, -62, -14, -10, -30, -47, -16, -8, -26, -13, -50, -59, -9, -7, -9, -29, -34, -58, -71, -76, -76, -49, -48, -113, -61, -64, -81, -83, -100, -67, -62, -77, -83, Byte.MIN_VALUE, -85, -75, -86, -84, -76, -106, -102, -63, -43, -27, -44, -23, -36, -44, -77, -57, -34, -77, -59, -61, -60, -56, -84, -68, -85, -64, -77, -85, -55, -85, -66, -64, -100, -92, -76, -93, -72, -85, -93, -63, -93, -74, -72, -107, -63, -106, -83, -119, 119, 118, -125, 107, 105, 106, 105, -110, 124, 99, 101, -91, -78, -86, -109, -104, -110, -101, -62, -49, -40, -73, -78, -34, -56, -81, -81, -65, -21, -32, -31, -33, -100, -23, -35, -12, -100, -18, -31, -17, -21, -24, -15, -16, -27, -21, -22, -100, -35, -32, -26, -15, -17, -16, -31, -32, -100, -16, -21, -74, -100, -39, 5, 3, -1, 5, -23, -57, -79, -95, -94, -96, -97, 115, 122, -125, 117, 111, -115, 111, 97, -115, 126, -96, -99, -116, -109, -100, -114, -120, -90, -107, -74, -69, -84, 116, 123, -124, 118, 112, -114, Byte.MAX_VALUE, -95, -104, -100, -118, -111, -102, -116, -122, -92, -105, -90, -66, -92, -99, -77, -28, -45, -32, -63, -30, -49, -32, -51, -63, -83, -102, -104, -104, -104, -111, 126, 124, 124, 126, -87, -106, -108, -108, -103, -61, -80, -81, -82, -82, -69, -88, -89, -90, -88, -101, -120, -121, -122, -118, -105, -124, -124, -126, -126, 101, Byte.MIN_VALUE, -117, -110, -124, 98, -121, -124, -126, -118, 63, 122, -117, -124, -122, Byte.MIN_VALUE, -126, -104, 101, -111, Byte.MIN_VALUE, -116, -124, 114, -120, -103, -124, 75, 63, -122, -120, -114, -115, -124, -124, -98, -122, -127, -117, 118, 114, 117, 111, -87, -85, -79, -80, -89, -89, -63, -75, -71, -71, -109, -104, -110, -101, -103, -101, -95, -96, -105, -105, -79, -91, -87, -87, -125, -120, -124, -119, -29, -27, -21, -22, -31, -31, -5, -17, -13, -13, -51, -46, -49, -51, -79, -77, -71, -72, -81, -81, -55, -63, -84, -74, -97, -95, -102, -94, 111, 113, 119, 118, 109, 109, -121, Byte.MAX_VALUE, 106, 116, 95, 91, 94, 93, 101, 103, 109, 108, 99, 99, 125, 117, 96, 106, 85, 83, 79, 87, -116, -82, -108, -109, -118, -118, -92, -120, -121, -111, 124, 122, 118, 120, -38, -4, -30, -31, -40, -40, -14, -38, -43, -33, -54, -58, -60, -52, -123, -110, 126, -108, -126, -122, 93, -117, -107, -111, 106, -119, 111, 118, -44, -29, -50, -40, -38, -71, -44, -85, -70, -90, -92, -80, -112, -85, -101, -86, -104, -96, -97, -74, -59, -60, -68, -63, -101, -74, -60, -45, -45, -67, -49, -87, -60, 122, -97, -105, -102, -97, -102, -87, 94, -119, 102, 104, 99, 126, 123, -114, -53, -44, -49, -82, -51, -77, -78, -34, -56, -61, -12, -57, -61, -76, -81, -107, -77, -100, -101, -104, -47, -52, -78, -46, -73, -70, -75, -30, -23, -61, -53, -58, -57, -51, -78, -53, -44, -43, -36, -43, -122, -89, -104, -106, -105, -100, -56, -103, -106, 124, -107, -98, -97, -90, -97, 80, 123, 97, 96, -111, 100, 96, -55, -30, -21, -20, -13, -20, -99, -56, -75, 115, 91, -119, -47, -55, -51, -34, -39, -29, -47, -71, -80, -69, -103, -102, -78, -79, -74, -82, -112, -68, -79, -78, -80, -93, -74, -79, -78, -68, -97, -78, -69, -79, -78, -65, -78, -65, 118, -104, -99, -104, 110, 91, 81, 93, 112, 86, 117, 125, 110, 82, 110, -112, -107, -112, 104, 84, -92, -84, -97, -102, -97, -105, -54, -44, -79, -80, -83, -58, -125, -115, 106, 108, 104, Byte.MAX_VALUE, -115, -117, -106, 108, -91, -83, -83, -91, -86, -93, -38, -7, -16, -37, -9, 0, -2, -64, -33, -127, 103, 105, 98, -103, -127, 126, -27, -41, -57, -62, -53, -52, -59, -30, 122, 113, 120, 95, 92, 98, -21, -30, -23, -47, -52, -53, -122, 125, -124, 108, 103, 103, -119, -123, 126, -63, -61, -64, -88, -60, -126, -102, -109, -96, -90, -95, -97, 104, -38, -13, 2, -17, -10, -86, -21, 4, 19, 4, -49, -56, -46, -6, -50, -30, 122, -109, -94, -109, 95, 87, 91, 90, -119, 94, 113, -65, -95, -93, -98, -28, -57, -59, -55, -61, -26, -55, -57, -52, -118, 109, 108, 106, 105, -67, -95, -91, -95, -123, -118, -84, -103, -77, -87, -99, -92, 125, -31, -12, -13, -4, -8, -81, -61, -25, -114, -95, -96, -87, -91, 92, -118, -85, -80, -95, 92, 110, -33, -14, -15, -6, -10, -83, -37, -4, 1, -14, -83, -64, -99, -80, -71, -81, -80, -67, 107, -70, -64, -65, -69, -64, -65, 107, -79, -84, -76, -73, -80, -81, -79, -60, -46, -50, -53, -44, -45, -56, -50, -51, -46, Byte.MAX_VALUE, -44, -51, -54, -51, -50, -42, -51, -115, Byte.MAX_VALUE, -94, -50, -61, -60, -62, Byte.MAX_VALUE, -52, -64, -41, Byte.MAX_VALUE, -47, -60, -46, -50, -53, -44, -45, -56, -50, -51, -103, Byte.MAX_VALUE, -98, -104, 120, -110, -124, 126, Byte.MIN_VALUE, 123, -92, -98, 126, -101, -125, -127, -127, -104, -90, -31, -37, -69, -40, -64, -66, -66, -37, -59, -65, -97, -64, -85, -93, -94, -60, -90, -64, -62, 
        -76, -82, -65, -115, -64, -90, -52, -49, -55, -90, -67, -51, -49, -86, -82, 120, -111, -122, -103, -118, -124, 117, -105, -108, -106, -78, -79, -68, 99, -105, -92, -91, -81, -88, -73, 99, -106, -23, -41, -56, -62, -52, -56, -59, -37, -43, -61, -76, -82, -72, -76, -79, -39, 125, 107, 92, 86, 97, 94, 89, 111, -38, -56, -71, -77, -66, -69, -74, -45, -84, -57, -57, 120, -59, -71, -58, -47, 120, -53, -52, -54, -67, -71, -59, 120, -69, -64, -71, -58, -65, -67, -53, -124, 120, -53, -57, 120, -68, -54, -57, -56, -56, -63, -58, -65, 120, -57, -66, -66, -53, -67, -52, -110, 120, -44, -81, -36, -72, -71, -51, -56, 122, 89, -25, -28, -55, -55, -63, -36, -73, -29, -52, -49, -32, -51, -70, -32, -26, -30, -65, -60, -60, -63, -28, -69, -68, -23, -38, -36, -39, -71, -105, -113, 125, -121, 74, -123, Byte.MAX_VALUE, -109, -126, -121, -115, 75, -111, -125, -111, -111, -121, -115, -116, 75, -121, -126, -19, 1, 0, -5, -71, -14, -2, -17, -44, -93, -97, -46, -33, -43, -29, -32, -38, -43, -97, -46, -25, -94, -98, -43, -46, -25, -94, -43, -97, -43, -42, -44, -32, -43, -42, -29, -120, -105, -108, -107, 82, -121, -108, -103, -103, -108, -110, -117, -102, -105, -104, 85, -108, -115, -114, -100, -65, -50, -53, -52, -119, -50, -59, -61, -60, -48, -66, -51, -54, -53, -120, -49, -54, -53, -33, -14, -83, -43, -24, -91, -118, -121, -108, -115, -121, -110, -55, -54, -57, -34, -20, -23, -22, -48, -29, -34, -33, -23, -68, -17, -32, -32, -33, -20, -95, -89, -86, -119, -110, -106, -105, -120, -107, -20, -8, -25, -13, -21, -77, -8, -25, -6, -21, -28, -13, -27, -13, -107, -96, -105, -108, -108, -105, -100, -104, -107, -103, -105, -104, -92, -107, -95, -112, -116, -110, 98, 99, -102, -103, -116, -111, -95, -94, -103, -80, -65, -119, -108, -115, 117, -112, -89, 119, 110, 113, 111, -66, -73, -74, -63, -63, -115, -116, -120, -118, -76, -114, -115, -123, -117, -68, -59, -68, -58, -119, -125, -101, -90, -105, -98, -111, -123, 102, 99, -47, -103, -33, -45, -37, -52, -48, -43, -38, -8, -18, 1, -14, -16, -71, -72, -70, -76, -100, -107, -113, -88, 102, -36, -33, -25, -99, -36, -47, -28, -43, -34, -45, -23, 3, -56, -74, 4, 5, 10, -5, -74, -86, -73, -73, -78, -73, -80, -113, -125, -108, -117, -112, -111, -127, -120, -75, -87, -64, 117, -80, -83, -79, -81, -80, -68, -40, -52, -29, -104, -44, -39, -37, -32, -33, -104, -34, -44, -27, -48, -98, -110, -87, 94, -88, -102, -107, -91, -103, -6, -11, -117, -121, -126, -115, -2, -6, -2, -10, -62, -75, -63, -75, -56, -68, -103, -108, -114, -106, -105, -116, -96, -98, -118, -111, -82, 112, 111, 112, -18, -33, -20, -29, -22, -22, -35, -30, -85, -100, -87, -96, -89, -89, -102, -97, -89, -77, -92, -79, -88, -81, -81, -94, -89, -74, -60, -75, -62, -71, -64, -64, -77, -72, -56, -76, -74, -83, -77, -74, -83, -72, -67, -83, -96, -89, -96, -100, -82, -96, -118, -80, -81, -85, -80, -81, 125, -80, -95, -95, -96, -83, -80, -83, -78, -97, -78, -89, -83, -84, 107, -94, -93, -91, -80, -93, -93, -79, -18, -76, -85, -80, -13, -85, -84, -77, -67, -85, -72, -66, -71, -72, -77, -48, -56, -58, -51, -77, -58, -63, -62, -52, -97, -46, -61, -61, -62, -49, -54, -73, -65, -70, -59, -75, -56, -59, -51, -91, -108, -99, -112, -106, -90, -30, -29, -36, -36, -45, -38, -45, -46, -101, -34, -38, -49, -25, -48, -49, -47, -39, -51, -68, -55, -59, -68, -68, -74, -92, -116, -6, -19, -24, -23, -13, -77, -73, -21, -12, -12, 3, -10, -15, -14, -4, -68, -18, 3, -67, -66, -97, -110, -115, -114, -104, 88, -118, -97, -116, 10, -3, -8, -7, 3, -61, -8, 3, 0, -10, 13, -63, 10, -3, 7, -3, 3, 2, -101, -114, -119, -118, -108, 84, -115, -118, -101, -120, -35, -48, -53, -52, -42, -106, -44, -41, -101, -35, -108, -52, -38, 4, -9, -14, -13, -3, -67, 6, -69, 4, -4, -14, -68, -3, -4, -64, -68, 4, -2, -58, -109, -122, -127, -126, -116, 76, -107, 74, -109, -117, -127, 75, -116, -117, 79, 75, -109, -115, 86, -98, -120, -101, -102, -106, -107, -94, -109, -92, -99, -112, -113, -60, -74, -79, -63, -75, -39, -47, -47, -58, -43, -63, -56, 18, 10, 10, -1, 14, -6, 1, 9, -86};
    }

    static {
        A0P();
        A12 = new int[]{1920, IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1440, 1280, 960, 854, 640, 540, 480};
    }

    public C0T(Context context, C0954Mg c0954Mg, C0951Md c0951Md, ZS zs, long j10, TO to, boolean z10, boolean z11, Handler handler, InterfaceC1727h8 interfaceC1727h8, int i10, int i11, int i12, int i13, int i14) {
        super(2, c0954Mg, c0951Md, zs, to, z10, z11, i12, i13);
        this.A0e = true;
        this.A0Z = true;
        boolean z12 = false;
        this.A0f = false;
        this.A0K = -9223372036854775807L;
        this.A0c = false;
        this.A0v = C0962Mq.A03(EnumC0959Mn.A1j);
        this.A0o = j10;
        this.A0k = i10;
        this.A0l = i11;
        this.A0p = context.getApplicationContext();
        this.A0m = i14;
        this.A0s = new C1709gq(context);
        this.A0r = new C1706gn(this.A0p);
        this.A0t = new C1726h7(handler, interfaceC1727h8);
        this.A0q = new C1687gU(this.A0r, this, this.A0v);
        this.A0u = A0i();
        if (AbstractC1672gE.A02 == 29 && AbstractC1672gE.A06.startsWith(A0B(811, 6, 109))) {
            z12 = true;
        }
        this.A0a = z12;
        this.A0w = new long[10];
        this.A0x = new long[10];
        this.A0R = -9223372036854775807L;
        this.A0O = -9223372036854775807L;
        this.A0M = -9223372036854775807L;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0H = 1;
        A0F();
    }

    private int A00(ZM zm) {
        if (zm.A0B != -1) {
            int i10 = 0;
            int i11 = zm.A0X.size();
            for (int initializationDataCount = 0; initializationDataCount < i11; initializationDataCount++) {
                int totalInitializationDataSize = zm.A0X.get(initializationDataCount).length;
                i10 += totalInitializationDataSize;
            }
            int totalInitializationDataSize2 = zm.A0B;
            return totalInitializationDataSize2 + i10;
        }
        int i12 = zm.A0L;
        String str = zm.A0W;
        int width = zm.A0A;
        return A02(str, i12, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00ae, code lost:
        if (r6 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00b0, code lost:
        r5 = new java.lang.StringBuilder();
        r0 = A0B(380, 29, 2);
        r5 = r5.append(r0).append(r7.A0L);
        r0 = A0B(1775, 1, 21);
        r5 = r5.append(r0).append(r7.A0A);
        r0 = A0B(1154, 3, 13);
        r1 = r5.append(r0);
        r0 = com.facebook.ads.redexgen.X.AbstractC1672gE.A04;
        r5 = r1.append(r0);
        r0 = A0B(1153, 1, 3);
        r5 = r5.append(r0).toString();
        r0 = A0B(682, 23, 48);
        com.facebook.ads.redexgen.X.AbstractC1633fb.A04(r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0113, code lost:
        if (r6 == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(com.facebook.ads.redexgen.X.ZS r6, com.facebook.ads.redexgen.X.ZM r7, boolean r8) throws com.facebook.ads.redexgen.X.ZW {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0T.A01(com.facebook.ads.redexgen.X.ZS, com.facebook.ads.redexgen.X.ZM, boolean):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A02(String str, int i10, int i11) {
        char c10;
        int i12;
        int maxPixels;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(A0B(1635, 10, 103))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                if (str.equals(A0B(1682, 10, 8))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1187890754:
                if (str.equals(A0B(1692, 13, 74))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals(A0B(1655, 9, 12))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127256:
                if (str.equals(A0B(1705, 19, 113))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals(A0B(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED, 19, 0))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                i12 = i10 * i11;
                if (A11[5].charAt(17) != 'C') {
                    A11[0] = "XihfVUbotLZDx4xXTlX7dv9JcUprNuKG";
                    maxPixels = 2;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 2:
                if (A0B(179, 14, 118).equals(AbstractC1672gE.A06)) {
                    return -1;
                }
                i12 = AbstractC1672gE.A05(i10, 16) * AbstractC1672gE.A05(i11, 16) * 16 * 16;
                maxPixels = 2;
                break;
            case 3:
                i12 = i10 * i11;
                maxPixels = 2;
                break;
            case 4:
            case 5:
                i12 = i10 * i11;
                maxPixels = 4;
                break;
            default:
                return -1;
        }
        int minCompressionRatio = i12 * 3;
        return minCompressionRatio / (maxPixels * 2);
    }

    public long A03(long j10, long j11, long j12, long j13, boolean z10) {
        double playbackSpeed = A1f();
        long j14 = (long) ((j13 - j10) / playbackSpeed);
        if (z10) {
            return j14 - (j12 - j11);
        }
        return j14;
    }

    @MetaExoPlayerCustomization("D64704257: Adding a new param to control AI FRC")
    private final MediaFormat A08(ZM zm, C1685gS c1685gS, boolean z10, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A0B(1462, 4, 116), zm.A0W);
        mediaFormat.setInteger(A0B(1755, 5, 48), zm.A0L);
        mediaFormat.setInteger(A0B(1307, 6, 19), zm.A0A);
        AbstractC1635fd.A06(mediaFormat, zm.A0X);
        AbstractC1635fd.A03(mediaFormat, A0B(1286, 10, 105), zm.A01);
        AbstractC1635fd.A04(mediaFormat, A0B(1548, 16, 33), zm.A0F);
        AbstractC1635fd.A02(mediaFormat, zm.A0N);
        mediaFormat.setInteger(A0B(1447, 9, 20), c1685gS.A02);
        mediaFormat.setInteger(A0B(1423, 10, 43), c1685gS.A00);
        AbstractC1635fd.A04(mediaFormat, A0B(1433, 14, 78), c1685gS.A01);
        if (AbstractC1672gE.A02 >= 23) {
            mediaFormat.setInteger(A0B(1521, 8, 39), 0);
        }
        if (z10) {
            mediaFormat.setInteger(A0B(1173, 8, 111), 0);
        }
        MJ.A03(this.A11, mediaFormat);
        if (i10 != 0) {
            A0T(mediaFormat, i10);
        }
        return mediaFormat;
    }

    private final C1685gS A0A(Z2 z22, ZM zm, ZM[] zmArr) throws ZW {
        int maxWidth;
        int i10 = zm.A0L;
        int i11 = zm.A0A;
        int A00 = A00(zm);
        int maxHeight = zmArr.length;
        if (maxHeight == 1) {
            return new C1685gS(i10, i11, A00);
        }
        int i12 = 0;
        for (ZM streamFormat : zmArr) {
            boolean z10 = z22.A04;
            int maxHeight2 = A11[1].charAt(9);
            if (maxHeight2 != 122) {
                throw new RuntimeException();
            }
            A11[1] = "hFYniT29tzMfk4zkiR5Pben0nLKkZMmz";
            if (A0v(z10, zm, streamFormat)) {
                int maxWidth2 = streamFormat.A0L;
                if (maxWidth2 != -1) {
                    int maxWidth3 = streamFormat.A0A;
                    if (maxWidth3 != -1) {
                        maxWidth = 0;
                        i12 |= maxWidth;
                        int maxWidth4 = streamFormat.A0L;
                        i10 = Math.max(i10, maxWidth4);
                        int maxWidth5 = streamFormat.A0A;
                        i11 = Math.max(i11, maxWidth5);
                        int maxWidth6 = A00(streamFormat);
                        A00 = Math.max(A00, maxWidth6);
                    }
                }
                maxWidth = 1;
                i12 |= maxWidth;
                int maxWidth42 = streamFormat.A0L;
                i10 = Math.max(i10, maxWidth42);
                int maxWidth52 = streamFormat.A0A;
                i11 = Math.max(i11, maxWidth52);
                int maxWidth62 = A00(streamFormat);
                A00 = Math.max(A00, maxWidth62);
            }
        }
        if (i12 != 0) {
            StringBuilder append = new StringBuilder().append(A0B(921, 43, 66)).append(i10);
            String A0B = A0B(1775, 1, 21);
            String sb = append.append(A0B).append(i11).toString();
            String A0B2 = A0B(682, 23, 48);
            AbstractC1633fb.A07(A0B2, sb);
            Point A07 = A07(z22, zm);
            if (A07 != null) {
                int maxWidth7 = A07.x;
                i10 = Math.max(i10, maxWidth7);
                int maxWidth8 = A07.y;
                i11 = Math.max(i11, maxWidth8);
                int maxWidth9 = A02(zm.A0W, i10, i11);
                A00 = Math.max(A00, maxWidth9);
                AbstractC1633fb.A07(A0B2, A0B(246, 34, 95) + i10 + A0B + i11);
            }
        }
        return new C1685gS(i10, i11, A00);
    }

    public static List<Z2> A0C(ZS zs, ZM zm) throws ZW {
        ArrayList arrayList = new ArrayList();
        String alternativeMimeType = ZZ.A0P(zm);
        if (alternativeMimeType != null) {
            List<Z2> A7e = zs.A7e(alternativeMimeType, false, false);
            if (AbstractC1672gE.A02 >= 26) {
                if (A0B(1664, 18, 119).equals(zm.A0W)) {
                    boolean isEmpty = A7e.isEmpty();
                    if (A11[5].charAt(17) != 'C') {
                        A11[7] = "MjxkmDR";
                        if (!isEmpty) {
                            return A7e;
                        }
                        return arrayList;
                    }
                    throw new RuntimeException();
                }
                return arrayList;
            }
            return arrayList;
        }
        return arrayList;
    }

    public static List<Z2> A0D(ZS zs, ZM zm, boolean z10) throws ZW {
        String str = zm.A0W;
        if (str == null) {
            return Collections.emptyList();
        }
        String[] strArr = A11;
        if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        A11[1] = "jfk4bz5Oizy2HT1tkEDilPHWV9VC8mhv";
        return Collections.unmodifiableList(zs.A7e(str, z10, false));
    }

    private void A0E() {
        this.A0h = false;
        if (AbstractC1672gE.A02 >= 23 && this.A0j) {
            InterfaceC1268Yz A1j = A1j();
            String[] strArr = A11;
            if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
                throw new RuntimeException();
            }
            A11[0] = "tRf4j3XAuhTUrishLHLLZY0n8xUtf2jr";
            if (A1j != null) {
                this.A00 = new C1019Ox(this, A1j);
            }
        }
    }

    private void A0F() {
        this.A0G = -1;
        this.A0E = -1;
        this.A03 = -1.0f;
        this.A0F = -1;
    }

    @MetaExoPlayerCustomization("need for SR to release EGL context")
    private void A0G() {
        if (this.A0q.A0G() && C0962Mq.A03(EnumC0959Mn.A1h)) {
            this.A0q.A0A();
            throw null;
        }
    }

    private void A0H() {
        if (this.A0l > 0 && this.A05 > 0 && this.A05 >= this.A0l) {
            this.A0t.A00(this.A05, SystemClock.elapsedRealtime() - this.A0I);
        }
        this.A05 = 0;
        this.A0I = SystemClock.elapsedRealtime();
    }

    private void A0I() {
        InterfaceC1268Yz A1j = A1j();
        if (A1j != null && !this.A0c && A1j.A9A() > 30) {
            A0V(super.A0j);
            this.A0c = true;
        }
    }

    private void A0J() {
        if (this.A09 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long now = this.A0J;
            long elapsedMs = elapsedRealtime - now;
            this.A0t.A01(this.A09, elapsedMs);
            this.A09 = 0;
            this.A0J = elapsedRealtime;
        }
    }

    private void A0K() {
        if (this.A08 == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0G != this.A08 || this.A0E != this.A06 || this.A0F != this.A07 || this.A03 != this.A01) {
            this.A0t.A0B(new Y2(this.A08, this.A06, this.A07, this.A01));
            this.A0G = this.A08;
            this.A0E = this.A06;
            this.A0F = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0L() {
        if (this.A0h) {
            this.A0t.A0D(this.A0U);
        }
    }

    private void A0M() {
        if (this.A0G != -1 || this.A0E != -1) {
            this.A0t.A0B(new Y2(this.A0G, this.A0E, this.A0F, this.A03));
        }
    }

    private void A0N() {
        long j10;
        if (this.A0o > 0) {
            j10 = SystemClock.elapsedRealtime() + this.A0o;
        } else {
            j10 = -9223372036854775807L;
        }
        this.A0M = j10;
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private void A0O() {
        super.A0i.A03(super.A0h);
    }

    private final void A0Q(int i10) {
        super.A0i.A04 += i10;
        this.A09 += i10;
        this.A05 += i10;
        super.A0i.A07 = Math.max(this.A05, super.A0i.A07);
        if (this.A09 >= this.A0k) {
            A0J();
        }
    }

    private final void A0R(long j10, long j11, float f10) {
        int A01 = (int) O5.A01(j10);
        int A012 = (int) O5.A01(j11);
        if (A012 > 1000 && A012 < 10000) {
            int i10 = A01 + A012;
            int positionMs = this.A0A;
            int presentationGapMs = this.A0B;
            if (i10 > positionMs + presentationGapMs + 1000) {
                int presentationGapMs2 = this.A0A;
                if (A01 > presentationGapMs2) {
                    int i11 = this.A0A;
                    int i12 = this.A0B;
                    int positionMs2 = A11[1].charAt(9);
                    if (positionMs2 != 122) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A11;
                    strArr[2] = "bs9qXYsYT8loRf6GvckLlR6pDe1CBFH9";
                    strArr[3] = "Zg7YmY2aXY9EZ5gVNBnC4rp36cey1aFg";
                    if (A01 < i11 + i12) {
                        OA oa = super.A0i;
                        int i13 = oa.A0E;
                        int i14 = A01 + A012;
                        String[] strArr2 = A11;
                        String str = strArr2[2];
                        String str2 = strArr2[3];
                        int positionMs3 = str.charAt(5);
                        int presentationGapMs3 = str2.charAt(5);
                        if (positionMs3 != presentationGapMs3) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A11;
                        strArr3[2] = "S6seRYbycKE2NQwE9DxjdMn9egSjrFLO";
                        strArr3[3] = "DAGbTYnYpv3sH0rNuac7wkHdB7hzbjmw";
                        int positionMs4 = this.A0A;
                        int presentationGapMs4 = this.A0B;
                        oa.A0E = i13 + ((int) (((i14 - (positionMs4 + presentationGapMs4)) * f10) / 1000.0d));
                        this.A0A = A01;
                        this.A0B = A012;
                    }
                }
                int positionMs5 = this.A0A;
                int presentationGapMs5 = this.A0B;
                if (A01 > positionMs5 + presentationGapMs5) {
                    int presentationGapMs6 = (int) ((A012 * f10) / 1000.0d);
                    super.A0i.A0E += presentationGapMs6;
                }
                this.A0A = A01;
                this.A0B = A012;
            }
        }
    }

    public void A0S(long j10, long j11, ZM zm, MediaFormat mediaFormat) {
        if (this.A0X != null) {
            this.A0X.AFa(j10, j11, zm, mediaFormat);
        }
    }

    public static void A0T(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled(A0B(1609, 17, 81), true);
        mediaFormat.setInteger(A0B(1157, 16, 1), i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0U(android.view.Surface r10) throws com.facebook.ads.redexgen.X.EK {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0T.A0U(android.view.Surface):void");
    }

    private void A0V(ZM zm) {
        InterfaceC1268Yz codec = A1j();
        if (codec != null && zm != null) {
            Pair<Long, Integer> A8Z = codec.A8Z();
            long longValue = ((Long) A8Z.first).longValue();
            String[] strArr = A11;
            if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A11;
            strArr2[6] = "KqB5WjprWJUdF9G";
            strArr2[4] = "cASIJFz4IWmOqOLOe";
            if (longValue > 0) {
                super.A0i.A04(A8Z);
                this.A0t.A04(super.A0i.A00, zm);
            }
        }
    }

    private final void A0W(InterfaceC1268Yz interfaceC1268Yz, int i10, long j10) {
        AbstractC1663g5.A02(A0B(1262, 15, 93));
        interfaceC1268Yz.AGq(i10, false);
        AbstractC1663g5.A00();
        A0Q(1);
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private final void A0X(InterfaceC1268Yz interfaceC1268Yz, int i10, long j10) {
        if (this.A0v) {
            A0Y(interfaceC1268Yz, i10, j10);
            return;
        }
        A0K();
        try {
            AbstractC1663g5.A02(A0B(1529, 19, 30));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC1268Yz.AGq(i10, true);
            long j11 = super.A0h;
            long startRenderTime = SystemClock.elapsedRealtime();
            super.A0h = j11 + (startRenderTime - elapsedRealtime);
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            super.A0i.A09++;
            A0H();
            A27();
            A0O();
        } finally {
            AbstractC1663g5.A00();
        }
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private final void A0Y(InterfaceC1268Yz interfaceC1268Yz, int i10, long j10) {
        AbstractC1663g5.A02(A0B(1529, 19, 30));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        interfaceC1268Yz.AGq(i10, true);
        long j11 = super.A0h;
        long startRenderTime = SystemClock.elapsedRealtime();
        super.A0h = j11 + (startRenderTime - elapsedRealtime);
        AbstractC1663g5.A00();
        super.A0i.A09++;
        A0H();
        if (!this.A0q.A0G()) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (A11[5].charAt(17) == 'C') {
                throw new RuntimeException();
            }
            A11[5] = "i8cO0zMNSWd1ewKpaUAlLuolVCtgXekF";
            this.A0P = elapsedRealtime2 * 1000;
            A0K();
            A27();
        }
    }

    private final void A0Z(InterfaceC1268Yz interfaceC1268Yz, int i10, long j10) {
        AbstractC1663g5.A02(A0B(1579, 15, 64));
        interfaceC1268Yz.AGq(i10, false);
        AbstractC1663g5.A00();
        super.A0i.A0B++;
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private final void A0a(InterfaceC1268Yz interfaceC1268Yz, int i10, long j10, long j11) {
        if (this.A0v) {
            A0c(interfaceC1268Yz, i10, j10, j11, true);
            return;
        }
        A0K();
        ZM zm = super.A0j;
        MediaFormat mediaFormat = this.A0S;
        String[] strArr = A11;
        if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        A11[1] = "1OxvY0lqazwFMaHeED37DJdg2bjujp7s";
        A0S(j10, j11, zm, mediaFormat);
        try {
            AbstractC1663g5.A02(A0B(1529, 19, 30));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC1268Yz.AGp(i10, j11);
            long j12 = super.A0h;
            long startRenderTime = SystemClock.elapsedRealtime();
            super.A0h = j12 + (startRenderTime - elapsedRealtime);
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            super.A0i.A09++;
            A0H();
            A27();
            A0O();
        } finally {
            AbstractC1663g5.A00();
        }
    }

    private final void A0b(@MetaExoPlayerCustomization InterfaceC1268Yz interfaceC1268Yz, int i10, long j10, long j11, boolean z10) {
        if (this.A0v) {
            A0c(interfaceC1268Yz, i10, j10, j11, z10);
            return;
        }
        A0K();
        A0S(j10, j11, super.A0j, this.A0S);
        try {
            AbstractC1663g5.A02(A0B(1529, 19, 30));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC1268Yz.AGp(i10, j11);
            long j12 = super.A0h;
            long startRenderTime = SystemClock.elapsedRealtime();
            super.A0h = j12 + (startRenderTime - elapsedRealtime);
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            super.A0i.A09++;
            A0H();
            A27();
            A0O();
        } finally {
            AbstractC1663g5.A00();
        }
    }

    @MetaExoPlayerCustomization("notifyFrameMetadataListener be removed once we take the Exo renderOutputBufferNow Function refactor")
    private final void A0c(InterfaceC1268Yz interfaceC1268Yz, int i10, long j10, long j11, boolean z10) {
        if (z10) {
            ZM zm = super.A0j;
            MediaFormat mediaFormat = this.A0S;
            if (A11[5].charAt(17) == 'C') {
                throw new RuntimeException();
            }
            A11[7] = "4VguciQ7";
            A0S(j10, j11, zm, mediaFormat);
        }
        AbstractC1663g5.A02(A0B(1529, 19, 30));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        interfaceC1268Yz.AGp(i10, j11);
        long j12 = super.A0h;
        long startRenderTime = SystemClock.elapsedRealtime();
        super.A0h = j12 + (startRenderTime - elapsedRealtime);
        AbstractC1663g5.A00();
        super.A0i.A09++;
        A0H();
        if (!this.A0q.A0G()) {
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            A0K();
            if (A11[1].charAt(9) != 'z') {
                A27();
                A0O();
                return;
            }
            String[] strArr = A11;
            strArr[6] = "G2zU8YwkZwnM36T";
            strArr[4] = "pyfYVO0ogWIcNmhi4";
            A27();
            A0O();
        }
    }

    public static void A0d(InterfaceC1268Yz interfaceC1268Yz, Surface surface) {
        interfaceC1268Yz.AIh(surface);
    }

    @MetaExoPlayerCustomization
    private void A0f(Object obj) {
        this.A0d = ((Boolean) obj).booleanValue();
        A1j();
    }

    private boolean A0g() {
        boolean z10 = false;
        if (this.A0m <= 0) {
            return false;
        }
        z10 = (this.A0K == -9223372036854775807L || System.currentTimeMillis() - this.A0K <= ((long) this.A0m)) ? true : true;
        String[] strArr = A11;
        if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A11;
        strArr2[6] = "tSNEeTj3zvxCS6h";
        strArr2[4] = "zKNG4oagYbeBOD6F4";
        if (this.A0K == -9223372036854775807L) {
            AbstractC1633fb.A07(A0B(682, 23, 48), A0B(901, 20, 46));
            this.A0K = System.currentTimeMillis();
        }
        return z10;
    }

    public static boolean A0h() {
        return AbstractC1672gE.A02 >= 21;
    }

    public static boolean A0i() {
        return AbstractC1672gE.A02 <= 22 && A0B(1280, 6, 6).equals(AbstractC1672gE.A03) && A0B(725, 6, 57).equals(AbstractC1672gE.A05);
    }

    public static /* synthetic */ boolean A0j() {
        boolean A0h = A0h();
        if (A11[0].charAt(18) != 'P') {
            A11[0] = "7GiRrcnfpEvFmxn3JhCcvJZoro3FYcpR";
            return A0h;
        }
        throw new RuntimeException();
    }

    public static boolean A0k(long j10) {
        return j10 < -30000;
    }

    public static boolean A0l(long j10) {
        return j10 < -500000;
    }

    public boolean A0m(long j10, long j11) {
        boolean z10;
        boolean z11 = A90() == 2;
        boolean isStarted = this.A0i;
        if (!isStarted) {
            if (!z11) {
                boolean isStarted2 = this.A0g;
                if (!isStarted2) {
                    z10 = false;
                }
            }
            z10 = true;
        } else {
            boolean isStarted3 = this.A0h;
            z10 = !isStarted3;
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.A0P;
        if (this.A0M == -9223372036854775807L && j10 >= A1i()) {
            if (z10) {
                return true;
            }
            if (z11) {
                boolean isStarted4 = A0p(j11, elapsedRealtime);
                if (isStarted4) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean A0n(long j10, long j11) {
        return A0l(j10);
    }

    private final boolean A0o(long j10, long j11) {
        return A0k(j10);
    }

    private final boolean A0p(long j10, long j11) {
        return A0k(j10) && j11 > 100000;
    }

    private final boolean A0q(InterfaceC1268Yz interfaceC1268Yz, int i10, long j10, long j11) throws EK {
        int A1Q = A1Q(j11);
        if (A1Q == 0) {
            return false;
        }
        OA oa = super.A0i;
        int droppedSourceBufferCount = oa.A06;
        oa.A06 = droppedSourceBufferCount + 1;
        int droppedSourceBufferCount2 = this.A04;
        A0Q(droppedSourceBufferCount2 + A1Q);
        A1m();
        if (this.A0q.A0G()) {
            this.A0q.A09();
            throw null;
        }
        return true;
    }

    private boolean A0r(Z2 z22) {
        return AbstractC1672gE.A02 >= 23 && this.A0e && !this.A0j && !A0u(z22.A03) && (!z22.A06 || DummySurface.A05(this.A0p));
    }

    private final boolean A0u(String str) {
        char c10 = 0;
        if (str.startsWith(A0B(743, 10, 33))) {
            return false;
        }
        synchronized (C0T.class) {
            if (!A0z) {
                if (A0B(1253, 6, 9).equals(AbstractC1672gE.A03)) {
                    A0y = true;
                } else {
                    char c11 = 27;
                    if (AbstractC1672gE.A02 <= 27 && A0B(563, 5, 54).equals(AbstractC1672gE.A03)) {
                        A0y = true;
                    } else if (AbstractC1672gE.A02 < 27) {
                        String str2 = AbstractC1672gE.A03;
                        switch (str2.hashCode()) {
                            case -2144781245:
                                if (str2.equals(A0B(423, 14, 69))) {
                                    c11 = '+';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -2144781185:
                                if (str2.equals(A0B(437, 14, 53))) {
                                    c11 = ',';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -2144781160:
                                if (str2.equals(A0B(451, 14, 127))) {
                                    c11 = '-';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -2097309513:
                                if (str2.equals(A0B(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, 6, 118))) {
                                    c11 = '?';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -2022874474:
                                if (str2.equals(A0B(220, 10, 22))) {
                                    c11 = 19;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1978993182:
                                if (str2.equals(A0B(731, 6, 95))) {
                                    c11 = 'M';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1978990237:
                                if (str2.equals(A0B(737, 6, 24))) {
                                    c11 = 'N';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1936688988:
                                if (str2.equals(A0B(777, 6, 13))) {
                                    c11 = 'X';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1936688066:
                                if (str2.equals(A0B(783, 6, 126))) {
                                    c11 = 'Y';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1936688065:
                                if (str2.equals(A0B(789, 6, 25))) {
                                    c11 = 'Z';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1931988508:
                                if (str2.equals(A0B(138, 10, 100))) {
                                    c11 = 11;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1696512866:
                                if (str2.equals(A0B(1137, 6, 113))) {
                                    c11 = '{';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1680025915:
                                if (str2.equals(A0B(280, 7, 121))) {
                                    c11 = 18;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1615810839:
                                if (str2.equals(A0B(803, 8, 21))) {
                                    c11 = '[';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1554255044:
                                if (str2.equals(A0B(1626, 9, 58))) {
                                    c11 = 't';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1481772737:
                                if (str2.equals(A0B(1494, 9, 30))) {
                                    c11 = 'T';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1481772730:
                                if (str2.equals(A0B(1503, 9, 38))) {
                                    c11 = 'U';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1481772729:
                                if (str2.equals(A0B(1512, 9, 55))) {
                                    c11 = 'V';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1320080169:
                                if (str2.equals(A0B(521, 14, 118))) {
                                    c11 = ')';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1217592143:
                                if (str2.equals(A0B(193, 11, 77))) {
                                    c11 = 15;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1180384755:
                                if (str2.equals(A0B(1353, 6, 54))) {
                                    c11 = ';';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1139198265:
                                if (str2.equals(A0B(1015, 9, 8))) {
                                    c11 = 'h';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1052835013:
                                if (str2.equals(A0B(1466, 6, 55))) {
                                    c11 = 'K';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -993250464:
                                if (str2.equals(A0B(12, 7, 80))) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -993250458:
                                if (str2.equals(A0B(19, 7, 31))) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -965403638:
                                if (str2.equals(A0B(1564, 8, 94))) {
                                    c11 = 'j';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -958336948:
                                if (str2.equals(A0B(324, 11, 40))) {
                                    c11 = 29;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -879245230:
                                if (str2.equals(A0B(1603, 6, 20))) {
                                    c11 = 'p';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -842500323:
                                if (str2.equals(A0B(1472, 10, 14))) {
                                    c11 = 'L';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -821392978:
                                if (str2.equals(A0B(39, 7, 56))) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -797483286:
                                if (str2.equals(A0B(1006, 9, 92))) {
                                    c11 = 'i';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -794946968:
                                if (str2.equals(A0B(1743, 6, 10))) {
                                    c11 = 'u';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -788334647:
                                if (str2.equals(A0B(1749, 6, 14))) {
                                    c11 = 'v';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -782144577:
                                if (str2.equals(A0B(753, 9, 110))) {
                                    c11 = 'O';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -575125681:
                                if (str2.equals(A0B(507, 14, 40))) {
                                    c11 = '(';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -521118391:
                                if (str2.equals(A0B(j3.a.b.f17904i, 14, 34))) {
                                    c11 = '*';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -430914369:
                                if (str2.equals(A0B(817, 10, 126))) {
                                    c11 = '\\';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -290434366:
                                if (str2.equals(A0B(1594, 9, 57))) {
                                    c11 = 'k';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -282781963:
                                if (str2.equals(A0B(171, 8, 76))) {
                                    c11 = 14;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -277133239:
                                if (str2.equals(A0B(1143, 7, 109))) {
                                    c11 = '|';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -173639913:
                                if (str2.equals(A0B(292, 12, 17))) {
                                    c11 = 26;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -56598463:
                                if (str2.equals(A0B(1767, 8, 126))) {
                                    c11 = 'x';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2126:
                                if (str2.equals(A0B(218, 2, 41))) {
                                    c11 = 17;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2564:
                                if (str2.equals(A0B(856, 2, 79))) {
                                    c11 = 'd';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2715:
                                if (str2.equals(A0B(IronSourceConstants.RV_CALLBACK_AD_CLICKED, 2, 97))) {
                                    c11 = 'q';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2719:
                                if (str2.equals(A0B(1121, 2, 7))) {
                                    c11 = 's';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3483:
                                if (str2.equals(A0B(1456, 2, 112))) {
                                    c11 = 'H';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 73405:
                                if (str2.equals(A0B(594, 3, 23))) {
                                    c11 = '>';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 75739:
                                if (str2.equals(A0B(668, 3, 9))) {
                                    c11 = 'D';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 76779:
                                if (str2.equals(A0B(679, 3, 70))) {
                                    c11 = 'J';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 78669:
                                if (str2.equals(A0B(766, 3, 44))) {
                                    c11 = 'R';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 79305:
                                if (str2.equals(A0B(795, 3, 28))) {
                                    c11 = '^';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 80618:
                                if (str2.equals(A0B(866, 3, 47))) {
                                    c11 = 'f';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 88274:
                                if (str2.equals(A0B(1150, 3, 66))) {
                                    c11 = '}';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 98846:
                                if (str2.equals(A0B(1247, 3, 95))) {
                                    c11 = 22;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 98848:
                                if (str2.equals(A0B(1250, 3, 85))) {
                                    c11 = 23;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 99329:
                                if (str2.equals(A0B(1259, 3, 72))) {
                                    c11 = 24;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 101481:
                                if (str2.equals(A0B(1277, 3, 30))) {
                                    c11 = '&';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1513190:
                                if (str2.equals(A0B(0, 4, 109))) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1514184:
                                if (str2.equals(A0B(4, 4, 22))) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1514185:
                                if (str2.equals(A0B(8, 4, 105))) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2436959:
                                if (str2.equals(A0B(762, 4, 20))) {
                                    c11 = 'Q';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2463773:
                                if (str2.equals(A0B(838, 4, 81))) {
                                    c11 = '`';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2464648:
                                if (str2.equals(A0B(847, 4, 120))) {
                                    c11 = 'b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2689555:
                                if (str2.equals(A0B(1133, 4, 107))) {
                                    c11 = 'z';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3154429:
                                if (str2.equals(A0B(1296, 4, 97))) {
                                    c11 = '\'';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3284551:
                                if (str2.equals(A0B(1376, 4, 112))) {
                                    c11 = '@';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3351335:
                                if (str2.equals(A0B(1458, 4, 1))) {
                                    c11 = 'I';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3386211:
                                if (str2.equals(A0B(1482, 4, 33))) {
                                    c11 = 'P';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 41325051:
                                if (str2.equals(A0B(671, 8, 103))) {
                                    c11 = 'G';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 55178625:
                                if (str2.equals(A0B(160, 11, 49))) {
                                    c11 = '\r';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 61542055:
                                if (str2.equals(A0B(26, 5, 19))) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 65355429:
                                if (str2.equals(A0B(287, 5, 79))) {
                                    c11 = 25;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 66214468:
                                if (str2.equals(A0B(345, 5, 74))) {
                                    c11 = 31;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 66214470:
                                if (str2.equals(A0B(350, 5, 46))) {
                                    c11 = ' ';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 66214473:
                                if (str2.equals(A0B(355, 5, 70))) {
                                    c11 = '!';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 66215429:
                                if (str2.equals(A0B(360, 5, 96))) {
                                    c11 = '\"';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 66215431:
                                if (str2.equals(A0B(365, 5, 88))) {
                                    c11 = '#';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 66215433:
                                if (str2.equals(A0B(370, 5, 56))) {
                                    c11 = '$';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 66216390:
                                if (str2.equals(A0B(375, 5, 52))) {
                                    c11 = '%';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 76402249:
                                if (str2.equals(A0B(798, 5, 84))) {
                                    c11 = '_';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 76404105:
                                if (str2.equals(A0B(842, 5, 118))) {
                                    c11 = 'a';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 76404911:
                                if (str2.equals(A0B(851, 5, 28))) {
                                    c11 = 'c';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 80963634:
                                if (str2.equals(A0B(IronSourceConstants.RV_CHECK_READY_TRUE, 5, 105))) {
                                    c11 = 'r';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 82882791:
                                if (str2.equals(A0B(1128, 5, 103))) {
                                    c11 = 'y';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 98715550:
                                if (str2.equals(A0B(1334, 5, 33))) {
                                    c11 = '8';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 101370885:
                                if (str2.equals(A0B(1380, 5, 103))) {
                                    c11 = 'A';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 102844228:
                                if (str2.equals(A0B(1385, 5, 19))) {
                                    c11 = 'B';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 165221241:
                                if (str2.equals(A0B(31, 8, 19))) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 182191441:
                                if (str2.equals(A0B(237, 9, 98))) {
                                    c11 = 21;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 245388979:
                                if (str2.equals(A0B(1415, 8, 5))) {
                                    c11 = 'F';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 287431619:
                                if (str2.equals(A0B(IronSourceConstants.RV_AUCTION_REQUEST, 7, 17))) {
                                    c11 = '1';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 307593612:
                                if (str2.equals(A0B(55, 8, 40))) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 308517133:
                                if (str2.equals(A0B(63, 8, 30))) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 316215098:
                                if (str2.equals(A0B(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, 8, 120))) {
                                    c11 = 'l';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 316215116:
                                if (str2.equals(A0B(IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES, 8, 100))) {
                                    c11 = 'm';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 316246811:
                                if (str2.equals(A0B(1053, 8, 12))) {
                                    c11 = 'n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 316246818:
                                if (str2.equals(A0B(IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY, 8, 105))) {
                                    c11 = 'o';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 407160593:
                                if (str2.equals(A0B(827, 11, 13))) {
                                    c11 = ']';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 507412548:
                                if (str2.equals(A0B(858, 8, 55))) {
                                    c11 = 'e';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 793982701:
                                if (str2.equals(A0B(465, 14, 77))) {
                                    c11 = '.';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 794038622:
                                if (str2.equals(A0B(479, 14, 11))) {
                                    c11 = '/';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 794040393:
                                if (str2.equals(A0B(493, 14, 1))) {
                                    c11 = '0';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 835649806:
                                if (str2.equals(A0B(1408, 7, 44))) {
                                    c11 = 'E';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 917340916:
                                if (str2.equals(A0B(46, 9, 81))) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 958008161:
                                if (str2.equals(A0B(1367, 9, 74))) {
                                    c11 = com.ironsource.cc.T;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1060579533:
                                if (str2.equals(A0B(1486, 8, 97))) {
                                    c11 = 'S';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1150207623:
                                if (str2.equals(A0B(LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, 7, 121))) {
                                    c11 = 'C';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1176899427:
                                if (str2.equals(A0B(1359, 8, 21))) {
                                    c11 = '<';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1280332038:
                                if (str2.equals(A0B(1327, 7, 43))) {
                                    c11 = '3';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1306947716:
                                if (str2.equals(A0B(335, 10, 81))) {
                                    c11 = 30;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1349174697:
                                if (str2.equals(A0B(1313, 14, 16))) {
                                    c11 = '2';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1522194893:
                                if (str2.equals(A0B(1760, 7, 69))) {
                                    c11 = 'w';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1691543273:
                                if (str2.equals(A0B(230, 7, 69))) {
                                    c11 = 20;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1709443163:
                                if (str2.equals(A0B(1339, 14, 56))) {
                                    c11 = '9';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1865889110:
                                if (str2.equals(A0B(1572, 7, 45))) {
                                    c11 = 'g';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1906253259:
                                if (str2.equals(A0B(769, 8, 120))) {
                                    c11 = 'W';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1977196784:
                                if (str2.equals(A0B(582, 12, 20))) {
                                    c11 = ':';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2006372676:
                                if (str2.equals(A0B(204, 14, 69))) {
                                    c11 = 16;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2029784656:
                                if (str2.equals(A0B(549, 7, 111))) {
                                    c11 = '4';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2030379515:
                                if (str2.equals(A0B(556, 7, 70))) {
                                    c11 = '5';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2033393791:
                                if (str2.equals(A0B(111, 12, 62))) {
                                    c11 = '\f';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2047190025:
                                if (str2.equals(A0B(304, 10, 42))) {
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2047252157:
                                if (str2.equals(A0B(314, 10, 18))) {
                                    c11 = 28;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2048319463:
                                if (str2.equals(A0B(568, 7, 81))) {
                                    c11 = '6';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2048855701:
                                if (str2.equals(A0B(575, 7, 95))) {
                                    c11 = '7';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case '\b':
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case ' ':
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                            case '&':
                            case '\'':
                            case '(':
                            case ')':
                            case '*':
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'I':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'M':
                            case 'N':
                            case 'O':
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 's':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                            case '{':
                            case '|':
                            case '}':
                                A0y = true;
                                break;
                        }
                        String str3 = AbstractC1672gE.A06;
                        switch (str3.hashCode()) {
                            case -2038157993:
                                if (str3.equals(A0B(877, 12, 31))) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -2038157992:
                                if (str3.equals(A0B(889, 12, 112))) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1984447159:
                                if (str3.equals(A0B(719, 6, 4))) {
                                    c10 = 15;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1458559768:
                                if (str3.equals(A0B(IronSourceError.ERROR_NT_LOAD_EXCEPTION, 14, 12))) {
                                    c10 = 16;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1337484257:
                                if (str3.equals(A0B(148, 12, 103))) {
                                    c10 = 20;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1152053872:
                                if (str3.equals(A0B(998, 8, 80))) {
                                    c10 = 19;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1147076792:
                                if (str3.equals(A0B(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 15, 73))) {
                                    c10 = 17;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -708142633:
                                if (str3.equals(A0B(869, 8, 114))) {
                                    c10 = 18;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -594534941:
                                if (str3.equals(A0B(597, 7, 100))) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -581948979:
                                if (str3.equals(A0B(IronSourceConstants.RV_CAP_SESSION, 7, 121))) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -401692983:
                                if (str3.equals(A0B(964, 8, 46))) {
                                    c10 = 23;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -399133966:
                                if (str3.equals(A0B(981, 8, 113))) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -154985182:
                                if (str3.equals(A0B(123, 15, 25))) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2006354:
                                if (str3.equals(A0B(71, 4, 105))) {
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2006367:
                                if (str3.equals(A0B(75, 4, 125))) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 81951059:
                                if (str3.equals(A0B(1123, 5, 116))) {
                                    c10 = 24;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 439365079:
                                if (str3.equals(A0B(535, 14, 32))) {
                                    c10 = 22;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 511748841:
                                if (str3.equals(A0B(972, 9, 52))) {
                                    c10 = '\f';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 619782645:
                                if (str3.equals(A0B(89, 11, 75))) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 619782647:
                                if (str3.equals(A0B(100, 11, 82))) {
                                    c10 = 21;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 632760191:
                                if (str3.equals(A0B(989, 9, 85))) {
                                    c10 = 25;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 807317112:
                                if (str3.equals(A0B(610, 7, 75))) {
                                    c10 = 14;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 807374834:
                                if (str3.equals(A0B(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 7, 104))) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1070811680:
                                if (str3.equals(A0B(646, 13, 19))) {
                                    c10 = '\r';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1682560972:
                                if (str3.equals(A0B(79, 10, 42))) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1921424370:
                                if (str3.equals(A0B(1024, 13, 38))) {
                                    c10 = 26;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2133907258:
                                if (str3.equals(A0B(659, 9, 96))) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                            case 2:
                                A0y = true;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case '\b':
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                                A0y = true;
                                break;
                        }
                    }
                }
                A0z = true;
            }
        }
        return A0y;
    }

    public static boolean A0v(boolean z10, ZM zm, ZM zm2) {
        return zm.A0W.equals(zm2.A0W) && zm.A0F == zm2.A0F && (z10 || (zm.A0L == zm2.A0L && zm.A0A == zm2.A0A)) && AbstractC1672gE.A1E(zm.A0N, zm2.A0N);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10, com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1X() {
        super.A1X();
        this.A09 = 0;
        this.A0A = 0;
        this.A0B = 0;
        this.A0J = SystemClock.elapsedRealtime();
        this.A0P = SystemClock.elapsedRealtime() * 1000;
        if (this.A0v) {
            this.A0r.A0D();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10, com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1Y() {
        this.A0M = -9223372036854775807L;
        A0J();
        A0H();
        if (this.A0v) {
            this.A0r.A0E();
        }
        super.A1Y();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10, com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1Z() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0R = -9223372036854775807L;
        this.A0O = -9223372036854775807L;
        this.A0C = 0;
        A0F();
        A0E();
        this.A0s.A08();
        this.A00 = null;
        this.A0j = false;
        this.A0A = 0;
        this.A0B = 0;
        A0G();
        try {
            super.A1Z();
        } finally {
            super.A0i.A02();
            this.A0t.A05(super.A0i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10, com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1a(long j10, boolean z10) throws EK {
        super.A1a(j10, z10);
        if (this.A0q.A0G()) {
            this.A0q.A09();
            throw null;
        }
        A0E();
        if (this.A0v) {
            C1706gn c1706gn = this.A0r;
            if (A11[0].charAt(18) == 'P') {
                throw new RuntimeException();
            }
            A11[0] = "I0UybRzxhz05UsWfQTuk5Ctxl58niJiW";
            c1706gn.A0C();
        }
        this.A0N = -9223372036854775807L;
        this.A0L = -9223372036854775807L;
        this.A0O = -9223372036854775807L;
        this.A0A = 0;
        this.A0B = 0;
        if (this.A0C != 0) {
            this.A0R = this.A0w[this.A0C - 1];
            this.A0C = 0;
        }
        if (z10) {
            A0N();
        } else {
            this.A0M = -9223372036854775807L;
        }
        A0H();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10, com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1b(boolean z10, boolean z11) throws EK {
        super.A1b(z10, z11);
        this.A0j = A1V().A00;
        this.A0t.A06(super.A0i);
        this.A0s.A09();
        this.A0g = z11;
        this.A0i = false;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10, com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1c(ZM[] zmArr, long j10, long j11) throws EK {
        if (this.A0R == -9223372036854775807L) {
            this.A0R = j11;
        } else {
            if (this.A0C == this.A0w.length) {
                AbstractC1633fb.A07(A0B(682, 23, 48), A0B(1069, 45, 59) + this.A0w[this.A0C - 1]);
            } else {
                this.A0C++;
            }
            this.A0w[this.A0C - 1] = j11;
            this.A0x[this.A0C - 1] = this.A0O;
        }
        super.A1c(zmArr, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final int A1g(InterfaceC1268Yz interfaceC1268Yz, Z2 z22, ZM zm, ZM zm2) {
        if (MJ.A04(this.A11, zm.A0L, zm.A0A, zm2.A0L, zm2.A0A)) {
            return 0;
        }
        if (A21() && zm.A0W.equals(zm2.A0W) && zm.A0F == zm2.A0F) {
            return 1;
        }
        if (!A0v(z22.A04, zm, zm2) || zm2.A0L > this.A0W.A02 || zm2.A0A > this.A0W.A00 || A00(zm2) > this.A0W.A01) {
            return 0;
        }
        return zm.A0A(zm2) ? 1 : 3;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final int A1h(ZS zs, TO to, ZM zm) throws ZW {
        if (A24(zm)) {
            if (A11[0].charAt(18) != 'P') {
                A11[5] = "QcszUsFUXpe8IYOI3eCl5U0UDPLgDPye";
                return 20;
            }
            throw new RuntimeException();
        }
        return A01(zs, zm, super.A0l);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final List<Z2> A1l(ZS zs, ZM zm, boolean z10) throws ZW {
        return A0D(zs, zm, z10);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void A1m() throws EK {
        super.A1m();
        this.A04 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void A1n() {
        try {
            super.A1n();
            this.A04 = 0;
            if (this.A0T != null) {
                if (this.A0U == this.A0T) {
                    this.A0U = null;
                }
                this.A0T.release();
                this.A0T = null;
            }
        } catch (Throwable th) {
            this.A04 = 0;
            Surface surface = this.A0T;
            String[] strArr = A11;
            if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
                throw new RuntimeException();
            }
            A11[5] = "ynWAHKdve9ZDybWNqkJILMjZXiEG9saW";
            if (surface != null) {
                if (this.A0U == this.A0T) {
                    this.A0U = null;
                }
                this.A0T.release();
                this.A0T = null;
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void A1q(long j10) {
        super.A1q(j10);
        this.A04--;
        while (this.A0C != 0 && j10 >= this.A0x[0]) {
            this.A0R = this.A0w[0];
            this.A0C--;
            System.arraycopy(this.A0w, 1, this.A0w, 0, this.A0C);
            System.arraycopy(this.A0x, 1, this.A0x, 0, this.A0C);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0022  */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("for SR video effects support of MCM")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1r(com.facebook.ads.redexgen.X.ZM r6) {
        /*
            r5 = this;
            boolean r0 = r5.A24(r6)
            r4 = 0
            if (r0 == 0) goto L39
            com.facebook.ads.redexgen.X.ZM r0 = r5.A0j
            if (r0 == 0) goto L31
            com.facebook.ads.redexgen.X.ZM r0 = r5.A0j
            java.lang.String r3 = r0.A0W
            r2 = 1645(0x66d, float:2.305E-42)
            r1 = 10
            r0 = 112(0x70, float:1.57E-43)
            java.lang.String r0 = A0B(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L31
            r0 = 1
        L20:
            if (r0 == 0) goto L33
            com.facebook.ads.redexgen.X.gU r0 = r5.A0q
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L33
            com.facebook.ads.redexgen.X.gU r0 = r5.A0q
            r0.A0A()
            r0 = 0
            throw r0
        L31:
            r0 = 0
            goto L20
        L33:
            com.facebook.ads.redexgen.X.gU r0 = r5.A0q
            com.facebook.ads.redexgen.X.C1687gU.A05(r0, r4)
            return
        L39:
            com.facebook.ads.redexgen.X.Mo r0 = com.facebook.ads.redexgen.X.EnumC0960Mo.A09
            int r3 = com.facebook.ads.redexgen.X.C0962Mq.A00(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0T.A11
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L65
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0T.A11
            java.lang.String r1 = "P2ZlpY0ERgZFsQcqSCQjVSg49sFfTOj4"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "w0kmHYOrlImNL7pz6PvFVWIP0ajPyIAa"
            r0 = 3
            r2[r0] = r1
            if (r3 <= 0) goto L64
            if (r6 == 0) goto L64
            int r0 = r6.A0L
            if (r0 <= r3) goto L64
            com.facebook.ads.redexgen.X.gU r0 = r5.A0q
            com.facebook.ads.redexgen.X.C1687gU.A05(r0, r4)
        L64:
            return
        L65:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0T.A1r(com.facebook.ads.redexgen.X.ZM):void");
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void A1s(ZM zm) throws EK {
        super.A1s(zm);
        this.A0t.A09(zm, null);
        this.A02 = zm.A02;
        this.A0D = zm.A0F;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void A1t(ZM zm) throws EK {
        if (!this.A0q.A0G()) {
            this.A0q.A0J(zm, A1i());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void A1u(C1214Ww c1214Ww) {
        this.A04++;
        this.A0O = Math.max(c1214Ww.A01, this.A0O);
        if (AbstractC1672gE.A02 < 23 && this.A0j) {
            A27();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157 A[RETURN] */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1v(com.facebook.ads.redexgen.X.InterfaceC1268Yz r11, android.media.MediaFormat r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0T.A1v(com.facebook.ads.redexgen.X.Yz, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("D40834768: [FBLite][Video] Enable low latency decoding for older Android versions"), @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Google Platform Dav1d Testing with Low Latency Decoding D62649046")})
    public final void A1w(Z2 z22, InterfaceC1268Yz interfaceC1268Yz, ZM zm, MediaCrypto mediaCrypto) throws ZW {
        this.A0W = A0A(z22, zm, A1e());
        MediaFormat A08 = A08(zm, this.A0W, this.A0u, this.A0n);
        if (this.A0U == null) {
            AbstractC1589es.A08(A0r(z22));
            if (this.A0T == null) {
                this.A0T = DummySurface.A01(this.A0p, z22.A06);
            }
            Surface surface = this.A0T;
            if (A11[7].length() == 5) {
                throw new RuntimeException();
            }
            String[] strArr = A11;
            strArr[2] = "eTG1JY0Z0f8x3UejYi9ifF0jnc0dhtvD";
            strArr[3] = "VakliYhQ2UnOyXBlYXsFKcpxhQDYHw32";
            this.A0U = surface;
        }
        boolean z10 = this.A11.A0H;
        boolean z11 = false;
        String A0B = A0B(1390, 11, 83);
        boolean z12 = z10 && z22.A00 != null && z22.A00.isFeatureSupported(A0B);
        if (z22.A03.equals(A0B(1181, 28, 84))) {
            C0954Mg c0954Mg = this.A11;
            if (A11[0].charAt(18) == 'P') {
                throw new RuntimeException();
            }
            A11[7] = "KYkpr8EtMuI1xIjXVcRBgqNn";
            if (c0954Mg.A09) {
                z11 = true;
            }
        }
        if ((AbstractC1672gE.A02 >= 30 || this.A11.A0I) && z12 && !z11) {
            A08.setFeatureEnabled(A0B, true);
            if (A11[0].charAt(18) == 'P') {
                throw new RuntimeException();
            }
            String[] strArr2 = A11;
            strArr2[6] = "roSUikaxP4Y8yp0";
            strArr2[4] = "Aub9OVfL4jB7ssjAF";
            A08.setInteger(A0B, 1);
        }
        if (this.A0q.A0G()) {
            A08 = this.A0q.A06(A08);
        }
        if (this.A0q.A0G()) {
            this.A0q.A07();
            throw null;
        }
        interfaceC1268Yz.A4y(A08, this.A0U, mediaCrypto, 0, this.A0Y);
        int i10 = AbstractC1672gE.A02;
        if (A11[1].charAt(9) == 'z') {
            String[] strArr3 = A11;
            strArr3[6] = "VlR5SpAC9c46PUq";
            strArr3[4] = "qqt2lYC69MTWVt7g5";
            if (i10 < 23) {
                return;
            }
        } else if (i10 < 23) {
            return;
        }
        if (this.A0j) {
            this.A00 = new C1019Ox(this, interfaceC1268Yz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public final void A1x(String str) {
        this.A0t.A0F(str);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void A1y(String str, long j10, long j11) {
        this.A0t.A0G(str, j10, j11);
        this.A0b = A0u(str);
        if (this.A0v) {
            this.A0q.A0E(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")
    public final void A1z(String str, ZM zm) throws EK {
        this.A0t.A0F(str);
        if (!this.A0q.A0G()) {
            this.A0q.A0J(zm, A1i());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final boolean A20() {
        return this.A0a && SystemClock.elapsedRealtime() - this.A0Q < 500;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final boolean A22() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x00b4, code lost:
        if (r12 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00b6, code lost:
        r7 = 21;
        r2 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00dc, code lost:
        if (r12 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0160, code lost:
        if (r32 == r9) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x016c, code lost:
        if (r32 == r9) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x016f, code lost:
        r6 = r6 - (r15 - r34);
        r18 = java.lang.System.nanoTime();
        r11 = r18 + (r6 * 1000);
        r15 = com.facebook.ads.redexgen.X.C0T.A11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0192, code lost:
        if (r15[2].charAt(5) == r15[3].charAt(5)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0199, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x019a, code lost:
        com.facebook.ads.redexgen.X.C0T.A11[1] = "mX3HKsb00zQ0Yr0eh5Uruiqbpk7IBAqe";
        r16 = r31.A0s.A07(r40, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01ad, code lost:
        if (r31.A0q.A0G() != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01af, code lost:
        r6 = (r16 - r18) / 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x01b3, code lost:
        r15 = A0n(r6, r34);
        r14 = com.facebook.ads.redexgen.X.C0T.A11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01c7, code lost:
        if (r14[6].length() == r14[4].length()) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01c9, code lost:
        com.facebook.ads.redexgen.X.C0T.A11[0] = "4zdnle4o5j0FE7iP1bblazp6pRjlKfuq";
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01d0, code lost:
        if (r15 == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01d2, code lost:
        r11 = 21;
        r24 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01e2, code lost:
        if (A0q(r24, r38, r0, r32) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01e4, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01e5, code lost:
        r14 = com.facebook.ads.redexgen.X.C0T.A11;
        r14[6] = "pIP5j6ZBfwk5vry";
        r14[4] = "SYbytyslPAjChX5NL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01f1, code lost:
        if (r15 == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01f4, code lost:
        r11 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01fa, code lost:
        if (A0o(r6, r34) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01fc, code lost:
        A0W(r24, r38, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0202, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0209, code lost:
        if (r31.A0q.A0G() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x020b, code lost:
        r31.A0q.A0B(r32, r34);
        r31.A0q.A0K(r31.A0j, r0, r43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x021a, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x021d, code lost:
        if (com.facebook.ads.redexgen.X.AbstractC1672gE.A02 < r11) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0224, code lost:
        if (r6 >= com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0228, code lost:
        A0a(r24, r38, r0, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x022f, code lost:
        r31.A0K = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0237, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0238, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0239, code lost:
        r2 = com.facebook.ads.redexgen.X.C0T.A11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x024a, code lost:
        if (r2[2].charAt(5) != r2[3].charAt(5)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0250, code lost:
        if (A0g() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0252, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0253, code lost:
        r2 = com.facebook.ads.redexgen.X.C0T.A11;
        r2[2] = "8NvNAYpc0BoPNabeyDwODwJqz8UEKgP7";
        r2[3] = "yftWtYHfYXRkx0qg1LFYnmo7iQbYy25Y";
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0263, code lost:
        if (A0g() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0266, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0270, code lost:
        if (r6 >= 30000) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0276, code lost:
        if (r6 <= 11000) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x027b, code lost:
        java.lang.Thread.sleep((r6 - 10000) / 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0281, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0288, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0289, code lost:
        A0X(r24, r38, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x028e, code lost:
        r31.A0K = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0291, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0292, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0297, code lost:
        if (A0g() != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0299, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x029a, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x029b, code lost:
        r2 = r40 - r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x02a4, code lost:
        if (r31.A0j.A01 == (-1.0f)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x02a6, code lost:
        r0 = r31.A0j.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x02aa, code lost:
        A0R(r32, r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x02b2, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x02b3, code lost:
        r0 = 30.0f;
     */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A23(long r32, long r34, com.facebook.ads.redexgen.X.InterfaceC1268Yz r36, java.nio.ByteBuffer r37, int r38, int r39, long r40, boolean r42, boolean r43) throws com.facebook.ads.redexgen.X.EK {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0T.A23(long, long, com.facebook.ads.redexgen.X.Yz, java.nio.ByteBuffer, int, int, long, boolean, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final boolean A25(Z2 z22) {
        return (this.A0U != null && (this.A0Z || this.A0U.isValid())) || A0r(z22);
    }

    public final Pair<ColorInfo, ColorInfo> A26(ColorInfo colorInfo) {
        if (!ColorInfo.A09(colorInfo)) {
            return Pair.create(ColorInfo.A09, ColorInfo.A09);
        }
        if (colorInfo.A03 == 7) {
            return Pair.create(colorInfo, colorInfo.A0A().A02(6).A03());
        }
        return Pair.create(colorInfo, colorInfo);
    }

    public final void A27() {
        this.A0i = true;
        if (!this.A0h) {
            this.A0h = true;
            this.A0t.A0D(this.A0U);
        }
    }

    @MetaExoPlayerCustomization("Required for VideoProcessorManager migration")
    public final boolean A28(long j10, long j11, boolean z10) {
        return A0k(j10) && !z10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et, com.facebook.ads.redexgen.X.QS
    public final void A9Y(int i10, Object obj) throws EK {
        if (i10 == 1) {
            A0U((Surface) obj);
        } else if (i10 == 4) {
            this.A0H = ((Integer) obj).intValue();
            InterfaceC1268Yz A1j = A1j();
            if (A1j == null) {
                return;
            }
            A1j.AIy(this.A0H);
        } else if (i10 == 7) {
            this.A0X = (InterfaceC1701gi) obj;
        } else if (i10 == 10001) {
            A0f(obj);
        } else if (i10 == 13) {
            this.A0q.A0F((List) AbstractC1589es.A01(obj));
        } else {
            String[] strArr = A11;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A11[5] = "Jx05LvFPfjBDIELAnIFdUSoDRhvrfVls";
            if (i10 == 14) {
                C1655fx c1655fx = (C1655fx) AbstractC1589es.A01(obj);
                if (c1655fx.A03() == 0 || c1655fx.A02() == 0 || this.A0U == null) {
                    return;
                }
                C1687gU c1687gU = this.A0q;
                String[] strArr2 = A11;
                if (strArr2[2].charAt(5) != strArr2[3].charAt(5)) {
                    c1687gU.A0C(this.A0U, c1655fx);
                    return;
                }
                String[] strArr3 = A11;
                strArr3[6] = "SvlqXFqKcpo7z8I";
                strArr3[4] = "Eg1jmv6OW92Zroxh5";
                c1687gU.A0C(this.A0U, c1655fx);
                return;
            }
            super.A9Y(i10, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10, com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final boolean AAE() {
        boolean AAE = super.AAE();
        boolean isEnded = this.A0q.A0G();
        if (isEnded) {
            boolean isEnded2 = this.A0q.A0I();
            return AAE & isEnded2;
        }
        return AAE;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10, com.facebook.ads.redexgen.X.InterfaceC1259Yq
    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public final boolean AAT() {
        if (super.AAT() && !this.A0h && ((this.A0T == null || this.A0U != this.A0T) && A1j() != null && !this.A0j)) {
            ((AbstractC0760Et) this).A0B = MI.A08;
        }
        if (super.AAT() && ((!this.A0q.A0G() || this.A0q.A0H()) && (this.A0h || ((this.A0T != null && this.A0U == this.A0T) || A1j() == null || this.A0j)))) {
            this.A0M = -9223372036854775807L;
            if (A11[5].charAt(17) != 'C') {
                String[] strArr = A11;
                strArr[6] = "uTJdMB2Jd3DbzLm";
                strArr[4] = "Vh5Zhx5fq1hbkzod2";
                return true;
            }
            throw new RuntimeException();
        } else if (this.A0M == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.A0M) {
                return true;
            }
            this.A0M = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10, com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void AHd(long j10, long j11) throws EK {
        super.AHd(j10, j11);
        if (this.A0q.A0G()) {
            this.A0q.A0B(j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq, com.facebook.ads.redexgen.X.InterfaceC1054Qi
    public final String getName() {
        return A0B(682, 23, 48);
    }
}
