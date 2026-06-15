package com.iab.omid.library.adcolony.walking.a;

import com.iab.omid.library.adcolony.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e extends a {
    public e(b.InterfaceC0201b interfaceC0201b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0201b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.adcolony.b.a a10 = com.iab.omid.library.adcolony.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.adcolony.adsession.a aVar : a10.b()) {
                if (((a) this).f15661a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f15663c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f15662b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.adcolony.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
