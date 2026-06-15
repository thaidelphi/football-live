package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.jc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1875jc implements C8A {
    public static byte[] A01;
    public final AnonymousClass85 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, 25, 15, 29, 26, 20, 15};
    }

    public C1875jc(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85;
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final String A6z() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final String A7w() {
        return BE.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final String A7x() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final String A8L() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final String A8S() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final AnonymousClass89 A8n() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new C1876jd(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final String A9G() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final String A9I() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final String A9J() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final boolean AAD() {
        return BuildConfigApi.isDebug();
    }
}
