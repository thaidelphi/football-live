package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6863a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6864b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6865c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f6863a = JsonUtils.getString(jSONObject, "name", "");
        this.f6864b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f6865c = d7.a(list);
        } else {
            this.f6865c = d7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f6864b;
    }

    public String b() {
        return this.f6863a;
    }

    public boolean c() {
        return this.f6865c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || d7.a(str2, str) != 1) {
            return str3 == null || d7.a(str3, str) != -1;
        }
        return false;
    }
}
