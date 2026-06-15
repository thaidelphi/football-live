package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class BT extends V4 {
    public static byte[] A02;
    public static String[] A03 = {"YAZ11", "yuuZExJFo5xDYmIScEYRiBhSTxCVyxA5", "34EzuySigAKtUUageJOSWfSF22bag92r", "oZpbHvv9l0FuX31xY", "cioy8VfyPMJlLYx4Hx9l1nQbmZiIZnM2", "wBuvaKPA0Xld3lJMF98Y4veGuviBi5wB", "sCnVmEJhEomX1m2A7h0t6mhxYUB5gbCg", "vBBtJx5dH6La2WFcTEBhE3l3Mnm8AgsS"};
    public static final Pattern A04;
    public final CharsetDecoder A01 = AbstractC1758hd.A06.newDecoder();
    public final CharsetDecoder A00 = AbstractC1758hd.A01.newDecoder();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{2, 4, 1, 21, 3, 23, 13, 2, 4, 0, 21, 3, 13, 17, 120, Byte.MAX_VALUE, 121, 110, 106, 102, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 103, 110, 55, 48, 54, 33, 37, 41, 49, 54, 40};
    }

    static {
        A02();
        A04 = Pattern.compile(A00(0, 14, 34), 32);
    }

    private String A01(ByteBuffer byteBuffer) {
        try {
            return this.A01.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.A00.decode(byteBuffer).toString();
                this.A00.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.A00.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.A00.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.A01.reset();
            byteBuffer.rewind();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.V4
    public final Metadata A0R(Bi bi, ByteBuffer byteBuffer) {
        char c10;
        String A01 = A01(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (A01 == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        String url = null;
        String str = null;
        Matcher matcher = A04.matcher(A01);
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String key = AbstractC1756hb.A01(group);
                int hashCode = key.hashCode();
                String[] strArr = A03;
                if (strArr[2].charAt(19) != strArr[4].charAt(19)) {
                    A03[7] = "hH4UDShpXMHOmMzORRWNzKcCIyC855UI";
                    switch (hashCode) {
                        case -315603473:
                            String icyString = A00(25, 9, 76);
                            if (key.equals(icyString)) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1646559960:
                            String icyString2 = A00(14, 11, 3);
                            if (key.equals(icyString2)) {
                                c10 = 0;
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
                            url = group2;
                            continue;
                        case 1:
                            str = group2;
                            continue;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, url, str));
    }
}
