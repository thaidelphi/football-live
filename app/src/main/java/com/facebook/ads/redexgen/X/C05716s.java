package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;
/* renamed from: com.facebook.ads.redexgen.X.6s  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05716s implements InterstitialAdApi, Repairable {
    public static byte[] A04;
    public final InterstitialAd A00;
    public final C2013lu A01;
    public final MX A02;
    public final C1900k1 A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-62, -63, -15, -15, -59, -60, -13, -65, -27, 22, 23, 21, -21, -22, -21, 23, -38, 5, -37, -39, 7, -35, -38, -36, 2, 39, 45, 30, 43, 39, 26, 37, -39, 30, 43, 43, 40, 43, -25, -61, 44, 81, 87, 72, 85, 86, 87, 76, 87, 76, 68, 79, 3, 68, 71, 3, 71, 72, 86, 87, 85, 82, 92, 72, 71, 50, 87, 93, 78, 91, 92, 93, 82, 93, 82, 74, 85, 9, 74, 77, 9, 85, 88, 74, 77, 9, 91, 78, 90, 94, 78, 92, 93, 78, 77, 39, 76, 82, 67, 80, 81, 82, 71, 82, 71, 63, 74, -2, 63, 66, -2, 81, 70, 77, 85, -2, 65, 63, 74, 74, 67, 66, -13, -12, 2, 3, 1, -2, 8, 88, 99, 64, 99, 85, 88, 53, 88, -8, -19, -12, -4};
    }

    public C05716s(Context context, String str, InterstitialAd interstitialAd) {
        this.A00 = interstitialAd;
        String uuid = UUID.randomUUID().toString();
        this.A03 = C05686p.A06(context, uuid);
        InterfaceC04311f A0F = this.A03.A0F();
        String adId = AdPlacementType.INTERSTITIAL.toString();
        A0F.A3J(adId, str);
        this.A01 = new C2013lu(this.A03, interstitialAd, str);
        this.A03.A0O(this);
        this.A02 = new MX(this.A01, uuid);
    }

    public final void A02(InterstitialAdListener interstitialAdListener) {
        this.A03.A0F().A3C(interstitialAdListener != null);
        this.A01.A0E(interstitialAdListener);
    }

    public final void A03(RewardData rewardData) {
        this.A02.A0F(rewardData);
    }

    public final void A04(RewardedAdListener rewardedAdListener) {
        this.A01.A0G(rewardedAdListener);
    }

    public final void A05(EnumSet<CacheFlag> enumSet, String str) {
        AbstractC0669Au.A05(A00(129, 8, 122), A00(65, 30, 111), A00(0, 8, 21));
        if (str == null) {
            this.A03.A0F().A3G();
        } else {
            this.A03.A0F().A3F();
        }
        this.A02.A0E(this.A00, enumSet, str);
        this.A03.A0F().A3E();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C05726t(this);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C05736u();
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        AbstractC0669Au.A05(A00(122, 7, 21), A00(40, 25, 105), A00(16, 8, 42));
        if (C06419m.A2D(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0F().A3K();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A0A();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean A0G = this.A02.A0G();
        this.A03.A0F().A5V(A0G);
        return A0G;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0H();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        A05(CacheFlag.ALL, null);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((C05726t) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A6e() != null) {
            this.A01.A6e().onError(this.A00, new AdError(2001, A00(24, 16, 63) + AbstractC0700Cl.A03(this.A03, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A0I(extraHints.getHints());
        this.A01.A0J(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC0669Au.A05(A00(137, 4, 11), A00(95, 27, 100), A00(8, 8, 56));
        this.A03.A0F().A3P();
        boolean A0I = this.A02.A0I(this.A00, new C05736u());
        this.A03.A0F().A3O(A0I);
        return A0I;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A03.A0F().A3P();
        boolean A0I = this.A02.A0I(this.A00, interstitialShowAdConfig);
        this.A03.A0F().A3O(A0I);
        return A0I;
    }
}
