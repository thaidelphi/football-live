package com.appnext.core.ra.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.core.ra.database.RecentAppsDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONArray;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends b {
    public e(Context context, Bundle bundle) {
        super(context, bundle);
    }

    @Override // com.appnext.core.ra.a.b
    protected final void ar() {
        try {
            Bundle au = au();
            if (au != null) {
                String string = au.getString("more_data");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                JSONArray jSONArray = new JSONArray(string);
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    String format = b.av().format(new Date());
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string2 = jSONArray.getString(i10);
                        if (string2.matches("^[a-z][a-z0-9_]*(\\.[a-z0-9_]+)+[0-9a-z_]$")) {
                            com.appnext.core.ra.database.a aVar = new com.appnext.core.ra.database.a();
                            aVar.eu = string2;
                            aVar.ev = format;
                            aVar.ew = false;
                            arrayList.add(aVar);
                        }
                    }
                    long[] a10 = RecentAppsDatabase.getInstance(getContext()).recentAppDao().a(arrayList);
                    if (a10 != null) {
                        Arrays.toString(a10);
                    }
                    RecentAppsDatabase.getInstance(getContext()).recentAppDao().aw().toString();
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("StoreRecentAppsAction$doUniqueAction", th);
        }
    }

    @Override // com.appnext.core.ra.a.b
    protected final boolean as() {
        return true;
    }
}
