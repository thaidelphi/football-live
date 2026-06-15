package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.ironsource.in;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final String f8602g;

    /* renamed from: h  reason: collision with root package name */
    private final List f8603h;

    /* renamed from: i  reason: collision with root package name */
    private final d3 f8604i;

    /* renamed from: j  reason: collision with root package name */
    private final Map f8605j;

    /* renamed from: k  reason: collision with root package name */
    private final Map f8606k;

    /* renamed from: l  reason: collision with root package name */
    private final Map f8607l;

    /* renamed from: m  reason: collision with root package name */
    private final MaxError f8608m;

    public s5(String str, List list, Map map, Map map2, MaxError maxError, d3 d3Var, com.applovin.impl.sdk.j jVar, boolean z10) {
        super("TaskFireMediationPostbacks", jVar);
        this.f8602g = str + "_urls";
        this.f8603h = list;
        this.f8605j = d7.a(map, jVar);
        this.f8606k = map2 == null ? new HashMap() : map2;
        this.f8608m = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f8604i = d3Var;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        if (z10 && d3Var != null) {
            hashMap.put("AppLovin-Ad-Network-Name", d3Var.c());
        }
        if (d3Var instanceof u2) {
            u2 u2Var = (u2) d3Var;
            hashMap.put("AppLovin-Ad-Unit-Id", u2Var.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", u2Var.getFormat().getLabel());
            if (z10) {
                hashMap.put("AppLovin-Third-Party-Ad-Placement-Id", u2Var.U());
            }
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f8607l = hashMap;
    }

    private void a(String str, Map map) {
        b().W().e(com.applovin.impl.sdk.network.d.b().d(str).c(in.f17849b).a(this.f8607l).a(false).c(map).c(((Boolean) this.f9827a.a(j3.L7)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f9827a.a(j3.K6)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.f8603h;
        if (list != null) {
            return list;
        }
        d3 d3Var = this.f8604i;
        if (d3Var != null) {
            return d3Var.b(this.f8602g);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> f10 = f();
        if (CollectionUtils.isEmpty(f10)) {
            return;
        }
        Map e8 = e();
        for (String str : f10) {
            Uri parse = Uri.parse(a(b(str, this.f8605j), this.f8608m));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            HashMap hashMap = new HashMap(this.f8606k);
            for (String str2 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str2);
                if (e8.containsKey(queryParameter)) {
                    d3 d3Var = this.f8604i;
                    if (d3Var != null) {
                        hashMap.put(str2, d3Var.a((String) e8.get(queryParameter)));
                    }
                } else {
                    clearQuery.appendQueryParameter(str2, queryParameter);
                }
            }
            hashMap.putAll(this.f9827a.x().e());
            a(clearQuery.build().toString(), hashMap);
        }
    }

    private String a(String str, MaxError maxError) {
        int i10;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i10 = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i10 = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i10)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2));
    }
}
