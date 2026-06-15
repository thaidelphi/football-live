package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f626a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f627b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f628c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f629d;

    /* renamed from: e  reason: collision with root package name */
    private final Bitmap f630e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f631f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f632g;

    /* renamed from: h  reason: collision with root package name */
    private final Uri f633h;

    /* renamed from: i  reason: collision with root package name */
    private MediaDescription f634i;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f635a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f636b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f637c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f638d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f639e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f640f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f641g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f642h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f635a, this.f636b, this.f637c, this.f638d, this.f639e, this.f640f, this.f641g, this.f642h);
        }

        public d b(CharSequence charSequence) {
            this.f638d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f641g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f639e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f640f = uri;
            return this;
        }

        public d f(String str) {
            this.f635a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f642h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f637c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f636b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f626a = str;
        this.f627b = charSequence;
        this.f628c = charSequence2;
        this.f629d = charSequence3;
        this.f630e = bitmap;
        this.f631f = uri;
        this.f632g = bundle;
        this.f633h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L83
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L83
            android.support.v4.media.MediaDescriptionCompat$d r2 = new android.support.v4.media.MediaDescriptionCompat$d
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompat.b.g(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.i(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.h(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.c(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.MediaDescriptionCompat.b.e(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.MediaDescriptionCompat.b.f(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.MediaDescriptionCompat.b.d(r9)
            if (r3 == 0) goto L44
            android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.b(r3)
        L44:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4f
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L50
        L4f:
            r5 = r0
        L50:
            if (r5 == 0) goto L68
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L62
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L62
            goto L69
        L62:
            r3.remove(r4)
            r3.remove(r6)
        L68:
            r0 = r3
        L69:
            r2.c(r0)
            if (r5 == 0) goto L72
            r2.g(r5)
            goto L7d
        L72:
            r0 = 23
            if (r1 < r0) goto L7d
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.c.a(r9)
            r2.g(r0)
        L7d:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f634i = r9
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        int i10;
        Bundle bundle;
        MediaDescription mediaDescription = this.f634i;
        if (mediaDescription != null || (i10 = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder b10 = b.b();
        b.n(b10, this.f626a);
        b.p(b10, this.f627b);
        b.o(b10, this.f628c);
        b.j(b10, this.f629d);
        b.l(b10, this.f630e);
        b.m(b10, this.f631f);
        if (i10 < 23 && this.f633h != null) {
            if (this.f632g == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(this.f632g);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f633h);
            b.k(b10, bundle);
        } else {
            b.k(b10, this.f632g);
        }
        if (i10 >= 23) {
            c.b(b10, this.f633h);
        }
        MediaDescription a10 = b.a(b10);
        this.f634i = a10;
        return a10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f627b) + ", " + ((Object) this.f628c) + ", " + ((Object) this.f629d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f626a);
            TextUtils.writeToParcel(this.f627b, parcel, i10);
            TextUtils.writeToParcel(this.f628c, parcel, i10);
            TextUtils.writeToParcel(this.f629d, parcel, i10);
            parcel.writeParcelable(this.f630e, i10);
            parcel.writeParcelable(this.f631f, i10);
            parcel.writeBundle(this.f632g);
            parcel.writeParcelable(this.f633h, i10);
            return;
        }
        ((MediaDescription) b()).writeToParcel(parcel, i10);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f626a = parcel.readString();
        this.f627b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f628c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f629d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f630e = (Bitmap) parcel.readParcelable(classLoader);
        this.f631f = (Uri) parcel.readParcelable(classLoader);
        this.f632g = parcel.readBundle(classLoader);
        this.f633h = (Uri) parcel.readParcelable(classLoader);
    }
}
