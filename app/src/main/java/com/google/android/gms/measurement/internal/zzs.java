package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzs {

    /* renamed from: a  reason: collision with root package name */
    private final zzfy f13744a;

    public zzs(zzfy zzfyVar) {
        this.f13744a = zzfyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, Bundle bundle) {
        String uri;
        this.f13744a.zzaz().c();
        if (this.f13744a.j()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.f13744a.A().f13247u.b(uri);
        this.f13744a.A().f13248v.b(this.f13744a.zzav().a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f13744a.zzaz().c();
        if (d()) {
            if (e()) {
                this.f13744a.A().f13247u.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f13744a.D().p("auto", "_cmpx", bundle);
            } else {
                String a10 = this.f13744a.A().f13247u.a();
                if (TextUtils.isEmpty(a10)) {
                    this.f13744a.zzay().o().a("Cache still valid but referrer not found");
                } else {
                    long a11 = ((this.f13744a.A().f13248v.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a11);
                    Object obj = pair.first;
                    this.f13744a.D().p(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f13744a.A().f13247u.b(null);
            }
            this.f13744a.A().f13248v.b(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f13744a.A().f13247u.b(null);
        }
    }

    final boolean d() {
        return this.f13744a.A().f13248v.a() > 0;
    }

    final boolean e() {
        return d() && this.f13744a.zzav().a() - this.f13744a.A().f13248v.a() > this.f13744a.u().m(null, zzeb.S);
    }
}
