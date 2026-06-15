package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private a f15795a;

    /* renamed from: b  reason: collision with root package name */
    protected final InterfaceC0205b f15796b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.async.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface InterfaceC0205b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0205b interfaceC0205b) {
        this.f15796b = interfaceC0205b;
    }

    public void a(a aVar) {
        this.f15795a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f15795a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
