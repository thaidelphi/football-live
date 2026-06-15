package com.appnext.actionssdk;

import android.content.Intent;
import com.appnext.core.AdsService;
import com.appnext.core.n;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionService extends AdsService {
    protected static final String be = "download";

    /* JADX WARN: Multi-variable type inference failed */
    protected final synchronized void a(n nVar) {
        super.a(nVar);
        try {
            c.a(this, "installed", new JSONObject().put("acid", nVar.ly.getString("acid")).put("name", nVar.ly.getString("name")).put("package", nVar.ly.getString("package")).toString());
        } catch (Throwable unused) {
        }
    }

    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            super.onHandleIntent(intent);
        }
    }
}
