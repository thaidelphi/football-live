package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class jh implements cf {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Object> f17953a = new HashMap();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        String f17954a;

        /* renamed from: b  reason: collision with root package name */
        String f17955b;

        /* renamed from: c  reason: collision with root package name */
        String f17956c;

        /* renamed from: d  reason: collision with root package name */
        Context f17957d;

        /* renamed from: e  reason: collision with root package name */
        String f17958e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b a(Context context) {
            this.f17957d = context;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b a(String str) {
            this.f17955b = str;
            return this;
        }

        public jh a() {
            return new jh(this);
        }

        b b(String str) {
            this.f17956c = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(String str) {
            this.f17954a = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b d(String str) {
            this.f17958e = str;
            return this;
        }
    }

    private jh(b bVar) {
        a(bVar);
        a(bVar.f17957d);
    }

    private void a(Context context) {
        f17953a.put(cc.f16863e, y8.b(context));
        f17953a.put(cc.f16864f, y8.d(context));
    }

    private void a(b bVar) {
        Context context = bVar.f17957d;
        za b10 = za.b(context);
        f17953a.put(cc.f16868j, SDKUtils.encodeString(b10.e()));
        f17953a.put(cc.f16869k, SDKUtils.encodeString(b10.f()));
        f17953a.put(cc.f16870l, Integer.valueOf(b10.a()));
        f17953a.put(cc.f16871m, SDKUtils.encodeString(b10.d()));
        f17953a.put(cc.f16872n, SDKUtils.encodeString(b10.c()));
        f17953a.put(cc.f16862d, SDKUtils.encodeString(context.getPackageName()));
        f17953a.put(cc.f16865g, SDKUtils.encodeString(bVar.f17955b));
        f17953a.put("sessionid", SDKUtils.encodeString(bVar.f17954a));
        f17953a.put(cc.f16860b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f17953a.put(cc.f16873o, cc.f16878t);
        f17953a.put(cc.f16874p, cc.f16875q);
        if (TextUtils.isEmpty(bVar.f17958e)) {
            return;
        }
        f17953a.put(cc.f16867i, SDKUtils.encodeString(bVar.f17958e));
    }

    public static void a(String str) {
        f17953a.put(cc.f16863e, SDKUtils.encodeString(str));
    }

    public static void b(String str) {
        f17953a.put(cc.f16864f, SDKUtils.encodeString(str));
    }

    @Override // com.ironsource.cf
    public Map<String, Object> a() {
        return f17953a;
    }
}
