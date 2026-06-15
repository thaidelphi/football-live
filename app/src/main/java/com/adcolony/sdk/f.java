package com.adcolony.sdk;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5986a;

    public synchronized void a(long j10) {
        if (!this.f5986a) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
            }
        }
    }

    public synchronized void a(boolean z10) {
        this.f5986a = z10;
        if (z10) {
            notifyAll();
        }
    }

    public boolean a() {
        return this.f5986a;
    }
}
