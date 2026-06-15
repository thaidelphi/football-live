package com.ironsource;

import android.text.TextUtils;
import com.ironsource.eh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class wa {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, va> f21279a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, va> f21280b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, va> f21281c = new LinkedHashMap();

    private void a(eh.e eVar, String str, va vaVar) {
        Map<String, va> b10;
        if (TextUtils.isEmpty(str) || vaVar == null || (b10 = b(eVar)) == null) {
            return;
        }
        b10.put(str, vaVar);
    }

    private Map<String, va> b(eh.e eVar) {
        if (eVar.name().equalsIgnoreCase(eh.e.RewardedVideo.name())) {
            return this.f21279a;
        }
        if (eVar.name().equalsIgnoreCase(eh.e.Interstitial.name())) {
            return this.f21280b;
        }
        if (eVar.name().equalsIgnoreCase(eh.e.Banner.name())) {
            return this.f21281c;
        }
        return null;
    }

    public va a(eh.e eVar, rj rjVar) {
        va vaVar = new va(rjVar);
        a(eVar, rjVar.e(), vaVar);
        return vaVar;
    }

    public va a(eh.e eVar, String str) {
        Map<String, va> b10;
        if (TextUtils.isEmpty(str) || (b10 = b(eVar)) == null) {
            return null;
        }
        return b10.get(str);
    }

    public va a(eh.e eVar, String str, Map<String, String> map, io ioVar) {
        va vaVar = new va(str, str, map, ioVar);
        a(eVar, str, vaVar);
        return vaVar;
    }

    public Collection<va> a(eh.e eVar) {
        Map<String, va> b10 = b(eVar);
        return b10 != null ? b10.values() : new ArrayList();
    }

    public void b(eh.e eVar, String str) {
        Map<String, va> b10;
        va remove;
        if (TextUtils.isEmpty(str) || (b10 = b(eVar)) == null || (remove = b10.remove(str)) == null) {
            return;
        }
        remove.a();
    }
}
