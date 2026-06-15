package com.ironsource;

import android.text.TextUtils;
import com.ironsource.e2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.p1;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class fn extends p1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(o1 adTools, gn adUnitData, hn listener) {
        super(adTools, adUnitData, listener, null, 8, null);
        String format;
        int b10;
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(listener, "listener");
        Placement g10 = g();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placement = " + g10);
        if (g10 == null || TextUtils.isEmpty(g10.getPlacementName())) {
            kotlin.jvm.internal.d0 d0Var = kotlin.jvm.internal.d0.f27370a;
            Object[] objArr = new Object[1];
            objArr[0] = g10 == null ? "placement is null" : "placement name is empty";
            format = String.format("can't load native ad - %s", Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.n.e(format, "format(format, *args)");
            b10 = a2.b(adUnitData.b().a());
        } else {
            format = null;
            b10 = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b10, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 a(fn this$0, b0 adInstanceData, h0 adInstancePayload) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInstanceData, "adInstanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        return new xm(new w2(this$0.f(), e2.b.PROVIDER), adInstanceData, adInstancePayload, new p1.a());
    }

    @Override // com.ironsource.p1
    protected d0 a() {
        return new d0() { // from class: com.ironsource.ey
            @Override // com.ironsource.d0
            public final a0 a(b0 b0Var, h0 h0Var) {
                a0 a10;
                a10 = fn.a(fn.this, b0Var, h0Var);
                return a10;
            }
        };
    }
}
