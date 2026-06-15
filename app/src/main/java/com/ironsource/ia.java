package com.ironsource;

import java.io.InputStream;
import java.net.URL;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ia implements u8 {

    /* renamed from: a  reason: collision with root package name */
    public static final ia f17821a = new ia();

    private ia() {
    }

    @Override // com.ironsource.u8
    public InputStream a(String url) {
        kotlin.jvm.internal.n.f(url, "url");
        InputStream openStream = new URL(url).openStream();
        kotlin.jvm.internal.n.e(openStream, "URL(url).openStream()");
        return openStream;
    }
}
