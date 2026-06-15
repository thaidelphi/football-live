package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zabe extends GoogleApiClient implements zabz {

    /* renamed from: b  reason: collision with root package name */
    private final Lock f12290b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.gms.common.internal.zak f12291c;

    /* renamed from: d  reason: collision with root package name */
    private zaca f12292d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12293e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f12294f;

    /* renamed from: g  reason: collision with root package name */
    private final Looper f12295g;
    @VisibleForTesting

    /* renamed from: h  reason: collision with root package name */
    final Queue<BaseImplementation.ApiMethodImpl<?, ?>> f12296h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f12297i;

    /* renamed from: j  reason: collision with root package name */
    private final GoogleApiAvailability f12298j;
    @VisibleForTesting

    /* renamed from: k  reason: collision with root package name */
    zabx f12299k;

    /* renamed from: l  reason: collision with root package name */
    final Map<Api.AnyClientKey<?>, Api.Client> f12300l;

    /* renamed from: m  reason: collision with root package name */
    Set<Scope> f12301m;

    /* renamed from: n  reason: collision with root package name */
    final ClientSettings f12302n;

    /* renamed from: o  reason: collision with root package name */
    final Map<Api<?>, Boolean> f12303o;

    /* renamed from: p  reason: collision with root package name */
    final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f12304p;

    /* renamed from: q  reason: collision with root package name */
    private final ListenerHolders f12305q;

    /* renamed from: r  reason: collision with root package name */
    private final ArrayList<zat> f12306r;

    /* renamed from: s  reason: collision with root package name */
    private Integer f12307s;

    /* renamed from: t  reason: collision with root package name */
    Set<zada> f12308t;

    /* renamed from: u  reason: collision with root package name */
    final zadc f12309u;

    public static int k(Iterable<Api.Client> iterable, boolean z10) {
        boolean z11 = false;
        boolean z12 = false;
        for (Api.Client client : iterable) {
            z11 |= client.requiresSignIn();
            z12 |= client.providesSignIn();
        }
        if (z11) {
            return (z12 && z10) ? 2 : 1;
        }
        return 3;
    }

    static String m(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void n(zabe zabeVar) {
        zabeVar.f12290b.lock();
        try {
            if (zabeVar.f12297i) {
                zabeVar.q();
            }
        } finally {
            zabeVar.f12290b.unlock();
        }
    }

    private final void p(int i10) {
        Integer num = this.f12307s;
        if (num == null) {
            this.f12307s = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            String m7 = m(i10);
            String m10 = m(this.f12307s.intValue());
            StringBuilder sb = new StringBuilder(m7.length() + 51 + m10.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(m7);
            sb.append(". Mode was already set to ");
            sb.append(m10);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f12292d != null) {
            return;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (Api.Client client : this.f12300l.values()) {
            z10 |= client.requiresSignIn();
            z11 |= client.providesSignIn();
        }
        int intValue = this.f12307s.intValue();
        if (intValue != 1) {
            if (intValue == 2 && z10) {
                this.f12292d = a.l(this.f12294f, this, this.f12290b, this.f12295g, this.f12298j, this.f12300l, this.f12302n, this.f12303o, this.f12304p, this.f12306r);
                return;
            }
        } else if (!z10) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        } else {
            if (z11) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.f12292d = new zabi(this.f12294f, this, this.f12290b, this.f12295g, this.f12298j, this.f12300l, this.f12302n, this.f12303o, this.f12304p, this.f12306r, this);
    }

    private final void q() {
        this.f12291c.b();
        ((zaca) Preconditions.m(this.f12292d)).a();
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void a(Bundle bundle) {
        while (!this.f12296h.isEmpty()) {
            g(this.f12296h.remove());
        }
        this.f12291c.d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void b(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.f12297i) {
                this.f12297i = true;
                if (this.f12299k == null && !ClientLibraryUtils.a()) {
                    try {
                        this.f12299k = this.f12298j.v(this.f12294f.getApplicationContext(), new q(this));
                    } catch (SecurityException unused) {
                    }
                }
                throw null;
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f12309u.f12374a.toArray(new BasePendingResult[0])) {
            basePendingResult.e(zadc.f12373c);
        }
        this.f12291c.e(i10);
        this.f12291c.a();
        if (i10 == 2) {
            q();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void c(ConnectionResult connectionResult) {
        if (!this.f12298j.k(this.f12294f, connectionResult.X())) {
            o();
        }
        if (this.f12297i) {
            return;
        }
        this.f12291c.c(connectionResult);
        this.f12291c.a();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void d() {
        this.f12290b.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f12293e >= 0) {
                Preconditions.q(this.f12307s != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f12307s;
                if (num == null) {
                    this.f12307s = Integer.valueOf(k(this.f12300l.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) Preconditions.m(this.f12307s)).intValue();
            this.f12290b.lock();
            if (intValue == 3 || intValue == 1) {
                i10 = intValue;
            } else if (intValue != 2) {
                i10 = intValue;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Illegal sign-in mode: ");
                sb.append(i10);
                Preconditions.b(z10, sb.toString());
                p(i10);
                q();
                this.f12290b.unlock();
            }
            z10 = true;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i10);
            Preconditions.b(z10, sb2.toString());
            p(i10);
            q();
            this.f12290b.unlock();
        } finally {
            this.f12290b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void e() {
        Lock lock;
        this.f12290b.lock();
        try {
            this.f12309u.b();
            zaca zacaVar = this.f12292d;
            if (zacaVar != null) {
                zacaVar.c();
            }
            this.f12305q.b();
            for (BaseImplementation.ApiMethodImpl<?, ?> apiMethodImpl : this.f12296h) {
                apiMethodImpl.o(null);
                apiMethodImpl.c();
            }
            this.f12296h.clear();
            if (this.f12292d == null) {
                lock = this.f12290b;
            } else {
                o();
                this.f12291c.a();
                lock = this.f12290b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f12290b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f12294f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f12297i);
        printWriter.append(" mWorkQueue.size()=").print(this.f12296h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f12309u.f12374a.size());
        zaca zacaVar = this.f12292d;
        if (zacaVar != null) {
            zacaVar.d(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T g(T t10) {
        Lock lock;
        Api<?> q10 = t10.q();
        boolean containsKey = this.f12300l.containsKey(t10.r());
        String d10 = q10 != null ? q10.d() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(d10).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d10);
        sb.append(" required for this call.");
        Preconditions.b(containsKey, sb.toString());
        this.f12290b.lock();
        try {
            zaca zacaVar = this.f12292d;
            if (zacaVar != null) {
                if (this.f12297i) {
                    this.f12296h.add(t10);
                    while (!this.f12296h.isEmpty()) {
                        BaseImplementation.ApiMethodImpl<?, ?> remove = this.f12296h.remove();
                        this.f12309u.a(remove);
                        remove.v(Status.f12068h);
                    }
                    lock = this.f12290b;
                } else {
                    t10 = (T) zacaVar.e(t10);
                    lock = this.f12290b;
                }
                lock.unlock();
                return t10;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f12290b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper h() {
        return this.f12295g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void i(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f12291c.f(onConnectionFailedListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r3 == false) goto L17;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.google.android.gms.common.api.internal.zada r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f12290b
            r0.lock()
            java.util.Set<com.google.android.gms.common.api.internal.zada> r0 = r2.f12308t     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L16
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L16:
            boolean r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L27
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L27:
            java.util.concurrent.locks.Lock r3 = r2.f12290b     // Catch: java.lang.Throwable -> L57
            r3.lock()     // Catch: java.lang.Throwable -> L57
            java.util.Set<com.google.android.gms.common.api.internal.zada> r3 = r2.f12308t     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto L36
            java.util.concurrent.locks.Lock r3 = r2.f12290b     // Catch: java.lang.Throwable -> L57
            r3.unlock()     // Catch: java.lang.Throwable -> L57
            goto L43
        L36:
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L50
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f12290b     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L4a
        L43:
            com.google.android.gms.common.api.internal.zaca r3 = r2.f12292d     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L4a
            r3.b()     // Catch: java.lang.Throwable -> L57
        L4a:
            java.util.concurrent.locks.Lock r3 = r2.f12290b
            r3.unlock()
            return
        L50:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f12290b     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            throw r3     // Catch: java.lang.Throwable -> L57
        L57:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f12290b
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabe.j(com.google.android.gms.common.api.internal.zada):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String l() {
        StringWriter stringWriter = new StringWriter();
        f("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        if (this.f12297i) {
            this.f12297i = false;
            throw null;
        }
        return false;
    }
}
