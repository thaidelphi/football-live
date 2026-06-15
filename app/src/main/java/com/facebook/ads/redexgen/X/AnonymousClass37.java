package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.37  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AnonymousClass37 {
    public static String[] A0E = {"e4QKd0vFJKlBfNQUlIHhfqQvs", "ktN6BUw9VrN2JTOHJ8TIrrXahMZ3fTmV", "DLbbL7kcZ5O", "9b4HlLYHdUSJ33wbgi9UrYdebMHGJs2L", "z1qfKPKzPcrrDsrmM", "3k9SvbOHIOGx0S2BWPTRCyg1cNUtQJE0", "0GDGJhxXKJqU0yOd0NeRuUkLVmalwgCj", "KW1MjCrhBg"};
    public int A00;
    public long A01;
    public RewardData A02;
    public AQ A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final AnonymousClass90 A07;
    public final EnumC0662Aj A08;
    public final EnumC0664Al A09;
    public final String A0A;
    public final EnumSet<CacheFlag> A0B;
    public final int A0C;
    public final AdPlacementType A0D;

    public AnonymousClass37(String str, EnumC0664Al enumC0664Al, AdPlacementType adPlacementType, EnumC0662Aj enumC0662Aj, int i10, AnonymousClass90 anonymousClass90) {
        this(str, enumC0664Al, adPlacementType, enumC0662Aj, i10, EnumSet.of(CacheFlag.NONE), anonymousClass90);
    }

    public AnonymousClass37(String str, EnumC0664Al enumC0664Al, AdPlacementType adPlacementType, EnumC0662Aj enumC0662Aj, int i10, EnumSet<CacheFlag> cacheFlags, AnonymousClass90 anonymousClass90) {
        this.A0A = str;
        this.A0D = adPlacementType;
        this.A08 = enumC0662Aj;
        this.A0C = i10;
        this.A0B = cacheFlags;
        this.A09 = enumC0664Al;
        this.A00 = -1;
        this.A07 = anonymousClass90;
    }

    public final B6 A00(C1900k1 c1900k1, C0668Aq c0668Aq, AdExperienceType adExperienceType) {
        return new B6(c1900k1, this.A0A, this.A08 != null ? new C0694Cf(this.A08.A04(), this.A08.A03()) : null, this.A09, this.A0C, c0668Aq, AbstractC0700Cl.A01(C06419m.A0M(c1900k1)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null, this.A07);
    }

    public final Set<AdPlacementType> A01() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(2);
        if (this.A0D == AdPlacementType.BANNER && this.A09 == EnumC0664Al.A0D) {
            linkedHashSet.add(AdPlacementType.BANNER);
            AdPlacementType adPlacementType = AdPlacementType.MEDIUM_RECTANGLE;
            String[] strArr = A0E;
            if (strArr[4].length() != strArr[0].length()) {
                String[] strArr2 = A0E;
                strArr2[4] = "dJCx3L7RUa0HYA9jO";
                strArr2[0] = "pYtnX6DZAplUTv76Lm34k0kqX";
                linkedHashSet.add(adPlacementType);
                return linkedHashSet;
            }
            throw new RuntimeException();
        } else if (this.A0D != null) {
            linkedHashSet.add(this.A0D);
            return linkedHashSet;
        } else if (this.A08 == null) {
            linkedHashSet.add(AdPlacementType.NATIVE);
            return linkedHashSet;
        } else if (this.A08 == EnumC0662Aj.A08) {
            linkedHashSet.add(AdPlacementType.INTERSTITIAL);
            return linkedHashSet;
        } else {
            linkedHashSet.add(AdPlacementType.BANNER);
            return linkedHashSet;
        }
    }

    public final void A02(int i10) {
        this.A00 = i10;
    }

    public final void A03(long j10) {
        this.A01 = j10;
    }

    public final void A04(RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(AQ aq) {
        this.A03 = aq;
    }

    public final void A06(String str) {
        this.A04 = str;
    }

    public final void A07(String str) {
        this.A05 = str;
    }

    public final void A08(boolean z10) {
        this.A06 = z10;
    }
}
