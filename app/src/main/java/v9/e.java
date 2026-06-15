package v9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import n9.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JdkWithJettyBootPlatform.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class e extends g {

    /* renamed from: c  reason: collision with root package name */
    private final Method f31915c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f31916d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f31917e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f31918f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f31919g;

    /* compiled from: JdkWithJettyBootPlatform.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    private static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f31920a;

        /* renamed from: b  reason: collision with root package name */
        boolean f31921b;

        /* renamed from: c  reason: collision with root package name */
        String f31922c;

        a(List<String> list) {
            this.f31920a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = o9.c.f29473b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f31921b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f31920a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f31920a.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f31922c = str;
                            return str;
                        }
                    }
                    String str2 = this.f31920a.get(0);
                    this.f31922c = str2;
                    return str2;
                } else if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                    this.f31922c = (String) objArr[0];
                    return null;
                } else {
                    return method.invoke(this, objArr);
                }
            }
        }
    }

    e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f31915c = method;
        this.f31916d = method2;
        this.f31917e = method3;
        this.f31918f = cls;
        this.f31919g = cls2;
    }

    public static g v() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider");
            return new e(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), cls3, Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // v9.g
    public void a(SSLSocket sSLSocket) {
        try {
            this.f31917e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw o9.c.b("unable to remove alpn", e8);
        }
    }

    @Override // v9.g
    public void g(SSLSocket sSLSocket, String str, List<w> list) {
        try {
            this.f31915c.invoke(null, sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{this.f31918f, this.f31919g}, new a(g.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw o9.c.b("unable to set alpn", e8);
        }
    }

    @Override // v9.g
    public String o(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f31916d.invoke(null, sSLSocket));
            boolean z10 = aVar.f31921b;
            if (!z10 && aVar.f31922c == null) {
                g.l().t(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (z10) {
                return null;
            } else {
                return aVar.f31922c;
            }
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw o9.c.b("unable to get selected protocol", e8);
        }
    }
}
