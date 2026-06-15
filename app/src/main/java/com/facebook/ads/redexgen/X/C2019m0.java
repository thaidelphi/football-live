package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.m0  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2019m0 extends AnonymousClass24 {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C2017ly A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, 63, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public C2019m0(C2017ly c2017ly) {
        this.A00 = c2017ly;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C0963Mr c0963Mr;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2013lu c2013lu;
        C0963Mr c0963Mr2;
        C0963Mr c0963Mr3;
        C0963Mr c0963Mr4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c0963Mr = this.A00.A03;
        if (c0963Mr != null && C06419m.A24(this.A00.A06)) {
            c0963Mr2 = this.A00.A03;
            c0963Mr2.A0S(new C2020m1(this));
            c0963Mr3 = this.A00.A03;
            c0963Mr3.A0N();
            c0963Mr4 = this.A00.A03;
            c0963Mr4.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c2013lu = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c2013lu.A6a());
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2013lu c2013lu;
        interstitialAdExtendedListener = this.A00.A07;
        c2013lu = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c2013lu.A6a());
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2013lu c2013lu;
        this.A00.A06.A0F().A3A();
        interstitialAdExtendedListener = this.A00.A07;
        c2013lu = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c2013lu.A6a());
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2013lu c2013lu;
        interstitialAdExtendedListener = this.A00.A07;
        c2013lu = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c2013lu.A6a());
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0E(View view) {
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0F(AnonymousClass23 anonymousClass23) {
        C0963Mr c0963Mr;
        C0963Mr c0963Mr2;
        C2S c2s;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2013lu c2013lu;
        C2S c2s2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C2013lu c2013lu2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C2013lu c2013lu3;
        InterstitialAd interstitialAd2;
        C2013lu c2013lu4;
        C2013lu c2013lu5;
        InterstitialAd interstitialAd3;
        C2013lu c2013lu6;
        C2013lu c2013lu7;
        C2013lu c2013lu8;
        c0963Mr = this.A00.A03;
        if (c0963Mr != null) {
            this.A00.A05 = true;
            C2017ly c2017ly = this.A00;
            c0963Mr2 = this.A00.A03;
            c2017ly.A02 = c0963Mr2.A0I();
            c2s = this.A00.A02;
            if (!(c2s instanceof AbstractC2058md)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c2013lu = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c2013lu.A6a());
                    return;
                }
            } else {
                c2s2 = this.A00.A02;
                final AbstractC2058md abstractC2058md = (AbstractC2058md) c2s2;
                if (abstractC2058md.A1Z() > 0) {
                    C6 c62 = new C6();
                    C1900k1 c1900k1 = this.A00.A06;
                    c2013lu6 = this.A00.A08;
                    if (c62.A09(c1900k1, c2013lu6.A08(), abstractC2058md.A1Z())) {
                        c62.A08(this.A00.A06, true);
                        C2017ly c2017ly2 = this.A00;
                        C1900k1 c1900k12 = this.A00.A06;
                        c2013lu7 = this.A00.A08;
                        String A0A = c2013lu7.A0A();
                        c2013lu8 = this.A00.A08;
                        c2017ly2.A01 = c62.A06(c1900k12, A0A, c2013lu8.A08());
                    } else {
                        C2017ly c2017ly3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            c62.A08(c2017ly3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            c62.A08(c2017ly3.A06, false);
                        }
                    }
                }
                C2017ly c2017ly4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c2017ly4.A01;
                    if (interstitialAd != null) {
                        abstractC2058md.A1l(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new InterstitialAdListener() { // from class: com.facebook.ads.redexgen.X.3H
                            @Override // com.facebook.ads.AdListener
                            public final void onAdClicked(com.facebook.ads.Ad ad) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onAdLoaded(com.facebook.ads.Ad ad) {
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C2013lu c2013lu9;
                                interstitialAdExtendedListener4 = C2019m0.this.A00.A07;
                                c2013lu9 = C2019m0.this.A00.A08;
                                interstitialAdExtendedListener4.onAdLoaded(c2013lu9.A6a());
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onError(com.facebook.ads.Ad ad, AdError adError) {
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C2013lu c2013lu9;
                                C2019m0.this.A00.A01 = null;
                                abstractC2058md.A1l(false);
                                interstitialAdExtendedListener4 = C2019m0.this.A00.A07;
                                c2013lu9 = C2019m0.this.A00.A08;
                                interstitialAdExtendedListener4.onAdLoaded(c2013lu9.A6a());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDismissed(com.facebook.ads.Ad ad) {
                                C0963Mr c0963Mr3;
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C2013lu c2013lu9;
                                C0963Mr c0963Mr4;
                                C0963Mr c0963Mr5;
                                C0963Mr c0963Mr6;
                                C2019m0.this.A00.A04 = false;
                                c0963Mr3 = C2019m0.this.A00.A03;
                                if (c0963Mr3 != null) {
                                    c0963Mr4 = C2019m0.this.A00.A03;
                                    c0963Mr4.A0S(new C2021m2(this));
                                    c0963Mr5 = C2019m0.this.A00.A03;
                                    c0963Mr5.A0N();
                                    c0963Mr6 = C2019m0.this.A00.A03;
                                    c0963Mr6.A0K();
                                    C2019m0.this.A00.A03 = null;
                                }
                                interstitialAdExtendedListener4 = C2019m0.this.A00.A07;
                                c2013lu9 = C2019m0.this.A00.A08;
                                interstitialAdExtendedListener4.onInterstitialDismissed(c2013lu9.A6a());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onLoggingImpression(com.facebook.ads.Ad ad) {
                            }
                        });
                        c2013lu4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c2013lu4.A0B());
                        c2013lu5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c2013lu5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C2017ly c2017ly5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c2017ly5.A07;
                        c2013lu3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c2013lu3.A6a());
                        return;
                    }
                    A02[2] = "joZPUUFug9Ts";
                    interstitialAdExtendedListener2 = c2017ly5.A07;
                    c2013lu2 = this.A00.A08;
                    interstitialAdExtendedListener2.onAdLoaded(c2013lu2.A6a());
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().AAu(A00(0, 3, 98), AbstractC06048a.A0N, new C06058b(A00(3, 18, 46)));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0G(C0660Ag c0660Ag) {
        long j10;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2013lu c2013lu;
        InterfaceC04311f A0F = this.A00.A06.A0F();
        j10 = this.A00.A00;
        A0F.A3D(C0709Cu.A01(j10), c0660Ag.A03().getErrorCode(), c0660Ag.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c2013lu = this.A00.A08;
        interstitialAdExtendedListener.onError(c2013lu.A6a(), C8.A00(c0660Ag));
    }
}
