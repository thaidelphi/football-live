package y;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* compiled from: InputContentInfoCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f32814a;

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f32816a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f32817b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f32818c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f32816a = uri;
            this.f32817b = clipDescription;
            this.f32818c = uri2;
        }

        @Override // y.d.c
        public Object a() {
            return null;
        }

        @Override // y.d.c
        public Uri b() {
            return this.f32816a;
        }

        @Override // y.d.c
        public void c() {
        }

        @Override // y.d.c
        public Uri d() {
            return this.f32818c;
        }

        @Override // y.d.c
        public ClipDescription getDescription() {
            return this.f32817b;
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f32814a = new a(uri, clipDescription, uri2);
        } else {
            this.f32814a = new b(uri, clipDescription, uri2);
        }
    }

    public static d f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new d(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f32814a.b();
    }

    public ClipDescription b() {
        return this.f32814a.getDescription();
    }

    public Uri c() {
        return this.f32814a.d();
    }

    public void d() {
        this.f32814a.c();
    }

    public Object e() {
        return this.f32814a.a();
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f32815a;

        a(Object obj) {
            this.f32815a = (InputContentInfo) obj;
        }

        @Override // y.d.c
        public Object a() {
            return this.f32815a;
        }

        @Override // y.d.c
        public Uri b() {
            return this.f32815a.getContentUri();
        }

        @Override // y.d.c
        public void c() {
            this.f32815a.requestPermission();
        }

        @Override // y.d.c
        public Uri d() {
            return this.f32815a.getLinkUri();
        }

        @Override // y.d.c
        public ClipDescription getDescription() {
            return this.f32815a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f32815a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private d(c cVar) {
        this.f32814a = cVar;
    }
}
