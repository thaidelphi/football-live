package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import i8.o;
import java.io.File;
import java.io.InputStream;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class hi implements ii {

    /* renamed from: a  reason: collision with root package name */
    private final u8 f17684a;

    public hi() {
        this(null, 1, null);
    }

    public hi(u8 connectionFactory) {
        kotlin.jvm.internal.n.f(connectionFactory, "connectionFactory");
        this.f17684a = connectionFactory;
    }

    public /* synthetic */ hi(u8 u8Var, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? ia.f17821a : u8Var);
    }

    private final Object b(String str) {
        Object createFromPath;
        Exception exc;
        File file = new File(str);
        if (file.exists()) {
            createFromPath = Drawable.createFromPath(file.getPath());
            if (createFromPath != null) {
                o.a aVar = i8.o.f26626b;
                return i8.o.b(createFromPath);
            }
            o.a aVar2 = i8.o.f26626b;
            exc = new Exception("failed to create a drawable");
        } else {
            o.a aVar3 = i8.o.f26626b;
            exc = new Exception("file does not exists");
        }
        createFromPath = i8.p.a(exc);
        return i8.o.b(createFromPath);
    }

    private final Object c(String str) {
        InputStream a10 = this.f17684a.a(str);
        try {
            Object createFromStream = Drawable.createFromStream(a10, new File(str).getName());
            r8.c.a(a10, null);
            if (createFromStream == null) {
                o.a aVar = i8.o.f26626b;
                createFromStream = i8.p.a(new Exception("failed to create a drawable"));
            } else {
                o.a aVar2 = i8.o.f26626b;
            }
            return i8.o.b(createFromStream);
        } finally {
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.ii
    public Object a(String url) {
        kotlin.jvm.internal.n.f(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (Exception e8) {
            o9.d().a(e8);
            o.a aVar = i8.o.f26626b;
            return i8.o.b(i8.p.a(e8));
        }
    }
}
