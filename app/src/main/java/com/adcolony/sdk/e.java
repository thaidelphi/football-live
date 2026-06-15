package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.e0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e extends j {
    private String G;
    private String H;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e.super.c();
        }
    }

    public e(Context context, int i10, h0 h0Var) {
        super(context, i10, h0Var);
        this.G = "";
        this.H = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.adcolony.sdk.c1
    /* renamed from: c */
    public final void b(Exception exc) {
        new e0.a().a(exc.getClass().toString()).a(" during metadata injection w/ metadata = ").a(c0.h(getInfo(), "metadata")).a(e0.f5981i);
        AdColonyInterstitial remove = com.adcolony.sdk.a.b().c().f().remove(c0.h(getInfo(), "ad_session_id"));
        if (remove == null) {
            return;
        }
        remove.p();
    }

    private final String p() {
        boolean w10;
        String str;
        if (this.H.length() > 0) {
            return new b9.e("script\\s*src\\s*=\\s*\"mraid.js\"").c(this.H, "script src=\"file://" + getMraidFilepath() + '\"');
        }
        FileInputStream fileInputStream = new FileInputStream(this.G);
        try {
            StringBuilder sb = new StringBuilder(fileInputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read < 0) {
                    break;
                }
                sb.append(new String(bArr, 0, read, b9.c.f5283b));
            }
            w10 = b9.p.w(this.G, ".html", false, 2, null);
            if (w10) {
                str = sb.toString();
            } else {
                str = "<html><script>" + ((Object) sb) + "</script></html>";
            }
            r8.c.a(fileInputStream, null);
            return str;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r8.c.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.c1
    public /* synthetic */ String d(f1 f1Var) {
        return this.H.length() > 0 ? "" : super.d(f1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.j, com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ void i() {
        h0 message = getMessage();
        f1 a10 = message == null ? null : message.a();
        if (a10 == null) {
            a10 = c0.b();
        }
        this.G = c(a10);
        this.H = c0.h(a10, "interstitial_html");
        super.i();
    }

    @Override // com.adcolony.sdk.b1
    protected /* synthetic */ void j() {
        try {
            h0 message = getMessage();
            f1 a10 = message == null ? null : message.a();
            if (a10 == null) {
                a10 = c0.b();
            }
            String h10 = c0.h(c0.f(a10, "info"), "metadata");
            String a11 = a(p(), c0.h(c0.b(h10), "iab_filepath"));
            b9.e eVar = new b9.e("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;");
            String c10 = eVar.c(a11, Matcher.quoteReplacement("var ADC_DEVICE_INFO = " + ((Object) h10) + ';'));
            String mUrl = getMUrl();
            if (mUrl.length() == 0) {
                mUrl = getBaseUrl();
            }
            loadDataWithBaseURL(mUrl, c10, "text/html", null, null);
        } catch (IOException e8) {
            b(e8);
        } catch (IllegalArgumentException e10) {
            b(e10);
        } catch (IndexOutOfBoundsException e11) {
            b(e11);
        }
    }

    @Override // com.adcolony.sdk.b1
    protected /* synthetic */ void k() {
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.k0
    public void c() {
        if (getDestroyed()) {
            return;
        }
        z0.a(new a(), n() ? 1000L : 0L);
    }
}
