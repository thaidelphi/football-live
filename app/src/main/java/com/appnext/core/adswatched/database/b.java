package com.appnext.core.adswatched.database;

import android.database.Cursor;
import androidx.room.p;
import androidx.room.q0;
import androidx.room.t0;
import androidx.room.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t0.c;
import v0.k;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements a {
    private final q0 dT;
    private final p<AdWatched> dU;
    private final w0 dV;

    public b(q0 q0Var) {
        this.dT = q0Var;
        this.dU = new p<AdWatched>(q0Var) { // from class: com.appnext.core.adswatched.database.b.1
            @Override // androidx.room.p
            public final /* synthetic */ void bind(k kVar, AdWatched adWatched) {
                AdWatched adWatched2 = adWatched;
                String str = adWatched2.bannerId;
                if (str == null) {
                    kVar.v0(1);
                } else {
                    kVar.d0(1, str);
                }
                String str2 = adWatched2.auid;
                if (str2 == null) {
                    kVar.v0(2);
                } else {
                    kVar.d0(2, str2);
                }
            }

            @Override // androidx.room.w0
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `AdWatched` (`bannerId`,`auid`) VALUES (?,?)";
            }
        };
        this.dV = new w0(q0Var) { // from class: com.appnext.core.adswatched.database.b.2
            @Override // androidx.room.w0
            public final String createQuery() {
                return "DELETE FROM adwatched WHERE adwatched.auid Like ?";
            }
        };
    }

    public static List<Class<?>> ag() {
        return Collections.emptyList();
    }

    @Override // com.appnext.core.adswatched.database.a
    public final long a(AdWatched adWatched) {
        this.dT.assertNotSuspendingTransaction();
        this.dT.beginTransaction();
        try {
            long insertAndReturnId = this.dU.insertAndReturnId(adWatched);
            this.dT.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.dT.endTransaction();
        }
    }

    @Override // com.appnext.core.adswatched.database.a
    public final List<String> x(String str) {
        t0 f10 = t0.f("SELECT adwatched.bannerId FROM adwatched WHERE  adwatched.auid Like ?", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.dT.assertNotSuspendingTransaction();
        Cursor b10 = c.b(this.dT, f10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.isNull(0) ? null : b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // com.appnext.core.adswatched.database.a
    public final int y(String str) {
        this.dT.assertNotSuspendingTransaction();
        k acquire = this.dV.acquire();
        if (str == null) {
            acquire.v0(1);
        } else {
            acquire.d0(1, str);
        }
        this.dT.beginTransaction();
        try {
            int n10 = acquire.n();
            this.dT.setTransactionSuccessful();
            return n10;
        } finally {
            this.dT.endTransaction();
            this.dV.release(acquire);
        }
    }
}
