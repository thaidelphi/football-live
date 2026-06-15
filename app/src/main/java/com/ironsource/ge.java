package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ge {

    /* renamed from: a  reason: collision with root package name */
    private final nf f17564a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f17565b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f17566c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f17567d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f17568a;

        a(Context context) {
            this.f17568a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ge.this.e(this.f17568a);
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
            ge.this.f17566c.set(false);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static volatile ge f17570a = new ge(null);

        private b() {
        }
    }

    private ge() {
        this.f17566c = new AtomicBoolean(false);
        this.f17567d = new AtomicBoolean(false);
        this.f17564a = mm.S().f();
        this.f17565b = new ConcurrentHashMap<>();
    }

    /* synthetic */ ge(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ge a() {
        return b.f17570a;
    }

    private void a(Context context) {
        if (this.f17566c.get()) {
            return;
        }
        try {
            this.f17566c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            this.f17566c.set(false);
        }
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f17565b.put(str, obj);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.f17565b.containsKey(str);
    }

    private void d(Context context) {
        if (context == null || this.f17567d.getAndSet(true)) {
            return;
        }
        a("auid", this.f17564a.t(context));
        a(fe.B, this.f17564a.e());
        a(fe.f17452t, this.f17564a.g());
        a(fe.E, this.f17564a.m());
        a(fe.f17440p, this.f17564a.r(context));
        String p10 = this.f17564a.p();
        if (p10 != null) {
            a(fe.F, p10.replaceAll("[^0-9/.]", ""));
            a(fe.I, p10);
        }
        a(fe.f17395a, String.valueOf(this.f17564a.l()));
        String j10 = this.f17564a.j(context);
        if (!TextUtils.isEmpty(j10)) {
            a(fe.L0, j10);
        }
        String e8 = c4.e(context);
        if (!TextUtils.isEmpty(e8)) {
            a(fe.f17437o, e8);
        }
        String i10 = this.f17564a.i(context);
        if (!TextUtils.isEmpty(i10)) {
            a(fe.f17447r0, i10);
        }
        a(fe.f17410f, context.getPackageName());
        a(fe.f17458v, String.valueOf(this.f17564a.h(context)));
        a(fe.Y, fe.f17411f0);
        a(fe.Z, Long.valueOf(c4.f(context)));
        a(fe.X, Long.valueOf(c4.d(context)));
        a(fe.f17404d, c4.b(context));
        a(fe.L, Integer.valueOf(x8.f(context)));
        a(fe.V, x8.g(context));
        a("stid", dp.c(context));
        a(fe.G, "android");
        a(fe.f17468z, this.f17564a.i());
        a(fe.f17466y, this.f17564a.a(this.f17564a.z(context)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String p10 = this.f17564a.p(context);
            if (!TextUtils.isEmpty(p10)) {
                a(fe.Q0, p10);
            }
            String a10 = this.f17564a.a(context);
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            a(fe.f17449s, Boolean.valueOf(Boolean.parseBoolean(a10)));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String G = this.f17564a.G(context);
        if (!TextUtils.isEmpty(G)) {
            a(fe.G0, G);
        } else if (a(fe.G0)) {
            b(fe.G0);
        }
        a("idfi", this.f17564a.w(context));
        String b10 = this.f17564a.b(context);
        if (!TextUtils.isEmpty(b10)) {
            a(fe.f17443q, b10.toUpperCase(Locale.getDefault()));
        }
        a(fe.f17446r, this.f17564a.I(context));
        String b11 = this.f17564a.b();
        if (!TextUtils.isEmpty(b11)) {
            a("tz", b11);
        }
        String b12 = y8.b(context);
        if (!TextUtils.isEmpty(b12) && !b12.equals("none")) {
            a(fe.f17422j, b12);
        }
        String d10 = y8.d(context);
        if (!TextUtils.isEmpty(d10)) {
            a(fe.f17425k, d10);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            a("vpn", Boolean.valueOf(y8.e(context)));
        }
        String n10 = this.f17564a.n(context);
        if (!TextUtils.isEmpty(n10)) {
            a("icc", n10);
        }
        int B = this.f17564a.B(context);
        if (B >= 0) {
            a(fe.f17412f1, Integer.valueOf(B));
        }
        a(fe.f17415g1, this.f17564a.D(context));
        a(fe.f17418h1, this.f17564a.K(context));
        a(fe.f17405d0, Float.valueOf(this.f17564a.m(context)));
        a(fe.f17431m, String.valueOf(this.f17564a.o()));
        a(fe.O, Integer.valueOf(this.f17564a.d()));
        a(fe.N, Integer.valueOf(this.f17564a.k()));
        a(fe.T0, String.valueOf(this.f17564a.j()));
        a(fe.f17403c1, String.valueOf(this.f17564a.q()));
        a("mcc", Integer.valueOf(x8.b(context)));
        a("mnc", Integer.valueOf(x8.c(context)));
        a(fe.Q, Boolean.valueOf(this.f17564a.c()));
        a(fe.f17413g, Boolean.valueOf(this.f17564a.J(context)));
        a(fe.f17416h, Integer.valueOf(this.f17564a.l(context)));
        a(fe.f17398b, Boolean.valueOf(this.f17564a.c(context)));
        a(fe.J, Boolean.valueOf(this.f17564a.d(context)));
        a("rt", Boolean.valueOf(this.f17564a.f()));
        a(fe.W, String.valueOf(this.f17564a.h()));
        a(fe.f17407e, Integer.valueOf(this.f17564a.y(context)));
        a(fe.U0, Boolean.valueOf(this.f17564a.q(context)));
        a(fe.f17401c, this.f17564a.f(context));
        a(fe.f17396a0, this.f17564a.t());
        z zVar = new z(mm.S().k());
        HashMap hashMap = new HashMap();
        zVar.a(hashMap);
        a(fe.f17469z0, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.f17565b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(ie.a(this.f17565b));
    }

    protected void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.f17565b.remove(str);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str, Object obj) {
        a(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }
}
