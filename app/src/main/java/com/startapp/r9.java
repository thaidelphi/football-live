package com.startapp;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.cc;
import com.ironsource.in;
import com.ironsource.xn;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.common.SDKException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r9 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22471a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22472b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONArray f22473c = new JSONArray();

    /* renamed from: d  reason: collision with root package name */
    public final String f22474d;

    /* renamed from: e  reason: collision with root package name */
    public final String f22475e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f22476f;

    public r9(Context context, String str, String str2, String str3, boolean z10) {
        this.f22471a = context;
        this.f22472b = str;
        this.f22474d = str2;
        this.f22475e = str3;
        this.f22476f = z10;
    }

    public final void a(VASTErrorCodes vASTErrorCodes) {
        if (this.f22473c.length() == 0) {
            return;
        }
        if (!this.f22476f || vASTErrorCodes == VASTErrorCodes.ErrorNone) {
            try {
                String b10 = b(vASTErrorCodes);
                if (TextUtils.isEmpty(b10)) {
                    return;
                }
                b3 a10 = com.startapp.sdk.components.a.a(this.f22471a).f23237m.a();
                String str = this.f22472b;
                byte[] bytes = b10.getBytes();
                WeakHashMap weakHashMap = o9.f22359a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                d3 d3Var = new d3(byteArrayOutputStream.toByteArray(), cc.L, "gzip");
                HashMap a11 = a10.a();
                t4<d6> t4Var = a10.f21790d;
                g6 g6Var = t4Var != null ? new g6(t4Var.a()) : null;
                try {
                    b3.b(str, a11, d3Var);
                    if (g6Var != null) {
                        g6Var.a(in.f17849b, str, null);
                    }
                } catch (SDKException e8) {
                    if (g6Var != null) {
                        g6Var.a(in.f17849b, str, e8);
                    }
                }
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    public final String b(VASTErrorCodes vASTErrorCodes) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vastDocs", this.f22473c);
        String str = this.f22474d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("partnerResponse", str);
        String str2 = this.f22475e;
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, str2 != null ? str2 : "");
        jSONObject.put(xn.a.f21422g, vASTErrorCodes.a());
        return jSONObject.toString();
    }
}
