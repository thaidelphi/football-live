package com.appnext.core.ra.services.a;

import android.content.Context;
import android.os.Bundle;
import androidx.work.a0;
import androidx.work.c;
import androidx.work.e;
import androidx.work.g;
import androidx.work.h;
import androidx.work.q;
import androidx.work.r;
import androidx.work.u;
import androidx.work.y;
import com.appnext.core.ra.services.RecentAppsWorkManagerService;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends a {
    public b(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:3:0x0001, B:6:0x0014, B:7:0x001e, B:9:0x0024, B:11:0x0032), top: B:19:0x0001 }] */
    @Override // com.appnext.core.ra.services.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean A(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.getContext()     // Catch: java.lang.Throwable -> L3d
            androidx.work.a0 r1 = androidx.work.a0.j(r1)     // Catch: java.lang.Throwable -> L3d
            b6.a r5 = r1.k(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r5.get()     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L14
            return r0
        L14:
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L3d
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3d
        L1e:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L3d
            androidx.work.z r1 = (androidx.work.z) r1     // Catch: java.lang.Throwable -> L3d
            androidx.work.z$a r2 = r1.a()     // Catch: java.lang.Throwable -> L3d
            androidx.work.z$a r3 = androidx.work.z.a.RUNNING     // Catch: java.lang.Throwable -> L3d
            if (r2 == r3) goto L3a
            androidx.work.z$a r1 = r1.a()     // Catch: java.lang.Throwable -> L3d
            androidx.work.z$a r2 = androidx.work.z.a.ENQUEUED     // Catch: java.lang.Throwable -> L3d
            if (r1 != r2) goto L1e
        L3a:
            r5 = 1
            return r5
        L3c:
            return r0
        L3d:
            r5 = move-exception
            java.lang.String r1 = "RecentAppsWorkManagerLogic$isRAServicesScheduled"
            com.appnext.base.a.a(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.ra.services.a.b.A(java.lang.String):boolean");
    }

    @Override // com.appnext.core.ra.services.a.a
    protected final void B(String str) {
        a0.j(getContext()).d(str);
    }

    @Override // com.appnext.core.ra.services.a.a
    protected final void a(com.appnext.core.ra.b.a aVar) {
        try {
            e a10 = a(aVar.au());
            String name = aVar.ay().name();
            if (aVar.az() == 0) {
                a0.j(getContext()).h(name, h.APPEND, new r.a(RecentAppsWorkManagerService.class).g(a10).g(a10).a(name).b());
                return;
            }
            long az = aVar.az();
            if (aVar.az() < 0 || (aVar.az() > 0 && aVar.az() < 900000)) {
                az = 900000;
            }
            c.a aVar2 = new c.a();
            aVar2.b(q.CONNECTED);
            c a11 = aVar2.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            u.a a12 = new u.a(RecentAppsWorkManagerService.class, az, timeUnit).e(a11).g(a10).a(name);
            if (aVar.aA() > 0) {
                a12.f(Math.max(aVar.aA(), 60000L), timeUnit);
            }
            a0.j(getContext()).g(name, g.REPLACE, a12.b());
        } catch (Throwable th) {
            com.appnext.base.a.a("RecentAppsWorkManagerLogic$scheduleEvent", th);
        }
    }

    @Override // com.appnext.core.ra.services.a.a
    protected final void c(List<com.appnext.core.ra.b.a> list) {
        try {
            int size = list.size();
            y yVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                com.appnext.core.ra.b.a aVar = list.get(i10);
                e a10 = a(aVar.au());
                r b10 = new r.a(RecentAppsWorkManagerService.class).g(a10).g(a10).a(aVar.ay().name()).b();
                if (i10 == 0) {
                    yVar = a0.j(getContext()).a(b10);
                } else {
                    yVar = yVar.b(b10);
                }
            }
            if (yVar != null) {
                yVar.a();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("RecentAppsWorkManagerLogic$scheduleEventsOrdered", th);
        }
    }

    private static e a(Bundle bundle) {
        try {
            return new e.a().e("action", bundle.getInt("action")).f("more_data", bundle.getString("more_data")).a();
        } catch (Throwable th) {
            com.appnext.base.a.a("RecentAppsWorkManagerLogic$createDataFromBundle", th);
            return null;
        }
    }
}
