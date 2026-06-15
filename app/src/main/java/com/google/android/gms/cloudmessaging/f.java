package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class f<T> {

    /* renamed from: a  reason: collision with root package name */
    final int f11963a;

    /* renamed from: b  reason: collision with root package name */
    final TaskCompletionSource<T> f11964b = new TaskCompletionSource<>();

    /* renamed from: c  reason: collision with root package name */
    final int f11965c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f11966d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i10, int i11, Bundle bundle) {
        this.f11963a = i10;
        this.f11965c = i11;
        this.f11966d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f11964b.setException(zzqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f11964b.setResult(t10);
    }

    public final String toString() {
        int i10 = this.f11965c;
        int i11 = this.f11963a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i10);
        sb.append(" id=");
        sb.append(i11);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
