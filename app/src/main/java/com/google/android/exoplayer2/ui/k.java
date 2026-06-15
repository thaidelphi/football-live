package com.google.android.exoplayer2.ui;
/* compiled from: TimeBar.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface k {

    /* compiled from: TimeBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void C(k kVar, long j10);

        void E(k kVar, long j10, boolean z10);

        void G(k kVar, long j10);
    }

    void a(a aVar);

    void b(long[] jArr, boolean[] zArr, int i10);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
