package com.ironsource;

import com.ironsource.eg;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.t;
import i8.o;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class iq {

    /* renamed from: a  reason: collision with root package name */
    private final vl f17850a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, t.d> f17851b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, t.d> f17852c;

    public iq(vl tools, Map<String, t.d> map, Map<String, t.d> map2) {
        kotlin.jvm.internal.n.f(tools, "tools");
        this.f17850a = tools;
        this.f17851b = map;
        this.f17852c = map2;
    }

    private final Object a(String str, Integer num) {
        Object a10;
        if (str == null || num == null) {
            o.a aVar = i8.o.f26626b;
            a10 = i8.p.a(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid"));
        } else {
            o.a aVar2 = i8.o.f26626b;
            a10 = i8.w.f26638a;
        }
        return i8.o.b(a10);
    }

    private final void a(eg.a aVar, String str, String str2, Integer num) {
        Object a10 = a(str2, num);
        if (i8.o.g(a10)) {
            i8.w wVar = (i8.w) a10;
            kotlin.jvm.internal.n.c(str2);
            kotlin.jvm.internal.n.c(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable d10 = i8.o.d(a10);
        if (d10 != null) {
            this.f17850a.b(str, IronSourceError.ERROR_REWARD_VALIDATION_FAILED, d10.getMessage());
        }
    }

    private final void b(eg.a aVar, String str, String str2, Integer num) {
        Object a10 = a(str2, num);
        if (i8.o.g(a10)) {
            i8.w wVar = (i8.w) a10;
            kotlin.jvm.internal.n.c(str2);
            kotlin.jvm.internal.n.c(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable d10 = i8.o.d(a10);
        if (d10 != null) {
            this.f17850a.b(str, IronSourceError.ERROR_REWARD_VALIDATION_FAILED, d10.getMessage());
        }
    }

    public final void a(eg.a rewardService) {
        kotlin.jvm.internal.n.f(rewardService, "rewardService");
        Map<String, t.d> map = this.f17852c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, t.d> entry : map.entrySet()) {
                String key = entry.getKey();
                gq f10 = entry.getValue().f();
                if (f10 != null) {
                    b(rewardService, key, f10.b(), f10.a());
                }
            }
        }
        Map<String, t.d> map2 = this.f17851b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, t.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            gq a10 = entry2.getValue().a();
            if (a10 != null) {
                a(rewardService, key2, a10.b(), a10.a());
            }
        }
    }
}
