package com.facebook.ads.redexgen.X;

import android.system.ErrnoException;
import android.system.OsConstants;
/* renamed from: com.facebook.ads.redexgen.X.dq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1525dq {
    public static boolean A00(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
