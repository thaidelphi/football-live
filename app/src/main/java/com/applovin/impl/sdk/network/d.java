package com.applovin.impl.sdk.network;

import com.applovin.impl.l4;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f9086a;

    /* renamed from: b  reason: collision with root package name */
    private String f9087b;

    /* renamed from: c  reason: collision with root package name */
    private String f9088c;

    /* renamed from: d  reason: collision with root package name */
    private String f9089d;

    /* renamed from: e  reason: collision with root package name */
    private Map f9090e;

    /* renamed from: f  reason: collision with root package name */
    private Map f9091f;

    /* renamed from: g  reason: collision with root package name */
    private Map f9092g;

    /* renamed from: h  reason: collision with root package name */
    private l4.a f9093h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9094i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9095j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9096k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9097l;

    /* renamed from: m  reason: collision with root package name */
    private String f9098m;

    /* renamed from: n  reason: collision with root package name */
    private int f9099n;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f9100a;

        /* renamed from: b  reason: collision with root package name */
        private String f9101b;

        /* renamed from: c  reason: collision with root package name */
        private String f9102c;

        /* renamed from: d  reason: collision with root package name */
        private String f9103d;

        /* renamed from: e  reason: collision with root package name */
        private Map f9104e;

        /* renamed from: f  reason: collision with root package name */
        private Map f9105f;

        /* renamed from: g  reason: collision with root package name */
        private Map f9106g;

        /* renamed from: h  reason: collision with root package name */
        private l4.a f9107h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f9108i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f9109j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f9110k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f9111l;

        public b a(String str) {
            this.f9103d = str;
            return this;
        }

        public b b(String str) {
            this.f9100a = str;
            return this;
        }

        public b c(String str) {
            this.f9101b = str;
            return this;
        }

        public b d(String str) {
            this.f9102c = str;
            return this;
        }

        public b a(Map map) {
            this.f9105f = map;
            return this;
        }

        public b b(Map map) {
            this.f9104e = map;
            return this;
        }

        public b c(Map map) {
            this.f9106g = map;
            return this;
        }

        public b d(boolean z10) {
            this.f9110k = z10;
            return this;
        }

        public b a(l4.a aVar) {
            this.f9107h = aVar;
            return this;
        }

        public b b(boolean z10) {
            this.f9111l = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f9109j = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f9108i = z10;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public static b b() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Map map = CollectionUtils.map(this.f9090e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f9090e = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f9099n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f9089d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f9098m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f9086a.equals(((d) obj).f9086a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l4.a f() {
        return this.f9093h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map g() {
        return this.f9091f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        return this.f9087b;
    }

    public int hashCode() {
        return this.f9086a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map i() {
        return this.f9090e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map j() {
        return this.f9092g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        return this.f9088c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        this.f9099n++;
    }

    public boolean m() {
        return this.f9096k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f9094i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f9095j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f9097l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f9086a);
        jSONObject.put("communicatorRequestId", this.f9098m);
        jSONObject.put("httpMethod", this.f9087b);
        jSONObject.put("targetUrl", this.f9088c);
        jSONObject.put("backupUrl", this.f9089d);
        jSONObject.put("encodingType", this.f9093h);
        jSONObject.put("isEncodingEnabled", this.f9094i);
        jSONObject.put("gzipBodyEncoding", this.f9095j);
        jSONObject.put("isAllowedPreInitEvent", this.f9096k);
        jSONObject.put("attemptNumber", this.f9099n);
        if (this.f9090e != null) {
            jSONObject.put("parameters", new JSONObject(this.f9090e));
        }
        if (this.f9091f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f9091f));
        }
        if (this.f9092g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f9092g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f9086a + "', communicatorRequestId='" + this.f9098m + "', httpMethod='" + this.f9087b + "', targetUrl='" + this.f9088c + "', backupUrl='" + this.f9089d + "', attemptNumber=" + this.f9099n + ", isEncodingEnabled=" + this.f9094i + ", isGzipBodyEncoding=" + this.f9095j + ", isAllowedPreInitEvent=" + this.f9096k + ", shouldFireInWebView=" + this.f9097l + '}';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(JSONObject jSONObject, j jVar) {
        Map hashMap;
        Map hashMap2;
        Map hashMap3;
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        if (JsonUtils.valueExists(jSONObject, "parameters")) {
            hashMap = Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters")));
        } else {
            hashMap = new HashMap();
        }
        if (JsonUtils.valueExists(jSONObject, "httpHeaders")) {
            hashMap2 = Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders")));
        } else {
            hashMap2 = new HashMap();
        }
        if (JsonUtils.valueExists(jSONObject, "requestBody")) {
            hashMap3 = Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody")));
        } else {
            hashMap3 = new HashMap();
        }
        this.f9086a = string;
        this.f9087b = string3;
        this.f9098m = string2;
        this.f9088c = string4;
        this.f9089d = string5;
        this.f9090e = hashMap;
        this.f9091f = hashMap2;
        this.f9092g = hashMap3;
        this.f9093h = l4.a.a(jSONObject.optInt("encodingType", l4.a.DEFAULT.b()));
        this.f9094i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f9095j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f9096k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f9097l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f9099n = i10;
    }

    private d(b bVar) {
        this.f9086a = UUID.randomUUID().toString();
        this.f9087b = bVar.f9101b;
        this.f9088c = bVar.f9102c;
        this.f9089d = bVar.f9103d;
        this.f9090e = bVar.f9104e;
        this.f9091f = bVar.f9105f;
        this.f9092g = bVar.f9106g;
        this.f9093h = bVar.f9107h;
        this.f9094i = bVar.f9108i;
        this.f9095j = bVar.f9109j;
        this.f9096k = bVar.f9110k;
        this.f9097l = bVar.f9111l;
        this.f9098m = bVar.f9100a;
        this.f9099n = 0;
    }
}
