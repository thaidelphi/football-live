package q3;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import q3.f;
import q3.g;
import q3.h;
/* compiled from: SimpleDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f30106a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f30107b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<I> f30108c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<O> f30109d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final I[] f30110e;

    /* renamed from: f  reason: collision with root package name */
    private final O[] f30111f;

    /* renamed from: g  reason: collision with root package name */
    private int f30112g;

    /* renamed from: h  reason: collision with root package name */
    private int f30113h;

    /* renamed from: i  reason: collision with root package name */
    private I f30114i;

    /* renamed from: j  reason: collision with root package name */
    private E f30115j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f30116k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f30117l;

    /* renamed from: m  reason: collision with root package name */
    private int f30118m;

    /* compiled from: SimpleDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(I[] iArr, O[] oArr) {
        this.f30110e = iArr;
        this.f30112g = iArr.length;
        for (int i10 = 0; i10 < this.f30112g; i10++) {
            this.f30110e[i10] = g();
        }
        this.f30111f = oArr;
        this.f30113h = oArr.length;
        for (int i11 = 0; i11 < this.f30113h; i11++) {
            this.f30111f[i11] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f30106a = aVar;
        aVar.start();
    }

    private boolean f() {
        return !this.f30108c.isEmpty() && this.f30113h > 0;
    }

    private boolean k() throws InterruptedException {
        E i10;
        synchronized (this.f30107b) {
            while (!this.f30117l && !f()) {
                this.f30107b.wait();
            }
            if (this.f30117l) {
                return false;
            }
            I removeFirst = this.f30108c.removeFirst();
            O[] oArr = this.f30111f;
            int i11 = this.f30113h - 1;
            this.f30113h = i11;
            O o10 = oArr[i11];
            boolean z10 = this.f30116k;
            this.f30116k = false;
            if (removeFirst.l()) {
                o10.f(4);
            } else {
                if (removeFirst.k()) {
                    o10.f(RecyclerView.UNDEFINED_DURATION);
                }
                if (removeFirst.m()) {
                    o10.f(134217728);
                }
                try {
                    i10 = j(removeFirst, o10, z10);
                } catch (OutOfMemoryError e8) {
                    i10 = i(e8);
                } catch (RuntimeException e10) {
                    i10 = i(e10);
                }
                if (i10 != null) {
                    synchronized (this.f30107b) {
                        this.f30115j = i10;
                    }
                    return false;
                }
            }
            synchronized (this.f30107b) {
                if (this.f30116k) {
                    o10.p();
                } else if (o10.k()) {
                    this.f30118m++;
                    o10.p();
                } else {
                    o10.f30100c = this.f30118m;
                    this.f30118m = 0;
                    this.f30109d.addLast(o10);
                }
                q(removeFirst);
            }
            return true;
        }
    }

    private void n() {
        if (f()) {
            this.f30107b.notify();
        }
    }

    private void o() throws f {
        E e8 = this.f30115j;
        if (e8 != null) {
            throw e8;
        }
    }

    private void q(I i10) {
        i10.g();
        I[] iArr = this.f30110e;
        int i11 = this.f30112g;
        this.f30112g = i11 + 1;
        iArr[i11] = i10;
    }

    private void s(O o10) {
        o10.g();
        O[] oArr = this.f30111f;
        int i10 = this.f30113h;
        this.f30113h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        do {
            try {
            } catch (InterruptedException e8) {
                throw new IllegalStateException(e8);
            }
        } while (k());
    }

    @Override // q3.d
    public final void flush() {
        synchronized (this.f30107b) {
            this.f30116k = true;
            this.f30118m = 0;
            I i10 = this.f30114i;
            if (i10 != null) {
                q(i10);
                this.f30114i = null;
            }
            while (!this.f30108c.isEmpty()) {
                q(this.f30108c.removeFirst());
            }
            while (!this.f30109d.isEmpty()) {
                this.f30109d.removeFirst().p();
            }
        }
    }

    protected abstract I g();

    protected abstract O h();

    protected abstract E i(Throwable th);

    protected abstract E j(I i10, O o10, boolean z10);

    @Override // q3.d
    /* renamed from: l */
    public final I d() throws f {
        I i10;
        synchronized (this.f30107b) {
            o();
            a5.a.f(this.f30114i == null);
            int i11 = this.f30112g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f30110e;
                int i12 = i11 - 1;
                this.f30112g = i12;
                i10 = iArr[i12];
            }
            this.f30114i = i10;
        }
        return i10;
    }

    @Override // q3.d
    /* renamed from: m */
    public final O b() throws f {
        synchronized (this.f30107b) {
            o();
            if (this.f30109d.isEmpty()) {
                return null;
            }
            return this.f30109d.removeFirst();
        }
    }

    @Override // q3.d
    /* renamed from: p */
    public final void c(I i10) throws f {
        synchronized (this.f30107b) {
            o();
            a5.a.a(i10 == this.f30114i);
            this.f30108c.addLast(i10);
            n();
            this.f30114i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(O o10) {
        synchronized (this.f30107b) {
            s(o10);
            n();
        }
    }

    @Override // q3.d
    public void release() {
        synchronized (this.f30107b) {
            this.f30117l = true;
            this.f30107b.notify();
        }
        try {
            this.f30106a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(int i10) {
        a5.a.f(this.f30112g == this.f30110e.length);
        for (I i11 : this.f30110e) {
            i11.q(i10);
        }
    }
}
