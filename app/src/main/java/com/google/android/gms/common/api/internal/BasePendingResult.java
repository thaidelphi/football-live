package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zaq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@KeepName
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* renamed from: o */
    static final ThreadLocal<Boolean> f12089o = new o0();

    /* renamed from: p */
    public static final /* synthetic */ int f12090p = 0;

    /* renamed from: f */
    private ResultCallback<? super R> f12096f;

    /* renamed from: h */
    private R f12098h;

    /* renamed from: i */
    private Status f12099i;

    /* renamed from: j */
    private volatile boolean f12100j;

    /* renamed from: k */
    private boolean f12101k;

    /* renamed from: l */
    private boolean f12102l;

    /* renamed from: m */
    private ICancelToken f12103m;
    @KeepName
    private p0 mResultGuardian;

    /* renamed from: a */
    private final Object f12091a = new Object();

    /* renamed from: d */
    private final CountDownLatch f12094d = new CountDownLatch(1);

    /* renamed from: e */
    private final ArrayList<PendingResult.StatusListener> f12095e = new ArrayList<>();

    /* renamed from: g */
    private final AtomicReference<j0> f12097g = new AtomicReference<>();

    /* renamed from: n */
    private boolean f12104n = false;

    /* renamed from: b */
    protected final CallbackHandler<R> f12092b = new CallbackHandler<>(Looper.getMainLooper());

    /* renamed from: c */
    protected final WeakReference<GoogleApiClient> f12093c = new WeakReference<>(null);

    @Deprecated
    BasePendingResult() {
    }

    private final R i() {
        R r10;
        synchronized (this.f12091a) {
            Preconditions.q(!this.f12100j, "Result has already been consumed.");
            Preconditions.q(g(), "Result is not ready.");
            r10 = this.f12098h;
            this.f12098h = null;
            this.f12096f = null;
            this.f12100j = true;
        }
        j0 andSet = this.f12097g.getAndSet(null);
        if (andSet != null) {
            andSet.f12219a.f12374a.remove(this);
        }
        return (R) Preconditions.m(r10);
    }

    private final void j(R r10) {
        this.f12098h = r10;
        this.f12099i = r10.a();
        this.f12103m = null;
        this.f12094d.countDown();
        if (this.f12101k) {
            this.f12096f = null;
        } else {
            ResultCallback<? super R> resultCallback = this.f12096f;
            if (resultCallback == null) {
                if (this.f12098h instanceof Releasable) {
                    this.mResultGuardian = new p0(this, null);
                }
            } else {
                this.f12092b.removeMessages(2);
                this.f12092b.a(resultCallback, i());
            }
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.f12095e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this.f12099i);
        }
        this.f12095e.clear();
    }

    public static void m(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e8) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(result)), e8);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void b(PendingResult.StatusListener statusListener) {
        Preconditions.b(statusListener != null, "Callback cannot be null.");
        synchronized (this.f12091a) {
            if (g()) {
                statusListener.a(this.f12099i);
            } else {
                this.f12095e.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void c() {
        synchronized (this.f12091a) {
            if (!this.f12101k && !this.f12100j) {
                ICancelToken iCancelToken = this.f12103m;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                m(this.f12098h);
                this.f12101k = true;
                j(d(Status.f12070j));
            }
        }
    }

    @KeepForSdk
    public abstract R d(Status status);

    @KeepForSdk
    @Deprecated
    public final void e(Status status) {
        synchronized (this.f12091a) {
            if (!g()) {
                h(d(status));
                this.f12102l = true;
            }
        }
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f12091a) {
            z10 = this.f12101k;
        }
        return z10;
    }

    @KeepForSdk
    public final boolean g() {
        return this.f12094d.getCount() == 0;
    }

    @KeepForSdk
    public final void h(R r10) {
        synchronized (this.f12091a) {
            if (!this.f12102l && !this.f12101k) {
                g();
                Preconditions.q(!g(), "Results have already been set");
                Preconditions.q(!this.f12100j, "Result has already been consumed");
                j(r10);
                return;
            }
            m(r10);
        }
    }

    public final void l() {
        boolean z10 = true;
        if (!this.f12104n && !f12089o.get().booleanValue()) {
            z10 = false;
        }
        this.f12104n = z10;
    }

    public final boolean n() {
        boolean f10;
        synchronized (this.f12091a) {
            if (this.f12093c.get() == null || !this.f12104n) {
                c();
            }
            f10 = f();
        }
        return f10;
    }

    public final void o(j0 j0Var) {
        this.f12097g.set(j0Var);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class CallbackHandler<R extends Result> extends zaq {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        public final void a(ResultCallback<? super R> resultCallback, R r10) {
            int i10 = BasePendingResult.f12090p;
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.m(resultCallback), r10)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.a(result);
                } catch (RuntimeException e8) {
                    BasePendingResult.m(result);
                    throw e8;
                }
            } else if (i10 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i10);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).e(Status.f12069i);
            }
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }
    }
}
