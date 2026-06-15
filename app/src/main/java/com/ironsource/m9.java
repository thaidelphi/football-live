package com.ironsource;

import java.lang.Thread;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class m9 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f18460a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m9(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f18460a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        n9 n9Var = new n9(th);
        if (n9Var.d()) {
            String b10 = n9Var.b();
            new lc(b10, "" + System.currentTimeMillis(), "Crash").a();
        }
        this.f18460a.uncaughtException(thread, th);
    }
}
