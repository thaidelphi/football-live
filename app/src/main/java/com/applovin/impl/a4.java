package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a4 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference f6499a = new AtomicReference();

    public static String a() {
        return "iabtechlab-Applovin";
    }

    public static String a(com.applovin.impl.sdk.j jVar) {
        InputStream inputStream;
        String str = (String) f6499a.get();
        if (StringUtils.isValidString(str)) {
            return str;
        }
        URL b10 = b();
        BufferedReader bufferedReader = null;
        if (b10 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (((Boolean) jVar.a(o4.f8258y)).booleanValue()) {
            try {
                InputStream a10 = jVar.A().a(b10.toString(), (List) null, false);
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(a10));
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                }
                bufferedReader2.close();
                if (a10 != null) {
                    a10.close();
                }
            } catch (Throwable th) {
                jVar.I().a("OpenMeasurementTestParameters", th);
                jVar.D().a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th);
            }
        } else {
            try {
                inputStream = jVar.A().a(b10.toString(), (List) null, false);
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String readLine2 = bufferedReader3.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            sb.append(readLine2);
                            sb.append("\n");
                        } catch (Throwable unused) {
                            bufferedReader = bufferedReader3;
                            d7.a(inputStream, jVar);
                            d7.a(bufferedReader, jVar);
                            String sb2 = sb.toString();
                            f6499a.set(sb2);
                            return sb2;
                        }
                    }
                    d7.a(inputStream, jVar);
                    d7.a(bufferedReader3, jVar);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                inputStream = null;
            }
        }
        String sb22 = sb.toString();
        f6499a.set(sb22);
        return sb22;
    }

    public static URL b() {
        try {
            return new URL("https://compliance.iabtechnologylab.com/compliance-js/omid-validation-verification-script-v1-APPLOVIN-01102024.js");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c() {
        return "iabtechlab.com-omid";
    }
}
