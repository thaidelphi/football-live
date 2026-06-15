package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class av {

    /* renamed from: a  reason: collision with root package name */
    private final e2 f16403a;

    public av(e2 e2Var) {
        this.f16403a = e2Var;
    }

    public void a() {
        this.f16403a.a(b2.COLLECT_TOKEN, new HashMap());
    }

    public void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f16403a.a(b2.COLLECT_TOKENS_COMPLETED, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f16403a.a(b2.COLLECT_TOKENS_FAILED, hashMap);
    }

    public void a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f16403a.a(b2.INSTANCE_COLLECT_TOKEN, hashMap);
    }

    public void a(Map<String, Object> map, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f16403a.a(b2.INSTANCE_COLLECT_TOKEN_SUCCESS, hashMap);
    }

    public void a(Map<String, Object> map, long j10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f16403a.a(b2.INSTANCE_COLLECT_TOKEN_FAILED, hashMap);
    }

    public void b(Map<String, Object> map, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f16403a.a(b2.INSTANCE_COLLECT_TOKEN_TIMED_OUT, hashMap);
    }
}
