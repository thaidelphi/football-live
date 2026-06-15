package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class i7 {

    /* renamed from: f  reason: collision with root package name */
    private static final List f7233f = Arrays.asList("video/mp4", MimeTypes.VIDEO_WEBM, "video/3gpp", "video/x-matroska");

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7234a;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f7236c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f7237d;

    /* renamed from: b  reason: collision with root package name */
    protected List f7235b = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final long f7238e = System.currentTimeMillis();

    public i7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        this.f7234a = jVar;
        this.f7236c = jSONObject;
        this.f7237d = jSONObject2;
    }

    public List a() {
        return this.f7235b;
    }

    public JSONObject b() {
        return this.f7236c;
    }

    public long c() {
        return this.f7238e;
    }

    public int d() {
        return this.f7235b.size();
    }

    public JSONObject e() {
        return this.f7237d;
    }

    public List f() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f7236c, "vast_preferred_video_types", null));
        return !explode.isEmpty() ? explode : f7233f;
    }

    public int g() {
        return d7.a(JsonUtils.getInt(this.f7236c, "video_completion_percent", -1));
    }
}
