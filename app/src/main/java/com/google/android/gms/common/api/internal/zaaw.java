package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.SignInOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaaw implements zabf {

    /* renamed from: a  reason: collision with root package name */
    private final zabi f12268a;

    /* renamed from: b  reason: collision with root package name */
    private final Lock f12269b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f12270c;

    /* renamed from: d  reason: collision with root package name */
    private final GoogleApiAvailabilityLight f12271d;

    /* renamed from: e  reason: collision with root package name */
    private ConnectionResult f12272e;

    /* renamed from: f  reason: collision with root package name */
    private int f12273f;

    /* renamed from: h  reason: collision with root package name */
    private int f12275h;

    /* renamed from: k  reason: collision with root package name */
    private com.google.android.gms.signin.zae f12278k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12279l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12280m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f12281n;

    /* renamed from: o  reason: collision with root package name */
    private IAccountAccessor f12282o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12283p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12284q;

    /* renamed from: r  reason: collision with root package name */
    private final ClientSettings f12285r;

    /* renamed from: s  reason: collision with root package name */
    private final Map<Api<?>, Boolean> f12286s;

    /* renamed from: t  reason: collision with root package name */
    private final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f12287t;

    /* renamed from: g  reason: collision with root package name */
    private int f12274g = 0;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f12276i = new Bundle();

    /* renamed from: j  reason: collision with root package name */
    private final Set<Api.AnyClientKey> f12277j = new HashSet();

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList<Future<?>> f12288u = new ArrayList<>();

    public zaaw(zabi zabiVar, ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.f12268a = zabiVar;
        this.f12285r = clientSettings;
        this.f12286s = map;
        this.f12271d = googleApiAvailabilityLight;
        this.f12287t = abstractClientBuilder;
        this.f12269b = lock;
        this.f12270c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void A(zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        if (zaawVar.n(0)) {
            ConnectionResult X = zakVar.X();
            if (X.z0()) {
                zav zavVar = (zav) Preconditions.m(zakVar.n0());
                ConnectionResult X2 = zavVar.X();
                if (!X2.z0()) {
                    String valueOf = String.valueOf(X2);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    zaawVar.k(X2);
                    return;
                }
                zaawVar.f12281n = true;
                zaawVar.f12282o = (IAccountAccessor) Preconditions.m(zavVar.n0());
                zaawVar.f12283p = zavVar.o0();
                zaawVar.f12284q = zavVar.y0();
                zaawVar.m();
            } else if (zaawVar.p(X)) {
                zaawVar.h();
                zaawVar.m();
            } else {
                zaawVar.k(X);
            }
        }
    }

    private final void I() {
        ArrayList<Future<?>> arrayList = this.f12288u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).cancel(true);
        }
        this.f12288u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.f12280m = false;
        this.f12268a.f12323n.f12301m = Collections.emptySet();
        for (Api.AnyClientKey<?> anyClientKey : this.f12277j) {
            if (!this.f12268a.f12316g.containsKey(anyClientKey)) {
                this.f12268a.f12316g.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    private final void i(boolean z10) {
        com.google.android.gms.signin.zae zaeVar = this.f12278k;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z10) {
                zaeVar.a();
            }
            zaeVar.disconnect();
            ClientSettings clientSettings = (ClientSettings) Preconditions.m(this.f12285r);
            this.f12282o = null;
        }
    }

    private final void j() {
        this.f12268a.h();
        zabj.a().execute(new g(this));
        com.google.android.gms.signin.zae zaeVar = this.f12278k;
        if (zaeVar != null) {
            if (this.f12283p) {
                zaeVar.d((IAccountAccessor) Preconditions.m(this.f12282o), this.f12284q);
            }
            i(false);
        }
        for (Api.AnyClientKey<?> anyClientKey : this.f12268a.f12316g.keySet()) {
            ((Api.Client) Preconditions.m(this.f12268a.f12315f.get(anyClientKey))).disconnect();
        }
        this.f12268a.f12324o.a(this.f12276i.isEmpty() ? null : this.f12276i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(ConnectionResult connectionResult) {
        I();
        i(!connectionResult.y0());
        this.f12268a.j(connectionResult);
        this.f12268a.f12324o.c(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ConnectionResult connectionResult, Api<?> api, boolean z10) {
        int priority = api.c().getPriority();
        if ((!z10 || connectionResult.y0() || this.f12271d.c(connectionResult.X()) != null) && (this.f12272e == null || priority < this.f12273f)) {
            this.f12272e = connectionResult;
            this.f12273f = priority;
        }
        this.f12268a.f12316g.put(api.b(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (this.f12275h != 0) {
            return;
        }
        if (!this.f12280m || this.f12281n) {
            ArrayList arrayList = new ArrayList();
            this.f12274g = 1;
            this.f12275h = this.f12268a.f12315f.size();
            for (Api.AnyClientKey<?> anyClientKey : this.f12268a.f12315f.keySet()) {
                if (this.f12268a.f12316g.containsKey(anyClientKey)) {
                    if (o()) {
                        j();
                    }
                } else {
                    arrayList.add(this.f12268a.f12315f.get(anyClientKey));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f12288u.add(zabj.a().submit(new l(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(int i10) {
        if (this.f12274g != i10) {
            Log.w("GACConnecting", this.f12268a.f12323n.l());
            Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
            int i11 = this.f12275h;
            StringBuilder sb = new StringBuilder(33);
            sb.append("mRemainingConnections=");
            sb.append(i11);
            Log.w("GACConnecting", sb.toString());
            String q10 = q(this.f12274g);
            String q11 = q(i10);
            StringBuilder sb2 = new StringBuilder(q10.length() + 70 + q11.length());
            sb2.append("GoogleApiClient connecting is in step ");
            sb2.append(q10);
            sb2.append(" but received callback for step ");
            sb2.append(q11);
            Log.e("GACConnecting", sb2.toString(), new Exception());
            k(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        int i10 = this.f12275h - 1;
        this.f12275h = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 < 0) {
            Log.w("GACConnecting", this.f12268a.f12323n.l());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            k(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f12272e;
        if (connectionResult != null) {
            this.f12268a.f12322m = this.f12273f;
            k(connectionResult);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(ConnectionResult connectionResult) {
        return this.f12279l && !connectionResult.y0();
    }

    private static final String q(int i10) {
        return i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Set x(zaaw zaawVar) {
        ClientSettings clientSettings = zaawVar.f12285r;
        if (clientSettings == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(clientSettings.e());
        Map<Api<?>, com.google.android.gms.common.internal.zab> i10 = zaawVar.f12285r.i();
        for (Api<?> api : i10.keySet()) {
            if (!zaawVar.f12268a.f12316g.containsKey(api.b())) {
                hashSet.addAll(i10.get(api).f12576a);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void a(Bundle bundle) {
        if (n(1)) {
            if (bundle != null) {
                this.f12276i.putAll(bundle);
            }
            if (o()) {
                j();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void b() {
        this.f12268a.f12316g.clear();
        this.f12280m = false;
        this.f12272e = null;
        this.f12274g = 0;
        this.f12279l = true;
        this.f12281n = false;
        this.f12283p = false;
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (Api<?> api : this.f12286s.keySet()) {
            Api.Client client = (Api.Client) Preconditions.m(this.f12268a.f12315f.get(api.b()));
            z10 |= api.c().getPriority() == 1;
            boolean booleanValue = this.f12286s.get(api).booleanValue();
            if (client.requiresSignIn()) {
                this.f12280m = true;
                if (booleanValue) {
                    this.f12277j.add(api.b());
                } else {
                    this.f12279l = false;
                }
            }
            hashMap.put(client, new h(this, api, booleanValue));
        }
        if (z10) {
            this.f12280m = false;
        }
        if (this.f12280m) {
            Preconditions.m(this.f12285r);
            Preconditions.m(this.f12287t);
            this.f12285r.j(Integer.valueOf(System.identityHashCode(this.f12268a.f12323n)));
            o oVar = new o(this, null);
            Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.f12287t;
            Context context = this.f12270c;
            Looper h10 = this.f12268a.f12323n.h();
            ClientSettings clientSettings = this.f12285r;
            this.f12278k = abstractClientBuilder.buildClient(context, h10, clientSettings, (ClientSettings) clientSettings.f(), (GoogleApiClient.ConnectionCallbacks) oVar, (GoogleApiClient.OnConnectionFailedListener) oVar);
        }
        this.f12275h = this.f12268a.f12315f.size();
        this.f12288u.add(zabj.a().submit(new k(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d(ConnectionResult connectionResult, Api<?> api, boolean z10) {
        if (n(1)) {
            l(connectionResult, api, z10);
            if (o()) {
                j();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e(int i10) {
        k(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean f() {
        I();
        i(true);
        this.f12268a.j(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T g(T t10) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
