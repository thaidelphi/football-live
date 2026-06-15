package pl.droidsonroids.gif;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SafeRunnable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final a f30029a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(a aVar) {
        this.f30029a = aVar;
    }

    abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f30029a.e()) {
                return;
            }
            b();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
