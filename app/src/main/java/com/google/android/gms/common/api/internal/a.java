package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements zaca {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12168a;

    /* renamed from: b  reason: collision with root package name */
    private final zabe f12169b;

    /* renamed from: c  reason: collision with root package name */
    private final Looper f12170c;

    /* renamed from: d  reason: collision with root package name */
    private final zabi f12171d;

    /* renamed from: e  reason: collision with root package name */
    private final zabi f12172e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Api.AnyClientKey<?>, zabi> f12173f;

    /* renamed from: h  reason: collision with root package name */
    private final Api.Client f12175h;

    /* renamed from: i  reason: collision with root package name */
    private Bundle f12176i;

    /* renamed from: m  reason: collision with root package name */
    private final Lock f12180m;

    /* renamed from: g  reason: collision with root package name */
    private final Set<SignInConnectionListener> f12174g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: j  reason: collision with root package name */
    private ConnectionResult f12177j = null;

    /* renamed from: k  reason: collision with root package name */
    private ConnectionResult f12178k = null;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12179l = false;

    /* renamed from: n  reason: collision with root package name */
    private int f12181n = 0;

    private a(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Api.Client client, ArrayList<zat> arrayList, ArrayList<zat> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.f12168a = context;
        this.f12169b = zabeVar;
        this.f12180m = lock;
        this.f12170c = looper;
        this.f12175h = client;
        this.f12171d = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new q0(this, null));
        this.f12172e = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new r0(this, null));
        androidx.collection.a aVar = new androidx.collection.a();
        for (Api.AnyClientKey<?> anyClientKey : map2.keySet()) {
            aVar.put(anyClientKey, this.f12171d);
        }
        for (Api.AnyClientKey<?> anyClientKey2 : map.keySet()) {
            aVar.put(anyClientKey2, this.f12172e);
        }
        this.f12173f = Collections.unmodifiableMap(aVar);
    }

    private final void f(ConnectionResult connectionResult) {
        int i10 = this.f12181n;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f12169b.c(connectionResult);
            } else {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f12181n = 0;
            }
        }
        g();
        this.f12181n = 0;
    }

    private final void g() {
        for (SignInConnectionListener signInConnectionListener : this.f12174g) {
            signInConnectionListener.a();
        }
        this.f12174g.clear();
    }

    private final boolean h() {
        ConnectionResult connectionResult = this.f12178k;
        return connectionResult != null && connectionResult.X() == 4;
    }

    private final boolean i(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        zabi zabiVar = this.f12173f.get(apiMethodImpl.r());
        Preconditions.n(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.f12172e);
    }

    private static boolean j(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.z0();
    }

    public static a l(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, ArrayList<zat> arrayList) {
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Api.Client client = null;
        for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
            Api.Client value = entry.getValue();
            if (true == value.providesSignIn()) {
                client = value;
            }
            if (value.requiresSignIn()) {
                aVar.put(entry.getKey(), value);
            } else {
                aVar2.put(entry.getKey(), value);
            }
        }
        Preconditions.q(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        androidx.collection.a aVar3 = new androidx.collection.a();
        androidx.collection.a aVar4 = new androidx.collection.a();
        for (Api<?> api : map2.keySet()) {
            Api.AnyClientKey<?> b10 = api.b();
            if (aVar.containsKey(b10)) {
                aVar3.put(api, map2.get(api));
            } else if (aVar2.containsKey(b10)) {
                aVar4.put(api, map2.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zat zatVar = arrayList.get(i10);
            if (aVar3.containsKey(zatVar.f12393a)) {
                arrayList2.add(zatVar);
            } else if (aVar4.containsKey(zatVar.f12393a)) {
                arrayList3.add(zatVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new a(context, zabeVar, lock, looper, googleApiAvailabilityLight, aVar, aVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, aVar3, aVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void s(a aVar, int i10, boolean z10) {
        aVar.f12169b.b(i10, z10);
        aVar.f12178k = null;
        aVar.f12177j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void t(a aVar, Bundle bundle) {
        Bundle bundle2 = aVar.f12176i;
        if (bundle2 == null) {
            aVar.f12176i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void u(a aVar) {
        ConnectionResult connectionResult;
        if (j(aVar.f12177j)) {
            if (!j(aVar.f12178k) && !aVar.h()) {
                ConnectionResult connectionResult2 = aVar.f12178k;
                if (connectionResult2 != null) {
                    if (aVar.f12181n == 1) {
                        aVar.g();
                        return;
                    }
                    aVar.f(connectionResult2);
                    aVar.f12171d.c();
                    return;
                }
                return;
            }
            int i10 = aVar.f12181n;
            if (i10 != 1) {
                if (i10 != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    aVar.f12181n = 0;
                }
                ((zabe) Preconditions.m(aVar.f12169b)).a(aVar.f12176i);
            }
            aVar.g();
            aVar.f12181n = 0;
        } else if (aVar.f12177j != null && j(aVar.f12178k)) {
            aVar.f12172e.c();
            aVar.f((ConnectionResult) Preconditions.m(aVar.f12177j));
        } else {
            ConnectionResult connectionResult3 = aVar.f12177j;
            if (connectionResult3 == null || (connectionResult = aVar.f12178k) == null) {
                return;
            }
            if (aVar.f12172e.f12322m < aVar.f12171d.f12322m) {
                connectionResult3 = connectionResult;
            }
            aVar.f(connectionResult3);
        }
    }

    private final PendingIntent w() {
        if (this.f12175h == null) {
            return null;
        }
        return com.google.android.gms.internal.base.zal.zaa(this.f12168a, System.identityHashCode(this.f12169b), this.f12175h.getSignInIntent(), com.google.android.gms.internal.base.zal.zaa | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void a() {
        this.f12181n = 2;
        this.f12179l = false;
        this.f12178k = null;
        this.f12177j = null;
        this.f12171d.a();
        this.f12172e.a();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void b() {
        this.f12171d.b();
        this.f12172e.b();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void c() {
        this.f12178k = null;
        this.f12177j = null;
        this.f12181n = 0;
        this.f12171d.c();
        this.f12172e.c();
        g();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f12172e.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f12171d.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T e(T t10) {
        if (i(t10)) {
            if (h()) {
                t10.v(new Status(4, (String) null, w()));
                return t10;
            }
            return (T) this.f12172e.e(t10);
        }
        return (T) this.f12171d.e(t10);
    }
}
