package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class si {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20691a = new a(null);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        public final boolean b(Context context) {
            kotlin.jvm.internal.n.f(context, "context");
            d8 d10 = d(context);
            if (d10.d().length() > 0) {
                if (d10.e().length() > 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
            if ((r0.e().length() > 0) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.ironsource.ls c(android.content.Context r5) {
            /*
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.n.f(r5, r0)
                com.ironsource.d8 r0 = r4.d(r5)
                java.lang.String r1 = r0.d()
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L17
                r1 = r2
                goto L18
            L17:
                r1 = r3
            L18:
                if (r1 == 0) goto L2a
                java.lang.String r1 = r0.e()
                int r1 = r1.length()
                if (r1 <= 0) goto L26
                r1 = r2
                goto L27
            L26:
                r1 = r3
            L27:
                if (r1 == 0) goto L2a
                goto L2b
            L2a:
                r2 = r3
            L2b:
                r1 = 0
                if (r2 == 0) goto L2f
                goto L30
            L2f:
                r0 = r1
            L30:
                if (r0 == 0) goto L48
                com.ironsource.ls r1 = new com.ironsource.ls
                java.lang.String r2 = r0.d()
                java.lang.String r3 = r0.f()
                java.lang.String r0 = r0.e()
                r1.<init>(r5, r2, r3, r0)
                com.ironsource.ls$a r5 = com.ironsource.ls.a.CACHE
                r1.a(r5)
            L48:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.si.a.c(android.content.Context):com.ironsource.ls");
        }

        public final d8 d(Context context) {
            kotlin.jvm.internal.n.f(context, "context");
            JSONObject a10 = a(context);
            String cachedAppKey = a10.optString("appKey");
            String cachedUserId = a10.optString("userId");
            String cachedSettings = a10.optString(ls.f18303n);
            kotlin.jvm.internal.n.e(cachedAppKey, "cachedAppKey");
            kotlin.jvm.internal.n.e(cachedUserId, "cachedUserId");
            kotlin.jvm.internal.n.e(cachedSettings, "cachedSettings");
            return new d8(cachedAppKey, cachedUserId, cachedSettings);
        }
    }

    public static final boolean a(Context context) {
        return f20691a.b(context);
    }

    public static final ls b(Context context) {
        return f20691a.c(context);
    }

    public static final d8 c(Context context) {
        return f20691a.d(context);
    }
}
