package com.iab.omid.library.startio.walking.async;

import com.iab.omid.library.startio.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e extends a {
    public e(b.InterfaceC0213b interfaceC0213b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0213b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.startio.internal.c c10 = com.iab.omid.library.startio.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.startio.adsession.a aVar : c10.b()) {
                if (this.f16055c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f16057e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f16056d.toString();
    }

    @Override // com.iab.omid.library.startio.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
