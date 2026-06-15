package com.facebook.ads.redexgen.X;

import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Ue  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1150Ue {
    public static String[] A00 = {"FDZqKr06ohlWngAzLb1S4vWCElM55DzK", "RhdLJADPnAnmo5u9ax0WceaBreJDQ9k9", "QrL1DWT2xBnejKHAC4QUnTXgfcBeQ2gQ", "EpzWGT3KiQIjeIOh2f4tPl273bK91RoZ", "ouZBIgfSc1F7FrUTlJxfCcNk4JGlHTSn", "doPNtlNutNTKR6WTlcy4ZkA135UOZqqm", "iAT7yjfKR3QS26LuYxmX97aaFDDEodpA", "2tJg9F8dmqpsoXmbQI8Vik0tvAjYOd2F"};

    public static int A00(ByteBuffer byteBuffer) {
        long packetDurationUs = A03(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0);
        return (int) ((48000 * packetDurationUs) / 1000000);
    }

    public static int A01(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static int A02(byte[] bArr) {
        return ((bArr[11] & 255) << 8) | (bArr[10] & 255);
    }

    public static long A03(byte b10, byte b11) {
        int frameDurationUs;
        int length;
        int frames = b10 & 255;
        int toc = frames & 3;
        switch (toc) {
            case 0:
                frameDurationUs = 1;
                break;
            case 1:
            case 2:
                frameDurationUs = 2;
                break;
            default:
                frameDurationUs = b11 & 63;
                break;
        }
        int frames2 = frames >> 3;
        int i10 = frames2 & 3;
        if (frames2 >= 16) {
            if (A00[2].charAt(6) != 84) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[5] = "5DKHM86mp5A01A1xNF5iou9hfQnDUqgj";
            strArr[4] = "VIVDyYXCV6YQDndnE7JHAVEKGdWmIOfD";
            length = 2500 << i10;
        } else if (frames2 >= 12) {
            int toc2 = i10 & 1;
            length = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS << toc2;
        } else if (i10 == 3) {
            length = 60000;
        } else {
            length = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS << i10;
        }
        return frameDurationUs * length;
    }

    public static long A04(long j10) {
        return (1000000000 * j10) / 48000;
    }

    public static long A05(byte[] bArr) {
        long A03 = A03(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
        if (A00[1].charAt(5) != 'A') {
            throw new RuntimeException();
        }
        A00[1] = "toZCbA7bIeGdBnDuDiXD3B1AVTs5pIsN";
        return A03;
    }

    public static List<byte[]> A06(byte[] bArr) {
        int preSkipSamples = A02(bArr);
        long A04 = A04(preSkipSamples);
        long A042 = A04(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(A07(A04));
        arrayList.add(A07(A042));
        return arrayList;
    }

    public static byte[] A07(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}
