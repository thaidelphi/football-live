package e3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: LogSourceMetrics.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static final d f24953c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f24954a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f24955b;

    /* compiled from: LogSourceMetrics.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f24956a = "";

        /* renamed from: b  reason: collision with root package name */
        private List<c> f24957b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f24956a, Collections.unmodifiableList(this.f24957b));
        }

        public a b(List<c> list) {
            this.f24957b = list;
            return this;
        }

        public a c(String str) {
            this.f24956a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f24954a = str;
        this.f24955b = list;
    }

    public static a c() {
        return new a();
    }

    @m6.d(tag = 2)
    public List<c> a() {
        return this.f24955b;
    }

    @m6.d(tag = 1)
    public String b() {
        return this.f24954a;
    }
}
