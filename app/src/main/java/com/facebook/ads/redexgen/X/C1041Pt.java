package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
@Deprecated
/* renamed from: com.facebook.ads.redexgen.X.Pt  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1041Pt implements InterfaceC1509dZ {
    public final Context A00;
    public final InterfaceC1509dZ A01;
    public final InterfaceC1558eN A02;

    public C1041Pt(Context context, InterfaceC1558eN interfaceC1558eN, InterfaceC1509dZ interfaceC1509dZ) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC1558eN;
        this.A01 = interfaceC1509dZ;
    }

    public C1041Pt(Context context, String str, InterfaceC1558eN interfaceC1558eN) {
        this(context, interfaceC1558eN, new C5K().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.5L] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1509dZ
    /* renamed from: A00 */
    public final C5L A58() {
        final Context context = this.A00;
        final Q7 A58 = this.A01.A58();
        ?? r12 = new Q7(context, A58) { // from class: com.facebook.ads.redexgen.X.5L
            public static byte[] A0B;
            public static String[] A0C = {"Qm6an9QvyBEMhzrPoVeL4badJ2ebPr5d", "PKapHge5bLRSHugJBbGktswhmInqAkt4", "0PDVTUJweTUURsmFGPWXgsSdS05i8Khy", "qYoCqzZfrvnAqG7Xn0sV0", "Y2tNNB146JSrElSs", "hFFlUJic6RPbUc1X", "8DkdVmiF3xPnGCeUOxRyR8uKQmKhqi27", "Viys6"};
            public Q7 A00;
            public Q7 A01;
            public Q7 A02;
            public Q7 A03;
            public Q7 A04;
            public Q7 A05;
            public Q7 A06;
            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public Q7 A07;
            public final Q7 A08;
            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public final Context A09;
            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public final List<InterfaceC1558eN> A0A = new ArrayList();

            public static String A07(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 50);
                }
                return new String(copyOfRange);
            }

            public static void A08() {
                A0B = new byte[]{-54, -4, 9, -1, 13, 10, 4, -1, -6, -4, 14, 14, 0, 15, -54, 119, -86, -86, -101, -93, -90, -86, -97, -92, -99, 86, -86, -91, 86, -90, -94, -105, -81, 86, -120, -118, -125, -122, 86, -87, -86, -88, -101, -105, -93, 86, -83, -97, -86, -98, -91, -85, -86, 86, -102, -101, -90, -101, -92, -102, -97, -92, -99, 86, -91, -92, 86, -86, -98, -101, 86, -120, -118, -125, -122, 86, -101, -82, -86, -101, -92, -87, -97, -91, -92, -39, -6, -5, -10, 10, 1, 9, -39, -10, 9, -10, -24, 4, 10, 7, -8, -6, Byte.MAX_VALUE, -84, -84, -87, -84, 90, -93, -88, -83, -82, -101, -88, -82, -93, -101, -82, -93, -88, -95, 90, -116, -114, -121, -118, 90, -97, -78, -82, -97, -88, -83, -93, -87, -88, 18, 31, 21, 35, 32, 26, 21, -33, 35, 22, 36, 32, 38, 35, 20, 22, -61, -43, -43, -57, -42, 11, 23, 21, -42, 15, 23, 23, 15, 20, 13, -42, 9, 22, 12, 26, 23, 17, 12, -42, 13, 32, 23, 24, 20, 9, 33, 13, 26, -38, -42, 13, 32, 28, -42, 26, 28, 21, 24, -42, -6, 28, 21, 24, -20, 9, 28, 9, -5, 23, 29, 26, 11, 13, -37, -25, -26, -20, -35, -26, -20, -106, -109, -90, -109, -23, -40, -18, -23, -36, -22, -26, -20, -23, -38, -36, 6, 8, 1, 4, -45, -62, -50};
            }

            static {
                A08();
            }

            {
                this.A09 = context.getApplicationContext();
                this.A08 = (Q7) AbstractC1589es.A01(A58);
            }

            private Q7 A00() {
                if (this.A00 == null) {
                    this.A00 = new AbstractC05325e(this.A09) { // from class: com.facebook.ads.redexgen.X.0s
                        public static byte[] A05;
                        public static String[] A06 = {"ijZK9S4", "Y9B02Wdt7Xj5Lewa5ltDFgXj0DYuYSo3", "r3i", "0LbTa2BcsJIqO6SvMMpCA1Ze40sdAelD", "FJ1BB7SRQ0ipPesOCzOqHiL0rS5UuYlV", "tio", "YA4qEPbjEwWaPS8weADkIBBirmo6XITA", "36ZDajpfulynYBV6ANx3GTbLIY4QbGLR"};
                        public long A00;
                        public Uri A01;
                        public InputStream A02;
                        public boolean A03;
                        public final AssetManager A04;

                        public static String A00(int i10, int i11, int i12) {
                            byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
                            for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                                copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 125);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A05 = new byte[]{11, -20, 30, 43, 33, 47, 44, 38, 33, 28, 30, 48, 48, 34, 49, -20};
                        }

                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException
                         */
                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final long AFq(C1519dj c1519dj) throws QA {
                            try {
                                this.A01 = c1519dj.A06;
                                String str = (String) AbstractC1589es.A01(this.A01.getPath());
                                if (str.startsWith(A00(1, 15, 64))) {
                                    str = str.substring(15);
                                } else if (str.startsWith(A00(0, 1, 95))) {
                                    str = str.substring(1);
                                }
                                A0G(c1519dj);
                                this.A02 = this.A04.open(str, 1);
                                if (this.A02.skip(c1519dj.A04) >= c1519dj.A04) {
                                    if (c1519dj.A03 != -1) {
                                        this.A00 = c1519dj.A03;
                                    } else {
                                        this.A00 = this.A02.available();
                                        int i10 = (this.A00 > 2147483647L ? 1 : (this.A00 == 2147483647L ? 0 : -1));
                                        if (A06[6].charAt(17) != 'A') {
                                            throw new RuntimeException();
                                        }
                                        A06[0] = "Tv7Yrv9";
                                        if (i10 == 0) {
                                            this.A00 = -1L;
                                        }
                                    }
                                    this.A03 = true;
                                    A0H(c1519dj);
                                    return this.A00;
                                }
                                throw new QA(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            } catch (QA e8) {
                                throw e8;
                            } catch (IOException e10) {
                                throw new QA(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
                            }
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A04 = r2.getAssets();
                        }

                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final Uri A9F() {
                            return this.A01;
                        }

                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final void close() throws QA {
                            this.A01 = null;
                            try {
                                try {
                                    if (this.A02 != null) {
                                        this.A02.close();
                                    }
                                    this.A02 = null;
                                    if (this.A03) {
                                        this.A03 = false;
                                        A0E();
                                    }
                                } catch (IOException e8) {
                                    throw new QA(e8, 2000);
                                }
                            } catch (Throwable th) {
                                this.A02 = null;
                                if (this.A03) {
                                    this.A03 = false;
                                    if (A06[0].length() != 7) {
                                        throw new RuntimeException();
                                    }
                                    A06[6] = "SnSHy8yPr0lafSe2PAeGXslDxg5fpZi8";
                                    A0E();
                                }
                                throw th;
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.O9
                        public final int read(byte[] bArr, int i10, int i11) throws QA {
                            if (i11 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i11 = (int) Math.min(this.A00, i11);
                                }
                                int read = ((InputStream) AbstractC1672gE.A0f(this.A02)).read(bArr, i10, i11);
                                if (read == -1) {
                                    return -1;
                                }
                                int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                                if (bytesRead != 0) {
                                    this.A00 -= read;
                                }
                                A0F(read);
                                return read;
                            } catch (IOException e8) {
                                throw new QA(e8, 2000);
                            }
                        }
                    };
                    A09(this.A00);
                }
                return this.A00;
            }

            private Q7 A01() {
                if (this.A01 == null) {
                    this.A01 = new AbstractC05325e(this.A09) { // from class: com.facebook.ads.redexgen.X.0r
                        public static byte[] A06;
                        public static String[] A07 = {"67bv5djIMF", "BxCohHPRss6mxLNFcQW", "i5wsGlZU6", "vbzLaBVe31BtmOnbzbtnWTTKBElKFQb1", "WdO87ICrhr", "TRDwQanC7FQciUC0ONH", "a94z1ZK8AyeWWjQh2i7I6Bk8umQIl1tM", "RdYzWmRrTAFimrQgIQPfnTbGm0Cxr37W"};
                        public long A00;
                        public AssetFileDescriptor A01;
                        public Uri A02;
                        public FileInputStream A03;
                        public boolean A04;
                        public final ContentResolver A05;

                        public static String A00(int i10, int i11, int i12) {
                            byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
                            for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                                copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 7);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A06 = new byte[]{27, 30, 27, Byte.MAX_VALUE, 83, 73, 80, 88, 28, 82, 83, 72, 28, 83, 76, 89, 82, 28, 90, 85, 80, 89, 28, 88, 89, 79, 95, 78, 85, 76, 72, 83, 78, 28, 90, 83, 78, 6, 28, 10, 5, 15, 25, 4, 2, 15, 69, 27, 25, 4, 29, 2, 15, 14, 25, 69, 14, 19, 31, 25, 10, 69, 42, 40, 40, 46, 59, 63, 52, 36, 57, 34, 44, 34, 37, 42, 39, 52, 38, 46, 47, 34, 42, 52, 45, 36, 57, 38, 42, 63, 82, 94, 95, 69, 84, 95, 69, 6};
                        }

                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 15
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
                        	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                        	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                         */
                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final long AFq(C1519dj c1519dj) throws Q8 {
                            AssetFileDescriptor openAssetFileDescriptor;
                            try {
                                try {
                                    Uri uri = c1519dj.A06;
                                    this.A02 = uri;
                                    A0G(c1519dj);
                                    if (A00(90, 7, 54).equals(c1519dj.A06.getScheme())) {
                                        Bundle bundle = new Bundle();
                                        bundle.putBoolean(A00(39, 51, 108), true);
                                        openAssetFileDescriptor = this.A05.openTypedAssetFileDescriptor(uri, A00(0, 3, 54), bundle);
                                    } else {
                                        openAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, A00(97, 1, 115));
                                    }
                                    this.A01 = openAssetFileDescriptor;
                                    if (openAssetFileDescriptor == null) {
                                        try {
                                            throw new Q8(new IOException(A00(3, 36, 59) + uri), 2000);
                                        } catch (IOException e8) {
                                            e = e8;
                                            throw new Q8(e, e instanceof FileNotFoundException ? 2005 : 2000);
                                        }
                                    }
                                    long length = openAssetFileDescriptor.getLength();
                                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                                    this.A03 = fileInputStream;
                                    if (length == -1 || c1519dj.A04 <= length) {
                                        long startOffset = openAssetFileDescriptor.getStartOffset();
                                        long skip = fileInputStream.skip(c1519dj.A04 + startOffset) - startOffset;
                                        if (skip == c1519dj.A04) {
                                            if (length == -1) {
                                                FileChannel channel = fileInputStream.getChannel();
                                                long size = channel.size();
                                                if (size == 0) {
                                                    this.A00 = -1L;
                                                } else {
                                                    this.A00 = size - channel.position();
                                                    if (this.A00 < 0) {
                                                        throw new Q8(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                                    }
                                                }
                                            } else {
                                                this.A00 = length - skip;
                                                if (this.A00 < 0) {
                                                    throw new Q8(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                                }
                                            }
                                            if (c1519dj.A03 != -1) {
                                                this.A00 = this.A00 == -1 ? c1519dj.A03 : Math.min(this.A00, c1519dj.A03);
                                            }
                                            this.A04 = true;
                                            A0H(c1519dj);
                                            return c1519dj.A03 != -1 ? c1519dj.A03 : this.A00;
                                        }
                                        throw new Q8(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                    }
                                    throw new Q8(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                } catch (IOException e10) {
                                    e = e10;
                                }
                            } catch (Q8 e11) {
                                throw e11;
                            }
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A05 = r2.getContentResolver();
                        }

                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final Uri A9F() {
                            return this.A02;
                        }

                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final void close() throws Q8 {
                            this.A02 = null;
                            try {
                                try {
                                    if (this.A03 != null) {
                                        this.A03.close();
                                    }
                                    this.A03 = null;
                                    try {
                                        try {
                                            if (this.A01 != null) {
                                                this.A01.close();
                                            }
                                        } catch (IOException e8) {
                                            throw new Q8(e8, 2000);
                                        }
                                    } finally {
                                        this.A01 = null;
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                    }
                                } catch (IOException e10) {
                                    throw new Q8(e10, 2000);
                                }
                            } catch (Throwable th) {
                                this.A03 = null;
                                try {
                                    try {
                                        if (this.A01 != null) {
                                            this.A01.close();
                                        }
                                        this.A01 = null;
                                        if (A07[3].charAt(8) != '3') {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr = A07;
                                        strArr[1] = "1xbzCf7XKXuGDZ9FSbV";
                                        strArr[5] = "KFXJYdfoiPhDSwFgNDN";
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                        throw th;
                                    } catch (IOException e11) {
                                        throw new Q8(e11, 2000);
                                    }
                                } finally {
                                    this.A01 = null;
                                    if (this.A04) {
                                        this.A04 = false;
                                        A0E();
                                    }
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.O9
                        public final int read(byte[] bArr, int i10, int i11) throws Q8 {
                            if (i11 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i11 = (int) Math.min(this.A00, i11);
                                }
                                int read = ((FileInputStream) AbstractC1672gE.A0f(this.A03)).read(bArr, i10, i11);
                                if (read == -1) {
                                    return -1;
                                }
                                int i12 = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                                if (A07[2].length() != 3) {
                                    A07[2] = "VpboIS0bwB8qwjSyFt3nVNUpL";
                                    if (i12 != 0) {
                                        this.A00 -= read;
                                    }
                                    A0F(read);
                                    if (A07[3].charAt(8) != '3') {
                                        throw new RuntimeException();
                                    }
                                    A07[2] = "kp79MYRM217RVhbIBfq1";
                                    return read;
                                }
                                throw new RuntimeException();
                            } catch (IOException e8) {
                                throw new Q8(e8, 2000);
                            }
                        }
                    };
                    A09(this.A01);
                }
                return this.A01;
            }

            private Q7 A02() {
                if (this.A02 == null) {
                    this.A02 = new AbstractC05325e() { // from class: com.facebook.ads.redexgen.X.0q
                        public static byte[] A04;
                        public static String[] A05 = {"u3x9p7z2Ttk3I8E6eOCIoGpCfho89q1p", "9mthCpedrhM7phOMoFpvPJ1c476GqM9q", "YMUUWk8tq8s18401lLlJ8I6NG6abq2Bs", "jwZlTiicYRqZfkXPOUfkFRSIyJTsB2bY", "H21C8IuDu4ngyO4p7GkZaRyhtbcuKrkr", "GoUK4HBKeVAAAnH6WNZhF0r8xwC6Wya3", "18JFTHyH4kAwck3cfBIGFWwNjPPbje", "vIlNZmjmc2jNImOQb926fU9NHo6kuVQq"};
                        public int A00;
                        public int A01;
                        public C1519dj A02;
                        public byte[] A03;

                        public static String A00(int i10, int i11, int i12) {
                            byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                            for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                                copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 121);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A04 = new byte[]{-6, -12, 27, 26, 44, 30, -17, -19, 37, 82, 82, 79, 82, 0, 87, 72, 73, 76, 69, 0, 80, 65, 82, 83, 73, 78, 71, 0, 34, 65, 83, 69, 22, 20, 0, 69, 78, 67, 79, 68, 69, 68, 0, 83, 84, 82, 73, 78, 71, 26, 0, -45, -20, -29, -10, -18, -29, -31, -14, -29, -30, -98, -45, -48, -57, -98, -28, -19, -16, -21, -33, -14, -72, -98, -48, -23, -18, -16, -21, -21, -22, -19, -17, -32, -33, -101, -18, -34, -29, -32, -24, -32, -75, -101, -11, -14, 5, -14};
                        }

                        static {
                            A01();
                        }

                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final Uri A9F() {
                            if (this.A02 != null) {
                                return this.A02.A06;
                            }
                            return null;
                        }

                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final long AFq(C1519dj c1519dj) throws IOException {
                            A0G(c1519dj);
                            this.A02 = c1519dj;
                            Uri uri = c1519dj.A06;
                            String scheme = uri.getScheme();
                            AbstractC1589es.A09(A00(94, 4, 24).equals(scheme), A00(74, 20, 2) + scheme);
                            String[] uriParts = AbstractC1672gE.A1O(uri.getSchemeSpecificPart(), A00(0, 1, 85));
                            if (uriParts.length == 2) {
                                String str = uriParts[1];
                                String dataString = uriParts[0];
                                if (dataString.contains(A00(1, 7, 64))) {
                                    try {
                                        this.A03 = Base64.decode(str, 0);
                                    } catch (IllegalArgumentException e8) {
                                        throw Q6.A02(A00(8, 43, 103) + str, e8);
                                    }
                                } else {
                                    this.A03 = AbstractC1672gE.A1G(URLDecoder.decode(str, AbstractC1758hd.A02.name()));
                                }
                                if (c1519dj.A04 <= this.A03.length) {
                                    this.A01 = (int) c1519dj.A04;
                                    this.A00 = this.A03.length - this.A01;
                                    if (c1519dj.A03 != -1) {
                                        this.A00 = (int) Math.min(this.A00, c1519dj.A03);
                                    }
                                    A0H(c1519dj);
                                    return c1519dj.A03 != -1 ? c1519dj.A03 : this.A00;
                                }
                                this.A03 = null;
                                throw new C1512dc(AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                            throw Q6.A02(A00(51, 23, 5) + uri, null);
                        }

                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final void close() {
                            if (this.A03 != null) {
                                this.A03 = null;
                                if (A05[6].length() == 32) {
                                    throw new RuntimeException();
                                }
                                String[] strArr = A05;
                                strArr[7] = "0tC0a2pqDHNLBzULCFZEjdh9P0z1cfYq";
                                strArr[1] = "p5uSIyVweC2dgHzEx12P2whYvoF8pMWq";
                                A0E();
                            }
                            this.A02 = null;
                        }

                        @Override // com.facebook.ads.redexgen.X.O9
                        public final int read(byte[] bArr, int i10, int i11) {
                            if (i11 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            int min = Math.min(i11, this.A00);
                            System.arraycopy(AbstractC1672gE.A0f(this.A03), this.A01, bArr, i10, min);
                            this.A01 += min;
                            this.A00 -= min;
                            A0F(min);
                            return min;
                        }
                    };
                    A09(this.A02);
                }
                return this.A02;
            }

            private Q7 A03() {
                if (this.A03 == null) {
                    this.A03 = new C04150o();
                    A09(this.A03);
                }
                return this.A03;
            }

            private Q7 A04() {
                if (this.A04 == null) {
                    this.A04 = new AbstractC05325e(this.A09) { // from class: com.facebook.ads.redexgen.X.0n
                        public static byte[] A07;
                        public static String[] A08 = {"IWRdlT6Nh3wIT", "", "5pAPbUbg9DbQjlF7jX34MQjGBayg7X1P", "KNjB2", "bkODobGUuj7vKzkNuAShSAN7e55Cu8Qc", "fpDwP8Q1xweRusUji1xtt3TNQpJOBlAv", "RkAvgPtrb", "LpfXir7WSIoSn9jmSG7HeS6qpRP3b0pc"};
                        public long A00;
                        public AssetFileDescriptor A01;
                        public Uri A02;
                        public InputStream A03;
                        public boolean A04;
                        public final Resources A05;
                        public final String A06;

                        public static String A00(int i10, int i11, int i12) {
                            byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
                            for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                                copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 85);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A07 = new byte[]{25, 112, 69, 110, 100, 32, 111, 102, 32, 115, 116, 114, 101, 97, 109, 32, 114, 101, 97, 99, 104, 101, 100, 32, 104, 97, 118, 105, 110, 103, 32, 110, 111, 116, 32, 114, 101, 97, 100, 32, 115, 117, 102, 102, 105, 99, 105, 101, 110, 116, 32, 100, 97, 116, 97, 46, 39, 16, 6, 26, 0, 7, 22, 16, 85, 28, 17, 16, 27, 1, 28, 19, 28, 16, 7, 85, 24, 0, 6, 1, 85, 23, 16, 85, 20, 27, 85, 28, 27, 1, 16, 18, 16, 7, 91, 63, 8, 30, 2, 24, 31, 14, 8, 77, 4, 30, 77, 14, 2, 0, 29, 31, 8, 30, 30, 8, 9, 87, 77, 7, 48, 38, 58, 32, 39, 54, 48, 117, 59, 58, 33, 117, 51, 58, 32, 59, 49, 123, 111, 104, 115, 26, 87, 79, 73, 78, 26, 95, 83, 78, 82, 95, 72, 26, 79, 73, 95, 26, 73, 89, 82, 95, 87, 95, 26, 72, 91, 77, 72, 95, 73, 85, 79, 72, 89, 95, 26, 85, 72, 26, 91, 84, 94, 72, 85, 83, 94, 20, 72, 95, 73, 85, 79, 72, 89, 95, 25, 33, 110, 85, 90, 80, 70, 91, 93, 80, 26, 70, 81, 71, 91, 65, 70, 87, 81, 105, 122, 108, 62, 45, 59, 62, 41, 63, 35, 57, 62, 47, 41};
                        }

                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException
                         */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
                        /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
                        @Override // com.facebook.ads.redexgen.X.Q7
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final long AFq(com.facebook.ads.redexgen.X.C1519dj r14) throws com.facebook.ads.redexgen.X.C1029Ph {
                            /*
                                Method dump skipped, instructions count: 523
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04140n.AFq(com.facebook.ads.redexgen.X.dj):long");
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A05 = r2.getResources();
                            this.A06 = r2.getPackageName();
                        }

                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final Uri A9F() {
                            return this.A02;
                        }

                        @Override // com.facebook.ads.redexgen.X.Q7
                        public final void close() throws C1029Ph {
                            this.A02 = null;
                            try {
                                try {
                                    if (this.A03 != null) {
                                        this.A03.close();
                                    }
                                    this.A03 = null;
                                    try {
                                        try {
                                            if (this.A01 != null) {
                                                this.A01.close();
                                            }
                                        } catch (IOException e8) {
                                            throw new C1029Ph(null, e8, 2000);
                                        }
                                    } finally {
                                        this.A01 = null;
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                    }
                                } catch (IOException e10) {
                                    throw new C1029Ph(null, e10, 2000);
                                }
                            } catch (Throwable th) {
                                this.A03 = null;
                                try {
                                    try {
                                        if (this.A01 != null) {
                                            this.A01.close();
                                        }
                                        this.A01 = null;
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                        throw th;
                                    } catch (IOException e11) {
                                        throw new C1029Ph(null, e11, 2000);
                                    }
                                } finally {
                                    this.A01 = null;
                                    if (this.A04) {
                                        this.A04 = false;
                                        A0E();
                                    }
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.O9
                        public final int read(byte[] bArr, int i10, int i11) throws C1029Ph {
                            if (i11 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i11 = (int) Math.min(this.A00, i11);
                                }
                                int read = ((InputStream) AbstractC1672gE.A0f(this.A03)).read(bArr, i10, i11);
                                if (read == -1) {
                                    int i12 = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                                    String[] strArr = A08;
                                    String str = strArr[7];
                                    String str2 = strArr[2];
                                    int bytesRead = str.charAt(1);
                                    if (bytesRead != str2.charAt(1)) {
                                        throw new RuntimeException();
                                    }
                                    A08[0] = "AZxtvN8hu7tYb";
                                    if (i12 == 0) {
                                        return -1;
                                    }
                                    throw new C1029Ph(A00(2, 54, 85), new EOFException(), 2000);
                                }
                                if (this.A00 != -1) {
                                    long j10 = this.A00 - read;
                                    int bytesRead2 = A08[4].charAt(18);
                                    if (bytesRead2 != 83) {
                                        String[] strArr2 = A08;
                                        strArr2[7] = "dpUH5F3Qkb7C8dhX3YikAjSwuXCfbaVT";
                                        strArr2[2] = "bpZlp59TdCP6KZrXUuU2I6OnnP9xBnO3";
                                        this.A00 = j10;
                                    } else {
                                        A08[6] = "09F0b2gN76HHavyQ2P1o1vTX4JYH";
                                        this.A00 = j10;
                                    }
                                }
                                A0F(read);
                                return read;
                            } catch (IOException e8) {
                                throw new C1029Ph(null, e8, 2000);
                            }
                        }
                    };
                    A09(this.A04);
                }
                return this.A04;
            }

            private Q7 A05() {
                if (this.A05 == null) {
                    try {
                        this.A05 = (Q7) Class.forName(A07(157, 53, 118)).getConstructor(new Class[0]).newInstance(new Object[0]);
                        A09(this.A05);
                    } catch (ClassNotFoundException unused) {
                        AbstractC1633fb.A07(A07(85, 17, 99), A07(15, 70, 4));
                    } catch (Exception e8) {
                        throw new RuntimeException(A07(102, 34, 8), e8);
                    }
                    if (this.A05 == null) {
                        Q7 q72 = this.A08;
                        if (A0C[7].length() != 5) {
                            throw new RuntimeException();
                        }
                        A0C[3] = "MkKzK2TRajiRPNTMTDMAr";
                        this.A05 = q72;
                    }
                }
                return this.A05;
            }

            private Q7 A06() {
                if (this.A06 == null) {
                    this.A06 = new C04130m();
                    A09(this.A06);
                }
                return this.A06;
            }

            /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void A09(com.facebook.ads.redexgen.X.Q7 r3) {
                /*
                    r2 = this;
                    r1 = 0
                L1:
                    java.util.List<com.facebook.ads.redexgen.X.eN> r0 = r2.A0A
                    int r0 = r0.size()
                    if (r1 >= r0) goto L17
                    java.util.List<com.facebook.ads.redexgen.X.eN> r0 = r2.A0A
                    java.lang.Object r0 = r0.get(r1)
                    com.facebook.ads.redexgen.X.eN r0 = (com.facebook.ads.redexgen.X.InterfaceC1558eN) r0
                    r3.A3t(r0)
                    int r1 = r1 + 1
                    goto L1
                L17:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C5L.A09(com.facebook.ads.redexgen.X.Q7):void");
            }

            private void A0A(Q7 q72, InterfaceC1558eN interfaceC1558eN) {
                if (q72 != null) {
                    q72.A3t(interfaceC1558eN);
                }
            }

            @Override // com.facebook.ads.redexgen.X.Q7
            public final void A3t(InterfaceC1558eN interfaceC1558eN) {
                AbstractC1589es.A01(interfaceC1558eN);
                this.A08.A3t(interfaceC1558eN);
                this.A0A.add(interfaceC1558eN);
                A0A(this.A03, interfaceC1558eN);
                A0A(this.A00, interfaceC1558eN);
                A0A(this.A01, interfaceC1558eN);
                A0A(this.A05, interfaceC1558eN);
                A0A(this.A06, interfaceC1558eN);
                A0A(this.A02, interfaceC1558eN);
                A0A(this.A04, interfaceC1558eN);
            }

            @Override // com.facebook.ads.redexgen.X.Q7
            public final Map<String, List<String>> A8j() {
                if (this.A07 == null) {
                    return Collections.emptyMap();
                }
                Q7 q72 = this.A07;
                String[] strArr = A0C;
                if (strArr[0].charAt(18) != strArr[6].charAt(18)) {
                    A0C[2] = "reJjgQCLShmyHM7DeAVLMzH6U5vRqp3K";
                    return q72.A8j();
                }
                throw new RuntimeException();
            }

            @Override // com.facebook.ads.redexgen.X.Q7
            public final Uri A9F() {
                if (this.A07 == null) {
                    return null;
                }
                return this.A07.A9F();
            }

            @Override // com.facebook.ads.redexgen.X.Q7
            public final long AFq(C1519dj c1519dj) throws IOException {
                AbstractC1589es.A08(this.A07 == null);
                String scheme = c1519dj.A06.getScheme();
                if (AbstractC1672gE.A1A(c1519dj.A06)) {
                    String path = c1519dj.A06.getPath();
                    if (path != null) {
                        String scheme2 = A07(0, 15, 105);
                        boolean startsWith = path.startsWith(scheme2);
                        String[] strArr = A0C;
                        String uriPath = strArr[0];
                        if (uriPath.charAt(18) == strArr[6].charAt(18)) {
                            throw new RuntimeException();
                        }
                        A0C[1] = "3YPpUglDeLMsDukioucZm3DhYp9fLdDl";
                        if (startsWith) {
                            this.A07 = A00();
                        }
                    }
                    this.A07 = A03();
                } else {
                    String scheme3 = A07(152, 5, 48);
                    if (scheme3.equals(scheme)) {
                        this.A07 = A00();
                    } else {
                        String scheme4 = A07(210, 7, 70);
                        if (scheme4.equals(scheme)) {
                            this.A07 = A01();
                        } else {
                            String scheme5 = A07(232, 4, 98);
                            if (scheme5.equals(scheme)) {
                                this.A07 = A05();
                            } else {
                                String scheme6 = A07(236, 3, 44);
                                if (scheme6.equals(scheme)) {
                                    this.A07 = A06();
                                } else {
                                    String scheme7 = A07(217, 4, 0);
                                    if (scheme7.equals(scheme)) {
                                        this.A07 = A02();
                                    } else {
                                        String scheme8 = A07(221, 11, 69);
                                        if (!scheme8.equals(scheme)) {
                                            String scheme9 = A07(136, 16, 127);
                                            if (!scheme9.equals(scheme)) {
                                                this.A07 = this.A08;
                                            }
                                        }
                                        this.A07 = A04();
                                    }
                                }
                            }
                        }
                    }
                }
                return this.A07.AFq(c1519dj);
            }

            @Override // com.facebook.ads.redexgen.X.Q7
            public final void close() throws IOException {
                if (this.A07 != null) {
                    try {
                        this.A07.close();
                    } finally {
                        this.A07 = null;
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.X.O9
            public final int read(byte[] bArr, int i10, int i11) throws IOException {
                return ((Q7) AbstractC1589es.A01(this.A07)).read(bArr, i10, i11);
            }
        };
        if (this.A02 != null) {
            r12.A3t(this.A02);
        }
        return r12;
    }
}
