package org.chromium.net;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class QuicException extends NetworkException {
    protected QuicException(String str, Throwable th) {
        super(str, th);
    }

    public abstract int getQuicDetailedErrorCode();
}
