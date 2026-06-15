package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import java.lang.Exception;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SM<T extends Exception> {
    public long A00;
    public T A01;
    public final long A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SM != com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<T extends java.lang.Exception> */
    public SM(long j10) {
        this.A02 = j10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SM != com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<T extends java.lang.Exception> */
    public final void A00() {
        this.A01 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SM != com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<T extends java.lang.Exception> */
    public final void A01(T exception) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A01 == null) {
            this.A01 = exception;
            long nowMs = this.A02;
            this.A00 = nowMs + elapsedRealtime;
        }
        if (elapsedRealtime >= this.A00) {
            if (this.A01 != exception) {
                this.A01.addSuppressed(exception);
            }
            T t10 = this.A01;
            A00();
            throw t10;
        }
    }
}
