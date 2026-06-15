package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ZV {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public ZV(String str, boolean z10, boolean z11) {
        this.A00 = str;
        this.A01 = z10;
        this.A02 = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != ZV.class) {
            return false;
        }
        ZV zv = (ZV) obj;
        return TextUtils.equals(this.A00, zv.A00) && this.A01 == zv.A01 && this.A02 == zv.A02;
    }

    public final int hashCode() {
        int result = 1 * 31;
        int prime = this.A00.hashCode();
        int result2 = (result + prime) * 31;
        int prime2 = this.A01 ? 1231 : 1237;
        int result3 = (result2 + prime2) * 31;
        int result4 = this.A02 ? 1231 : 1237;
        return result3 + result4;
    }
}
