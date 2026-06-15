package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AvailabilityException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final a<ApiKey<?>, ConnectionResult> f12047a;

    public AvailabilityException(a<ApiKey<?>, ConnectionResult> aVar) {
        this.f12047a = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (ApiKey<?> apiKey : this.f12047a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.m(this.f12047a.get(apiKey));
            z10 &= !connectionResult.z0();
            String b10 = apiKey.b();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(b10).length() + 2 + valueOf.length());
            sb.append(b10);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
