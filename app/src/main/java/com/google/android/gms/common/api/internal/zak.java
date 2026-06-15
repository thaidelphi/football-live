package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zak extends zap {

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<k0> f12383e;

    private final k0 j(int i10) {
        if (this.f12383e.size() <= i10) {
            return null;
        }
        SparseArray<k0> sparseArray = this.f12383e;
        return sparseArray.get(sparseArray.keyAt(i10));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void b(ConnectionResult connectionResult, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        k0 k0Var = this.f12383e.get(i10);
        if (k0Var != null) {
            i(i10);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = k0Var.f12224c;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void c() {
        for (int i10 = 0; i10 < this.f12383e.size(); i10++) {
            k0 j10 = j(i10);
            if (j10 != null) {
                j10.f12223b.d();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.f12383e.size(); i10++) {
            k0 j10 = j(i10);
            if (j10 != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(j10.f12222a);
                printWriter.println(":");
                j10.f12223b.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void i(int i10) {
        k0 k0Var = this.f12383e.get(i10);
        this.f12383e.remove(i10);
        if (k0Var != null) {
            k0Var.f12223b.i(k0Var);
            k0Var.f12223b.e();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        boolean z10 = this.f12389a;
        String valueOf = String.valueOf(this.f12383e);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z10);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f12390b.get() == null) {
            for (int i10 = 0; i10 < this.f12383e.size(); i10++) {
                k0 j10 = j(i10);
                if (j10 != null) {
                    j10.f12223b.d();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i10 = 0; i10 < this.f12383e.size(); i10++) {
            k0 j10 = j(i10);
            if (j10 != null) {
                j10.f12223b.e();
            }
        }
    }
}
