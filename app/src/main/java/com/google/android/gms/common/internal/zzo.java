package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzo {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f12623f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    private final String f12624a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12625b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f12626c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12627d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12628e;

    public zzo(String str, String str2, int i10, boolean z10) {
        Preconditions.g(str);
        this.f12624a = str;
        Preconditions.g(str2);
        this.f12625b = str2;
        this.f12626c = null;
        this.f12627d = 4225;
        this.f12628e = z10;
    }

    public final ComponentName a() {
        return this.f12626c;
    }

    public final Intent b(Context context) {
        Bundle bundle;
        if (this.f12624a != null) {
            if (this.f12628e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f12624a);
                try {
                    bundle = context.getContentResolver().call(f12623f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e8) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e8.toString()));
                    bundle = null;
                }
                r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r2 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f12624a)));
                }
            }
            return r2 == null ? new Intent(this.f12624a).setPackage(this.f12625b) : r2;
        }
        return new Intent().setComponent(this.f12626c);
    }

    public final String c() {
        return this.f12625b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzo) {
            zzo zzoVar = (zzo) obj;
            return Objects.a(this.f12624a, zzoVar.f12624a) && Objects.a(this.f12625b, zzoVar.f12625b) && Objects.a(this.f12626c, zzoVar.f12626c) && this.f12628e == zzoVar.f12628e;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f12624a, this.f12625b, this.f12626c, 4225, Boolean.valueOf(this.f12628e));
    }

    public final String toString() {
        String str = this.f12624a;
        if (str == null) {
            Preconditions.m(this.f12626c);
            return this.f12626c.flattenToString();
        }
        return str;
    }
}
