package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzgi extends zzfs {
    public final int zzb;

    public zzgi(zzfw zzfwVar, int i10, int i11) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = 1;
    }

    public static zzgi zza(IOException iOException, zzfw zzfwVar, int i10) {
        String message = iOException.getMessage();
        int i11 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && zzfsb.zza(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        }
        if (i11 == 2007) {
            return new zzgh(iOException, zzfwVar);
        }
        return new zzgi(iOException, zzfwVar, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10;
    }

    public zzgi(IOException iOException, zzfw zzfwVar, int i10, int i11) {
        super(iOException, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzgi(String str, zzfw zzfwVar, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzgi(String str, IOException iOException, zzfw zzfwVar, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = i11;
    }
}
