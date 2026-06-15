package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class pm {

    /* renamed from: a  reason: collision with root package name */
    private String f19768a;

    public pm(String str) {
        this.f19768a = str;
    }

    private nh a() throws Exception {
        nh nhVar = new nh(this.f19768a, "metadata.json");
        if (!nhVar.exists()) {
            a(nhVar);
        }
        return nhVar;
    }

    private void a(nh nhVar) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), nhVar.getPath());
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(String str) throws Exception {
        JSONObject b10 = b();
        if (b10.has(str)) {
            b10.remove(str);
            return a(b10);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject b10;
        b10 = b();
        b10.put(str, jSONObject);
        return a(b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(ArrayList<nh> arrayList) throws Exception {
        Iterator<nh> it = arrayList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized JSONObject b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean b(String str, JSONObject jSONObject) throws Exception {
        JSONObject b10;
        b10 = b();
        JSONObject optJSONObject = b10.optJSONObject(str);
        if (optJSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            b10.putOpt(str, jSONObject);
        }
        return a(b10);
    }
}
