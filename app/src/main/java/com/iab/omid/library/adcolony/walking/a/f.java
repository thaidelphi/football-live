package com.iab.omid.library.adcolony.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.adcolony.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class f extends a {
    public f(b.InterfaceC0201b interfaceC0201b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0201b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.adcolony.b.a a10 = com.iab.omid.library.adcolony.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.adcolony.adsession.a aVar : a10.b()) {
                if (((a) this).f15661a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f15663c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.adcolony.d.b.b(this.f15662b, this.f15667d.b())) {
            return null;
        }
        this.f15667d.a(this.f15662b);
        return this.f15662b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.adcolony.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
