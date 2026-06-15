package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
/* renamed from: com.facebook.ads.redexgen.X.Jg  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public interface InterfaceC0877Jg {
    boolean AD7(C0875Je c0875Je);

    HttpURLConnection AFt(String str, Proxy proxy) throws IOException;

    InputStream AFu(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream AFv(HttpURLConnection httpURLConnection) throws IOException;

    void AGE(HttpURLConnection httpURLConnection, EnumC0873Jc enumC0873Jc, String str) throws IOException;

    byte[] AGb(InputStream inputStream) throws IOException;

    void AKD(OutputStream outputStream, byte[] bArr) throws IOException;
}
