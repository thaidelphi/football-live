package f2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
/* compiled from: DefaultImageHeaderParser.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f25318a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f25319b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f25320a;

        a(ByteBuffer byteBuffer) {
            this.f25320a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // f2.k.c
        public long c(long j10) {
            int min = (int) Math.min(this.f25320a.remaining(), j10);
            ByteBuffer byteBuffer = this.f25320a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }

        @Override // f2.k.c
        public int d() throws c.a {
            return (f() << 8) | f();
        }

        @Override // f2.k.c
        public int e(byte[] bArr, int i10) {
            int min = Math.min(i10, this.f25320a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f25320a.get(bArr, 0, min);
            return min;
        }

        @Override // f2.k.c
        public short f() throws c.a {
            if (this.f25320a.remaining() >= 1) {
                return (short) (this.f25320a.get() & 255);
            }
            throw new c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f25321a;

        b(byte[] bArr, int i10) {
            this.f25321a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        private boolean c(int i10, int i11) {
            return this.f25321a.remaining() - i10 >= i11;
        }

        short a(int i10) {
            if (c(i10, 2)) {
                return this.f25321a.getShort(i10);
            }
            return (short) -1;
        }

        int b(int i10) {
            if (c(i10, 4)) {
                return this.f25321a.getInt(i10);
            }
            return -1;
        }

        int d() {
            return this.f25321a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f25321a.order(byteOrder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {

        /* compiled from: DefaultImageHeaderParser.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a extends IOException {
            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        long c(long j10) throws IOException;

        int d() throws IOException;

        int e(byte[] bArr, int i10) throws IOException;

        short f() throws IOException;
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f25322a;

        d(InputStream inputStream) {
            this.f25322a = inputStream;
        }

        @Override // f2.k.c
        public long c(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f25322a.skip(j11);
                if (skip <= 0) {
                    if (this.f25322a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }

        @Override // f2.k.c
        public int d() throws IOException {
            return (f() << 8) | f();
        }

        @Override // f2.k.c
        public int e(byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f25322a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // f2.k.c
        public short f() throws IOException {
            int read = this.f25322a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }
    }

    private static int d(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    private int e(c cVar, z1.b bVar) throws IOException {
        try {
            int d10 = cVar.d();
            if (!g(d10)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + d10);
                }
                return -1;
            }
            int i10 = i(cVar);
            if (i10 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(i10, byte[].class);
            int k10 = k(cVar, bArr, i10);
            bVar.put(bArr);
            return k10;
        } catch (c.a unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType f(c cVar) throws IOException {
        try {
            int d10 = cVar.d();
            if (d10 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int f10 = (d10 << 8) | cVar.f();
            if (f10 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int f11 = (f10 << 8) | cVar.f();
            if (f11 == -1991225785) {
                cVar.c(21L);
                try {
                    return cVar.f() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (f11 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                cVar.c(4L);
                if (((cVar.d() << 16) | cVar.d()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int d11 = (cVar.d() << 16) | cVar.d();
                if ((d11 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i10 = d11 & 255;
                if (i10 == 88) {
                    cVar.c(4L);
                    return (cVar.f() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i10 == 76) {
                    cVar.c(4L);
                    return (cVar.f() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean g(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    private boolean h(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f25318a.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f25318a;
                if (i11 >= bArr2.length) {
                    break;
                } else if (bArr[i11] != bArr2[i11]) {
                    return false;
                } else {
                    i11++;
                }
            }
        }
        return z10;
    }

    private int i(c cVar) throws IOException {
        short f10;
        short f11;
        int d10;
        long j10;
        long c10;
        do {
            if (cVar.f() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) f10));
                }
                return -1;
            }
            f11 = cVar.f();
            if (f11 == 218) {
                return -1;
            }
            if (f11 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            d10 = cVar.d() - 2;
            if (f11 == 225) {
                return d10;
            }
            j10 = d10;
            c10 = cVar.c(j10);
        } while (c10 == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) f11) + ", wanted to skip: " + d10 + ", but actually skipped: " + c10);
        }
        return -1;
    }

    private static int j(b bVar) {
        ByteOrder byteOrder;
        short a10 = bVar.a(6);
        if (a10 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a10 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a10));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b10 = bVar.b(10) + 6;
        short a11 = bVar.a(b10);
        for (int i10 = 0; i10 < a11; i10++) {
            int d10 = d(b10, i10);
            short a12 = bVar.a(d10);
            if (a12 == 274) {
                short a13 = bVar.a(d10 + 2);
                if (a13 >= 1 && a13 <= 12) {
                    int b11 = bVar.b(d10 + 4);
                    if (b11 < 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i10 + " tagType=" + ((int) a12) + " formatCode=" + ((int) a13) + " componentCount=" + b11);
                        }
                        int i11 = b11 + f25319b[a13];
                        if (i11 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a13));
                            }
                        } else {
                            int i12 = d10 + 8;
                            if (i12 >= 0 && i12 <= bVar.d()) {
                                if (i11 >= 0 && i11 + i12 <= bVar.d()) {
                                    return bVar.a(i12);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a12));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) a12));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) a13));
                }
            }
        }
        return -1;
    }

    private int k(c cVar, byte[] bArr, int i10) throws IOException {
        int e8 = cVar.e(bArr, i10);
        if (e8 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + e8);
            }
            return -1;
        } else if (h(bArr, i10)) {
            return j(new b(bArr, i10));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(InputStream inputStream, z1.b bVar) throws IOException {
        return e(new d((InputStream) s2.j.d(inputStream)), (z1.b) s2.j.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) throws IOException {
        return f(new a((ByteBuffer) s2.j.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) throws IOException {
        return f(new d((InputStream) s2.j.d(inputStream)));
    }
}
