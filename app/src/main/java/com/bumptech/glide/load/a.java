package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import f2.w;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class C0169a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f10331a;

        C0169a(InputStream inputStream) {
            this.f10331a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f10331a);
            } finally {
                this.f10331a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f10332a;

        b(ByteBuffer byteBuffer) {
            this.f10332a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.b(this.f10332a);
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f10333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z1.b f10334b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, z1.b bVar) {
            this.f10333a = parcelFileDescriptorRewinder;
            this.f10334b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            w wVar = null;
            try {
                w wVar2 = new w(new FileInputStream(this.f10333a.a().getFileDescriptor()), this.f10334b);
                try {
                    ImageHeaderParser.ImageType c10 = imageHeaderParser.c(wVar2);
                    try {
                        wVar2.close();
                    } catch (IOException unused) {
                    }
                    this.f10333a.a();
                    return c10;
                } catch (Throwable th) {
                    th = th;
                    wVar = wVar2;
                    if (wVar != null) {
                        try {
                            wVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f10333a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f10335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z1.b f10336b;

        d(InputStream inputStream, z1.b bVar) {
            this.f10335a = inputStream;
            this.f10336b = bVar;
        }

        @Override // com.bumptech.glide.load.a.f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.f10335a, this.f10336b);
            } finally {
                this.f10335a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f10337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z1.b f10338b;

        e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, z1.b bVar) {
            this.f10337a = parcelFileDescriptorRewinder;
            this.f10338b = bVar;
        }

        @Override // com.bumptech.glide.load.a.f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            w wVar = null;
            try {
                w wVar2 = new w(new FileInputStream(this.f10337a.a().getFileDescriptor()), this.f10338b);
                try {
                    int a10 = imageHeaderParser.a(wVar2, this.f10338b);
                    try {
                        wVar2.close();
                    } catch (IOException unused) {
                    }
                    this.f10337a.a();
                    return a10;
                } catch (Throwable th) {
                    th = th;
                    wVar = wVar2;
                    if (wVar != null) {
                        try {
                            wVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f10337a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, z1.b bVar) throws IOException {
        return c(list, new e(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, z1.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return c(list, new d(inputStream, bVar));
    }

    private static int c(List<ImageHeaderParser> list, f fVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = fVar.a(list.get(i10));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType d(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, z1.b bVar) throws IOException {
        return g(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, InputStream inputStream, z1.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return g(list, new C0169a(inputStream));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return g(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType a10 = gVar.a(list.get(i10));
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
