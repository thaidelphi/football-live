package com.iab.omid.library.ironsrc.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class f extends a {
    public f(b.InterfaceC0209b interfaceC0209b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0209b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.ironsrc.internal.c c10 = com.iab.omid.library.ironsrc.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : c10.b()) {
                if (this.f15927c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f15929e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.ironsrc.utils.c.h(this.f15928d, this.f15931b.a())) {
            return null;
        }
        this.f15931b.a(this.f15928d);
        return this.f15928d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.ironsrc.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
