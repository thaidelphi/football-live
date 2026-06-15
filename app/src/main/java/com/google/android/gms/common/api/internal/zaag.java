package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class zaag extends GoogleApiClient {

    /* renamed from: b  reason: collision with root package name */
    private final String f12265b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public zaag(String str) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void d() {
        throw new UnsupportedOperationException(this.f12265b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void e() {
        throw new UnsupportedOperationException(this.f12265b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.f12265b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void i(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new UnsupportedOperationException(this.f12265b);
    }
}
