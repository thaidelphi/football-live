package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaaj implements zabf {

    /* renamed from: a  reason: collision with root package name */
    private final zabi f12266a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12267b = false;

    public zaaj(zabi zabiVar) {
        this.f12266a = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void b() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c() {
        if (this.f12267b) {
            this.f12267b = false;
            this.f12266a.k(new f(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d(ConnectionResult connectionResult, Api<?> api, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e(int i10) {
        this.f12266a.j(null);
        this.f12266a.f12324o.b(i10, this.f12267b);
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean f() {
        if (this.f12267b) {
            return false;
        }
        Set<zada> set = this.f12266a.f12323n.f12308t;
        if (set != null && !set.isEmpty()) {
            this.f12267b = true;
            for (zada zadaVar : set) {
                zadaVar.f();
            }
            return false;
        }
        this.f12266a.j(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T g(T t10) {
        try {
            this.f12266a.f12323n.f12309u.a(t10);
            zabe zabeVar = this.f12266a.f12323n;
            Api.Client client = zabeVar.f12300l.get(t10.r());
            Preconditions.n(client, "Appropriate Api was not requested.");
            if (!client.isConnected() && this.f12266a.f12316g.containsKey(t10.r())) {
                t10.v(new Status(17));
            } else {
                t10.t(client);
            }
        } catch (DeadObjectException unused) {
            this.f12266a.k(new e(this, this));
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        if (this.f12267b) {
            this.f12267b = false;
            this.f12266a.f12323n.f12309u.b();
            f();
        }
    }
}
