package com.ironsource;

import android.util.Log;
import com.ironsource.er;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class lh {

    /* renamed from: b  reason: collision with root package name */
    private static lh f18211b;

    /* renamed from: a  reason: collision with root package name */
    private kc f18212a;

    private lh() {
    }

    private static lh a() {
        if (f18211b == null) {
            f18211b = new lh();
        }
        return f18211b;
    }

    public static void a(ec ecVar, jh jhVar) {
        if (ecVar != null) {
            try {
                a().f18212a = new kc(ecVar, jhVar);
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }
    }

    public static void a(er.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(er.a aVar, Map<String, Object> map) {
        kc kcVar = a().f18212a;
        if (kcVar == null) {
            Log.d(cc.f16859a, cc.U);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f17320b));
        }
        kcVar.a(aVar.f17319a, map);
    }
}
