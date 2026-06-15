package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.li  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2001li implements AnonymousClass81 {
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public com.facebook.ads.Ad A09;
    public WeakReference<com.facebook.ads.Ad> A0A;
    public final C1900k1 A0B;
    public final AnonymousClass90 A0C;
    public final String A0D;

    public C2001li(C1900k1 c1900k1, String str, com.facebook.ads.Ad ad, AnonymousClass90 anonymousClass90) {
        this.A0B = c1900k1;
        this.A0D = str;
        this.A09 = ad;
        this.A0A = new WeakReference<>(ad);
        this.A0C = anonymousClass90;
        c1900k1.A0N(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass81
    /* renamed from: A00 */
    public final RewardedVideoAdListener A6e() {
        return this.A04;
    }

    public final C1900k1 A01() {
        return this.A0B;
    }

    public final void A02(com.facebook.ads.Ad ad) {
        if (ad == null && !C06419m.A0t(this.A0B)) {
            return;
        }
        this.A09 = ad;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass81
    public final com.facebook.ads.Ad A6a() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
