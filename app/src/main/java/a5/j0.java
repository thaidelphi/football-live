package a5;

import a5.p;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemHandlerWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j0 implements p {

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f451b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    private final Handler f452a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SystemHandlerWrapper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements p.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f453a;

        /* renamed from: b  reason: collision with root package name */
        private j0 f454b;

        private b() {
        }

        private void b() {
            this.f453a = null;
            this.f454b = null;
            j0.m(this);
        }

        @Override // a5.p.a
        public void a() {
            ((Message) a5.a.e(this.f453a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) a5.a.e(this.f453a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, j0 j0Var) {
            this.f453a = message;
            this.f454b = j0Var;
            return this;
        }
    }

    public j0(Handler handler) {
        this.f452a = handler;
    }

    private static b l() {
        b remove;
        List<b> list = f451b;
        synchronized (list) {
            if (list.isEmpty()) {
                remove = new b();
            } else {
                remove = list.remove(list.size() - 1);
            }
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(b bVar) {
        List<b> list = f451b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // a5.p
    public p.a a(int i10) {
        return l().d(this.f452a.obtainMessage(i10), this);
    }

    @Override // a5.p
    public boolean b(int i10) {
        return this.f452a.hasMessages(i10);
    }

    @Override // a5.p
    public p.a c(int i10, int i11, int i12, Object obj) {
        return l().d(this.f452a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // a5.p
    public p.a d(int i10, Object obj) {
        return l().d(this.f452a.obtainMessage(i10, obj), this);
    }

    @Override // a5.p
    public p.a e(int i10, int i11, int i12) {
        return l().d(this.f452a.obtainMessage(i10, i11, i12), this);
    }

    @Override // a5.p
    public boolean f(Runnable runnable) {
        return this.f452a.post(runnable);
    }

    @Override // a5.p
    public boolean g(p.a aVar) {
        return ((b) aVar).c(this.f452a);
    }

    @Override // a5.p
    public boolean h(int i10) {
        return this.f452a.sendEmptyMessage(i10);
    }

    @Override // a5.p
    public boolean i(int i10, long j10) {
        return this.f452a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // a5.p
    public void j(int i10) {
        this.f452a.removeMessages(i10);
    }
}
