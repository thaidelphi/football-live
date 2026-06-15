package com.startapp;

import android.net.Uri;
import com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig;
import com.startapp.sdk.common.SDKException;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g6 {

    /* renamed from: a  reason: collision with root package name */
    public final d6 f21986a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21987b = o9.a();

    public g6(d6 d6Var) {
        this.f21986a = d6Var;
    }

    public final void a(String str, String str2, SDKException sDKException) {
        String str3;
        int i10;
        int i11;
        String str4;
        long a10 = o9.a();
        d6 d6Var = this.f21986a;
        long j10 = a10 - this.f21987b;
        NetworkDiagnosticConfig call = d6Var.f21881d.call();
        if (call == null || !call.e()) {
            call = null;
        }
        if (call == null) {
            return;
        }
        if (sDKException != null) {
            if (sDKException.getCause() != null) {
                i11 = 2;
                str4 = "Failure: ".concat(sDKException.getCause().getClass().getName());
            } else {
                i11 = 1;
                str4 = "Error: " + sDKException.a();
            }
            i10 = i11;
            str3 = str4;
        } else {
            str3 = "Success";
            i10 = 4;
        }
        if ((call.d() & i10) != 0) {
            Uri b10 = sDKException != null ? sDKException.b() : null;
            if (b10 == null) {
                b10 = Uri.parse(str2).buildUpon().query(null).build();
            }
            d6Var.f21880c.execute(new e6(d6Var, str + ' ' + b10, str3, j10));
        }
        if (i10 == 4) {
            d6Var.f21880c.execute(d6Var.f21882e);
        }
    }
}
