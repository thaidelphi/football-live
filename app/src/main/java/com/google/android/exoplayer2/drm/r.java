package com.google.android.exoplayer2.drm;

import a5.p0;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.p;
import com.ironsource.cc;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import r3.u;
import z4.e0;
import z4.l;
import z4.p;
import z4.r0;
/* compiled from: HttpMediaDrmCallback.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r implements s {

    /* renamed from: a  reason: collision with root package name */
    private final l.a f10544a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10545b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10546c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f10547d;

    public r(String str, boolean z10, l.a aVar) {
        a5.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f10544a = aVar;
        this.f10545b = str;
        this.f10546c = z10;
        this.f10547d = new HashMap();
    }

    private static byte[] c(l.a aVar, String str, byte[] bArr, Map<String, String> map) throws u {
        r0 r0Var = new r0(aVar.a());
        z4.p a10 = new p.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        z4.p pVar = a10;
        while (true) {
            try {
                z4.n nVar = new z4.n(r0Var, pVar);
                try {
                    byte[] V0 = p0.V0(nVar);
                    p0.n(nVar);
                    return V0;
                } catch (e0 e8) {
                    String d10 = d(e8, i10);
                    if (d10 != null) {
                        i10++;
                        pVar = pVar.a().j(d10).a();
                        p0.n(nVar);
                    } else {
                        throw e8;
                    }
                }
            } catch (Exception e10) {
                throw new u(a10, (Uri) a5.a.e(r0Var.p()), r0Var.d(), r0Var.o(), e10);
            }
        }
    }

    private static String d(e0 e0Var, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = e0Var.f33485d;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = e0Var.f33487f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.s
    public byte[] a(UUID uuid, p.d dVar) throws u {
        return c(this.f10544a, dVar.b() + "&signedRequest=" + p0.C(dVar.a()), null, Collections.emptyMap());
    }

    @Override // com.google.android.exoplayer2.drm.s
    public byte[] b(UUID uuid, p.a aVar) throws u {
        String str;
        String b10 = aVar.b();
        if (this.f10546c || TextUtils.isEmpty(b10)) {
            b10 = this.f10545b;
        }
        if (!TextUtils.isEmpty(b10)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = n3.i.f28008e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = n3.i.f28006c.equals(uuid) ? cc.L : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f10547d) {
                hashMap.putAll(this.f10547d);
            }
            return c(this.f10544a, b10, aVar.a(), hashMap);
        }
        throw new u(new p.b().i(Uri.EMPTY).a(), Uri.EMPTY, y5.r.j(), 0L, new IllegalStateException("No license URL"));
    }

    public void e(String str, String str2) {
        a5.a.e(str);
        a5.a.e(str2);
        synchronized (this.f10547d) {
            this.f10547d.put(str, str2);
        }
    }
}
