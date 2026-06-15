package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e extends a {
    public e(b.InterfaceC0217b interfaceC0217b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0217b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.unity3d.internal.c c10 = com.iab.omid.library.unity3d.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : c10.b()) {
                if (this.f16183c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f16185e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f16184d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.unity3d.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
