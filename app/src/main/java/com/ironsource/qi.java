package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class qi {

    /* renamed from: a  reason: collision with root package name */
    public static final qi f19891a = new qi();

    private qi() {
    }

    public static final JSONObject a() {
        new ak().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject put = new JSONObject().put("data", IronSourceAES.encode(mb.b().c(), new pi().a().toString()));
        kotlin.jvm.internal.n.e(put, "InitProvider()\n        .…ATA_KEY, encryptedData) }");
        return put;
    }
}
