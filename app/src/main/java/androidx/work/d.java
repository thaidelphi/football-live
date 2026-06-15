package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ContentUriTriggers.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<a> f4641a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f4642a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f4643b;

        a(Uri uri, boolean z10) {
            this.f4642a = uri;
            this.f4643b = z10;
        }

        public Uri a() {
            return this.f4642a;
        }

        public boolean b() {
            return this.f4643b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4643b == aVar.f4643b && this.f4642a.equals(aVar.f4642a);
        }

        public int hashCode() {
            return (this.f4642a.hashCode() * 31) + (this.f4643b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f4641a.add(new a(uri, z10));
    }

    public Set<a> b() {
        return this.f4641a;
    }

    public int c() {
        return this.f4641a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f4641a.equals(((d) obj).f4641a);
    }

    public int hashCode() {
        return this.f4641a.hashCode();
    }
}
