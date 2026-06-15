package com.appnext.core;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class SettingsManager {
    private ArrayList<ConfigCallback> dA;
    protected HashMap<String, Object> dz = null;

    /* renamed from: w  reason: collision with root package name */
    protected HashMap<String, String> f10053w = null;

    /* renamed from: m  reason: collision with root package name */
    private int f10052m = 0;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface ConfigCallback {
        void error(String str);

        void loaded(HashMap<String, Object> hashMap);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends AsyncTask<Object, Void, String> {
        private a() {
        }

        protected static String a(Object... objArr) {
            if (objArr == null) {
                return "error: Internal error";
            }
            try {
                int length = objArr.length;
                Context context = length >= 0 ? (Context) objArr[0] : null;
                if (context == null) {
                    return "error: Internal error";
                }
                String str = length > 0 ? (String) objArr[1] : null;
                if (TextUtils.isEmpty(str)) {
                    return "error: Internal error";
                }
                HashMap hashMap = length >= 2 ? (HashMap) objArr[2] : null;
                String str2 = length >= 3 ? (String) objArr[3] : null;
                o.ab();
                return o.a(context, str, hashMap, str2);
            } catch (Throwable unused) {
                return "error: Internal error";
            }
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ String doInBackground(Object[] objArr) {
            return a(objArr);
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(String str) {
            String str2 = str;
            super.onPostExecute(str2);
            if (str2 == null) {
                SettingsManager.this.f10052m = 0;
                SettingsManager.this.v("unknown error");
            } else if (str2.startsWith("error:")) {
                SettingsManager.this.f10052m = 0;
                SettingsManager.this.v(str2.substring(7));
            } else {
                try {
                    HashMap<String, Object> u10 = SettingsManager.u(str2);
                    SettingsManager settingsManager = SettingsManager.this;
                    HashMap<String, Object> hashMap = settingsManager.dz;
                    if (hashMap == null) {
                        settingsManager.dz = u10;
                    } else {
                        hashMap.putAll(u10);
                    }
                    SettingsManager.this.f10052m = 2;
                    SettingsManager settingsManager2 = SettingsManager.this;
                    settingsManager2.a(settingsManager2.dz);
                } catch (Throwable th) {
                    com.appnext.base.a.a("SettingsManager$onPostExecute", th);
                    SettingsManager.this.f10052m = 0;
                    SettingsManager.this.v("parsing error");
                }
            }
        }
    }

    protected static HashMap<String, Object> u(String str) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = jSONObject.getString(next);
            try {
                JSONObject jSONObject2 = new JSONObject(string);
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    String string2 = jSONObject2.getString(next2);
                    hashMap.put(next + "_" + next2, string2);
                }
            } catch (Throwable unused) {
                hashMap.put(next, string);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        synchronized (com.appnext.actionssdk.h.bI) {
            Iterator it = new ArrayList(this.dA).iterator();
            while (it.hasNext()) {
                ConfigCallback configCallback = (ConfigCallback) it.next();
                if (configCallback != null) {
                    configCallback.error(str);
                }
            }
            this.dA.clear();
        }
    }

    public final synchronized void a(Context context, String str, ConfigCallback configCallback) {
        try {
        } catch (Throwable unused) {
            this.f10052m = 0;
            v("Internal Error");
        }
        if (!i.h(context)) {
            this.f10052m = 0;
            if (configCallback != null) {
                configCallback.error(AppnextError.CONNECTION_ERROR);
            }
            return;
        }
        if (this.dA == null) {
            this.dA = new ArrayList<>();
        }
        int i10 = this.f10052m;
        if (i10 != 2) {
            if (i10 == 0) {
                this.f10052m = 1;
                g("pck", context.getPackageName());
                g("vid", i.Y());
                new a().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context, j() + "?packageId=" + context.getPackageName() + "&id=" + str, k(), m());
            }
            if (configCallback != null) {
                this.dA.add(configCallback);
            }
        } else if (configCallback != null) {
            configCallback.loaded(this.dz);
        }
    }

    public final void g(String str, String str2) {
        if (this.f10053w == null) {
            this.f10053w = new HashMap<>();
        }
        this.f10053w.put(str, str2);
    }

    public final void h(String str, String str2) {
        if (this.f10053w == null) {
            this.f10053w = new HashMap<>();
        }
        if (this.f10053w.containsKey(str)) {
            return;
        }
        this.f10053w.put(str, str2);
    }

    public final void i(String str, String str2) {
        if (this.dz == null) {
            this.dz = new HashMap<>();
        }
        this.dz.put(str, str2);
    }

    protected abstract String j();

    protected abstract HashMap<String, String> k();

    protected abstract HashMap<String, String> l();

    protected abstract String m();

    public final String t(String str) {
        HashMap<String, Object> hashMap = this.dz;
        String str2 = (hashMap == null || !hashMap.containsKey(str)) ? null : (String) this.dz.get(str);
        if (str2 != null) {
            return str2;
        }
        if (l().containsKey(str)) {
            return l().get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, Object> hashMap) {
        synchronized (com.appnext.actionssdk.h.bI) {
            Iterator it = new ArrayList(this.dA).iterator();
            while (it.hasNext()) {
                ((ConfigCallback) it.next()).loaded(hashMap);
            }
            this.dA.clear();
        }
    }
}
