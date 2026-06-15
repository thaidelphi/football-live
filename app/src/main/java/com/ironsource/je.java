package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.fe;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class je {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17952a = "adunit_data";

    public void a(Context context) {
        ge.a().c(context);
    }

    public void a(String str, fe.a aVar) {
        JSONObject optJSONObject;
        try {
            String name = aVar.name();
            ge a10 = ge.a();
            JSONObject optJSONObject2 = a10.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f17952a);
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(name)) == null || optJSONObject.remove(str) == null) {
                return;
            }
            a10.b(f17952a, optJSONObject2.put(name, optJSONObject));
        } catch (JSONException e8) {
            o9.d().a(e8);
        }
    }

    public void a(String str, Object obj) {
        ge.a().b(str, obj);
    }

    public void a(String str, Object obj, fe.a aVar) {
        try {
            String name = aVar.name();
            ge a10 = ge.a();
            JSONObject optJSONObject = a10.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f17952a);
            if (optJSONObject == null) {
                a10.b(f17952a, new JSONObject().put(name, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(name);
            if (optJSONObject2 == null) {
                a10.b(f17952a, optJSONObject.put(name, new JSONObject().put(str, obj)));
            } else {
                a10.b(f17952a, optJSONObject.put(name, optJSONObject2.put(str, obj)));
            }
        } catch (JSONException e8) {
            o9.d().a(e8);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        ge.a().a(str, jSONObject);
    }

    public void a(Map<String, Object> map) {
        ge.a().a(map);
    }
}
