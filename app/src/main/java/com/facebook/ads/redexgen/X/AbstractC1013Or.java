package com.facebook.ads.redexgen.X;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Or  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1013Or extends AbstractC1768ho {
    public static int A00(@CheckForNull Object... objects) {
        return Arrays.hashCode(objects);
    }

    public static boolean A01(@CheckForNull Object a10, @CheckForNull Object b10) {
        return a10 == b10 || (a10 != null && a10.equals(b10));
    }
}
