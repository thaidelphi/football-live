package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Uw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1165Uw {
    public static String[] A00 = {"1uRXHx", "KSG9tn3fbAnNGiFq3tIXiv2aqWq9gviK", "", "pDRAePRkugxTBhpwfzRbB7wpcY9eEGfj", "JOOrWhLHkxhBaOMtaxRugg96yD299L9P", "XvPRnHMXVZQRZT8yjPliK3bU3tQIIgPV", "CBe7ptLYmx", ""};

    public static int A00(int i10, int i11) {
        switch (i10) {
            case 1:
            case 65534:
                int A03 = AbstractC1672gE.A03(i11);
                String[] strArr = A00;
                if (strArr[4].charAt(13) != strArr[5].charAt(13)) {
                    String[] strArr2 = A00;
                    strArr2[4] = "LyihMrYoJZglzyyBQD5zKqMNZCWxunZ7";
                    strArr2[5] = "Fna4OdYg0bpdUVv6IzRRCIHKRdR9DHW7";
                    return A03;
                }
                throw new RuntimeException();
            case 3:
                return i11 == 32 ? 4 : 0;
            default:
                return 0;
        }
    }
}
