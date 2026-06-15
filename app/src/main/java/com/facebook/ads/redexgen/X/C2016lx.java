package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.lx  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2016lx extends AnonymousClass24 {
    public static byte[] A01;
    public final /* synthetic */ C2014lv A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, 24, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C2016lx(C2014lv c2014lv) {
        this.A00 = c2014lv;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j10;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            C7F c7f = (C7F) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j10 = this.A00.A02;
            c7f.A02(currentTimeMillis - j10);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(c7f.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2001li c2001li;
        this.A00.A07.A0F().A3A();
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c2001li = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c2001li.A6a());
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2001li c2001li;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c2001li = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c2001li.A6a());
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0F(AnonymousClass23 anonymousClass23) {
        C0948Ma c0948Ma;
        C2001li c2001li;
        C2001li c2001li2;
        C0948Ma c0948Ma2;
        C2S c2s;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2001li c2001li3;
        C2S c2s2;
        RewardedVideoAd rewardedVideoAd2;
        C2S c2s3;
        C2001li c2001li4;
        RewardedVideoAd rewardedVideoAd3;
        C2S c2s4;
        C2001li c2001li5;
        C2001li c2001li6;
        C2001li c2001li7;
        C2S c2s5;
        C2001li c2001li8;
        c0948Ma = this.A00.A05;
        if (c0948Ma == null) {
            this.A00.A07.A08().AAu(A00(0, 3, 67), AbstractC06048a.A0N, new C06058b(A00(3, 18, 108)));
            return;
        }
        AbstractC2062mh abstractC2062mh = (AbstractC2062mh) anonymousClass23;
        c2001li = this.A00.A09;
        if (c2001li.A03 != null) {
            c2001li8 = this.A00.A09;
            abstractC2062mh.A02(c2001li8.A03);
        }
        c2001li2 = this.A00.A09;
        c2001li2.A00 = abstractC2062mh.A0H();
        this.A00.A06 = true;
        C2014lv c2014lv = this.A00;
        c0948Ma2 = this.A00.A05;
        c2014lv.A04 = c0948Ma2.A0I();
        c2s = this.A00.A04;
        if (c2s != null) {
            int i10 = 0;
            c2s4 = this.A00.A04;
            if (!c2s4.A1B()) {
                c2s5 = this.A00.A04;
                i10 = ((AbstractC2058md) c2s5).A1Z();
            }
            if (i10 > 0) {
                C6 c62 = new C6();
                C1900k1 c1900k1 = this.A00.A07;
                c2001li5 = this.A00.A09;
                if (c62.A09(c1900k1, c2001li5.A06, i10)) {
                    c62.A08(this.A00.A07, true);
                    C2014lv c2014lv2 = this.A00;
                    C1900k1 c1900k12 = this.A00.A07;
                    c2001li6 = this.A00.A09;
                    String str = c2001li6.A0D;
                    c2001li7 = this.A00.A09;
                    c2014lv2.A03 = c62.A07(c1900k12, str, c2001li7.A06);
                } else {
                    c62.A08(this.A00.A07, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            c2001li3 = this.A00.A09;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c2001li3.A6a());
            return;
        }
        c2s2 = this.A00.A04;
        ((AbstractC2058md) c2s2).A1l(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        c2s3 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(c2s3.A0c());
        c2001li4 = this.A00.A09;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c2001li4.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.3I
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(com.facebook.ads.Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(com.facebook.ads.Ad ad) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C2001li c2001li9;
                s2SRewardedVideoAdExtendedListener2 = C2016lx.this.A00.A08;
                c2001li9 = C2016lx.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c2001li9.A6a());
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(com.facebook.ads.Ad ad, AdError adError) {
                C2S c2s6;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C2001li c2001li9;
                C2016lx.this.A00.A03 = null;
                c2s6 = C2016lx.this.A00.A04;
                ((AbstractC2058md) c2s6).A1l(false);
                s2SRewardedVideoAdExtendedListener2 = C2016lx.this.A00.A08;
                c2001li9 = C2016lx.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c2001li9.A6a());
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(com.facebook.ads.Ad ad) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C2016lx.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C2016lx.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0G(C0660Ag c0660Ag) {
        C2001li c2001li;
        long j10;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2001li c2001li2;
        this.A00.A0D(true);
        c2001li = this.A00.A09;
        InterfaceC04311f A0F = c2001li.A0B.A0F();
        j10 = this.A00.A01;
        A0F.A3D(C0709Cu.A01(j10), c0660Ag.A03().getErrorCode(), c0660Ag.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c2001li2 = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onError(c2001li2.A6a(), C8.A00(c0660Ag));
    }
}
