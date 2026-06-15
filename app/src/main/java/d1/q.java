package d1;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
/* compiled from: WebViewGlueCommunicator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q {

    /* compiled from: WebViewGlueCommunicator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final u f23930a = new u(q.d().getWebkitToCompatConverter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebViewGlueCommunicator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        static final s f23931a = q.a();
    }

    static s a() {
        if (Build.VERSION.SDK_INT < 21) {
            return new h();
        }
        try {
            return new t((WebViewProviderFactoryBoundaryInterface) z9.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new h();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static InvocationHandler b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static u c() {
        return a.f23930a;
    }

    public static s d() {
        return b.f23931a;
    }

    public static ClassLoader e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.b();
        }
        return f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
