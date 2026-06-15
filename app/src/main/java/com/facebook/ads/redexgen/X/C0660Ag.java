package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
/* renamed from: com.facebook.ads.redexgen.X.Ag  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0660Ag {
    public final AdErrorType A00;
    public final String A01;

    public C0660Ag(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public C0660Ag(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C0660Ag A00(AdErrorType adErrorType) {
        return new C0660Ag(adErrorType, (String) null);
    }

    public static C0660Ag A01(AdErrorType adErrorType, String str) {
        return new C0660Ag(adErrorType, str);
    }

    public static C0660Ag A02(C0661Ah c0661Ah) {
        return new C0660Ag(c0661Ah.A00(), c0661Ah.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
