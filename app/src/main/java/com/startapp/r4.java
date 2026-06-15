package com.startapp;

import android.text.TextUtils;
import com.startapp.sdk.common.SDKException;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r4 extends w6 {

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f22464b;

    public r4(Set<String> set) {
        super(set);
        this.f22464b = new JSONObject();
    }

    @Override // com.startapp.w6
    public final void a(String str, Object obj, boolean z10, boolean z11) throws SDKException {
        if (this.f23509a.contains(str)) {
            return;
        }
        if (z10 && obj == null) {
            throw new SDKException(str, null);
        }
        if (obj == null || TextUtils.isEmpty(obj.toString())) {
            return;
        }
        try {
            this.f22464b.put(str, obj);
        } catch (JSONException e8) {
            if (z10) {
                throw new SDKException(str, e8);
            }
        }
    }

    public final String toString() {
        return this.f22464b.toString();
    }

    @Override // com.startapp.w6
    public final void a(String str, Set set) throws SDKException {
        if (this.f23509a.contains(str) || set == null || set.size() <= 0) {
            return;
        }
        try {
            this.f22464b.put(str, new JSONArray((Collection) set));
        } catch (JSONException unused) {
        }
    }
}
