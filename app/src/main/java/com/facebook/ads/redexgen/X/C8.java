package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class C8 {
    public static AdError A00(C0660Ag c0660Ag) {
        if (c0660Ag.A03().isPublicError()) {
            return new AdError(c0660Ag.A03().getErrorCode(), c0660Ag.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
