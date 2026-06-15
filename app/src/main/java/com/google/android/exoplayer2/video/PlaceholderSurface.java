package com.google.android.exoplayer2.video;

import a5.j;
import a5.o;
import a5.t;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: d  reason: collision with root package name */
    private static int f11046d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f11047e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11048a;

    /* renamed from: b  reason: collision with root package name */
    private final b f11049b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11050c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private j f11051a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f11052b;

        /* renamed from: c  reason: collision with root package name */
        private Error f11053c;

        /* renamed from: d  reason: collision with root package name */
        private RuntimeException f11054d;

        /* renamed from: e  reason: collision with root package name */
        private PlaceholderSurface f11055e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws o.a {
            a5.a.e(this.f11051a);
            this.f11051a.h(i10);
            this.f11055e = new PlaceholderSurface(this, this.f11051a.g(), i10 != 0);
        }

        private void d() {
            a5.a.e(this.f11051a);
            this.f11051a.i();
        }

        public PlaceholderSurface a(int i10) {
            boolean z10;
            start();
            this.f11052b = new Handler(getLooper(), this);
            this.f11051a = new j(this.f11052b);
            synchronized (this) {
                z10 = false;
                this.f11052b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f11055e == null && this.f11054d == null && this.f11053c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f11054d;
            if (runtimeException == null) {
                Error error = this.f11053c;
                if (error == null) {
                    return (PlaceholderSurface) a5.a.e(this.f11055e);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            a5.a.e(this.f11052b);
            this.f11052b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (o.a e8) {
                    t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f11054d = new IllegalStateException(e8);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f11053c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f11054d = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    private static int a(Context context) {
        if (o.h(context)) {
            return o.i() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (PlaceholderSurface.class) {
            if (!f11047e) {
                f11046d = a(context);
                f11047e = true;
            }
            z10 = f11046d != 0;
        }
        return z10;
    }

    public static PlaceholderSurface c(Context context, boolean z10) {
        a5.a.f(!z10 || b(context));
        return new b().a(z10 ? f11046d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f11049b) {
            if (!this.f11050c) {
                this.f11049b.c();
                this.f11050c = true;
            }
        }
    }

    private PlaceholderSurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f11049b = bVar;
        this.f11048a = z10;
    }
}
