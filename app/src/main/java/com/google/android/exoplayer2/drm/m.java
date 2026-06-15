package com.google.android.exoplayer2.drm;

import a5.p0;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.e;
import r3.t;
import r3.v;
/* compiled from: DrmUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrmUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        public static boolean a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        public static boolean b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrmUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return p0.T(p0.U(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrmUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Exception exc, int i10) {
        int i11 = p0.f482a;
        if (i11 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i11 < 23 || !c.a(exc)) {
            if (i11 < 18 || !a.b(exc)) {
                if (i11 < 18 || !a.a(exc)) {
                    if (exc instanceof v) {
                        return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
                    }
                    if (exc instanceof e.C0171e) {
                        return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                    }
                    if (exc instanceof t) {
                        return 6008;
                    }
                    if (i10 == 1) {
                        return 6006;
                    }
                    if (i10 == 2) {
                        return 6004;
                    }
                    if (i10 == 3) {
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    }
                    throw new IllegalArgumentException();
                }
                return 6007;
            }
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        return 6006;
    }
}
