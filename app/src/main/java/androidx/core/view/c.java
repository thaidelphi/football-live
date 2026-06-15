package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
/* compiled from: ContentInfoCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final f f2865a;

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0051c f2866a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f2866a = new b(clipData, i10);
            } else {
                this.f2866a = new d(clipData, i10);
            }
        }

        public c a() {
            return this.f2866a.build();
        }

        public a b(Bundle bundle) {
            this.f2866a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f2866a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f2866a.a(uri);
            return this;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b implements InterfaceC0051c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo.Builder f2867a;

        b(ClipData clipData, int i10) {
            this.f2867a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // androidx.core.view.c.InterfaceC0051c
        public void a(Uri uri) {
            this.f2867a.setLinkUri(uri);
        }

        @Override // androidx.core.view.c.InterfaceC0051c
        public void b(int i10) {
            this.f2867a.setFlags(i10);
        }

        @Override // androidx.core.view.c.InterfaceC0051c
        public c build() {
            return new c(new e(this.f2867a.build()));
        }

        @Override // androidx.core.view.c.InterfaceC0051c
        public void setExtras(Bundle bundle) {
            this.f2867a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private interface InterfaceC0051c {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class d implements InterfaceC0051c {

        /* renamed from: a  reason: collision with root package name */
        ClipData f2868a;

        /* renamed from: b  reason: collision with root package name */
        int f2869b;

        /* renamed from: c  reason: collision with root package name */
        int f2870c;

        /* renamed from: d  reason: collision with root package name */
        Uri f2871d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f2872e;

        d(ClipData clipData, int i10) {
            this.f2868a = clipData;
            this.f2869b = i10;
        }

        @Override // androidx.core.view.c.InterfaceC0051c
        public void a(Uri uri) {
            this.f2871d = uri;
        }

        @Override // androidx.core.view.c.InterfaceC0051c
        public void b(int i10) {
            this.f2870c = i10;
        }

        @Override // androidx.core.view.c.InterfaceC0051c
        public c build() {
            return new c(new g(this));
        }

        @Override // androidx.core.view.c.InterfaceC0051c
        public void setExtras(Bundle bundle) {
            this.f2872e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo f2873a;

        e(ContentInfo contentInfo) {
            this.f2873a = (ContentInfo) androidx.core.util.i.f(contentInfo);
        }

        @Override // androidx.core.view.c.f
        public ContentInfo a() {
            return this.f2873a;
        }

        @Override // androidx.core.view.c.f
        public int b() {
            return this.f2873a.getSource();
        }

        @Override // androidx.core.view.c.f
        public ClipData c() {
            return this.f2873a.getClip();
        }

        @Override // androidx.core.view.c.f
        public int d() {
            return this.f2873a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2873a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private interface f {
        ContentInfo a();

        int b();

        ClipData c();

        int d();
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ClipData f2874a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2875b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2876c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f2877d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f2878e;

        g(d dVar) {
            this.f2874a = (ClipData) androidx.core.util.i.f(dVar.f2868a);
            this.f2875b = androidx.core.util.i.b(dVar.f2869b, 0, 5, "source");
            this.f2876c = androidx.core.util.i.e(dVar.f2870c, 1);
            this.f2877d = dVar.f2871d;
            this.f2878e = dVar.f2872e;
        }

        @Override // androidx.core.view.c.f
        public ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.c.f
        public int b() {
            return this.f2875b;
        }

        @Override // androidx.core.view.c.f
        public ClipData c() {
            return this.f2874a;
        }

        @Override // androidx.core.view.c.f
        public int d() {
            return this.f2876c;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f2874a.getDescription());
            sb.append(", source=");
            sb.append(c.e(this.f2875b));
            sb.append(", flags=");
            sb.append(c.a(this.f2876c));
            if (this.f2877d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f2877d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f2878e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    c(f fVar) {
        this.f2865a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static c g(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f2865a.c();
    }

    public int c() {
        return this.f2865a.d();
    }

    public int d() {
        return this.f2865a.b();
    }

    public ContentInfo f() {
        ContentInfo a10 = this.f2865a.a();
        Objects.requireNonNull(a10);
        return a10;
    }

    public String toString() {
        return this.f2865a.toString();
    }
}
