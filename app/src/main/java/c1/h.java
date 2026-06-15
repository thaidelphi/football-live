package c1;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import d1.a;
import d1.p;
import d1.q;
import d1.r;
import d1.s;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
/* compiled from: WebViewCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f5320a = Uri.parse("*");

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f5321b = Uri.parse("");

    /* compiled from: WebViewCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void onComplete(long j10);
    }

    /* compiled from: WebViewCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void onPostMessage(WebView webView, d dVar, Uri uri, boolean z10, c1.a aVar);
    }

    public static void a(WebView webView, String str, Set<String> set, b bVar) {
        if (p.U.c()) {
            f(webView).a(str, (String[]) set.toArray(new String[0]), bVar);
            return;
        }
        throw p.a();
    }

    private static WebViewProviderBoundaryInterface b(WebView webView) {
        return d().createWebView(webView);
    }

    public static PackageInfo c() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            return null;
        }
        if (i10 >= 26) {
            return d1.d.a();
        }
        try {
            return e();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static s d() {
        return q.d();
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo e() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    private static r f(WebView webView) {
        return new r(b(webView));
    }

    public static WebViewClient g(WebView webView) {
        a.e eVar = p.H;
        if (eVar.b()) {
            return d1.d.d(webView);
        }
        if (eVar.c()) {
            return f(webView).b();
        }
        throw p.a();
    }

    public static boolean h() {
        if (p.R.c()) {
            return d().getStatics().isMultiProcessEnabled();
        }
        throw p.a();
    }

    public static void i(WebView webView, String str) {
        if (p.U.c()) {
            f(webView).c(str);
            return;
        }
        throw p.a();
    }

    public static void j(WebView webView, boolean z10) {
        if (p.f23908f0.c()) {
            f(webView).d(z10);
            return;
        }
        throw p.a();
    }
}
