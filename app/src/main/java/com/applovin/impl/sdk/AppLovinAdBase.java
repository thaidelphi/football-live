package com.applovin.impl.sdk;

import android.graphics.Color;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.array.ArrayDirectDownloadAd;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u3;
import com.applovin.impl.v3;
import com.applovin.impl.y4;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class AppLovinAdBase implements u3, ArrayDirectDownloadAd {
    protected final JSONObject adObject;
    private final long createdAtMillis;
    protected final JSONObject fullResponse;
    protected final j sdk;
    protected final y4 synchronizedAdObject;
    protected final y4 synchronizedFullResponse;
    protected final Object adObjectLock = new Object();
    protected final Object fullResponseLock = new Object();

    /* JADX INFO: Access modifiers changed from: protected */
    public AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (jVar != null) {
            this.sdk = jVar;
            if (((Boolean) jVar.a(o4.f8089c6)).booleanValue()) {
                this.synchronizedAdObject = new y4(jSONObject);
                this.synchronizedFullResponse = new y4(jSONObject2);
                this.adObject = null;
                this.fullResponse = null;
            } else {
                this.adObject = jSONObject;
                this.fullResponse = jSONObject2;
                this.synchronizedAdObject = null;
                this.synchronizedFullResponse = null;
            }
            this.createdAtMillis = System.currentTimeMillis();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean containsKeyForAdObject(String str) {
        boolean has;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return y4Var.a(str);
        }
        synchronized (this.adObjectLock) {
            has = this.adObject.has(str);
        }
        return has;
    }

    public String getAdDomain() {
        return getStringFromFullResponse("adomain", "");
    }

    @Override // com.applovin.impl.u3
    public abstract /* synthetic */ v3 getAdEventTracker();

    public abstract long getAdIdNumber();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean booleanValue;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return y4Var.a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            booleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getBooleanFromFullResponse(String str, boolean z10) {
        boolean booleanValue;
        y4 y4Var = this.synchronizedFullResponse;
        if (y4Var != null) {
            return y4Var.a(str, Boolean.valueOf(z10)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            booleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z10)).booleanValue();
        }
        return booleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getColorFromAdObject(String str, int i10) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i10;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspId() {
        return getStringFromFullResponse("dsp_id", "");
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float getFloatFromAdObject(String str, float f10) {
        float f11;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return y4Var.a(str, f10);
        }
        synchronized (this.adObjectLock) {
            f11 = JsonUtils.getFloat(this.adObject, str, f10);
        }
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getIntFromAdObject(String str, int i10) {
        int i11;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return y4Var.a(str, i10);
        }
        synchronized (this.adObjectLock) {
            i11 = JsonUtils.getInt(this.adObject, str, i10);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return y4Var.a(str, (List) list);
        }
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONArray getJsonArrayFromAdObject(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return y4Var.a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return y4Var.a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long getLongFromAdObject(String str, long j10) {
        long j11;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return y4Var.a(str, j10);
        }
        synchronized (this.adObjectLock) {
            j11 = JsonUtils.getLong(this.adObject, str, j10);
        }
        return j11;
    }

    protected long getLongFromFullResponse(String str, long j10) {
        long j11;
        y4 y4Var = this.synchronizedFullResponse;
        if (y4Var != null) {
            return y4Var.a(str, j10);
        }
        synchronized (this.fullResponseLock) {
            j11 = JsonUtils.getLong(this.fullResponse, str, j10);
        }
        return j11;
    }

    @Override // com.applovin.impl.u3
    public abstract /* synthetic */ String getOpenMeasurementContentUrl();

    @Override // com.applovin.impl.u3
    public abstract /* synthetic */ String getOpenMeasurementCustomReferenceData();

    @Override // com.applovin.impl.u3
    public abstract /* synthetic */ List getOpenMeasurementVerificationScriptResources();

    public j getSdk() {
        return this.sdk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getStringFromAdObject(String str, String str2) {
        String string;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return y4Var.a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getStringFromFullResponse(String str, String str2) {
        String string;
        y4 y4Var = this.synchronizedFullResponse;
        if (y4Var != null) {
            return y4Var.a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<String> getStringListFromAdObject(String str, List<String> list) {
        List<String> stringList;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return y4Var.b(str, list);
        }
        synchronized (this.adObjectLock) {
            stringList = JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    @Override // com.applovin.impl.u3
    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();
}
