package x1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ThumbFetcher.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f32387a;

    /* renamed from: b  reason: collision with root package name */
    private final e f32388b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f32389c;

    /* compiled from: ThumbFetcher.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f32390b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f32391a;

        a(ContentResolver contentResolver) {
            this.f32391a = contentResolver;
        }

        @Override // x1.d
        public Cursor a(Uri uri) {
            return this.f32391a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f32390b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f32392b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f32393a;

        b(ContentResolver contentResolver) {
            this.f32393a = contentResolver;
        }

        @Override // x1.d
        public Cursor a(Uri uri) {
            return this.f32393a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f32392b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f32387a = uri;
        this.f32388b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        InputStream d10 = this.f32388b.d(this.f32387a);
        int a10 = d10 != null ? this.f32388b.a(this.f32387a) : -1;
        return a10 != -1 ? new g(d10, a10) : d10;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f32389c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public w1.a d() {
        return w1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        try {
            InputStream h10 = h();
            this.f32389c = h10;
            aVar.f(h10);
        } catch (FileNotFoundException e8) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e8);
            }
            aVar.c(e8);
        }
    }
}
