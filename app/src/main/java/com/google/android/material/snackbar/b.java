package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* compiled from: SnackbarManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class b {

    /* renamed from: e  reason: collision with root package name */
    private static b f14518e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f14519a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f14520b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f14521c;

    /* renamed from: d  reason: collision with root package name */
    private c f14522d;

    /* compiled from: SnackbarManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface InterfaceC0190b {
        void a(int i10);

        void show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<InterfaceC0190b> f14524a;

        /* renamed from: b  reason: collision with root package name */
        int f14525b;

        /* renamed from: c  reason: collision with root package name */
        boolean f14526c;

        boolean a(InterfaceC0190b interfaceC0190b) {
            return interfaceC0190b != null && this.f14524a.get() == interfaceC0190b;
        }
    }

    private b() {
    }

    private boolean a(c cVar, int i10) {
        InterfaceC0190b interfaceC0190b = cVar.f14524a.get();
        if (interfaceC0190b != null) {
            this.f14520b.removeCallbacksAndMessages(cVar);
            interfaceC0190b.a(i10);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b c() {
        if (f14518e == null) {
            f14518e = new b();
        }
        return f14518e;
    }

    private boolean f(InterfaceC0190b interfaceC0190b) {
        c cVar = this.f14521c;
        return cVar != null && cVar.a(interfaceC0190b);
    }

    private boolean g(InterfaceC0190b interfaceC0190b) {
        c cVar = this.f14522d;
        return cVar != null && cVar.a(interfaceC0190b);
    }

    private void l(c cVar) {
        int i10 = cVar.f14525b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f14520b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f14520b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    private void m() {
        c cVar = this.f14522d;
        if (cVar != null) {
            this.f14521c = cVar;
            this.f14522d = null;
            InterfaceC0190b interfaceC0190b = cVar.f14524a.get();
            if (interfaceC0190b != null) {
                interfaceC0190b.show();
            } else {
                this.f14521c = null;
            }
        }
    }

    public void b(InterfaceC0190b interfaceC0190b, int i10) {
        synchronized (this.f14519a) {
            if (f(interfaceC0190b)) {
                a(this.f14521c, i10);
            } else if (g(interfaceC0190b)) {
                a(this.f14522d, i10);
            }
        }
    }

    void d(c cVar) {
        synchronized (this.f14519a) {
            if (this.f14521c == cVar || this.f14522d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(InterfaceC0190b interfaceC0190b) {
        boolean z10;
        synchronized (this.f14519a) {
            z10 = f(interfaceC0190b) || g(interfaceC0190b);
        }
        return z10;
    }

    public void h(InterfaceC0190b interfaceC0190b) {
        synchronized (this.f14519a) {
            if (f(interfaceC0190b)) {
                this.f14521c = null;
                if (this.f14522d != null) {
                    m();
                }
            }
        }
    }

    public void i(InterfaceC0190b interfaceC0190b) {
        synchronized (this.f14519a) {
            if (f(interfaceC0190b)) {
                l(this.f14521c);
            }
        }
    }

    public void j(InterfaceC0190b interfaceC0190b) {
        synchronized (this.f14519a) {
            if (f(interfaceC0190b)) {
                c cVar = this.f14521c;
                if (!cVar.f14526c) {
                    cVar.f14526c = true;
                    this.f14520b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void k(InterfaceC0190b interfaceC0190b) {
        synchronized (this.f14519a) {
            if (f(interfaceC0190b)) {
                c cVar = this.f14521c;
                if (cVar.f14526c) {
                    cVar.f14526c = false;
                    l(cVar);
                }
            }
        }
    }
}
