package n9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
/* compiled from: Headers.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f28911a;

    /* compiled from: Headers.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final List<String> f28912a = new ArrayList(20);

        public a a(String str, String str2) {
            r.a(str);
            r.b(str2, str);
            return c(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a b(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return c(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return c("", str.substring(1));
            }
            return c("", str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a c(String str, String str2) {
            this.f28912a.add(str);
            this.f28912a.add(str2.trim());
            return this;
        }

        public r d() {
            return new r(this);
        }

        public String e(String str) {
            for (int size = this.f28912a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f28912a.get(size))) {
                    return this.f28912a.get(size + 1);
                }
            }
            return null;
        }

        public a f(String str) {
            int i10 = 0;
            while (i10 < this.f28912a.size()) {
                if (str.equalsIgnoreCase(this.f28912a.get(i10))) {
                    this.f28912a.remove(i10);
                    this.f28912a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public a g(String str, String str2) {
            r.a(str);
            r.b(str2, str);
            f(str);
            c(str, str2);
            return this;
        }
    }

    r(a aVar) {
        List<String> list = aVar.f28912a;
        this.f28911a = (String[]) list.toArray(new String[list.size()]);
    }

    static void a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(o9.c.r("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    throw new IllegalArgumentException(o9.c.r("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    private static String d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public String c(String str) {
        return d(this.f28911a, str);
    }

    public String e(int i10) {
        return this.f28911a[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).f28911a, this.f28911a);
    }

    public a f() {
        a aVar = new a();
        Collections.addAll(aVar.f28912a, this.f28911a);
        return aVar;
    }

    public int g() {
        return this.f28911a.length / 2;
    }

    public Map<String, List<String>> h() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int g10 = g();
        for (int i10 = 0; i10 < g10; i10++) {
            String lowerCase = e(i10).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(i(i10));
        }
        return treeMap;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f28911a);
    }

    public String i(int i10) {
        return this.f28911a[(i10 * 2) + 1];
    }

    public List<String> j(String str) {
        int g10 = g();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < g10; i10++) {
            if (str.equalsIgnoreCase(e(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i(i10));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int g10 = g();
        for (int i10 = 0; i10 < g10; i10++) {
            sb.append(e(i10));
            sb.append(": ");
            sb.append(i(i10));
            sb.append("\n");
        }
        return sb.toString();
    }
}
