package c2;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LazyHeaders.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j implements h {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<i>> f5353c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Map<String, String> f5354d;

    /* compiled from: LazyHeaders.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static final String f5355d;

        /* renamed from: e  reason: collision with root package name */
        private static final Map<String, List<i>> f5356e;

        /* renamed from: a  reason: collision with root package name */
        private boolean f5357a = true;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, List<i>> f5358b = f5356e;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5359c = true;

        static {
            String b10 = b();
            f5355d = b10;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(b10)));
            }
            f5356e = Collections.unmodifiableMap(hashMap);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public j a() {
            this.f5357a = true;
            return new j(this.f5358b);
        }
    }

    /* compiled from: LazyHeaders.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        private final String f5360a;

        b(String str) {
            this.f5360a = str;
        }

        @Override // c2.i
        public String a() {
            return this.f5360a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f5360a.equals(((b) obj).f5360a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5360a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f5360a + "'}";
        }
    }

    j(Map<String, List<i>> map) {
        this.f5353c = Collections.unmodifiableMap(map);
    }

    private String b(List<i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String a10 = list.get(i10).a();
            if (!TextUtils.isEmpty(a10)) {
                sb.append(a10);
                if (i10 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f5353c.entrySet()) {
            String b10 = b(entry.getValue());
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put(entry.getKey(), b10);
            }
        }
        return hashMap;
    }

    @Override // c2.h
    public Map<String, String> a() {
        if (this.f5354d == null) {
            synchronized (this) {
                if (this.f5354d == null) {
                    this.f5354d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f5354d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f5353c.equals(((j) obj).f5353c);
        }
        return false;
    }

    public int hashCode() {
        return this.f5353c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f5353c + '}';
    }
}
