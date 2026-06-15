package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zai {

    /* renamed from: b  reason: collision with root package name */
    protected final A f12376b;

    public zae(int i10, A a10) {
        super(i10);
        this.f12376b = (A) Preconditions.n(a10, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        try {
            this.f12376b.v(status);
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f12376b.v(new Status(10, sb.toString()));
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq<?> zabqVar) throws DeadObjectException {
        try {
            this.f12376b.t(zabqVar.s());
        } catch (RuntimeException e8) {
            b(e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zaad zaadVar, boolean z10) {
        zaadVar.c(this.f12376b, z10);
    }
}
