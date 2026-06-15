package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zabq<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {

    /* renamed from: b */
    private final Api.Client f12328b;

    /* renamed from: c */
    private final ApiKey<O> f12329c;

    /* renamed from: d */
    private final zaad f12330d;

    /* renamed from: g */
    private final int f12333g;

    /* renamed from: h */
    private final zact f12334h;

    /* renamed from: i */
    private boolean f12335i;

    /* renamed from: m */
    final /* synthetic */ GoogleApiManager f12339m;

    /* renamed from: a */
    private final Queue<zai> f12327a = new LinkedList();

    /* renamed from: e */
    private final Set<zal> f12331e = new HashSet();

    /* renamed from: f */
    private final Map<ListenerHolder.ListenerKey<?>, zaci> f12332f = new HashMap();

    /* renamed from: j */
    private final List<y> f12336j = new ArrayList();

    /* renamed from: k */
    private ConnectionResult f12337k = null;

    /* renamed from: l */
    private int f12338l = 0;

    public zabq(GoogleApiManager googleApiManager, GoogleApi<O> googleApi) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f12339m = googleApiManager;
        handler = googleApiManager.f12127p;
        Api.Client zab = googleApi.zab(handler.getLooper(), this);
        this.f12328b = zab;
        this.f12329c = googleApi.getApiKey();
        this.f12330d = new zaad();
        this.f12333g = googleApi.zaa();
        if (!zab.requiresSignIn()) {
            this.f12334h = null;
            return;
        }
        context = googleApiManager.f12118g;
        handler2 = googleApiManager.f12127p;
        this.f12334h = googleApi.zac(context, handler2);
    }

    public static /* bridge */ /* synthetic */ boolean K(zabq zabqVar, boolean z10) {
        return zabqVar.n(false);
    }

    private final Feature b(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f12328b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            androidx.collection.a aVar = new androidx.collection.a(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                aVar.put(feature.X(), Long.valueOf(feature.n0()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) aVar.get(feature2.X());
                if (l10 == null || l10.longValue() < feature2.n0()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void c(ConnectionResult connectionResult) {
        for (zal zalVar : this.f12331e) {
            zalVar.b(this.f12329c, connectionResult, Objects.a(connectionResult, ConnectionResult.f12002e) ? this.f12328b.getEndpointPackageName() : null);
        }
        this.f12331e.clear();
    }

    public final void d(Status status) {
        Handler handler;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        e(status, null, false);
    }

    private final void e(Status status, Exception exc, boolean z10) {
        Handler handler;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        if ((status == null) != (exc == null)) {
            Iterator<zai> it = this.f12327a.iterator();
            while (it.hasNext()) {
                zai next = it.next();
                if (!z10 || next.f12382a == 2) {
                    if (status != null) {
                        next.a(status);
                    } else {
                        next.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void f() {
        ArrayList arrayList = new ArrayList(this.f12327a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zai zaiVar = (zai) arrayList.get(i10);
            if (!this.f12328b.isConnected()) {
                return;
            }
            if (l(zaiVar)) {
                this.f12327a.remove(zaiVar);
            }
        }
    }

    public final void g() {
        A();
        c(ConnectionResult.f12002e);
        k();
        Iterator<zaci> it = this.f12332f.values().iterator();
        while (it.hasNext()) {
            zaci next = it.next();
            if (b(next.f12352a.c()) != null) {
                it.remove();
            } else {
                try {
                    next.f12352a.d(this.f12328b, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f12328b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        f();
        i();
    }

    public final void h(int i10) {
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        com.google.android.gms.common.internal.zal zalVar;
        A();
        this.f12335i = true;
        this.f12330d.e(i10, this.f12328b.getLastDisconnectMessage());
        GoogleApiManager googleApiManager = this.f12339m;
        handler = googleApiManager.f12127p;
        handler2 = googleApiManager.f12127p;
        Message obtain = Message.obtain(handler2, 9, this.f12329c);
        j10 = this.f12339m.f12112a;
        handler.sendMessageDelayed(obtain, j10);
        GoogleApiManager googleApiManager2 = this.f12339m;
        handler3 = googleApiManager2.f12127p;
        handler4 = googleApiManager2.f12127p;
        Message obtain2 = Message.obtain(handler4, 11, this.f12329c);
        j11 = this.f12339m.f12113b;
        handler3.sendMessageDelayed(obtain2, j11);
        zalVar = this.f12339m.f12120i;
        zalVar.c();
        for (zaci zaciVar : this.f12332f.values()) {
            zaciVar.f12354c.run();
        }
    }

    private final void i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j10;
        handler = this.f12339m.f12127p;
        handler.removeMessages(12, this.f12329c);
        GoogleApiManager googleApiManager = this.f12339m;
        handler2 = googleApiManager.f12127p;
        handler3 = googleApiManager.f12127p;
        Message obtainMessage = handler3.obtainMessage(12, this.f12329c);
        j10 = this.f12339m.f12114c;
        handler2.sendMessageDelayed(obtainMessage, j10);
    }

    private final void j(zai zaiVar) {
        zaiVar.d(this.f12330d, M());
        try {
            zaiVar.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f12328b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void k() {
        Handler handler;
        Handler handler2;
        if (this.f12335i) {
            handler = this.f12339m.f12127p;
            handler.removeMessages(11, this.f12329c);
            handler2 = this.f12339m.f12127p;
            handler2.removeMessages(9, this.f12329c);
            this.f12335i = false;
        }
    }

    private final boolean l(zai zaiVar) {
        boolean z10;
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j12;
        if (!(zaiVar instanceof zac)) {
            j(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature b10 = b(zacVar.g(this));
        if (b10 == null) {
            j(zaiVar);
            return true;
        }
        String name = this.f12328b.getClass().getName();
        String X = b10.X();
        long n02 = b10.n0();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(X).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(X);
        sb.append(", ");
        sb.append(n02);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        z10 = this.f12339m.f12128q;
        if (z10 && zacVar.f(this)) {
            y yVar = new y(this.f12329c, b10, null);
            int indexOf = this.f12336j.indexOf(yVar);
            if (indexOf >= 0) {
                y yVar2 = this.f12336j.get(indexOf);
                handler5 = this.f12339m.f12127p;
                handler5.removeMessages(15, yVar2);
                GoogleApiManager googleApiManager = this.f12339m;
                handler6 = googleApiManager.f12127p;
                handler7 = googleApiManager.f12127p;
                Message obtain = Message.obtain(handler7, 15, yVar2);
                j12 = this.f12339m.f12112a;
                handler6.sendMessageDelayed(obtain, j12);
                return false;
            }
            this.f12336j.add(yVar);
            GoogleApiManager googleApiManager2 = this.f12339m;
            handler = googleApiManager2.f12127p;
            handler2 = googleApiManager2.f12127p;
            Message obtain2 = Message.obtain(handler2, 15, yVar);
            j10 = this.f12339m.f12112a;
            handler.sendMessageDelayed(obtain2, j10);
            GoogleApiManager googleApiManager3 = this.f12339m;
            handler3 = googleApiManager3.f12127p;
            handler4 = googleApiManager3.f12127p;
            Message obtain3 = Message.obtain(handler4, 16, yVar);
            j11 = this.f12339m.f12113b;
            handler3.sendMessageDelayed(obtain3, j11);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (m(connectionResult)) {
                return false;
            }
            this.f12339m.g(connectionResult, this.f12333g);
            return false;
        }
        zacVar.b(new UnsupportedApiCallException(b10));
        return true;
    }

    private final boolean m(ConnectionResult connectionResult) {
        Object obj;
        zaae zaaeVar;
        Set set;
        zaae zaaeVar2;
        obj = GoogleApiManager.f12110t;
        synchronized (obj) {
            GoogleApiManager googleApiManager = this.f12339m;
            zaaeVar = googleApiManager.f12124m;
            if (zaaeVar != null) {
                set = googleApiManager.f12125n;
                if (set.contains(this.f12329c)) {
                    zaaeVar2 = this.f12339m.f12124m;
                    zaaeVar2.h(connectionResult, this.f12333g);
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean n(boolean z10) {
        Handler handler;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        if (this.f12328b.isConnected() && this.f12332f.size() == 0) {
            if (!this.f12330d.g()) {
                this.f12328b.disconnect("Timing out service connection.");
                return true;
            }
            if (z10) {
                i();
            }
            return false;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ ApiKey t(zabq zabqVar) {
        return zabqVar.f12329c;
    }

    public static /* bridge */ /* synthetic */ void v(zabq zabqVar, Status status) {
        zabqVar.d(status);
    }

    public static /* bridge */ /* synthetic */ void y(zabq zabqVar, y yVar) {
        if (zabqVar.f12336j.contains(yVar) && !zabqVar.f12335i) {
            if (zabqVar.f12328b.isConnected()) {
                zabqVar.f();
            } else {
                zabqVar.B();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(zabq zabqVar, y yVar) {
        Handler handler;
        Handler handler2;
        Feature feature;
        Feature[] g10;
        if (zabqVar.f12336j.remove(yVar)) {
            handler = zabqVar.f12339m.f12127p;
            handler.removeMessages(15, yVar);
            handler2 = zabqVar.f12339m.f12127p;
            handler2.removeMessages(16, yVar);
            feature = yVar.f12258b;
            ArrayList arrayList = new ArrayList(zabqVar.f12327a.size());
            for (zai zaiVar : zabqVar.f12327a) {
                if ((zaiVar instanceof zac) && (g10 = ((zac) zaiVar).g(zabqVar)) != null && ArrayUtils.c(g10, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zai zaiVar2 = (zai) arrayList.get(i10);
                zabqVar.f12327a.remove(zaiVar2);
                zaiVar2.b(new UnsupportedApiCallException(feature));
            }
        }
    }

    public final void A() {
        Handler handler;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        this.f12337k = null;
    }

    public final void B() {
        Handler handler;
        com.google.android.gms.common.internal.zal zalVar;
        Context context;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        if (this.f12328b.isConnected() || this.f12328b.isConnecting()) {
            return;
        }
        try {
            GoogleApiManager googleApiManager = this.f12339m;
            zalVar = googleApiManager.f12120i;
            context = googleApiManager.f12118g;
            int b10 = zalVar.b(context, this.f12328b);
            if (b10 != 0) {
                ConnectionResult connectionResult = new ConnectionResult(b10, null);
                String name = this.f12328b.getClass().getName();
                String obj = connectionResult.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(obj);
                Log.w("GoogleApiManager", sb.toString());
                E(connectionResult, null);
                return;
            }
            GoogleApiManager googleApiManager2 = this.f12339m;
            Api.Client client = this.f12328b;
            a0 a0Var = new a0(googleApiManager2, client, this.f12329c);
            if (client.requiresSignIn()) {
                ((zact) Preconditions.m(this.f12334h)).v0(a0Var);
            }
            try {
                this.f12328b.connect(a0Var);
            } catch (SecurityException e8) {
                E(new ConnectionResult(10), e8);
            }
        } catch (IllegalStateException e10) {
            E(new ConnectionResult(10), e10);
        }
    }

    public final void C(zai zaiVar) {
        Handler handler;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        if (this.f12328b.isConnected()) {
            if (l(zaiVar)) {
                i();
                return;
            } else {
                this.f12327a.add(zaiVar);
                return;
            }
        }
        this.f12327a.add(zaiVar);
        ConnectionResult connectionResult = this.f12337k;
        if (connectionResult != null && connectionResult.y0()) {
            E(this.f12337k, null);
        } else {
            B();
        }
    }

    public final void D() {
        this.f12338l++;
    }

    public final void E(ConnectionResult connectionResult, Exception exc) {
        Handler handler;
        com.google.android.gms.common.internal.zal zalVar;
        boolean z10;
        Status h10;
        Status h11;
        Status h12;
        Handler handler2;
        Handler handler3;
        long j10;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        zact zactVar = this.f12334h;
        if (zactVar != null) {
            zactVar.w0();
        }
        A();
        zalVar = this.f12339m.f12120i;
        zalVar.c();
        c(connectionResult);
        if ((this.f12328b instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.X() != 24) {
            this.f12339m.f12115d = true;
            GoogleApiManager googleApiManager = this.f12339m;
            handler5 = googleApiManager.f12127p;
            handler6 = googleApiManager.f12127p;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.X() == 4) {
            status = GoogleApiManager.f12109s;
            d(status);
        } else if (this.f12327a.isEmpty()) {
            this.f12337k = connectionResult;
        } else if (exc != null) {
            handler4 = this.f12339m.f12127p;
            Preconditions.d(handler4);
            e(null, exc, false);
        } else {
            z10 = this.f12339m.f12128q;
            if (z10) {
                h11 = GoogleApiManager.h(this.f12329c, connectionResult);
                e(h11, null, true);
                if (this.f12327a.isEmpty() || m(connectionResult) || this.f12339m.g(connectionResult, this.f12333g)) {
                    return;
                }
                if (connectionResult.X() == 18) {
                    this.f12335i = true;
                }
                if (this.f12335i) {
                    GoogleApiManager googleApiManager2 = this.f12339m;
                    handler2 = googleApiManager2.f12127p;
                    handler3 = googleApiManager2.f12127p;
                    Message obtain = Message.obtain(handler3, 9, this.f12329c);
                    j10 = this.f12339m.f12112a;
                    handler2.sendMessageDelayed(obtain, j10);
                    return;
                }
                h12 = GoogleApiManager.h(this.f12329c, connectionResult);
                d(h12);
                return;
            }
            h10 = GoogleApiManager.h(this.f12329c, connectionResult);
            d(h10);
        }
    }

    public final void F(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        Api.Client client = this.f12328b;
        String name = client.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        client.disconnect(sb.toString());
        E(connectionResult, null);
    }

    public final void G(zal zalVar) {
        Handler handler;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        this.f12331e.add(zalVar);
    }

    public final void H() {
        Handler handler;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        if (this.f12335i) {
            B();
        }
    }

    public final void I() {
        Handler handler;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        d(GoogleApiManager.f12108r);
        this.f12330d.f();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f12332f.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            C(new zah(listenerKey, new TaskCompletionSource()));
        }
        c(new ConnectionResult(4));
        if (this.f12328b.isConnected()) {
            this.f12328b.onUserSignOut(new x(this));
        }
    }

    public final void J() {
        Handler handler;
        GoogleApiAvailability googleApiAvailability;
        Context context;
        Status status;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        if (this.f12335i) {
            k();
            GoogleApiManager googleApiManager = this.f12339m;
            googleApiAvailability = googleApiManager.f12119h;
            context = googleApiManager.f12118g;
            if (googleApiAvailability.i(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            d(status);
            this.f12328b.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.f12328b.isConnected();
    }

    public final boolean M() {
        return this.f12328b.requiresSignIn();
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void Z(ConnectionResult connectionResult, Api<?> api, boolean z10) {
        throw null;
    }

    public final boolean a() {
        return n(true);
    }

    public final int o() {
        return this.f12333g;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f12339m.f12127p;
        if (myLooper == handler.getLooper()) {
            g();
            return;
        }
        handler2 = this.f12339m.f12127p;
        handler2.post(new u(this));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        E(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f12339m.f12127p;
        if (myLooper == handler.getLooper()) {
            h(i10);
            return;
        }
        handler2 = this.f12339m.f12127p;
        handler2.post(new v(this, i10));
    }

    public final int p() {
        return this.f12338l;
    }

    public final ConnectionResult q() {
        Handler handler;
        handler = this.f12339m.f12127p;
        Preconditions.d(handler);
        return this.f12337k;
    }

    public final Api.Client s() {
        return this.f12328b;
    }

    public final Map<ListenerHolder.ListenerKey<?>, zaci> u() {
        return this.f12332f;
    }
}
