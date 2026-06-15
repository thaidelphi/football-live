package i9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
/* compiled from: FastServiceLoader.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f26681a = new o();

    private o() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> M;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            M = j8.y.M(ServiceLoader.load(cls, classLoader));
            return M;
        }
    }

    private final List<String> e(URL url) {
        boolean r10;
        String l02;
        String s02;
        String l03;
        String url2 = url.toString();
        r10 = b9.o.r(url2, "jar", false, 2, null);
        if (r10) {
            l02 = b9.p.l0(url2, "jar:file:", null, 2, null);
            s02 = b9.p.s0(l02, '!', null, 2, null);
            l03 = b9.p.l0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(s02, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(l03)), "UTF-8"));
                List<String> f10 = f26681a.f(bufferedReader);
                r8.c.a(bufferedReader, null);
                jarFile.close();
                return f10;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        i8.b.a(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List<String> f11 = f26681a.f(bufferedReader2);
            r8.c.a(bufferedReader2, null);
            return f11;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                r8.c.a(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> M;
        String t02;
        CharSequence y02;
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                M = j8.y.M(linkedHashSet);
                return M;
            }
            t02 = b9.p.t0(readLine, "#", null, 2, null);
            y02 = b9.p.y0(t02);
            String obj = y02.toString();
            int i10 = 0;
            while (true) {
                if (i10 >= obj.length()) {
                    z10 = true;
                    break;
                }
                char charAt = obj.charAt(i10);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (z10) {
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    public final List<y> c() {
        y yVar;
        if (!p.a()) {
            return b(y.class, y.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            y yVar2 = null;
            try {
                yVar = (y) y.class.cast(Class.forName("e9.a", true, y.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                yVar = null;
            }
            if (yVar != null) {
                arrayList.add(yVar);
            }
            try {
                yVar2 = (y) y.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, y.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (yVar2 != null) {
                arrayList.add(yVar2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return b(y.class, y.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set<String> Q;
        int k10;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        kotlin.jvm.internal.n.e(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            j8.v.n(arrayList, f26681a.e(url));
        }
        Q = j8.y.Q(arrayList);
        if (!Q.isEmpty()) {
            k10 = j8.r.k(Q, 10);
            ArrayList arrayList2 = new ArrayList(k10);
            for (String str : Q) {
                arrayList2.add(f26681a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
