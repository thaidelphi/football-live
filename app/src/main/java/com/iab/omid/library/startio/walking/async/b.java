package com.iab.omid.library.startio.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private a f16058a;

    /* renamed from: b  reason: collision with root package name */
    protected final InterfaceC0213b f16059b;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void a(b bVar);
    }

    /* compiled from: Sta */
    /* renamed from: com.iab.omid.library.startio.walking.async.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface InterfaceC0213b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0213b interfaceC0213b) {
        this.f16059b = interfaceC0213b;
    }

    public void a(a aVar) {
        this.f16058a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f16058a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
