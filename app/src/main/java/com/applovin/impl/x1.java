package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Collections;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f9571a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9572b;

    public x1(Map map, com.applovin.impl.sdk.j jVar) {
        this.f9571a = map == null ? Collections.emptyMap() : map;
        this.f9572b = jVar;
    }

    public Drawable a() {
        Object obj = this.f9571a.get("google_watermark");
        if (!a(obj)) {
            this.f9572b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.f9572b.I();
                I.b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] decode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.j.m().getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.f9572b.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f9572b.I().a("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.f9571a.get("google_watermark"));
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}
