package com.ironsource;

import android.content.Context;
import android.os.Build;
import com.ironsource.b9;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class v8 implements Cif {

    /* renamed from: a  reason: collision with root package name */
    private hf f21116a;

    /* JADX INFO: Access modifiers changed from: protected */
    public v8(JSONObject jSONObject, Context context) {
        this.f21116a = a(jSONObject, context);
        String simpleName = v8.class.getSimpleName();
        Logger.i(simpleName, "created ConnectivityAdapter with strategy " + this.f21116a.getClass().getSimpleName());
    }

    private hf a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(b9.i.f16703g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        return (Build.VERSION.SDK_INT < 23 || !c4.c(context, "android.permission.ACCESS_NETWORK_STATE")) ? new BroadcastReceiverStrategy(this) : new jn(this);
    }

    public JSONObject a(Context context) {
        return this.f21116a.c(context);
    }

    @Override // com.ironsource.Cif
    public void a() {
    }

    @Override // com.ironsource.Cif
    public void a(String str, JSONObject jSONObject) {
    }

    public void b() {
        this.f21116a.a();
    }

    public void b(Context context) {
        this.f21116a.b(context);
    }

    @Override // com.ironsource.Cif
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.f21116a.a(context);
    }
}
