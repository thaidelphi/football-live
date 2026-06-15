package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zabi implements zaca, zau {

    /* renamed from: a  reason: collision with root package name */
    private final Lock f12310a;

    /* renamed from: b  reason: collision with root package name */
    private final Condition f12311b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f12312c;

    /* renamed from: d  reason: collision with root package name */
    private final GoogleApiAvailabilityLight f12313d;

    /* renamed from: e  reason: collision with root package name */
    private final s f12314e;

    /* renamed from: f  reason: collision with root package name */
    final Map<Api.AnyClientKey<?>, Api.Client> f12315f;

    /* renamed from: h  reason: collision with root package name */
    final ClientSettings f12317h;

    /* renamed from: i  reason: collision with root package name */
    final Map<Api<?>, Boolean> f12318i;

    /* renamed from: j  reason: collision with root package name */
    final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f12319j;

    /* renamed from: k  reason: collision with root package name */
    private volatile zabf f12320k;

    /* renamed from: m  reason: collision with root package name */
    int f12322m;

    /* renamed from: n  reason: collision with root package name */
    final zabe f12323n;

    /* renamed from: o  reason: collision with root package name */
    final zabz f12324o;

    /* renamed from: g  reason: collision with root package name */
    final Map<Api.AnyClientKey<?>, ConnectionResult> f12316g = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private ConnectionResult f12321l = null;

    public zabi(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, ArrayList<zat> arrayList, zabz zabzVar) {
        this.f12312c = context;
        this.f12310a = lock;
        this.f12313d = googleApiAvailabilityLight;
        this.f12315f = map;
        this.f12317h = clientSettings;
        this.f12318i = map2;
        this.f12319j = abstractClientBuilder;
        this.f12323n = zabeVar;
        this.f12324o = zabzVar;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this);
        }
        this.f12314e = new s(this, looper);
        this.f12311b = lock.newCondition();
        this.f12320k = new zaax(this);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void Z(ConnectionResult connectionResult, Api<?> api, boolean z10) {
        this.f12310a.lock();
        try {
            this.f12320k.d(connectionResult, api, z10);
        } finally {
            this.f12310a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void a() {
        this.f12320k.c();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void b() {
        if (this.f12320k instanceof zaaj) {
            ((zaaj) this.f12320k).i();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void c() {
        if (this.f12320k.f()) {
            this.f12316g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f12320k);
        for (Api<?> api : this.f12318i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.d()).println(":");
            ((Api.Client) Preconditions.m(this.f12315f.get(api.b()))).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T e(T t10) {
        t10.l();
        return (T) this.f12320k.g(t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.f12310a.lock();
        try {
            this.f12323n.o();
            this.f12320k = new zaaj(this);
            this.f12320k.b();
            this.f12311b.signalAll();
        } finally {
            this.f12310a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.f12310a.lock();
        try {
            this.f12320k = new zaaw(this, this.f12317h, this.f12318i, this.f12313d, this.f12319j, this.f12310a, this.f12312c);
            this.f12320k.b();
            this.f12311b.signalAll();
        } finally {
            this.f12310a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(ConnectionResult connectionResult) {
        this.f12310a.lock();
        try {
            this.f12321l = connectionResult;
            this.f12320k = new zaax(this);
            this.f12320k.b();
            this.f12311b.signalAll();
        } finally {
            this.f12310a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(r rVar) {
        this.f12314e.sendMessage(this.f12314e.obtainMessage(1, rVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(RuntimeException runtimeException) {
        this.f12314e.sendMessage(this.f12314e.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f12310a.lock();
        try {
            this.f12320k.a(bundle);
        } finally {
            this.f12310a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.f12310a.lock();
        try {
            this.f12320k.e(i10);
        } finally {
            this.f12310a.unlock();
        }
    }
}
