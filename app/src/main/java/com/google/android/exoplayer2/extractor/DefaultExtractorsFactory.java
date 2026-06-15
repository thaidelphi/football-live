package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import com.facebook.ads.redexgen.X.C0958Mm;
import com.facebook.ads.redexgen.X.P0;
import com.facebook.ads.redexgen.X.UF;
import com.facebook.ads.redexgen.X.UG;
import com.facebook.ads.redexgen.X.UK;
import com.facebook.ads.redexgen.X.UO;
import com.facebook.ads.redexgen.X.ZM;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class DefaultExtractorsFactory implements UO {
    public static byte[] A0D;
    public static String[] A0E = {"ClrkhcWADC8kVOqRD8woyHnTUaZ8Zlx0", "hwvlnLov7mEUxeCjcn213RSGDt", "", "4BcCja8PeJXtbv3jh", "YDrqYimlE3", "FRRbwYAqxkuGOgLuyhimO8EU4cJHuoW", "k3q2lY", "SHo"};
    public static final UG A0F;
    public static final UG A0G;
    public static final int[] A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = 1;
    public int A09 = 112800;
    @MetaExoPlayerCustomization("Replaces ImmutableList with List")
    public List<ZM> A0A = C0958Mm.A03(new ZM[0]);
    public boolean A0B;
    public boolean A0C;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0D = new byte[]{22, 34, 32, -31, 26, 34, 34, 26, 31, 24, -31, 20, 33, 23, 37, 34, 28, 23, -31, 24, 43, 34, 35, 31, 20, 44, 24, 37, -27, -31, 23, 24, 22, 34, 23, 24, 37, -31, 32, 28, 23, 28, -31, 0, 28, 23, 28, -8, 43, 39, 37, 20, 22, 39, 34, 37, -6, 6, 4, -59, -2, 6, 6, -2, 3, -4, -59, -8, 5, -5, 9, 6, 0, -5, -59, -4, 15, 6, 7, 3, -8, 16, -4, 9, -55, -59, -4, 15, 11, -59, -3, 3, -8, -6, -59, -35, 3, -8, -6, -36, 15, 11, 9, -8, -6, 11, 6, 9, -33, -21, -23, -86, -29, -21, -21, -29, -24, -31, -86, -35, -22, -32, -18, -21, -27, -32, -86, -31, -12, -21, -20, -24, -35, -11, -31, -18, -82, -86, -31, -12, -16, -86, -30, -24, -35, -33, -86, -62, -24, -35, -33, -56, -27, -34, -18, -35, -18, -11, -68, -58, -108, -55, -76, -68, -65, -76, -75, -65, -72};
    }

    static {
        A05();
        A0H = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
        A0F = new UG(new UF() { // from class: com.facebook.ads.redexgen.X.WU
            @Override // com.facebook.ads.redexgen.X.UF
            public final Constructor A7H() {
                Constructor A01;
                A01 = DefaultExtractorsFactory.A01();
                return A01;
            }
        });
        A0G = new UG(new UF() { // from class: com.facebook.ads.redexgen.X.WQ
            @Override // com.facebook.ads.redexgen.X.UF
            public final Constructor A7H() {
                Constructor A02;
                A02 = DefaultExtractorsFactory.A02();
                return A02;
            }
        });
    }

    public static Constructor<? extends UK> A01() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        boolean isFlacNativeLibraryAvailable = Boolean.TRUE.equals(Class.forName(A00(108, 50, 63)).getMethod(A00(158, 11, 22), new Class[0]).invoke(null, new Object[0]));
        if (!isFlacNativeLibraryAvailable) {
            return null;
        }
        return Class.forName(A00(56, 52, 90)).asSubclass(UK.class).getConstructor(Integer.TYPE);
    }

    public static Constructor<? extends UK> A02() throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName(A00(0, 56, 118)).asSubclass(UK.class).getConstructor(new Class[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
        if (r6.A0C != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r6.A0C != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
        r3 = 0;
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Removed AVI and JPEG extractors")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(int r7, java.util.List<com.facebook.ads.redexgen.X.UK> r8) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.A06(int, java.util.List):void");
    }

    @Override // com.facebook.ads.redexgen.X.UO
    public final synchronized UK[] A5D() {
        return A5E(Uri.EMPTY, new HashMap());
    }

    @Override // com.facebook.ads.redexgen.X.UO
    public final synchronized UK[] A5E(Uri uri, Map<String, List<String>> responseHeaders) {
        List<Extractor> extractors;
        int[] iArr;
        extractors = new ArrayList<>(A0H.length);
        int fileType = P0.A02(responseHeaders);
        if (fileType != -1) {
            A06(fileType, extractors);
        }
        int A00 = P0.A00(uri);
        if (A00 != -1 && A00 != fileType) {
            A06(A00, extractors);
        }
        for (int responseHeadersInferredFileType : A0H) {
            if (responseHeadersInferredFileType != fileType && responseHeadersInferredFileType != A00) {
                A06(responseHeadersInferredFileType, extractors);
            }
        }
        return (UK[]) extractors.toArray(new UK[extractors.size()]);
    }
}
